import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx2 {
    public static void main(String args[]) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(5);
        num.add(2);
        num.add(1);
        num.add(3);
        num.add(0);
        num.add(8);
        num.add(6);
        num.add(7);
        num.add(9);
        num.add(101);
        num.add(10);
        Iterator<Integer> iterator = num.iterator();
        while(iterator.hasNext()){
            int i = iterator.next();
            System.out.println(i);
            if((i % 2) == 0){
                iterator.remove();
            }
        }
        System.out.println(num);
    }
}
