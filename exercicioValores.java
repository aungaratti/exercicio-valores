import java.util.Scanner;
public class exercicioValores{
  public static void main(String args[]){
      double valorA, valorB, valorC, mediaA, mediaH;
      Scanner teclado = new Scanner (System.in);
      System.out.println("\fInsira o primeiro valor");
      valorA = teclado.nextDouble();
      System.out.println("\fInsira o segundo valor");
      valorB = teclado.nextDouble();
      System.out.println("\fInsira o terceiro valor");
      valorC = teclado.nextDouble();
      mediaA = (valorA+valorB+valorC)/3;
      System.out.println("A média aritmética é:"+mediaA);
      mediaH = 3/(1/valorA+1/valorB+1/valorC);
      System.out.println("A média harmônica é:"+mediaH);
      
  }
}
