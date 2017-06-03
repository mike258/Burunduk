import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by User on 6/3/2017.
 */
public class SomeNumbers implements LongNumbers {
    @Override
    public List<Integer> FillInNumbers() {
        Random random = new Random();
        List<Integer> numbers = new LinkedList<>();
        for (int i = 0; i<3; i++){
            numbers.add(random.nextInt(100)+1);
        }
        for (Integer some : numbers){
            System.out.println(some);
        }
        return numbers;
    }

    @Override
    public void FillInLongNumbers() {

    }
}
