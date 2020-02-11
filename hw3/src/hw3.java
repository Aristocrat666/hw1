import java.util.HashMap;

public class hw3 {
    public static void main(String[] args) {
        String[] fruit = {"1", "2", "3", "1", "2", "3", "1", "2", "3", "3", "4"};
        HashMap<String, Integer> fetus = new HashMap<>();
        for (String x : fruit) {
            fetus.put(x, fetus.getOrDefault(x,0)+1);
        }
        System.out.println(fetus);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // создаем книгу
        Book book = new Book();
        book.addContact("Egor", "111111");
        book.addContact("Egor", "222222");
        book.addContact("Egor", "333333");
        book.addContact("Roma", "444444");
        book.addContact("Sena", "555555");
        book.addContact("Sena", "666666");

        // ищем по имени
        book.findAndPrint("Egor");
        book.findAndPrint("Roma");
        book.findAndPrint("Sena");

    }
}
