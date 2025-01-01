public abstract class ADevice {
    private final String  deviceName;

    public ADevice(String deviceName){
        this.deviceName=deviceName;
    }
  public String getDeviceName(){
        return deviceName;
  }
  public abstract String getMessageStatus();

}
