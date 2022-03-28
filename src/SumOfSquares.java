import java.util.ArrayList;
import java.util.List;

public class SumOfSquares {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(sumOfSquareOdd(list));
        System.out.println(list.stream().filter(s->s%2!=0).toList());
        System.out.println(list);
    }


    static int sumOfSquareOdd(List<Integer> list){
        int sum = 0;
        sum = sum + list.stream().filter(s->s%2!=0).mapToInt(x->x*x).sum();
        return sum;
    }


}
