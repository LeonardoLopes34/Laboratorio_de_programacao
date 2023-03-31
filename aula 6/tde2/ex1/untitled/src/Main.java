public class Main {
    public static void main(String[] args) {
        circulo a = new circulo();
        a.raio = 8;
        System.out.println("Área = "+a.calcularArea());
        System.out.println("Perímetro = "+a.calcularPerimetro());
    }
}