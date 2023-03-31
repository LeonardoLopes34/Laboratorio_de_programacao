public class Main {
    public static void main(String[] args) {
        contaBancaria a = new contaBancaria();
        a.saldo = 2000;
        a.numConta = "192";
        a.titular = "leo";


        if(a.saldo == 0){
            System.out.println("Saldo insuficiente para fazer operações");
        }
        System.out.println("Saque de R$"+a.sacar(400)+" realizado com sucesso");

    }
}