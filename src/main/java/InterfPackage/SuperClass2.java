package InterfPackage;

public abstract class SuperClass2 {
    public int treeHeight;
    public String name;
    public String leafNeedle;

    public SuperClass2(int treeHeight, String name, String leafNeedle) {
        this.treeHeight = treeHeight;
        this.name = name;
        this.leafNeedle = leafNeedle;
    }

    public String leafOrNeedles() {
        if (this.leafNeedle == "leaf") ;
     return "leaf";
        // abstraktse klassi meetodil ei ole "keha", sulge ja need lõpevad semikooloniga
    }
}

