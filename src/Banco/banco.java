package Banco;

public class banco {
    //Declaração de variaveis
    private String nome;
    private int cnpj;

    //Construtor
    public banco(String nome, int cnpj){
        this.nome = nome;
        this.cnpj = cnpj;
    }

    //Metodo para mostrar informações
    public void mostraInfo(){
        System.out.println("-_".repeat(30));
        System.out.println("Nome: " + this.nome);
        System.out.println("CNPJ: " + this.cnpj);
        System.out.println("-_".repeat(30));
    }
    //gets
    public String getNome() {
        return nome;
    }
    public int getCnpj() {
        return cnpj;
    }
}
