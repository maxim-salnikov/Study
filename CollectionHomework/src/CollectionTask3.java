import java.util.*;

public class CollectionTask3 {
    public static void main(String[] args) {

        List<SortAndFilterTestClass> list = new ArrayList<>();
        list.add(new SortAndFilterTestClass(122));
        list.add(new SortAndFilterTestClass(3));
        list.add(new SortAndFilterTestClass(9));
        list.add(new SortAndFilterTestClass(58));
        list.add(new SortAndFilterTestClass(67));

        System.out.println("Вывод коллекции в консоль");
        for (SortAndFilterTestClass sortAndFilterTestClass : list) {
            System.out.println(sortAndFilterTestClass);
        }

        System.out.println("Вывод коллекции в консоль после сортировки");
        Collection myList = FilterApplicator.sort(list);
        for (Object o : myList) {
            System.out.println(o);
        }

        List myList1 = new ArrayList();
        myList1.add("Привет");
        myList1.add("мне");
        myList1.add(25);
        myList1.add("лет");
        System.out.println("Вывод коллекции в консоль");

        for (Object o : myList1) {
            System.out.println(o);
        }
        System.out.println("Вывод коллекции в консоль после фильтрации");

        FilterApplicator.filter(myList1, new MyFilter());
        for (Object o : myList1) {
            System.out.println(o);
        }
    }
}
