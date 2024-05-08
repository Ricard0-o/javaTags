import java.util.Scanner;

public class I4 {
    public static void main(String[] args) {
        
        Scanner sc = new.Scanner(System.in)

        Sytem.out.println("Digite um numero para a sua tabuada:");
        int num = sc.nextInt();

        for ( int c = 0; c <= 10; c++) {

            int res = num * c;

            System.out.println(num + " x " + c + " = " + res);
        }


    }
}