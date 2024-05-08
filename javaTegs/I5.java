import java.util.Scanner;

public class I5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        

        System.out.println("    Media dos alunos");
        System.out.println("");
        System.out.println("--------------------------");

        for (int c = 1; c <= 10; c++) {
            int somaNot = 0;

            System.out.println("Calcular a Media do aluno n: " + c);
            System.out.println("Digite as 4 notas deste aluno");

            for (int c2 = 1; c2 <= 4; c2++) {
                
                int nAluno = sc.nextInt();
                somaNot = somaNot + nAluno;
            }

            int medAluno = somaNot/4; 
            System.out.println("média do aluno n:" + c + " é : (-- " + medAluno + " --)");
            System.out.println("");

            


        }



    }
}