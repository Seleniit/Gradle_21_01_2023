package InterfPackage;

public class Main {
    public static void main(String[] args) {
        Grow pineGrow = new Pine();
        Blooming pineBloom = new Pine();
        Fruits pineFruits = new Pine();
       System.out.print("It's spring, pine ");
        pineGrow.quickly();
        System.out.print("Pine blossoms are ");
        pineBloom.color();
       pineFruits.type();
        pineFruits.shape();
     }
}
