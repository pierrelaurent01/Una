import java.util.Scanner;
import java.io.*;

class Main {
  public static void main(String[] args) {
int hora, minutos, resultado;
    
Scanner ler=new Scanner(System.in);
    

System.out.println("Digite a hora");

hora = ler.nextInt();

System.out.println("Digite os minutos");

minutos = ler.nextInt();

resultado= hora*60;
resultado= resultado + minutos;


System.out.println("O resultado é:" + resultado);

}
}