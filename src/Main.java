import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Задание 1.1
        System.out.println("Задание 1.1");

        TelephoneDirectory map = new TelephoneDirectory();

        System.out.println(map);

        // Задание 1.2
        System.out.println("Задание 1.2");

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


        HashMap<Product, Integer> forEveryRecipe = new HashMap<>();
        forEveryRecipe.put(cucumbers, 2);
        forEveryRecipe.put(tomatoes, 3);

        Recipe recipe = new Recipe("Салат", forEveryRecipe);
        forEveryRecipe.clear();
        forEveryRecipe.put(apples, 25);
        forEveryRecipe.put(sugar, 1);

        Recipe recipe1 = new Recipe("Яблочное варенье", forEveryRecipe);
        forEveryRecipe.clear();
        forEveryRecipe.put(pear, 40);
        forEveryRecipe.put(sugar, 1);

        Recipe recipe2 = new Recipe("Грушевое варенье", forEveryRecipe);
        //Recipe recipeTest = new Recipe("Яблочное варенье", Set.of(apples, pear, sugar));

        RecipeList allRecipe = new RecipeList();
        allRecipe.addRecipe(Set.of(recipe,recipe1,recipe2));

        //allRecipe.addRecipe(recipeTest);

        for (Recipe recipeOut : allRecipe.getListRecipe())
            System.out.println(recipeOut);

        //задание 1.3
        System.out.println("Задание 1.3");

        ArbitraryMaps arbitraryMap = new ArbitraryMaps();
        arbitraryMap.setArbitraryMap("str2",1);
        //arbitraryMap.setArbitraryMap("str1",2);
        arbitraryMap.setArbitraryMap("str1",5);



        //Задание 2.1
        System.out.println("Задание 2.1");

        Map<String, List<Integer>> nameKeyForList = new HashMap<>();
        Random r = new Random();
        nameKeyForList.put("Земля", List.of(r.nextInt(1000),r.nextInt(1000),r.nextInt(1000)));
        nameKeyForList.put("Меркурий", List.of(r.nextInt(1000),r.nextInt(1000),r.nextInt(1000)));
        nameKeyForList.put("Венера", List.of(r.nextInt(1000),r.nextInt(1000),r.nextInt(1000)));
        nameKeyForList.put("Марс", List.of(r.nextInt(1000),r.nextInt(1000),r.nextInt(1000)));
        nameKeyForList.put("Юпитер", List.of(r.nextInt(1000),r.nextInt(1000),r.nextInt(1000)));

        Map<String, Integer> nameKeyForSum = new HashMap<>();
        for (Map.Entry<String, List<Integer>>  currentMapElement : nameKeyForList.entrySet()) {
            int sum = 0;
            for (int currentValues : currentMapElement.getValue())
            {
                sum+=currentValues;
            }
            nameKeyForSum.put(currentMapElement.getKey(),sum);
        }

        for (Map.Entry<String, Integer>  currentMapElement : nameKeyForSum.entrySet()) {
            System.out.println("Элемент с ключем: " + currentMapElement.getKey()  + ". Имеет значение " + currentMapElement.getValue());
        }
        System.out.println();


        //Задание 2.2
        System.out.println("Задание 2.2");
        Map<Integer, String> countKeyMap = new LinkedHashMap<>();
        while (countKeyMap.size()<10) {
            Random random = new Random();
            switch (countKeyMap.size()) {
                case 0:
                    countKeyMap.put(random.nextInt(100), "Сон Е Джин");
                    break;
                case 1:
                    countKeyMap.put(random.nextInt(100), "Ким Го Ын");
                    break;
                case 2:
                    countKeyMap.put(random.nextInt(100), "Со Йе Джи");
                    break;
                case 3:
                    countKeyMap.put(random.nextInt(100), "Пак Мин Ён");
                    break;
                case 4:
                    countKeyMap.put(random.nextInt(100), "Чо Бо А");
                    break;
                case 5:
                    countKeyMap.put(random.nextInt(100), "Ли Со Гён");
                    break;
                case 6:
                    countKeyMap.put(random.nextInt(100), "Сюзи");
                    break;
                case 7:
                    countKeyMap.put(random.nextInt(100), "Ким Со Ён");
                    break;
                case 8:
                    countKeyMap.put(random.nextInt(100), "Мун Га Ён");
                    break;
                case 9:
                    countKeyMap.put(random.nextInt(100), "Мун Чэ Вон");
                    break;
                default:
                    System.out.println("Заполнено");
            }
        }

        for (Map.Entry<Integer, String>  currentMapElement : countKeyMap.entrySet()) {
            System.out.println("Элемент с ключем: " + currentMapElement.getKey()  + ". Имеет значение " + currentMapElement.getValue());
        }
        System.out.println();
    }


}
