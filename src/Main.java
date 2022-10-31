import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Задание 1.1
        System.out.println("Задание 1.1");

        Product cucumbers = new Product("Огурцы", 60.0f, 1);
        Product tomatoes= new Product("Помидоры", 230.0f, 2);
        Product apples= new Product("Яблоки", 270.0f, 4);
        Product pear= new Product("Груша", 120.0f, 1);
        Product sugar= new Product("Сахар", 80.9f, 1);
        ProductList productList = new ProductList();
        productList.addProduct(cucumbers);
        productList.addProduct(tomatoes);
        productList.addProduct(apples);
        productList.addProduct(pear);
        productList.addProduct(sugar);
        System.out.println(productList);
        //Product tomatoes2= new Product("Помидоры", 280.0f, 5);
       // productList.addProduct(tomatoes2);

        // Задание 2.1
        System.out.println("Задание 2.1");

        Recipe recipe = new Recipe("Салат", Set.of(cucumbers, tomatoes));
        Recipe recipe1 = new Recipe("Яблочное варенье", Set.of(apples, sugar));
        Recipe recipe2 = new Recipe("Грушевое варенье", Set.of(pear, sugar));
        Recipe recipeTest = new Recipe("Яблочное варенье", Set.of(apples, pear, sugar));

        RecipeList allRecipe = new RecipeList();
        allRecipe.addRecipe(Set.of(recipe,recipe1,recipe2));

        //allRecipe.addRecipe(recipeTest);

        for (Recipe recipeOut : allRecipe.getListRecipe())
            System.out.println(recipeOut);


        // Задание 2.2
        System.out.println("Задание 2.2");
        numbersSetRemoveEven();

        // Задание 3.2
        System.out.println("Задание 2.2");
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        for (Task outTask : multiplicationTable.getTasks())
            System.out.println(outTask);


    }

    private static void numbersSetRemoveEven() {
        Set<Integer> numbers = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(1000));
        }
        System.out.println(numbers);
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 != 0) {
                iterator.remove();
            }
        }
        System.out.println(numbers);

    }

}