package strings;

import java.util.Map;
import java.util.stream.Collectors;

public class ZooProgram {

    public static void main(String args[]) throws Exception {

        String name = "zzzooooooo";

        Map<Character, Long> collect = name.chars().mapToObj(x -> (char) x).collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        Long z = collect.get('z');
        Long o = collect.get('o');

        if (z * 2 == o) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
