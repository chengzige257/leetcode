package medium;

import org.testng.annotations.Test;

public class m62 {//不同路径

    public int uniquePaths(int m, int n) {
        long ans = 1;
        for (int x = n, y = 1; y < m; ++x, ++y) {
            ans = ans * x / y;
        }
        return (int) ans;
    }

    @Test
    public void main() {
        System.out.println(uniquePaths(10,10));
    }
}
