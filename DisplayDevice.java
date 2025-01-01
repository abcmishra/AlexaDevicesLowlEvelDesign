public class DisplayDevice extends ADevice implements IDisplay , IsPluggedDevice{
    private  boolean pluggedIn;
    public DisplayDevice(String deviceANme, boolean pluggedIn){
        super(deviceANme);
        this.pluggedIn=pluggedIn;
    }
    @Override
    public void display(String message){
        System.out.println("Display: "+message);
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
