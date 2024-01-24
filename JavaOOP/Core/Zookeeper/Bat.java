public class Bat extends Mammal {
    public Bat(int energy) {
        super(300);
    }

    public void fly() {
        System.out.println("The bat is flying.");
        energy -= 50;
        displayEnergy();
    }

    public void eatHumans() {
        System.out.println("Bat eat a human!");
        energy += 25;
        displayEnergy();
    }

    public void attackTown() {
        System.out.println("The bat attack a town.");
        energy -= 100;
        displayEnergy();
    }
}