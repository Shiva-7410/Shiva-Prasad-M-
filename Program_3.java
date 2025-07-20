import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 1;
        int num = 1;
        if(a%2==0){
             count = a-1;
        }
        else {
            count = a;
        }
        for(int i=0; i < count; i++){
            System.out.print(num+",");
            num = num + 2;
        }
    }
}
