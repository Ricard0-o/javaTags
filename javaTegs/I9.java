import java.util.Scanner;

public class I9 {
    public static void main(String[] args) {
        
        
int mat = 0, sra = 0, qual;
        
        Scanner sc = new Scanner(System.in);

        for (int c = 1; c <= 20; c++) {

            System.out.println("Escolha qual destes filmes merece a classificação de melhor filme"); 
            System.out.println("Matrix(1) ou Senhor dos Anéis(2) vez: "+c);
            
            qual = sc.nextInt();

            if (qual == 1) {
                mat++;
            } else {
                sra++;
            }
        }

        if (mat > sra) {
            System.out.println("Matrix venceu!");
        } else if (sra > mat) {
            System.out.println("Senhor dos Anéis venceu!");
        } else {
            System.out.println("Houve um empate!");
        }
        
        System.out.println("Votos Matrix: " + mat);
        System.out.println("Votos Sr. dos Anéis: " + sra);
            }
}