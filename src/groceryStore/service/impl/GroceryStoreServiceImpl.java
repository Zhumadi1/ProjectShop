package groceryStore.service.impl;

import groceryStore.dao.StoreDao;
import groceryStore.model.Manager;
import groceryStore.model.Product;
import groceryStore.service.GroceryStoreService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GroceryStoreServiceImpl implements GroceryStoreService {
    private StoreDao storeDao = new StoreDao();


    @Override
    public void addProducts(List<Product> products) {
        List<Product> productList = new ArrayList<>();
        products.stream().filter(product -> product.getCompanyName().equalsIgnoreCase("nur")
                        || product.getCompanyName().equalsIgnoreCase("toiboss")
                        || product.getCompanyName().equalsIgnoreCase("milka"))
                .forEach(productList::add);
        productList.stream().filter(product -> product.getShelfLife()
                        .minusMonths(1).isAfter(LocalDate.now()))
                .forEach(storeDao.getProducts()::add);
    }

    @Override
    public void sortByDate(List<Product> products) {
        LinkedList<Product> linkedList = new LinkedList<>(products);
        linkedList.stream().filter(product -> product.getShelfLife().isBefore(LocalDate.now()))
                .forEach(products::remove);

        linkedList.stream().filter(product -> product.getShelfLife().minusDays(7).isEqual(LocalDate.now())
                        || product.getShelfLife().minusDays(6).isEqual(LocalDate.now())
                        || product.getShelfLife().minusDays(5).isEqual(LocalDate.now())
                        || product.getShelfLife().minusDays(4).isEqual(LocalDate.now())
                        || product.getShelfLife().minusDays(3).isEqual(LocalDate.now())
                        || product.getShelfLife().minusDays(2).isEqual(LocalDate.now())
                        || product.getShelfLife().minusDays(1).isEqual(LocalDate.now()))
                .forEach(getStoreDao().getDiscountProducts()::add);

    }

    @Override
    public void getAllProducts(String userName, String password) {
        if (userName.equals(new Manager().getName()) && password.equals(new Manager().getPassword())) {
            System.out.println("products:");
            getStoreDao().getProducts().forEach(System.out::println);
            System.out.println("-------------------------------------------- \n discount products:");
            getStoreDao().getDiscountProducts().forEach(System.out::println);
        } else {
            System.out.println("not");
        }

    }

    public StoreDao getStoreDao() {
        return storeDao;
    }

    public void setStoreDao(StoreDao storeDao) {
        this.storeDao = storeDao;
    }
}
