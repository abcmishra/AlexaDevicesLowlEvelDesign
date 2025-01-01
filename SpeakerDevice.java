public class SpeakerDevice extends ADevice implements IsSpeaker,IsPluggedDevice{
    private  boolean pluggedIn;
    public SpeakerDevice(String deviceName,boolean pluggedIn){
        super(deviceName);
        this.pluggedIn=pluggedIn;

    }
    @Override
    public void speak(String message){
        System.out.println(" Say "+message);
    }

    @Override
    public  boolean isPluggedIn(){
        return pluggedIn;
    }

    @Override
    public String getMessageStatus(){
        if(isPluggedIn()){
            return "Currently plugged into wall power";
        }
        return "Not plugged in, cannot operate";
    }
}
