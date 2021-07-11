package InterfaceTranferencia;

import Banco.conta;
import Execesao.saldoinsuficiente;
 //Interface para realizar transferencia
public interface tranferencia {
    public void tranferir(conta conta, double valor) throws saldoinsuficiente;
}
