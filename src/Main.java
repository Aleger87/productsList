import java.util.*;

public class Main {
    public static void main(String[] args) {
        //task1.1
        Product product = new Product("яблоко", 22, 10);    // создан новый продукт, добавлен в список продуктов ProductMethod
        Product product1 = new Product("сахар", 100, 1);  // создан новый продукт, добавлен в список продуктов ProductMethod
        Product product2 = new Product("яйца", 10, 3);  // создан новый продукт, добавлен в список продуктов ProductMethod
        Product product3 = new Product("яблоко", 22, 10);   // создан новый продукт, не добавлен в список продуктов в рецепте, выводит информацию о наличии товара в списке


        //Product product7 = new Product("hsdsd", 22, 10); //выкидывает исключение Название на русском..
        //Product product7 = new Product("", 22, 10); //выкидывает исключение Название не заполнено..

        System.out.println(ProductMethod.correctList.toString());       // выводит список продуктов
        ProductMethod.correctList.remove(product);                      // удаляет продукт из списка
        System.out.println(ProductMethod.correctList.toString());       // выводит новый список продуктов


        //task1.2
        Recipe recipe = new Recipe("Шарлотка", product);      // создан новый рецепт и добавлен продукт в список в формате "название: количество" записываем сумму(количество в продукте * цену ) 220
        recipe.addProduct(product1);                                    // создан новый рецепт и добавлен продукт в список в формате "название: количество" записываем сумму(количество в продукте * цену) 100
        recipe.addProduct(product2);                                    // создан новый рецепт и добавлен продукт в список в формате "название: количество" записываем сумму(количество в продукте * цену) 30
        recipe.addProduct(product3);                                    // в рецепт НЕ добавлен новый продукт

        System.out.println("Название блюда " + recipe.getRecipeName());
        System.out.println("Продуктовый лист "+recipe.getProductsList());
        System.out.println("На сумму " +recipe.getTotalCost());


        //task 1.3(map)
        Map<String, Integer> list2 = new HashMap<>();
        String key0 = "Key";
        int number = 1;
        addDataInMap(list2, key0, number);
        String key1 = "Key1";
        int number1 = 12;
        addDataInMap(list2, key1, number1);
        System.out.println(list2);


        //task 2.1

        int a = 1;
        int b = 1000;
        int count = 0;

        Map<String, List<Integer>> mapList = new HashMap<>();

        // коллекция map заполняется 5-ю парами: ключ -"string + число size" значение -List из трех уникальных случайных чисел в диапазоне от 1 до 1000 при помощи метода createSetList
        while (mapList.size() < 5) {
            mapList.put("string"+count, createSetList(a, b));
            count++;
        }

        //вывод коллекции
        System.out.println(mapList);

        //преобразование коллекции mapList в newMapList: ключ -"string + число size". значение -сумма чисел в коллекции List при помощи метода sum
        Map<String, Integer> newMapList = new HashMap<>();
        for (var key: mapList.keySet()) {
            newMapList.put(key, sum(mapList.get(key)));
        }
        //вывод новой коллекции
        System.out.println(newMapList);


        //task 2.2

        TreeMap<Integer, String> map = new TreeMap<>();
        int count0 = 10;
        while (map.size() < count0) {
            map.put(map.size(), "map" + map.size());
        }
        for (var k : map.keySet()) {
            printMap(k, map.get(k));
        }

        //task2-----------------------------------------------
        //Хеш и хеш-функции. Множества задание из урока 2.2
        ArrayList<Integer> list = new ArrayList<>();
        while (list.size() < 20) {
            list.add((int) (Math.random() * (1000 - 1) + 1));
        }
        System.out.println(list.toString());
        list.removeIf(integer -> integer % 2 == 0);
        System.out.println(list.toString());
        //---------------------------------------------------

    }


    public static void printMap(int key, String str) {
        System.out.println(key + ":" + str);
    }

    private static Integer sum(List<Integer> integers) {
        int sum = 0;
        for (int s: integers) {
            sum = sum + s;
        }
        return sum;
    }

    private static List<Integer> createSetList(int a, int b) {
        int count = 0;
        Set<Integer> integers = new HashSet<>();
        while(count < 3){
            if (integers.add(createNumbers(a, b))) {
                count++;
            }
        }
        List<Integer> list = new ArrayList<>();
        list.addAll(integers);
        return list;
    }



    public static int createNumbers(int a, int b) {
        int random_number1 = a + (int) (Math.random() * b);
        return random_number1;
    }


    private static Map<String, Integer> addDataInMap(Map<String, Integer> mapList, String str, int i) {
        if (!mapList.containsKey(str) || !mapList.containsValue(i)) {
            mapList.put(str, i);
        } else {
            throw new RuntimeException("Ключ и значение совпадают");
        }
        return mapList;
    }




}