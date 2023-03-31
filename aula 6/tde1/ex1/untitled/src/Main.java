public class Main {
    public static void main(String[] args) {

        carro a = new carro();
        a.ano = "2012";
        a.cor = "Prata";
        a.marca = "BMW";
        a.modelo = "320i";

        System.out.println(a.acelerar());
        System.out.println(a.frear());
    }
}