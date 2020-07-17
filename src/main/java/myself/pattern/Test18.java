package myself.pattern;

import jdk.dynalink.Operation;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class Test18 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);

        Stream<Integer> myStream = myList.stream();
        Stream<Integer> myStream1 = myList.stream();
        Optional<Integer> minVal = myStream.min(Integer::compare);
        Optional<Integer> maxVal = myStream1.max(Integer::compare);
        if (minVal.isPresent()) {
            System.out.println(myList.stream().count());
            System.out.println(
                    "Минимальное значение: " + minVal.get()+" "+ maxVal.get());
        }

        ArrayList<Double> rnyList = new ArrayList<>( );
        rnyList.add(7.0);
        rnyList.add(18.0);
        rnyList.add(10.0);
        rnyList.add(24.0);
        rnyList.add(12.0);
        rnyList.add(5.0);
        rnyList.add(0.0);
        double productOfSqrRoots = rnyList.parallelStream().reduce(
                1.0,
                (а,b) -> а + b,
                (а,b) -> а + b);
        System.out.println("Пpoизвeдeниe квадратных корней: "
                + productOfSqrRoots);
    }
}
