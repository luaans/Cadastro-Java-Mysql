package Banco;

public class Funcionario {
    
    // Atributos da classe como private
    private int matricula;
    private String nome;
    private int idade;

    // Construtor padrão
    public Funcionario() {
    }

    // Construtor personalizado
    public Funcionario(int matricula, String nome, int idade) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos get e set para os atributos serem acessados por outras classes
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}