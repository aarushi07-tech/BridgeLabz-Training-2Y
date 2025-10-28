// Superclass: Device
class Device {
    String deviceId;
    String status;

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

// Subclass: Thermostat extends Device
class Thermostat extends Device {
    double temperatureSetting;

    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status); // Initialize superclass attributes
        this.temperatureSetting = temperatureSetting;
    }

    // Override displayStatus to include temperature
    @Override
    public void displayStatus() {
        super.displayStatus(); // Show base device info
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Main class to test
public class displayStatus {
    public static void main(String[] args) {
        Thermostat livingRoomThermostat = new Thermostat(
            "THERMO-001",
            "Online",
            22.5
        );

        livingRoomThermostat.displayStatus();
    }
}