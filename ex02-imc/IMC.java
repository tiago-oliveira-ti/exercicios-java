import java.util.Scanner;



public class IMC {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     

        System.out.print("Digite sua altura (ex: 1.75): ");
        double altura = sc.nextDouble();

       System.out.print("Digite seu peso (ex: 70.5): ");
        double peso = sc.nextDouble(); 
     
       double imc = peso / (altura * altura);

        System.out.printf("\nSeu IMC é: %.2f%n", imc);
     
     
     
     
      }







     
      }









}