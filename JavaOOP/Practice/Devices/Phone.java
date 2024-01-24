public class Phone extends Device {
    public int b;

    public Phone(int b) {
        super();
        this.b = super.getBatteryValue();
    }

    public void makeACall() {
        if (b > 24) {
            b = b - 5;
            System.out.println("I am making a call and the remaining battery charge is " + b);
        } else if (b < 10) {
            displayCriticalMessage();
        }

    }

    public void playAGame() {
        if (b > 24) {
            b = b - 20;
            System.out.println("I am playing a game and the remaining battery charge is " + b);
        }
        if (b < 25) {
            if (b < 11) {
                displayCriticalMessage();
            }
            System.out.println("You Need 25 or more to play!");
        }

    }

    public void ChargeTheBattery() {
        if (super.getBatteryValue() > 49) {
            b = 100;
        } else {
            b = b + 50;
        }
        System.out.println("I am charging the battery and the remaining battery charge is " + b);
    }

    public void displayCriticalMessage() {
        System.out.println("Your Battery Charge is critical");
    }
}
