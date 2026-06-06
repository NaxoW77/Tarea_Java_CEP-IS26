// Calculadora trigonométrica en Java

// Participantes:
// - Ignacio Apuy Anchia
// - Ronald Mora Rojas
// - Cristopher Viquez Quiros



import java.io.Console;

public class Calculadora {

    // Función para mostrar errores y salir
    public void mostrarError(String msg) {
        System.out.println("Error: "+msg);
        System.exit(1);
        return;
    }

    public double sinX(double x) {
        return Math.sin(x);
    }

     public double cosX(double x) {
        return Math.cos(x);
    }

     public double tanX(double x) {
        return Math.tan(x);
    }

    public void main(String[] args) {

                //Clase Console para recibir entradas
                Console console = System.console();
                
                // Mensaje de bienvenida
                System.out.println("Bienvenido a la calculadora trigonométrica.");

                // Selección
                System.out.println("¿Qué operación desea realizar?");
                System.out.println("1. sin(x)");
                System.out.println("2. cos(x)");
                System.out.println("3. tan(x)");

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

                // Segunda comprobación
                if (opcion < 1 || opcion > 3) {
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
                }

                // Resultado
                System.out.println("El resultado es: "+resultado);

                System.exit(0);
    }
}