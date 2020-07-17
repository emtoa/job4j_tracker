package myself.pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test19 {

public static void main(String[] args) {
    ArrayList<Integer> myList = new ArrayList<>();
    myList.add(7);
    myList.add(18);
    myList.add(10);
    myList.add(24);
    myList.add(17);
    myList.add(8);

  Optional<Integer> productObj =
            myList.stream().reduce( (а,Ь) -> а*Ь);

    int productObj1 =
            myList.stream().reduce(0, (а,Ь) -> а+Ь);

    System.out.println(productObj1);

    if(productObj.isPresent())
        System.out.println("Пpoизвeдeниe в виде объекта "
                + "типа Optional: " + productObj.get());
}

}
