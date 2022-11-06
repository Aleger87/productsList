
import java.util.HashMap;
import java.util.Map;


public class RecipeList {
    public static Map<String, Recipe> recipes = new HashMap<>();

    public static void addRecipe(Recipe recipe) {
        if (recipes.containsKey(recipe.getRecipeName())) {
            throw new RuntimeException("Рецепт " + recipe.getRecipeName() +" уже есть");
        }
        recipes.put(recipe.getRecipeName(), recipe);
    }
}
