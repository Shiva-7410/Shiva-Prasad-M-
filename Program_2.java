import java.util.Scanner;

public class Program_2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int res = 0;

        for (int i = 0; i < a; i++) {
            res = 2 * i + 1;
            System.out.print(res+",");
        }

    }
}
