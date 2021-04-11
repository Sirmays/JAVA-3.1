package Task1and2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Changer<type> {

    public void doTask1(type[] arr) {

        for (int i = 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }


    public void doTask2(type[] arr) {
        List<type> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);
    }
}


