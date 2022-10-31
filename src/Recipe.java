import java.util.Objects;
import java.util.Set;

public class Recipe {
    private final String name;
    private final float price;
    private final Set<Product> products;

    public Recipe(String name, Set<Product> products) {
        if (name == null || name.isBlank() || products == null || products.size() == 0) {
            throw new IllegalArgumentException("Не заполнены все поля");
        }
        this.name = name;
        this.price = getRecipePrice(products);
        this.products = products;
    }

    public Recipe(String name, float price, Set<Product> products) {
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

    public Set<Product> getProducts() {
        return products;
    }

    public float getRecipePrice() {
        float sum = 0;
        for (Product product:products) {
            sum += product.getPrice();
        }
        return sum;
    }

    public float getRecipePrice(Set<Product> products) {
        float sum = 0;
        for (Product product:products) {
            sum += product.getPrice();
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
