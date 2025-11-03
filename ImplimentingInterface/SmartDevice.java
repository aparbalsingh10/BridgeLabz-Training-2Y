interface SmartDevice {
    void turnOn();
    void turnOff();
}

class Light implements SmartDevice {
    public void turnOn() { System.out.println("Light turned ON"); }
    public void turnOff() { System.out.println("Light turned OFF"); }
}

class AC implements SmartDevice {
    public void turnOn() { System.out.println("AC started"); }
    public void turnOff() { System.out.println("AC stopped"); }
}

class TV implements SmartDevice {
    public void turnOn() { System.out.println("TV turned ON"); }
    public void turnOff() { System.out.println("TV turned OFF"); }
}

public class SmartDevice {
    public static void main(String[] args) {
        SmartDevice s1 = new Light();
        SmartDevice s2 = new AC();
        SmartDevice s3 = new TV();

        s1.turnOn(); s1.turnOff();
        s2.turnOn(); s2.turnOff();
        s3.turnOn(); s3.turnOff();
    }
}
