import java.util.*;

public class Recipe {
    private Map<Product, Float> productsList = new HashMap<>();
    private float totalCost;
    private String recipeName;



    public Recipe(String recipeName, Product product) {
        this.recipeName = recipeName;
        addProduct(product);
        RecipeList.addRecipe(this);

    }

    public void addProduct(Product product) {
        if (!productsList.containsKey(product)) {
            productsList.put(product, (float) product.getCount());
            totalCost = getTotalCost()+ product.getSum();
        }

    }

    @Override
    public String toString() {
        return "Название блюда = " + recipeName +
                "\nПродуктовый лист = " + productsList +
                "\nНа сумму = " + getTotalCost() + "\n\n";
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


    public float getTotalCost() {
        return totalCost;
    }

    public String getRecipeName() {
        return recipeName;
    }

}
