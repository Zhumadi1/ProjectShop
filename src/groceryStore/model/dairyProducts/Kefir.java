package groceryStore.model.dairyProducts;

import groceryStore.model.Product;

import java.time.LocalDate;

public class Kefir extends Product {
    public Kefir(int id, String name, String companyName, LocalDate shelfLife) {
        super(id, name, companyName,shelfLife);
    }
}
