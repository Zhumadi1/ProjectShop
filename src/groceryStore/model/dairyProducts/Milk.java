package groceryStore.model.dairyProducts;

import groceryStore.model.Product;

import java.time.LocalDate;

public class Milk extends Product {
    public Milk(int id, String name, String  companyName, LocalDate shelfLife) {
        super(id, name, companyName, shelfLife);
    }
}
