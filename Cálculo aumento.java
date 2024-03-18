
import java.util.Scanner;
import java.io.*;

class Main {
  public static void main(String[] args) {
     double salarioatual, porcentagemdoaumento, novosalario, aumento;

		Scanner ler = new 
    Scanner(System.in);
    
        System.out.println("Digite o salario atual");
        salarioatual = ler.nextDouble();
		System.out.println("Digite a porcentagem do aumento");
		porcentagemdoaumento = ler.nextDouble();
		
		porcentagemdoaumento= salarioatual*10/100;
    
    novosalario= salarioatual+porcentagemdoaumento;
    System.out.println("O aumento é:" + porcentagemdoaumento);
    System.out.println("Saldo atual:"+ novosalario);

  }
}
