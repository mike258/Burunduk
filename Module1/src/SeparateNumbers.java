import java.util.List;

/**
 * Created by User on 6/3/2017.
 */
public class SeparateNumbers extends SomeNumbers {
    @Override
    public void FillInLongNumbers() {
        List<Integer> numbers = new SomeNumbers().FillInNumbers();
        int[][] mas = new int[3][3];
        for (int i = 2; i >= 0; i--) {
            int temp = numbers.get(i);
            for (int y = 2; y >= 0; y--) {
                if (temp > 0) {
                    int lastDigit = temp % 10;
                    mas[i][y] = lastDigit;
                    temp = temp / 10;
                    System.out.print(mas[i][y] + " ");
                }
            }
            System.out.println();
        }

    }
}

