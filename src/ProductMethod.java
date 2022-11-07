import java.util.HashSet;
import java.util.Set;

public class ProductMethod {
    public static Set<Product> correctList = new HashSet<>();

    public static boolean checkName(String name) {
        for (int i = 0; i < correctList.size(); i++) {
            if (correctList.contains(name)) {
                try {
                    throw new ProductException("Имя"+ name +"уже есть в списке ");
                } catch (ProductException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        return false;
    }


    public static void addNewProduct(Product product) {
        if (!correctList.add(product)) {
            try {
                throw new ProductException("Товар "+product.getName()+" уже есть в списке");
            } catch (ProductException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
