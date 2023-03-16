import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner (System.in);
        System.out.println("Inserire un numero intero: ");
        int numero= input.nextInt();
        if (numero<0)
        {
          System.out.println("Il numero è negativo");  
        }
        else if (numero>0)
        {
          System.out.println("Il numero è positivo");  
        }
        else  //Non ha bisogno di if perchè se il numero non è né >0 né <0 è per forza == 0
        {
          System.out.println("Il numero è uguale a zero");  
        }

        
    }
}
