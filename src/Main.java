import groceryStore.dao.StoreDao;
import groceryStore.model.Product;
import groceryStore.model.dairyProducts.Kefir;
import groceryStore.model.dairyProducts.Milk;
import groceryStore.model.dairyProducts.Yogurt;
import groceryStore.model.meatProducts.Fish;
import groceryStore.model.meatProducts.Meat;
import groceryStore.model.meatProducts.Sausage;
import groceryStore.model.wheatProducts.Bread;
import groceryStore.model.wheatProducts.Macaroni;
import groceryStore.model.wheatProducts.Torment;
import groceryStore.service.GroceryStoreService;
import groceryStore.service.impl.GroceryStoreServiceImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>(Arrays.asList(
                new Fish(1, "Сазан", "Toiboss", LocalDate.of(2023, 5, 27)),
                new Fish(2, "Атлантическая скумбрия", "Toiboss", LocalDate.of(2023, 6, 27)),
                new Fish(3, "Форель", "Toiboss", LocalDate.of(2023, 5, 27)),
                new Meat(4, "Говядина", "Toiboss", LocalDate.of(2023, 7, 22)),
                new Meat(5, "Баранина", "Toiboss", LocalDate.of(2023, 6, 22)),
                new Meat(6, "Конина", "Toiboss", LocalDate.of(2023, 7, 22)),
                new Sausage(7, "Вареная", "Toiboss", LocalDate.of(2023, 6, 24)),
                new Sausage(8, "Полукопченая", "Toiboss", LocalDate.of(2023, 6, 4)),
                new Sausage(9, "Сыровяленая", "Toiboss", LocalDate.of(2023, 6, 24)),
                new Kefir(10, "Фруктовый", "Milka", LocalDate.of(2023, 6, 26)),
                new Kefir(11, "Витаминизированный", "Milka", LocalDate.of(2023, 7, 6)),
                new Kefir(12, "Биокефир", "Milka", LocalDate.of(2023, 6, 26)),
                new Milk(13, "Козье молоко", "Milka", LocalDate.of(2023, 6, 23)),
                new Milk(14, "Овечье молоко", "Milka", LocalDate.of(2023, 6, 23)),
                new Milk(15, "Верблюжье молоко", "Milka", LocalDate.of(2023, 7, 23)),
                new Yogurt(16, "Натуральный", "Milka", LocalDate.of(2023, 6, 7)),
                new Yogurt(17, "Ароматизированный", "Milka", LocalDate.of(2023, 6, 30)),
                new Yogurt(18, "Фруктовый", "Milka", LocalDate.of(2023, 6, 20)),
                new Bread(19, "Белый", "Nur", LocalDate.of(2023, 6, 30)),
                new Bread(20, "Ржаной", "Nur", LocalDate.of(2023, 7, 8)),
                new Bread(21, "Бездрожжевой", "Nur", LocalDate.of(2023, 6, 12)),
                new Macaroni(22, "Вермишель", "Nur", LocalDate.of(2023, 6, 30)),
                new Macaroni(23, "Спагетти", "ozho", LocalDate.of(2023, 7, 6)),
                new Macaroni(24, "Каппеллини", "Nur", LocalDate.of(2023, 6, 29)),
                new Torment(25, "Пшеничная", "Nur", LocalDate.of(2023, 5, 28)),
                new Torment(26, "Кукурузная", "Nur", LocalDate.of(2023, 6, 5)),
                new Torment(27, "Соевая", "Nur", LocalDate.of(2023, 6, 30))
        ));

        GroceryStoreServiceImpl groceryStoreService = new GroceryStoreServiceImpl();

        groceryStoreService.addProducts(productList);

        groceryStoreService.sortByDate(productList);

        Scanner scanner = new Scanner(System.in);
        System.out.println("longin:");
        String longin = scanner.nextLine();
        System.out.println("password:");
        String password = scanner.nextLine();
        groceryStoreService.getAllProducts(longin, password);
    }


}