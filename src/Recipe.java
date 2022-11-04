import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {
    private Set<Product> productsList = new HashSet<>();
    private float totalCost;
    private String recipeName;

    public Recipe(float totalCost, String recipeName, Product product ) {
        this.totalCost = totalCost;
        this.recipeName = recipeName;
        addProduct(product);
        RecipeList.addRecipe(this);

    }

    public void addProduct(Product product) {
        productsList.add(product);
    }

    @Override
    public String toString() {
        return "Название блюда = " + recipeName +
                "\nПродуктовый лист = " + productsList +
                "\nОбщая стоимость = " + totalCost +"\n\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Float.compare(recipe.totalCost, totalCost) == 0 && Objects.equals(recipeName, recipe.recipeName);
    }

/*    @Override
    public int hashCode() {
        return Objects.hash(totalCost, recipeName);
    }*/



    public float getTotalCost() {
        return totalCost;
    }

    public String getRecipeName() {
        return recipeName;
    }

}
