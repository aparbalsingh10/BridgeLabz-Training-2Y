interface LightAction {
    void activate();
}

public class Lightaction {
    public static void main(String[] args) {

        LightAction motionSensor = () -> System.out.println("Motion detected → Lights ON!");
        LightAction nightTime = () -> System.out.println("Night time → Dim warm lights ON!");
        LightAction voiceCommand = () -> System.out.println("Voice Command → Custom light mode ON!");

        motionSensor.activate();
        nightTime.activate();
        voiceCommand.activate();
    }
}
