import java.util.Scanner;

public class I8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int salAjuste, salAlmento, op, salAtual;
        
         

        System.out.println("Reajuste salarial funcionario");

        for (int c = 1; c > 0; c++) {

            salAlmento = 0;
            salAjuste = 0;
         
            System.out.println("Digite o salario atual do funcionario");
            salAtual = sc.nextInt();
            System.out.println("");

            System.out.println("Digite o almento do funcionario-n:"+c);
            System.out.println("");
            System.out.println("|  1  -   5% |");
            System.out.println("|  2  -  15% |");
            System.out.println("|  3  -  25% |");
            System.out.println("|  4  -  30% |");
            System.out.println("|  0  -  Exit|");
            System.out.println("Escolha: ");
            op = sc.nextInt();
            System.out.println("");

            switch (op) {

                case 1: 
                    System.out.println("Almento de 5%");
                    salAlmento = (int) (salAtual * 0.05);
                    salAjuste = salAtual + salAlmento;
                    break;
                
                case 2:
                    System.out.println("Almento de 15%");
                    salAlmento = (int) (salAtual * 0.15);
                    salAjuste = salAtual + salAlmento;
                    break;
                
                case 3:
                    System.out.println("Almento de 25%");
                    salAlmento = (int) (salAtual * 0.25);
                    salAjuste = salAtual + salAlmento;
                    break;

                case 4:
                    System.out.println("Almento de 30%");
                    salAlmento = (int) (salAtual * 0.30);
                    salAjuste = salAtual + salAlmento;
                    break;

                default:
                    System.out.println("Fim do programa");
                    c = 0;
                    break;
            }

            System.out.println("----------------------");
            System.out.println("  Salario ajustado");
            System.out.println("----------------------");
            System.out.println("Almento de: " + salAlmento);
            System.out.println("Salario reajustado: " + salAjuste);
            System.out.println("Salario Antigo: " + salAtual);
            System.out.println("----------------------");
            
        }

    }
}