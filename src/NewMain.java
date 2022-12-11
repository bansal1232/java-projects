import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewMain {
    public static void main(String[] args) {

        List<Integer> listOfNumbers = new ArrayList<>();
        for(int i=0; i<100; ++i) {
            listOfNumbers.add(i);
        }
        long currentTime = System.currentTimeMillis();
        listOfNumbers.parallelStream().forEach(number -> {
                    Testing.failChecker();
                    System.out.println(number + " " + Thread.currentThread().getName());
                }
        );

        System.out.println("Finished: "+ (System.currentTimeMillis() - currentTime));
    }
}
/*
*
Finished: 13199
Finished: 13204


* */