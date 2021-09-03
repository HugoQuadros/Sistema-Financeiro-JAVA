public class SistemaFinanceiro {

    public static void main(String[] args){
        //criando o cliente (não precisou do construtor, importou da classe especial Objects)
        Cliente clientex = new Cliente();
        clientex.setNome("Fulano");
        clientex.setSobrenome("de tal");

        // tipo, variável, new tipoDoNovoObjeto
        ContaCorrente contaCorrente = new ContaCorrente(clientex);
        Conta novaContaCorrente = new ContaCorrente(clientex);
        Conta contaPoupanca = new ContaPoupanca(clientex);
        CaixaEletronico caixa = new CaixaEletronico();
        ContaEspecial contaEspecial = new ContaEspecial(clientex);

        //caixa.consultarSaldo(contaCorrente);
        contaCorrente.depositar( 1000);
        contaCorrente.sacar( 200);
        //caixa.consultarSaldo((contaCorrente));

        caixa.consultarSaldo(contaEspecial);
        contaEspecial.depositar(1000);
        caixa.consultarSaldo(contaEspecial);

    }

}
