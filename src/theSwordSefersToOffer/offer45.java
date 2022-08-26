package theSwordSefersToOffer;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

public class offer45 {
    public String minNumber(int[] nums) {
        String reduce = Arrays.stream(nums).mapToObj(String::valueOf).sorted((a,b)-> (a+b).compareTo(b+a)).reduce("", (a, b) -> a + b);
        return reduce;
    }
    @Test
    public void main() {

    }
}
