public class BatteryManager {
    private int batteryPercentage;
    private boolean isCharging;

    public BatteryManager(int batteryPercentage, boolean isCharging) {
        if (batteryPercentage < 0 || batteryPercentage > 100) {
            throw new IllegalArgumentException("Battery percentage must be between 0 and 100.");
        }
        this.batteryPercentage = batteryPercentage;
        this.isCharging = isCharging;
    }

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public boolean isCharging() {
        return isCharging;
    }

    public boolean isBatteryDrained() {
        return batteryPercentage == 0 && !isCharging;
    }

    public String getBatteryStatus() {
        if (isBatteryDrained()) {
            return "Battery is drained and not charging.";
        } else if (isCharging) {
            return "Battery level is " + batteryPercentage + "% and charging.";
        } else {
            return "Battery level is " + batteryPercentage + "% and discharging.";
        }
    }
}
