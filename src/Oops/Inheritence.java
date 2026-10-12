package Oops;

public class Inheritence {
    public static void main(String[] args) {
                SmartPhone1 s = new SmartPhone1();
                s.powerOn();
                s.call();
                s.takePhoto();

    }
}
class Device {
    void powerOn() {
        System.out.println("Device is powered on");
    }
}

interface Camera {
    void takePhoto();
}

class Mobile extends Device {
    void call() {
        System.out.println("Making a call");
    }
}

class SmartPhone1 extends Mobile implements Camera {
    public void takePhoto() {
        System.out.println("Taking photo");
    }
}


