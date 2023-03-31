public class contaBancaria {
    String numConta;
    double saldo;
    double saldo2 = 0;
    String titular;

    double depositar(int num){
        return saldo+num;
    }
    String result = "Saldo insuficiente";
    double result2;

    double sacar(int num){
        return num;
    }

    double transferir(int num){
        return saldo-num;
    }
}
