package j5.j5_1;

/**
 * 설정 클래스 - 변경 가능한 설정값들
 */
public class Configuration {
    private String serverUrl;
    private int port;
    private boolean debugMode;

    public Configuration(String serverUrl, int port) {
        this.serverUrl = serverUrl;
        this.port = port;
        this.debugMode = false;
    }

    // Getter/Setter
    public String getServerUrl() { return serverUrl; }
    public void setServerUrl(String url) { this.serverUrl = url; }

    public int getPort() { return port; }
    public void setPort(int port) { this.port = port; }

    public boolean isDebugMode() { return debugMode; }
    public void setDebugMode(boolean debug) { this.debugMode = debug; }

    public void printConfig() {
        System.out.println("Server: " + serverUrl + ":" + port);
        System.out.println("Debug Mode: " + debugMode);
    }
}

