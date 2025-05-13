package Banco;




//Extends é um comando que serve para a classe gerente herdar os atributos da classe funcionario

import Banco.Funcionario;


public class Gerente extends Funcionario{
    
     // Atributos da classe como private
    private String departamento;
    
     // Construtor padrão
    public Gerente() {
    }

        // Métodos get e set para os atributos seremm ascessado por outras classes
    public Gerente(int matricula, String nome, int idade, String departamento){
        super(matricula, nome, idade);
        this.departamento = departamento;
    }
    
     public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}
