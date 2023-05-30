package groceryStore.model;

import java.time.LocalDate;

public abstract class Product {
    private int id;

    private String name;

    private String companyName;

    private LocalDate shelfLife;

    public Product(int id, String name, String companyName, LocalDate dateOfProduction) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.shelfLife = dateOfProduction;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public LocalDate getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(LocalDate shelfLife) {
        this.shelfLife = shelfLife;
    }

    @Override
    public String toString() {
        return "Product" +
                "id=" + id +
                " name= " + name + '\'' +
                " companyName=" + companyName +
                " shelfLife=" + shelfLife;
    }
}
