package Banco;

import java.io.*;

public class contaPoupança extends conta {

    //construtor
    private String extrato = "extrato.txt"; // Variavel para armazenar o nome do arquivo
    public contaPoupança(int numero, double saldo, cliente cliente, banco banco) {
        super(numero, saldo, cliente, banco);
    }

    //Extrato
    @Override
    public void extrato() {
        //Escrita de arquivo
        try {
            OutputStream output = new FileOutputStream(extrato);
            OutputStreamWriter escrever = new OutputStreamWriter(output);
            BufferedWriter escreve = new BufferedWriter(escrever);

            escreve.append("Nome: " + cliente.getNome());
            escreve.newLine();
            escreve.append("CPF: " + cliente.getCpf());
            escreve.newLine();
            escreve.append("Banco: " + this.banco.getNome());
            escreve.newLine();
            escreve.append("Tipo de conta: Poupança\n");
            escreve.append("Saldo: " + this.saldo);

            escreve.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        InputStream input = null;
        //Leitura de arquivo
        try {
            input = new FileInputStream(extrato);
            Reader inputDR = new InputStreamReader(input);
            BufferedReader ler = new BufferedReader(inputDR);

            String texto = ler.readLine();

            while (texto != null){
                System.out.println(texto);
                texto = ler.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo " + extrato + "não encontrado");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
