package easy;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class easy119 {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<Integer>();
        row.add(1);
        for (int i = 1; i <= rowIndex; ++i) {
            row.add((int) ((long) row.get(i - 1) * (rowIndex - i + 1) / i));
        }
        return row;
    }

    @Test
    public void main() {
        List<Integer> row = getRow(5);
        for (Integer integer : row) {
            System.out.println(integer);
        }
    }
}

