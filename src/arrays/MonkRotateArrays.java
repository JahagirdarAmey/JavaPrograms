package arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MonkRotateArrays {

    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40, 50};


        int k = 2; //40 50 10 20 30

        List<Integer> original = IntStream.range(0, a.length - k).mapToObj(x -> a[x]).collect(Collectors.toList());
        List<Integer> rotation = IntStream.range(a.length - k, a.length).mapToObj(x -> a[x]).collect(Collectors.toList());


        rotation.addAll(original);


        System.out.println(rotation);
    }

}
