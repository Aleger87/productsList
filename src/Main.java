import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //task1
        Product product = new Product("яблоко", 22, 10);
        Product product2 = new Product("яблоко", 22, 10);
       //Product product1 = new Product("яблоко1", 221.1f, 101.123f);
/*        Product product2 = new Product("яблоко2", 222.2f, 102.223f);
        Product product3 = new Product("яблоко3", 223.3f, 103.323f);
        Product product4 = new Product("яблоко4", 224.4f, 104.423f);
        Product product5 = new Product("яблоко5", 224.4f, 1.1f);
        Product product = new Product("яsdsd", 22, 10);*/

        /*System.out.println(ProductMethod.correctList.toString());
        ProductMethod.correctList.remove(product);
        System.out.println(ProductMethod.correctList.toString());*/


        //task2
        Recipe recipe = new Recipe(ProductMethod.summ, "Шарлотка", product);
        Recipe recipe1 = new Recipe(ProductMethod.summ, "Шарлотка1", product);
        //Recipe recipe2 = new Recipe(ProductMethod.summ, "Шарлотка", product);
        //recipe.addProduct(product1);


        //System.out.println(recipe.toString());
        System.out.println(RecipeList.recipes.toString());


    }




}