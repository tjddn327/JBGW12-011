package j7.J7_4;

import java.util.Map;
import java.util.stream.Collectors;

public class ConfigurationExample {
    // TODO: 데이터베이스 설정 레코드를 정의하세요
    record DatabaseConfig(String host, int port, String database, String username, String password, Map<String, String> options) {
        // TODO: 연결 URL 생성 메서드를 작성하세요
        public String getConnectionUrl() {
            String optionsStr = options.entrySet().stream()
                    .map(entry -> entry.getKey() + "=" + entry.getValue())
                    .collect(Collectors.joining("&"));
            return String.format("jdbc:mysql://%s:%d/%s?%s", host, port, database, optionsStr);
        }
    }

    // TODO: 서버 설정 레코드를 정의하세요
    record ServerConfig(int port, String contextPath, int maxConnections, int timeout) {}

    // TODO: 애플리케이션 설정 레코드를 정의하세요
    record AppConfig(String appName, String version, DatabaseConfig database, ServerConfig server, boolean debugMode) {}

    public static void main(String[] args) {
        // TODO: 설정 객체들을 생성하세요
        DatabaseConfig dbConfig = new DatabaseConfig("localhost", 3306, "myapp", "user", "pass",
                Map.of("useSSL", "false", "serverTimezone", "UTC", "characterEncoding", "UTF-8"));

        ServerConfig serverConfig = new ServerConfig(8080, "/api", 100, 30000);

        AppConfig appConfig = new AppConfig("MyApplication", "1.0.0", dbConfig, serverConfig, true);

        System.out.println("=== 애플리케이션 설정 ===");
        System.out.println("앱 이름: " + appConfig.appName());
        System.out.println("버전: " + appConfig.version());
        System.out.println("디버그 모드: " + appConfig.debugMode());

        System.out.println("\n=== 데이터베이스 설정 ===");
        System.out.println("호스트: " + appConfig.database().host());
        System.out.println("포트: " + appConfig.database().port());
        System.out.println("연결 URL: " + appConfig.database().getConnectionUrl());

        System.out.println("\n=== 서버 설정 ===");
        System.out.println("포트: " + appConfig.server().port());
        System.out.println("컨텍스트 경로: " + appConfig.server().contextPath());
        System.out.println("최대 연결 수: " + appConfig.server().maxConnections());
    }
}