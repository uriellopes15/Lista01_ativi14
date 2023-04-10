import java.util.Scanner;
public class App {

    public static void main(String[] args) throws Exception {
        double peso;
        double multa;
        double excesso;

        System.out.println("Por favor digite o peso dos peixes (Kg):");
        try (Scanner teclado = new Scanner(System.in)) {
            peso = teclado.nextDouble();
        }
        if ((peso > 50)) { 
            excesso = peso - 50;
            multa = excesso * 4;
            System.out.println("Seus peixes exederam em: " + excesso + "Kg ");
            System.out.println("O valor da multa é R$ " + multa);

         }else{
            System.out.println("Não hove excesso de peso. ");
         }
         }
              
     }

    


