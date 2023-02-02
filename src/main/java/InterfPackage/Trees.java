package InterfPackage;

public abstract class Trees extends Plants {
    public int treeHeight;
    public String name;
    public String leafNeedle;

    public Trees(int treeHeight, String name, String leafNeedle) {
        super();
        this.treeHeight = treeHeight;
        this.name = name;
        this.leafNeedle = leafNeedle;
    }

    public Trees() {

    }

    public abstract void apstraktneMeetod(); // abstraktse klassi meetodil ei ole "keha", sulge ja need lõpevad semikooloniga

    public String leafOrNeedles() {
        if (this.leafNeedle == "leaf") ;
     return "leaf";

    }
}

