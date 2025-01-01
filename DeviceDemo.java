public class DeviceDemo {
    public static void main(String[] args) {
        // Speaker-only device
        ADevice echoDot = new SpeakerDevice("Echo Dot", true);
        System.out.println(echoDot.getDeviceName() + ": " + echoDot.getMessageStatus());
        ((IsSpeaker) echoDot).speak(echoDot.getMessageStatus());

        // Display-only device
        ADevice microwave = new DisplayDevice("Alexa-Enabled Microwave", true);
        System.out.println(microwave.getDeviceName() + ": " + microwave.getMessageStatus());
        ((IDisplay) microwave).display(microwave.getMessageStatus());

        // Device with speaker and display
        ADevice echoShow = new SpeakerDisplayDevice("Echo Show", true);
        System.out.println(echoShow.getDeviceName() + ": " + echoShow.getStatusMessage());
        ((IsSpeaker) echoShow).speak(echoShow.getMessageStatus());
        ((IDisplay) echoShow).display(echoShow.get());

        // Device with battery, speaker, and display
        ADevice fireTablet = new BatterySpeakerDisplayDevice("Fire Tablet", 75, true);
        System.out.println(fireTablet.getDeviceName() + ": " + fireTablet.getStatusMessage());
        ((ISpeaker) fireTablet).speak(fireTablet.getStatusMessage());
        ((IDisplay) fireTablet).display(fireTablet.getStatusMessage());
    }
}
