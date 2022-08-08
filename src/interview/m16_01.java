package interview;

public class m16_01 {//交换数字
    public int[] swapNumbers(int[] numbers) {//任何数和自身异或为0，与0异或为自身
        numbers[0] = numbers[0]^numbers[1];
        numbers[1] = numbers[0]^numbers[1];
        numbers[0] = numbers[0]^numbers[1];
        return numbers;
    }
}
