class TestDevice {
    public static void main(String[] args) {
        Phone p = new Phone(100);
        while (p.b > 25) {

            p.makeACall();
            p.makeACall();
            p.playAGame();
            p.playAGame();
            p.playAGame();
            p.makeACall();
            p.makeACall();
            p.playAGame();

        }

        p.ChargeTheBattery();

    }
}
