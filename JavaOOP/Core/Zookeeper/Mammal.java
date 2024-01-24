public class Mammal {
    protected int energy = 100;

    public Mammal(int energy) {
        this.energy = energy;
    }

    public int displayEnergy() {
        System.out.println("The mammal Energy is : " + energy);
        return energy;
    }
}