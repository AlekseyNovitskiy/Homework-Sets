import javax.swing.plaf.PanelUI;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProductList {
    private final Set<Product> products = new HashSet<>();

    public void addProduct(Product product) {
        if (products.contains(product)) {
            throw new ProductAlreadyExistsException();
        } else {
            products.add(product);
        }
    }
    public void checkProduct(String name) {
        for (Product product:products) {
            if (product.getName().equals(name)) {
                product.setChecked();
                break;
            }
        }
    }
    public void removeProduct(String name) {
        Iterator<Product> productIterator = products.iterator();
        while (productIterator.hasNext()) {
            if (productIterator.next().getName().equals(name)) {
                productIterator.remove();
                break;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список продуктов: ").append('\n');
        for (Product product : products) {
            stringBuilder.append(product).append('\n');
        }
        return stringBuilder.toString();
    }
}
