// Calculadora trigonométrica en Java

// Participantes:
// - Ignacio Apuy Anchia
// - Ronald Mora Rojas
// - Cristopher Viquez Quiros


import java.io.Console;

// *Añadidas las bases del programa* - Ignacio A.
public class Calculadora {

    // Función para mostrar errores y salir
    public static void mostrarError(String msg) {
        System.out.println("Error: "+msg);
        System.exit(1);
        return;
    }

    // Funciones trigonométricas:
    
    // Función sin(x)
    public static double sinX(double x) {
        return Math.sin(x);
    }

    // Función cos(x)
     public static double cosX(double x) {
        return Math.cos(x);
    }

    // Función tan(x)
     public static double tanX(double x) {
        return Math.tan(x);
    }

    // *Añadidas las funciones inversas* - Ronald M.

    // Función arcsin(x)
    public static double arcsinX(double x) {
        return Math.asin(x);
    }

    // Función arccos(x)
    public static double arccosX(double x) {
        return Math.acos(x);
    }

    // Función arctan(x)
    public static double arctanX(double x) {
        return Math.atan(x);
    }

    // *Añadidas las funciones hiperbólicas* - Cristopher V.

    // Función sinh(x)
    public static double sinhX(double x) {
        return Math.sinh(x);
    }

    // Función cosh(x)
    public static double coshX(double x) {
        return Math.cosh(x);
    }

    // Función tanh(x)
    public static double tanhX(double x) {
        return Math.tanh(x);
    }

    // Función principal
    public static void main(String[] args) {

                //Clase Console para recibir entradas
                Console console = System.console();
                
                // Mensaje de bienvenida
                System.out.println("Bienvenido a la calculadora trigonométrica.");

                // Selección
                System.out.println("¿Qué operación desea realizar?");
                System.out.println("1. sin(x)");
                System.out.println("2. cos(x)");
                System.out.println("3. tan(x)");

                // *Añadidas las opciones para las inversas* - Ronald M.

                System.out.println("4. arcsin(x)");
                System.out.println("5. arccos(x)");
                System.out.println("6. arctan(x)");

                // *Añadidas las opciones para las funciones hiperbólicas* - Cristopher V.

                System.out.println("7. sinh(x)");
                System.out.println("8. cosh(x)");
                System.out.println("9. tanh(x)");

                // Variables
                int  opcion = 0;
                double x = 0;
                double resultado = 0;

                // Entrada de la opción
                String entrada = console.readLine("Escribe el número de la opción:\n> ");

                // Comprobación
                try{
                    opcion = Integer.parseInt(entrada);
                }catch(NumberFormatException e){
                    mostrarError("Valor inválido.");
                }

                // *Se incrementó el índice* - Ronald M.
                // *Se modificaron las opciones otra vez* - Cristopher V.
                // Segunda comprobación
                if (opcion < 1 || opcion > 9) {
                    mostrarError("Opción incorrecta");
                }

                // Entrada del valor x
                String entrada2 = console.readLine("Introduzca el valor del ángulo α:\n> ");

                // Comprobación
                try{
                    x = Double.parseDouble(entrada2);
                }catch(NumberFormatException e){
                    mostrarError("Valor inválido.");
                }

                // Se pasa de ángulos a radianes
                x = Math.PI*x/180;

                // Se llama a la función correspondiente
                switch(opcion) {
                    case 1:
                        resultado = sinX(x);
                        break;
                    case 2:
                        resultado = cosX(x);
                        break;
                    case 3:
                        resultado = tanX(x);
                        break;

                    // *Casos para las funciones inversas* - Ronald M.

                    case 4:
                        resultado = arcsinX(x);
                        break;
                    case 5:
                        resultado = arccosX(x);
                        break;
                    case 6:
                        resultado = arctanX(x);
                        break;

                    // *Añadidas las operaciones hiperbólicas* - Cristopher V.

                    case 7:
                        resultado = sinhX(x);
                        break;
                    case 8:
                        resultado = coshX(x);
                        break;
                    case 9:
                        resultado = tanhX(x);
                        break;
                }

                // Resultado
                System.out.println("El resultado es: "+resultado);

                System.exit(0);
    }
}