import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double resultado = 0;

        System.out.println("BIENVENID@! \nIngresa:  \n\t1 para conversiones de temperatura \n\t2 para calculos matemáticos");
        var tipoOperacion = scan.nextInt();

        if (tipoOperacion == 1) {
            double gradosUsuario = 0;
            System.out.println("Ingresa: \n\t1. Celsius a Farenheit \n\t2. Farenheit a Celsius");
            var operacion = scan.nextInt();

            if (operacion == 1) {
                System.out.println("Ingrese los grados a convertir:");
                gradosUsuario = scan.nextDouble();
                resultado = convertirCelciusAFarenheit(gradosUsuario);
            } else if (operacion == 2) {
                System.out.println("Ingrese los grados a convertir:");
                gradosUsuario = scan.nextDouble();
                resultado = convertirFarenheitACelcius(gradosUsuario);
            } else {
                System.out.println("No ingresaste una opción válida");
                return;
            }

        } else if (tipoOperacion == 2) {
            double primerNumero = 0, segundoNumero = 0;
            System.out.println("Ingresa: \n\t1. Suma \n\t2. Resta \n\t3. Multiplicación \n\t4. División \n\t5. Módulo \n\t6. Potencia \n\t7. Raíz cuadrada");
            var operacion = scan.nextInt();

            if (operacion != 7 && operacion >= 1 && operacion <= 6) {
                System.out.println("Ingresa tu primer numero");
                primerNumero = scan.nextDouble();
                System.out.println("Ingresa tu segundo numero");
                segundoNumero = scan.nextDouble();
            } else if (operacion == 7) {
                /*Pide solo un numero porque sqrt solo necesita uno*/
                System.out.println("Ingresa tu numero");
                primerNumero = scan.nextDouble();
            } else {
                System.out.println("No ingresaste una opción válida");
                return;
            }

            /*ejecuta operaciones*/
            switch (operacion) {
                case 1 -> resultado = sumar(primerNumero, segundoNumero);
                case 2 -> resultado = restar(primerNumero, segundoNumero);
                case 3 -> resultado = multiplicar(primerNumero, segundoNumero);
                case 4 -> resultado = dividir(primerNumero, segundoNumero);
                case 5 -> resultado = calcularModulo(primerNumero, segundoNumero);
                case 6 -> resultado = calcularPotencia(primerNumero, segundoNumero);
                case 7 -> resultado = calcularRaiz(primerNumero);
            }

        } else {
            System.out.println("No ingresaste una opción válida");
            return;
        }

        System.out.print("El resultado es " + resultado);

    }

    public static double sumar(double primerNumero, double segundoNumero) {
        return primerNumero + segundoNumero;
    }

    public static double restar(double primerNumero, double segundoNumero) {
        return primerNumero - segundoNumero;
    }

    public static double multiplicar(double primerNumero, double segundoNumero) {
        return primerNumero * segundoNumero;
    }

    public static double dividir(double primerNumero, double segundoNumero) {
        return primerNumero / segundoNumero;
    }

    public static double calcularModulo(double primerNumero, double segundoNumero) {
        return primerNumero % segundoNumero;
    }

    public static double calcularPotencia(double primerNumero, double segundoNumero) {
        return Math.pow(primerNumero, segundoNumero);
    }

    public static double calcularRaiz(double primerNumero) {
        return Math.sqrt(primerNumero);
    }

    public static double convertirCelciusAFarenheit(double gradosCelsius) {
        return (gradosCelsius - 32) / 1.8;
    }

    public static double convertirFarenheitACelcius(double gradosFarenheit) {
        return (gradosFarenheit - 32) * 5 / 9;
    }

}