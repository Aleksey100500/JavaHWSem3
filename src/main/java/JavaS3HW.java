import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JavaS3HW {
    public static void main(String[] args) {
        //1. Создать новый список, добавить несколько строк и вывести коллекцию на экран.
        String str1 = "Hello!";
        String str2 = "HelloWorld!";
        String str3 = "HelloWorldJava!";
        String str4 = "Hello!";

        List<String> list = new ArrayList<>();
        list.add(str1);
        list.add(str2);
        list.add(str3);
        list.add(str4);

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }

    }
}
