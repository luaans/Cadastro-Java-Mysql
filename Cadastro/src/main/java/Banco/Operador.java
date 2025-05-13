package Banco;




//Extends é um comando que serve para a classe gerente herdar os atributos da classe funcionario

import Banco.Funcionario;


public class Operador extends Funcionario {
    
    // Atributos da classe como private
       private String funcao;
  
     // Construtor padrão
    public Operador() {
    }

       
        // Métodos get e set para os atributos seremm ascessado por outras classes
    public Operador(int matricula, String nome, int idade, String funcao){
        super(matricula, nome, idade);
        this.funcao = funcao;
    }
    
     public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
}