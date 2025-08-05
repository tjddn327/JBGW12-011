package j5.j5_8.database;

// 테스트
class DatabaseTest {
    public static void main(String[] args) {
        // TODO 32: Builder 패턴으로 ConnectionConfig 생성하기
        // host: "192.168.1.100", port: 3306
        // database: "mydb", username: "admin", password: "secret"
        DatabaseManager.ConnectionConfig config = new DatabaseManager.ConnectionConfig.Builder()
                .host("192.168.1.100")
                .port(3306)
                .database("mydb")
                .username("admin")
                .password("secret")
                .build();

        // TODO 33: 연결 설정 정보 출력하기
        // config와 연결 URL 출력
        System.out.println("연결 설정: " + config);
        System.out.println("연결 URL: " + config.getConnectionUrl());

        // TODO 34: DatabaseManager 생성하고 연결하기
        DatabaseManager manager = new DatabaseManager(config);
        manager.connect();

        // TODO 35: 쿼리 실행하고 결과 출력하기
        // "SELECT * FROM users" 쿼리 실행
        // 결과 행 수 출력
        DatabaseManager.QueryResult result = manager.executeQuery("SELECT * FROM users");
        System.out.println("결과 행 수: " + result.getRowCount());
    }
}
