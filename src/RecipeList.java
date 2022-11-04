import java.util.HashSet;
import java.util.Set;

public class RecipeList {
    public static Set<Recipe> recipes = new HashSet<>();

    public static void addRecipe(Recipe recipe) {
        for (var r: recipes) {
            if (recipe.getRecipeName().equals(r.getRecipeName())) {
                throw new RuntimeException("Рецепт " + recipe.getRecipeName() +" уже есть");
            }
        }
        recipes.add(recipe);
    }
}
