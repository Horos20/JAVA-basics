package week3;

import java.util.ArrayList;
public class Ex66 {
    public static int greatest(ArrayList<Integer> list) {
        int largestNumber = list.get(0);
        for(Integer d : list)
            if (d > largestNumber) {
                largestNumber = d;
            }
        return largestNumber;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The greatest number is: " + greatest(list));
    }
}
