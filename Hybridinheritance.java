package Pattern;

interface Device {
    void powerOn();
}

interface SmartDevice extends Device {
    void installApps();
}

interface Internet {
    void connectWiFi();
}

class SmartTV implements SmartDevice, Internet {

    public void powerOn() {
        System.out.println("TV Power On");
    }

    public void installApps() {
        System.out.println("Apps Installed");
    }

    public void connectWiFi() {
        System.out.println("WiFi Connected");
    }
}

public class Hybridinheritance {

    public static void main(String[] args) {

        SmartTV tv = new SmartTV();

        tv.powerOn();
        tv.installApps();
        tv.connectWiFi();
    }
}