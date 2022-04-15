public class Main {

    public static int addNumbers(int a, int b, int c) {
            int sum = a + b + c;
            System.out.println("Bip, bop, bip! Calculating! ...");
            System.out.println("The result is:");
            return (sum);
    }

    public static class Coche {
        int puertas = 4;

        public int agregarPuerta(){
            puertas = puertas + 1;
            System.out.println("Ahora este coche tiene: " + puertas + " puertas.");
            return puertas;
        }
    }

    public static void main(String[] args) {

        //Parte 1. Sumar números
        System.out.println("Primer ejercicio:");
        int num1 = 5;
        int num2 = 5;
        int num3 = 5;
        int result;

        result = addNumbers(num1, num2, num3);

        System.out.println(result);

        //Parte 2. Sumar puertas de coche
        System.out.println(" \nSegundo ejercicio:");
        Coche primerCoche = new Coche();
        primerCoche.agregarPuerta();

    }
}