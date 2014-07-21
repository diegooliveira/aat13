package br.com.globalcode;
public class ConfigManager {
  private String serverName;
  private static ConfigManager instance = new ConfigManager();

  private ConfigManager() {
  }
  
  public String getServerName() {
    return serverName;
  }

  public void setServerName(String serverName) {
    this.serverName = serverName;
  }
  
  public static ConfigManager getInstance() {
      return instance;
  }
}
