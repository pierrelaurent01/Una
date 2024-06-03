/**
 *
 * @author 32416449
 */
public class Sayajin extends personagemDragonBall implements Transformavel {

    private final String temRabo;
    private  int nivelMaximoSJJ;

    public Sayajin(String nome, int idade, String sexo, String poderEspecial, int temporada, int ki, int nivelMaximoSSJ, String temRabo) {
        super(nome, idade, sexo, poderEspecial, temporada, ki);
        this.temRabo = temRabo;
        this.nivelMaximoSJJ = nivelMaximoSSJ;
    }

    @Override
    public String toString(){
        return "Nome: " + this.nome + "Idade: " + this.idade + "Sexo:" + this.sexo +"Temporada: " + this.temporada + "Poder especial" + this.poderEspecial + "Nivel SJJ:" + this.nivelMaximoSJJ + "Tem rabo: " + this.temRabo;
    }
    
    @Override
    public double calcularPoder() {
        return ki * (1 + nivelMaximoSJJ * 0.1);
    }

    @Override

    public int Transformar(int nivel) {
        
        String opcoes = " ";

        switch (nivel) {
                case 1:
                opcoes = "{{"+  nome + "}}" + " transformou para super sayajin nível" + "{{"+  nivel + "}}";
                nivelMaximoSJJ += 1;
                break;
                
                case 2:
               opcoes = "{{"+  nome + "}}" + " transformou para super sayajin nível" + "{{"+  nivel + "}}";
                nivelMaximoSJJ += 2;
                break;
                
                case 3:
                opcoes = "{{"+  nome + "}}" + " transformou para super sayajin nível" + "{{"+  nivel + "}}";
                nivelMaximoSJJ += 3;
                break;
                
                case 4:
               if("Goku".equals(nome) || "Vegeta".equals(nome)){
                System.out.println("{{"+  nome + "}}" + " transformou para super sayajin nível" + "{{"+  nivel + "}}");
                } 
               else{
                   System.out.println(" O " + this.nome +" não consegue   transformar em Super Sayajin " + nivel);
               }
                nivelMaximoSJJ += 4;
                break;
                
                case 5:
               if("Goku".equals(nome) || "Vegeta".equals(nome)){
                System.out.println("{{"+  nome + "}}" + " transformou para super sayajin nível" + "{{"+  nivel + "}}");
                } 
               else{
                  System.out.println(" O " + this.nome +" não consegue   transformar em Super Sayajin " + nivel);
               }
                nivelMaximoSJJ += 5;
                break;
                    
                default:
                break;

        }
        return 0;
    }
        public String temRabo(){
            
            return temRabo;
        }
    
    
}