package kakao.q2018;

import java.util.ArrayList;
import java.util.List;

public class NewsClustering {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(1);
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list1.retainAll(list2);
        for (Integer i : list1) {
            System.out.print(i + " ");
        }
    }
}
