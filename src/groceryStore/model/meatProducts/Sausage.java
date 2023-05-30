package groceryStore.model.meatProducts;

import groceryStore.model.Product;

import java.time.LocalDate;

public class Sausage extends Product {
    public Sausage(int id, String name, String companyName, LocalDate shelfLife) {
        super(id, name, companyName, shelfLife);
    }
}
