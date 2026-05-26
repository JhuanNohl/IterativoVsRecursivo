public class Main {

    public static void main(String[] args) {
        Fatorial fatorial = new Fatorial();

        int numero = 5;

        System.out.println("Número informado: " + numero);

        System.out.println("Fatorial iterativo de " + numero + ": "
                + fatorial.calcularIterativo(numero));

        System.out.println("Fatorial recursivo de " + numero + ": "
                + fatorial.calcularRecursivo(numero));
    }
}
