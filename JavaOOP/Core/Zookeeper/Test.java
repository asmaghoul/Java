public class Test {
    public static void main(String[] args) {
        // Gorilla
        System.out.println("*************Gorilla is here*************");
        Gorilla g = new Gorilla(100);
        g.throwSomething();
        g.throwSomething();
        g.throwSomething();
        g.eatBananas();
        g.eatBananas();
        g.climb();
        // Bat
        System.out.println("*************Bat is here*************");
        Bat b = new Bat(100);
        b.attackTown();
        b.attackTown();
        b.attackTown();
        b.eatHumans();
        b.eatHumans();
        b.fly();
        b.fly();

    }
}