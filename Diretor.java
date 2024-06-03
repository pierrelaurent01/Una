/**
 *
 * @author 32416449
 */
public class Pricipal {

    public static void main(String[] args) {
   
    Terraqueo terraqueo =  PersonagemFactory.criarTerraqueo("Kuririn",44,"M","Kienzan",1,2000,"Brasino","laguna");
    Sayajin Goku =  PersonagemFactory.criarSayajin("Goku",66,"M", "Migate no gokui",6,8001, 5, "não");
    Sayajin gohan =  PersonagemFactory.criarSayajin("Gohan",16,"M", "Mystic",5,7000,2, "não");
    Namekuseijin namekuseijin = PersonagemFactory.criarNamekuseijin("Dendê",4000,"M","HEAL",4,2500,2,true);

    Goku.Transformar(5);
    System.out.println (Goku.toString());
    gohan.Transformar(5);
    System.out.println (gohan.toString());
    namekuseijin.fazerDesejo(" ");
    System.out.println (namekuseijin.toString());
    
    
    
}



}