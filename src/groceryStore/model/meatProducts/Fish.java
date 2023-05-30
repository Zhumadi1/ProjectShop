package groceryStore.model.meatProducts;

import groceryStore.model.Product;

import java.time.LocalDate;

public class Fish extends Product {
    public Fish(int id, String name, String companyName, LocalDate shelfLife) {
        super(id, name, companyName, shelfLife);
    }
}
