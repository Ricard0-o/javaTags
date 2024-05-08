import java.util.Scanner;

public class I7 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantidade de alunos: ");
        int N = scanner.nextInt();
        int somaIdades = 0;
        
        for (int aluno = 1; aluno <= N; aluno++) {
            System.out.print("Digite a idade do aluno " + aluno + ": ");
            somaIdades += scanner.nextInt();
        }

        double medIdades = (double) somaIdades / N;
        System.out.println("Média das idades: " + medIdades);
        scanner.close();
    }
}