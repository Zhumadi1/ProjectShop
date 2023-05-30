package groceryStore.model.meatProducts;

import groceryStore.model.Product;

import java.time.LocalDate;

public class Meat extends Product {
    public Meat(int id, String name, String companyName, LocalDate shelfLife) {
        super(id, name, companyName, shelfLife);
    }
}
