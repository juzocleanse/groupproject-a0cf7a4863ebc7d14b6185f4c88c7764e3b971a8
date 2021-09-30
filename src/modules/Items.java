package modules;

public class Items { //I want to make this public so that Main can get access to the function
    private String name; //This is private so Main can't accidentally access it when the get/set function is not called for/used.
    private String description;
    private double price;

    public Items(String name, String description, double price){ //This is public, so I can create items from Main.
        this.name        = name; //"This" refers to the current object called items
        this.description = description;
        this.price       = price;
    }

    public String getName() { //"getName" makes it so that Main can access the variable name even though it's a private varible
        return name; //"return" return the variable "name".
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
