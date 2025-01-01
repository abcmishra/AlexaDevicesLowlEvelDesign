public class BatterySpeakerDisplayDevice extends ADevice implements IsSpeaker, IDisplay {
    private final BatteryManager batteryManager;

    public BatterySpeakerDisplayDevice(String deviceName, int batteryPercentage, boolean isCharging) {
        super(deviceName);
        this.batteryManager = new BatteryManager(batteryPercentage, isCharging);
    }

    @Override
    public void speak(String message) {
        if (batteryManager.isBatteryDrained()) {
            System.out.println("Device is not operational. Cannot speak.");
        } else {
            System.out.println("Say: " + message);
        }
    }

    @Override
    public void display(String message) {
        if (batteryManager.isBatteryDrained()) {
            System.out.println("Device is not operational. Cannot display.");
        } else {
            System.out.println("Display: " + message);
        }
    }



    @Override
    public String getMessageStatus() {
        return null;
    }
}
