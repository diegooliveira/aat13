package br.com.globalcode;

public class ConfigManager {

    // Para garantir que ninguem irá criar um
    private ConfigManager() { }
    
    private static final ConfigManager instance = new ConfigManager();
    
    public static ConfigManager getInstance(){
        return instance;
    }

    private String serverName;

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }
}
