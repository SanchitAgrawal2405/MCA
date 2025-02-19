package week_6;

// Interface 1
interface Device {
    void turnOn();
    void turnOff();
}

// Interface 2
interface Connectivity {
    void connectToWiFi();
    void disconnectWiFi();
}

// Class implementing multiple interfaces
class Smartphone implements Device, Connectivity {
    @Override
    public void turnOn() {
        System.out.println("Smartphone is turning on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Smartphone is turning off...");
    }

    @Override
    public void connectToWiFi() {
        System.out.println("Smartphone is connecting to WiFi...");
    }

    @Override
    public void disconnectWiFi() {
        System.out.println("Smartphone is disconnecting from WiFi...");
    }
}

// Main class to test the program
public class Problem_2 {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone();
        
        // Using methods from both interfaces
        myPhone.turnOn();
        myPhone.connectToWiFi();
        myPhone.disconnectWiFi();
        myPhone.turnOff();
    }
}