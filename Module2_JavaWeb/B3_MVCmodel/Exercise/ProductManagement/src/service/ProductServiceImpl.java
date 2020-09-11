package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {

    private static Map<Integer, Product> productMap;

    static {
        productMap = new HashMap<>();
        productMap.put(1, new Product(1, "Sach", 15000, "sach thieu nhi", "nha xuat ban Nhi Dong"));
        productMap.put(2, new Product(2, "Vo", 10000, "vo o ly 96 trang", "Campus"));
        productMap.put(3, new Product(3, "But muc", 5000, "but gel muc xanh", "Thien Long"));
        productMap.put(4, new Product(4, "But chi", 3000, "but chi 2b", "Ben Nghe"));
        productMap.put(5, new Product(5, "Thuoc ke", 7000, "thuoc ke nhua 15cm", "Ben Nghe"));
        productMap.put(6, new Product(6, "Balo", 120000, "balo hoc sinh co nho", "Miti"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public void update(int id, Product product) {
        productMap.put(id, product);
    }

    @Override
    public void remove(int id) {
        productMap.remove(id);
    }

    @Override
    public Product findByName(String name) {
        for (Product product : findAll()) {
            if (product.getName().contains(name)) {
                return product;
            }
        }
        return null;
    }

    public List<Product> searchProduct(String keyword) {
        ArrayList<Product> arrayList = new ArrayList<>();
        for (Product product : findAll()) {
            if (product.getName().contains(keyword)) {
                arrayList.add(product);
            }
        }
        return arrayList;
    }
}
