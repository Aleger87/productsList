import java.util.*;


public class Recipe {
    private Map<Product, Float> productsList = new HashMap<>();
    private float totalCost;
    private final String recipeName;



    public Recipe(String recipeName, Product product) {
        this.recipeName = recipeName;
        addProduct(product);
        RecipeList.addRecipe(this);

    }

    public void addProduct(Product product) {
        productsList.put(product, (float) product.getCount());
    }

    public float getTotalSum() {
        for (var sum : productsList.keySet()) {
            totalCost += sum.getSumm();
        }
        return totalCost;
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
        return Float.compare(recipe.totalCost, totalCost) == 0 && Objects.equals(productsList, recipe.productsList) && Objects.equals(recipeName, recipe.recipeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productsList, totalCost, recipeName);
    }

    public Map<Product, Float> getProductsList() {
        return productsList;
    }

    public String getRecipeName() {
        return recipeName;
    }

}
