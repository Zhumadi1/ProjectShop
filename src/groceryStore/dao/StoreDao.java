package groceryStore.dao;

import groceryStore.model.Product;

import java.util.ArrayList;

public class StoreDao {
    private ArrayList<Product> products = new ArrayList<>();

    private ArrayList<Product> discountProducts = new ArrayList<>();

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Product> getDiscountProducts() {
        return discountProducts;
    }

    public void setDiscountProducts(ArrayList<Product> discountProducts) {
        this.discountProducts = discountProducts;
    }

    @Override
    public String toString() {
        return "StoreDao{" +
                "products=" + products +
                ", discountProducts=" + discountProducts +
                '}';
    }
}
