import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Product {
    private String name;
    private float price;
    private float count;
    private float summ;

    public Product(String name, float price, float count) {
        setName(name);
        setPrice(price);
        setCount(count);
        summ = summ + price * count;
        ProductMethod.addNewProduct(this);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Float.compare(product.price, price) == 0 && Float.compare(product.count, count) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, count);
    }

    @Override
    public String toString() {
        return "продукт ='" + name  +
                ", по цене =" + price +
                ", в количестве =" + count +
                ", на сумму = " + summ;
    }

    private boolean checkCorrectName(String name) {
        final String regex = "[а-яА-Я0-9]";
        final String string = name;

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(string);

        if (matcher.find()) {
            return true;
        }
        return false;

    }

    public float getSumm() {
        return summ;
    }


    public String getName() {
        return name;
    }

    public double getCount() {
        return count;
    }

    public float getPrice() {
        return price;
    }


    public void setName(String name) {
        if (name == null && name.isEmpty() && name.isBlank()) {
            throw new RuntimeException("Необходимо указать название");
        }
        if (!checkCorrectName(name)) {
            throw new RuntimeException("Имя "+name+" должно быть на русском языке");
        }
        if (ProductMethod.checkName(name)) {
            throw new RuntimeException("товар " + getName() + " " + getPrice() + " " + getCount() + " уже есть в списке");
        }
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setCount(float count) {
        if (count <= 0) {
            count = 1;
        }
        this.count = count;
    }

}
