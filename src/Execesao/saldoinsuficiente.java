package Execesao;

//Excessão criada para quando o saldo for insuficiente
public class saldoinsuficiente extends Exception{
    public saldoinsuficiente(String message) {
        super(message);
    }
}
