package InterfPackage;

public abstract class Trees extends Plants {
    public int treeHeight;
    public String name;
    public String leafNeedle;

    public Trees(int treeHeight, String name, String leafNeedle) {
        this.treeHeight = treeHeight;
        this.name = name;
        this.leafNeedle = leafNeedle;
    }

    public void apstraktneMeetod(){}

    public String leafOrNeedles() {
        if (this.leafNeedle == "leaf") ;
     return "leaf";
        // abstraktse klassi meetodil ei ole "keha", sulge ja need lõpevad semikooloniga
    }
}

