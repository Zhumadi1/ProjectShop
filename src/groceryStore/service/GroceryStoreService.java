package groceryStore.service;

import groceryStore.model.Product;

import java.util.List;

public interface GroceryStoreService {

    void addProducts(List<Product> products);

    void sortByDate(List<Product> products);

    void getAllProducts(String userName, String password);


}
