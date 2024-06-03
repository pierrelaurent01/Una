/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 package com.mycompany.dragonball;

 /**
  *
  * @author 32416449
  */
 public abstract class personagemDragonBall {
    
     protected String  nome,sexo,poderEspecial ;
     protected int temporada ,idade, ki;
     
     public personagemDragonBall (String nome , int idade , String sexo, String poderEspecial,int temporada, int ki){
         this.nome = nome;
         this.idade = idade;
         this.sexo = sexo;
         this.poderEspecial = poderEspecial;
         this.temporada = temporada;
         this.ki = ki;
     }
      public abstract  double calcularPoder();   
          
 }
     