public abstract class Conta {

    private String numero;
    private double saldo;
    private Cliente titular;

    //construtor para a classe conta
    //não precisa colocar o tipo, pq vai retornar sempre um objeto da classe Conta
    public Conta(Cliente titular){
        this.saldo = 0.0;
        this.numero = "1";
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void sacar(double valorSacado){
        saldo -= valorSacado;
    }

    public void depositar(double valorDepositado){
        saldo += valorDepositado;
    }

    public void transferir(double valorTransferido, Conta destino){
        this.sacar(valorTransferido);
        destino.depositar(valorTransferido);
    }

    public double consultarSaldo() {
        return saldo;
    }

}
