public class Main {
    public static void main(String[] args) {
        retangulo a = new retangulo();
        a.altura = 5;
        a.base = 4;
        System.out.println(a.calcularArea());
        System.out.println(a.calcularPerimetro());
    }
}