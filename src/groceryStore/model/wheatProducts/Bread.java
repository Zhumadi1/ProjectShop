package groceryStore.model.wheatProducts;

import groceryStore.model.Product;

import java.time.LocalDate;

public class Bread extends Product {
    public Bread(int id, String name, String companyName, LocalDate shelfLife) {
        super(id, name, companyName, shelfLife);
    }
}
