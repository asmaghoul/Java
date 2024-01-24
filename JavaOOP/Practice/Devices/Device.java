public class Device {
    // MEMBER VARIABLES
    private int batteryValue;

    // Contructor
    public Device() {
        this.batteryValue = 100;
    }

    // Getter and Setter
    public int getBatteryValue() {
        return batteryValue;
    }

    public void setBatteryValue(int batteryValue) {
        this.batteryValue = batteryValue;
    }

    // Method displayBatteryLife
    public void displayBatteryLife() {
        System.out.println("The battery life is : " + batteryValue);
    }
}
