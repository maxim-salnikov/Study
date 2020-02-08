
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class CollectionsMain3 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        System.out.println("Количество элементов " + queue.size());

        queue.add("element 1");
        queue.add("element 3");
        queue.add("element 2");

        for (String s : queue) {
            System.out.println(s);
        }

//        System.out.println("Количество элементов после итераций " + queue.size());
//
//        Iterator<String> iterator = queue.iterator();
//        while (iterator.hasNext()){
//            System.out.println(queue.element());
//        }

        System.out.println("Количество элементов после итераций " + queue.size());


        for (int i = 0; i < 10000; i++) {
            System.out.println(queue.poll());
        }
    }
}
