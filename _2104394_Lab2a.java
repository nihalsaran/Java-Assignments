import java.util.Scanner;

public class _2104394_Lab2a {
    public static int findMaxCoins(int val) {
        int coins = 0;
        while (val>0 && val != 1) {
            if (val % 2 == 0) {
                val /= 2;
            } else {
                val=val+(val*2)+1;
            }
            coins++;
        }
        return coins;
    }

    public static void main(String[] args) {
        int x, maxCoins = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of X : ");
        x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            maxCoins = Math.max(maxCoins, findMaxCoins(i));
        }

        System.out.println(maxCoins);
    }
}