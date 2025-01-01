public class SpeakerDisplayDevice extends ADevice implements IsSpeaker, IDisplay, IsPluggedDevice {
    private boolean pluggedIn;

    public SpeakerDisplayDevice(String deviceName, boolean pluggedIn) {
        super(deviceName);
        this.pluggedIn = pluggedIn;
    }

    @Override
    public void speak(String message) {
        System.out.println("Say: " + message);
    }

    @Override
    public void display(String message) {
        System.out.println("Display: " + message);
    }

    @Override
    public boolean isPluggedIn() {
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
