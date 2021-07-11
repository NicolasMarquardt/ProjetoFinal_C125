package Banco;

public class cliente {
    //Declaração de variaveis
    private String nome;
    private int cpf;

    //Construtor
    public cliente(String nome, int cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    //Metodo para mostrar informações
    public void mostraInfo(){
        System.out.println("-_".repeat(30));
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("-_".repeat(30));
    }

    //Gets
    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }
}

