import java.util.Scanner;
class Main {
  public static void main(String[] args) {
     int numero, quadrado, cubo, raizquadrada;

Scanner ler=new 
    Scanner(System.in);
    
        System.out.println("Digite um numero");
        numero= ler.nextInt();
        if (numero <0){
            
        
        }
    quadrado= numero*numero;
    cubo= numero*numero*numero;
	raizquadrada= cubo/numero;
    
		
    System.out.println("O quadrado é:" +  quadrado);
    System.out.println("O cubo é:"+ cubo );
    System.out.println("A raiz quadrada será:"+ raizquadrada);

		
  }
}
