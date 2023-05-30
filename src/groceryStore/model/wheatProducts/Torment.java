package groceryStore.model.wheatProducts;

import groceryStore.model.Product;

import java.time.LocalDate;

public class Torment extends Product {
    public Torment(int id, String name, String companyName, LocalDate shelfLife) {
        super(id, name, companyName, shelfLife);
    }
}
