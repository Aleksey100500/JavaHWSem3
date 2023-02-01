import java.util.*;

public class JavaS3HW {
    public static void main(String[] args) {
        //1. Создать новый список, добавить несколько строк и вывести коллекцию на экран.

        String str1 = "Yellow";
        String str2 = "Blue";
        String str3 = "Red";
        String str4 = "Orange";

        List<String> list = new ArrayList<>();
        list.add(str1);
        list.add(str2);
        list.add(str3);
        list.add(str4);

        System.out.println(list);

        // 2.Итерация всех элементов списка цветов и добавления к каждому символа '!'.

        String symbol = "!";
        String temp;
        List<String> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            temp = list.get(i);
            temp = temp + symbol;
            list1.add(temp);
        }
        System.out.println(list1);

        // 3. Вставить элемент в список в первой позиции.

        list1.add(0, "Green!");
        System.out.println(list1);

        // 4. Извлечь элемент (по указанному индексу) из заданного списка.

        System.out.println(list1.get(0));

        // 5. Обновить определенный элемент списка по заданному индексу.

        list1.set(3,"Brown!");
        System.out.println(list1);

        // 6. Удалить третий элемент из списка.

        list1.remove(2);
        System.out.println(list1);

        // 7. Поиска элемента в списке по строке.

        System.out.println("Its index: " + list1.indexOf("Orange!"));

        // 8. Создать новый список и добавить в него несколько елементов первого списка.

        Random rnd = new Random();
        List<String> list2 = new ArrayList<>();
        for (int i = 0; i < rnd.nextInt(1, 3); i++) {
            list2.add(list1.get(i));
        }
        System.out.println("Its a new list: " + list2);

        // 9. Удалить из первого списка все элементы отсутствующие во втором списке.

        list1.removeAll(list2);
        System.out.println(list1);

        // 10. *Сортировка списка.

        Collections.sort(list1);
        System.out.println(list1);
    }
}
