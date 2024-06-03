/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dragonball;

/**
 *
 * @author 32416449
 */
public class PersonagemFactory  {
    public static   Terraqueo criarTerraqueo(String nome, int idade, String sexo, String poderEspecial, int temporada, int ki, String pais, String cidade){
        return new Terraqueo (nome,idade,sexo,poderEspecial,temporada,ki,pais,cidade);
    }
      public static   Sayajin criarSayajin(String nome, int idade, String sexo, String poderEspecial, int temporada, int ki, int nivelMaximoSSJ, String temRabo){
        return new Sayajin (nome,idade,sexo,poderEspecial,temporada,ki, nivelMaximoSSJ,temRabo);
    }
        public static   Namekuseijin criarNamekuseijin(String nome, int idade, String sexo, String poderEspecial, int temporada, int ki,int quantidadeEsferas,boolean podeCurar){
        return new Namekuseijin (nome,idade,sexo,poderEspecial,temporada,ki, quantidadeEsferas, podeCurar);
    }
}