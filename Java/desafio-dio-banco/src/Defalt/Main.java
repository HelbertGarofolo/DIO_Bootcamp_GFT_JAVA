package Defalt;

public class Main {
    public static void main(String[] args) {

        Cliente clienteBanco = new Cliente();
        clienteBanco.setNome("Helbert Garofolo");

        IConta cc = new ContaCorrente(clienteBanco);
        cc.depositar(100);

        IConta cp = new ContaPoupanca(clienteBanco);

        cc.transferir(100,cp);

        cc.extrato();
        cp.extrato();

    }
}