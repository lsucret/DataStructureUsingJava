package chapter3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        extracted();
    }

    /**
     * p.85 문제 03-1
     */
    private static void extracted() {
        List<Integer> list = new LinkedList();
        for (int i = 1; i < 10; i++) {
            list.add(i);
        }
        Integer sum = 0;
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            sum += iterator.next();
        }
        System.out.println("sum : " + sum);
        for (int i = (list.size() - 1); i >= 0; i--) {
            Integer num = list.get(i);
            if (num % 3 == 0 || num % 2 == 0) {
                list.remove(i);
            }
        }
        list.stream().forEach(System.out::println);
    }
}
