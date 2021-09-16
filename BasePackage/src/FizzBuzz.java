import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class FizzBuzz {
    public static void main(String[] args) {
        countTo();

    }


    public static void countTo() {
        Map<Integer, String> keyNumberDict = new HashMap<Integer, String>();
        keyNumberDict.put(3, "Fizz");
        keyNumberDict.put(5, "Buzz");
        ArrayList<String> finalArray = new ArrayList<String>();
        for (int i = 1; i < 101; i++) {
            String result = "";
            for (Integer num : keyNumberDict.keySet()) {
                result += (i % num == 0) ? keyNumberDict.get(num) : "";
            }

            if (result.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(result);
            }
        }


    }

}
