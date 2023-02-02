package InterfPackage;

public class Pine extends Trees implements Grow, Blooming, Fruits {

    public Pine(int treeHeight, String name, String leafNeedle) {
        super(treeHeight, name, leafNeedle);
    }

    public void quickly() {
        System.out.println("grows quickly.");
    }
    public void slowly(){
        System.out.println("grows slowly.");
    }
    public void notGrows(){
        System.out.println("does not grow. Sleeps!");
    }

    @Override
    public void color() {
        System.out.println("red or yellowish.");
    }

    @Override
    public void smell() {
        System.out.println("no smell");

    }

    @Override
    public void type() {
        System.out.println("The fruit is called corne.");

    }

    @Override
    public void shape() {
        System.out.println("The cone has the shape of a cone.");

    }

    @Override
    public void edible() {
        System.out.println("The cone is edible for squirrels and birds.");

    }
}
