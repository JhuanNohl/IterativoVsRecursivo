public class Fatorial {

    public long calcularIterativo(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("O número não pode ser negativo.");
        }

        long resultado = 1;

        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }

        return resultado;
    }

    public long calcularRecursivo(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("O número não pode ser negativo.");
        }

        if (numero == 0 || numero == 1) {
            return 1;
        }

        return numero * calcularRecursivo(numero - 1);
    }
}