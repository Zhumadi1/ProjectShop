package groceryStore.model.wheatProducts;

import groceryStore.model.Product;

import java.time.LocalDate;

public class Macaroni extends Product {
    public Macaroni(int id, String name, String companyName, LocalDate shelfLife) {
        super(id, name, companyName, shelfLife);
    }
}
