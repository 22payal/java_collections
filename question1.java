import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class question1 {

    public static void main(String[] args) {

        float sum = 0;

        List<Float> linkedNumbers = new LinkedList<>();

            linkedNumbers.add(new Float(1.14));
            linkedNumbers.add(new Float(2.14));
            linkedNumbers.add(new Float(3.14));
            linkedNumbers.add(new Float(4.14));
            linkedNumbers.add(new Float(5.14));



        Iterator<Float> iterator = linkedNumbers.iterator();
        while (iterator.hasNext()) {
             float n = iterator.next();
            sum += n;

        }

        System.out.println("Sum Of Numbers:" + sum);
    }
}
