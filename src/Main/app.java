package Main;

import Banco.*;
import InterfaceTranferencia.tranferencia;

public class app {
    public static void main(String[] args) {
        //Crinado o banco e os crientes
        banco nuBank = new banco("nuBank",785);
        cliente cliente1 = new cliente("João",123);
        cliente cliente2 = new cliente("Pedro",456);
        cliente cliente3 = new cliente("Ana",789);
        cliente cliente4 = new cliente("joana",963);
        //Crinado contas

        //Contas correntes
        contaCorrente conta1 = new contaCorrente(753,500,cliente1,nuBank);
        conta conta2 = new contaCorrente(741,600,cliente2,nuBank);
        conta conta3 = new contaCorrente(852,450,cliente3,nuBank);

        //Contas poupança
        conta conta4 = new contaPoupança(846,570,cliente4,nuBank);
        conta conta5 = new contaPoupança(426,1000,cliente2,nuBank);

        //Chamando metodo tranferir
        try {
            conta1.tranferir(conta2,100);
        } catch (Execesao.saldoinsuficiente saldoinsuficiente) {
            System.out.println(saldoinsuficiente.getMessage());
        }
        //Estrato conta 1
        conta1.extrato();
        System.out.println("-_".repeat(30));
        //Estrato conta 2
        conta2.extrato();
        System.out.println("-_".repeat(30));

        //Chamando metodo sacar
        try {
            conta5.sacar(450);
        } catch (Execesao.saldoinsuficiente saldoinsuficiente) {
            System.out.println(saldoinsuficiente.getMessage());
        }
        //Extrato conta 5
        conta5.extrato();
        System.out.println("-_".repeat(30));
        //Chamando metodo depositar
        conta4.depositar(30);
        //Extrato conta 4
        conta4.extrato();
        System.out.println("-_".repeat(30));

    }
}
