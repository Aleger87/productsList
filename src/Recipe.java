import java.util.*;

public class Recipe {
    private Map<String, Float> productsList = new HashMap<>();
    private float totalCost;
    private final String recipeName;



    public Recipe(String recipeName, Product product) {
        this.recipeName = recipeName;
        addProduct(product);
        RecipeList.addRecipe(this);

    }

    public void addProduct(Product product) {

        if (!productsList.containsKey(product.getName())) {
            productsList.put(product.getName(), (float) product.getCount());
            totalCost = getTotalCost() + product.getSumm();
        }

    }

    @Override
    public String toString() {
        return  "название блюда" +
                "\nПродуктовый лист = " + productsList +
                "\nНа сумму = " + totalCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Float.compare(recipe.totalCost, totalCost) == 0 && Objects.equals(recipeName, recipe.recipeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCost, recipeName);
    }


    public Map<String, Float> getProductsList() {
        return productsList;
    }

    public float getTotalCost() {
        return totalCost;
    }

    public String getRecipeName() {
        return recipeName;
    }

}
