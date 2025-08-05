package j5.j5_8.database;
import java.util.*; // List, Map, HashMap 등 사용

/**
 * 데이터베이스 연결을 관리하는 클래스
 */
public class DatabaseManager {

    // 연결 설정을 저장하는 정적 중첩 클래스
    public static class ConnectionConfig {
        private String host;
        private int port;
        private String database;
        private String username;
        private String password;

        // Builder 패턴
        public static class Builder {
            private String host = "localhost";
            private int port = 3306;
            private String database;
            private String username;
            private String password;

            public Builder host(String host) {
                // TODO 19: host 설정하고 this 반환하기
                this.host = host;
                return this;
            }

            public Builder port(int port) {
                // TODO 20: port 설정하고 this 반환하기
                this.port = port;
                return this;
            }

            public Builder database(String database) {
                // TODO 21: database 설정하고 this 반환하기
                this.database = database;
                return this;
            }

            public Builder username(String username) {
                // TODO 22: username 설정하고 this 반환하기
                this.username = username;
                return this;
            }

            public Builder password(String password) {
                // TODO 23: password 설정하고 this 반환하기
                this.password = password;
                return this;
            }

            public ConnectionConfig build() {
                // TODO 24: ConnectionConfig 객체 생성하고 필드 설정하기
                // 모든 Builder 필드를 config에 복사
                ConnectionConfig config = new ConnectionConfig();
                config.host = this.host;
                config.port = this.port;
                config.database = this.database;
                config.username = this.username;
                config.password = this.password;
                return config;
            }
        }

        private ConnectionConfig() {} // private 생성자

        public String getConnectionUrl() {
            // TODO 25: JDBC 연결 URL 생성하기
            // 형식: "jdbc:mysql://host:port/database"
            return String.format("jdbc:mysql://%s:%d/%s", host, port, database);
        }

        @Override
        public String toString() {
            // TODO 26: "ConnectionConfig[username@host:port]" 형식으로 반환하기
            return String.format("ConnectionConfig[%s@%s:%d]", username, host, port);
        }
    }

    // 쿼리 결과를 저장하는 정적 중첩 클래스
    public static class QueryResult {
        private List<Map<String, Object>> rows;
        private int affectedRows;
        private long executionTime;

        public QueryResult() {
            this.rows = new ArrayList<>();
        }

        public void addRow(Map<String, Object> row) {
            // TODO 27: rows에 row 추가하기
            rows.add(row);
        }

        public int getRowCount() {
            // TODO 28: 행의 개수 반환하기
            return rows.size();
        }

        public List<Map<String, Object>> getRows() {
            // TODO 29: rows의 복사본 반환하기
            return new ArrayList<>(rows);
        }
    }

    private ConnectionConfig config;

    public DatabaseManager(ConnectionConfig config) {
        // TODO 30: config 초기화하기
        this.config = config;
    }

    public void connect() {
        System.out.println("데이터베이스 연결: " + config.getConnectionUrl());
    }

    public QueryResult executeQuery(String sql) {
        System.out.println("쿼리 실행: " + sql);
        // TODO 31: QueryResult 객체 생성하고 예시 데이터 추가하기
        // 예시: id=1, name="Test"를 가진 row 추가
        QueryResult result = new QueryResult();
        Map<String, Object> row = new HashMap<>();
        row.put("id", 1);
        row.put("name", "Test");
        result.addRow(row);
        return result;
    }
}
