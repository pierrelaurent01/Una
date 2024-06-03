/**
 *
 * @author 32416449
 */
public class Terraqueo extends personagemDragonBall {

    private final String pais;
    private final String cidade;

    public Terraqueo(String nome, int idade, String sexo, String poderEspecial, int temporada, int ki, String pais, String cidade) {
        super(nome, idade, sexo, poderEspecial, temporada, ki);
        this.pais = pais;
        this.cidade = cidade;

    }

    @Override
    public String toString(){
        return "Nome: " + this.nome + "Idade: " + this.idade + "Sexo:" + this.sexo +"Temporada: " + "Poder especial" + this.poderEspecial + this.cidade + this.pais;
    }
    @Override
    public double calcularPoder() {
        return ki;
    }

} 