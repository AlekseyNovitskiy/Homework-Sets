import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Recipe {
    private final String name;
    private final float price;
    private final HashMap<Product, Integer> products;

    public Recipe(String name, HashMap<Product, Integer> products) {
        if (name == null || name.isBlank() || products == null || products.size() == 0) {
            throw new IllegalArgumentException("Не заполнены все поля");
        }
        this.name = name;
        this.price = getRecipePrice(products);
        this.products = products;
    }

    public Recipe(String name, float price, HashMap<Product, Integer> products) {
        if (name == null || name.isBlank() || products == null || products.size() == 0) {
            throw new IllegalArgumentException("Не заполнены все поля");
        }
        this.name = name;
        this.price = price;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public HashMap<Product, Integer> getProducts() {
        return products;
    }

    public float getRecipePrice() {
        float sum = 0;
        for (Map.Entry<Product, Integer>  product : this.products.entrySet()) {
            sum += product.getKey().getPrice() * product.getValue();
        }
        return sum;
    }

    public float getRecipePrice(HashMap<Product, Integer>  products) {
        float sum = 0;
        for (Map.Entry<Product, Integer>  product : products.entrySet()) {
            sum += product.getKey().getPrice() * product.getValue();
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){ return true;}
        if (o==null|| getClass()!=o.getClass()) {
            return false;
        }
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", products=" + products +
                '}';
    }
}
