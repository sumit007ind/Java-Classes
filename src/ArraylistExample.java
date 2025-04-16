import java.util.ArrayList;

public class ArraylistExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.set(0,100);
        System.out.println(list.contains(5));
        System.out.println(list);


    }

}
