import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Set;

public class RecipeList {
    private final Set<Recipe> recipes = new HashSet<>();

    public void addRecipe(Recipe recipe) {
        if (recipes.contains(recipe)) {
            throw new IllegalArgumentException("Рецепт с таким названием уже существует");
        } else {
            recipes.add(recipe);
        }
    }
    public void addRecipe(Set<Recipe> recipe) {
        for (Recipe currentRecipe : recipe) {
            this.addRecipe(currentRecipe);
        }
    }

    public Set<Recipe>  getListRecipe()
    {
        return this.recipes;
    }
}
