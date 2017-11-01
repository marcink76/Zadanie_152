package pl.zadanie151.zadanie151.model;

public class Unit {
    private String name;
    private String price;
    private String cathegory;

    public Unit(String name, String price, String cathegory) {
        this.name = name;
        this.price = price;
        this.cathegory = cathegory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCathegory() {
        return cathegory;
    }

    public void setCathegory(String cathegory) {
        this.cathegory = cathegory;
    }

    @Override
    public String toString() {
        return "Nazwa produktu = " + name + ", cena = " + price + ", kategoria = " + cathegory;
    }
}
