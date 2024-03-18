import java.util.Scanner;
import java.io.*;

class Main {
  public static void main(String[] args) {
     double salariobruto,boleto1,boleto2,boleto3,boleto4,desconto,salarioliquido,valordosboletos,valortotal;

		Scanner ler = new 
    Scanner(System.in);
    
        System.out.println("Digite o salario bruto");
        salariobruto = ler.nextDouble();
    
		System.out.println("Digite o 1º boleto:");
		boleto1 = ler.nextDouble();

		System.out.println("Digite o 2º boleto:");
		boleto2 = ler.nextDouble();

		System.out.println("Digite o 3º boleto:");
		boleto3 = ler.nextDouble();
    
		System.out.println("Digite o 4º boleto:");
		boleto4 = ler.nextDouble();
    
		 valordosboletos = boleto1+boleto2+boleto3+boleto4;
    desconto = salariobruto * 14/100;
    salarioliquido = salariobruto-desconto;
    valortotal = salarioliquido-valordosboletos;
    System.out.println("Salario liquido é:" + salarioliquido);
    System.out.println("O total dos boletos são:"+ valordosboletos);
    System.out.println("Saldo restante:"+ valortotal);

		
  }
}
