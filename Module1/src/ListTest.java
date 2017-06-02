import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListTest {
    public void fillList(){
        Random random = new Random();
        List<Integer> numbers = new LinkedList<>();
        for (int i = 0; i < 5; i++){
            numbers.add(random.nextInt(10));
        }
        for(Integer temp : numbers){
            System.out.println(temp);
        }
    }
}
