import java.util.*;

public class Main {
    public static void main(String[] args) {
        //task1
        /*Product product = new Product("яблоко", 22, 10);
        Product product2 = new Product("яблоко", 22, 10);
        Product product1 = new Product("яблоко1", 22, 10);*/
      /* Product product2 = new Product("яблоко1", 221.1f, 101.123f);
        Product product3 = new Product("яблоко2", 222.2f, 102.223f);
        Product product4 = new Product("яблоко3", 223.3f, 103.323f);
        Product product5 = new Product("яблоко4", 224.4f, 104.423f);
        Product product6 = new Product("яблоко5", 224.4f, 1.1f);
        Product product7 = new Product("яsdsd", 22, 10);*/

        /*System.out.println(ProductMethod.correctList.toString());
        ProductMethod.correctList.remove(product);
        System.out.println(ProductMethod.correctList.toString());*/


        //task2
        //Recipe recipe = new Recipe("Шарлотка", product);
        //Recipe recipe1 = new Recipe(ProductMethod.summ, "Шарлотка1", product);
        //Recipe recipe2 = new Recipe(ProductMethod.summ, "Шарлотка", product);
        /*recipe.addProduct(product1);
        recipe.addProduct(product2);*/


        //System.out.println(recipe.toString());
        //System.out.println(RecipeList.recipes.toString());



        //task3
        /*ArrayList<Integer> list = new ArrayList<>();
        while (list.size() < 20) {
            list.add((int) (Math.random() * (1000 - 1) + 1));
        }
        System.out.println(list.toString());
        list.removeIf(integer -> integer % 2 == 0);
        System.out.println(list.toString());*/

        //task 1..3(map)
      /*  Map<String, Integer> list = new HashMap<>();
        String key = "Key";
        int number = 1;
        addDataInMap(list, key, number);
        String key1 = "Key";
        int number1 = 2;
        addDataInMap(list, key1, number1);
        System.out.println(list);*/

        //task 2.1

        /*int a = 1;
        int b = 1000;
        int count = 0;

        Map<String, List<Integer>> mapList = new HashMap<>();

        while (mapList.size() < 5) {
            mapList.put("string"+count, createSetList(a, b));
            count++;
        }
        System.out.println(mapList);

        Map<String, Integer> newMapList = new HashMap<>();
        for (var key: mapList.keySet()) {
            newMapList.put(key, sum(mapList.get(key)));
        }
        System.out.println(newMapList);*/

        //task 2.2
        Map<Integer, String> map = new HashMap<>();
        int count = 10;
        while (map.size() < count) {
            map.put(map.size(), "map" + map.size());
        }
        for (var k : map.keySet()) {
            printMap(k, map.get(k));
        }

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
        if (!mapList.containsKey(str)) {
            mapList.put(str, i);
        } else {
            mapList.remove(str);
            mapList.put(str, i);
        }
        return mapList;
    }




}