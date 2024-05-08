import java.util.Scanner;

public class I15 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a base: ");
        double base = scanner.nextDouble();
        
        System.out.print("Digite o expoente: ");
        int expoente = scanner.nextInt();
        
        double resultadoPotencia = Math.pow(base, expoente);
        System.out.println("Resultado da potência: " + resultadoPotencia);
        
        scanner.close();
    }
}