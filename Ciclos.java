import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class CiclosArreglado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            // ASCII
         System.out.println("\n=====================================================");
           System.out.println("            .''.      .        *''*    :_\/_:     .");
           System.out.println(":_\/_:   _\(/_  .:.*_\/_*   : /\ :        .'.:.'. ");
           System.out.println(" .''.: /\ :    /)\ ':'* /\ *  : '..'.     -=:o:=- ");
           System.out.println(":_\/_:'.:::.   | ' *''*    * '.\'/.'_\(/_ '.':'.' ");
           System.out.println(": /\ : :::::   =  *_\/_*     -= o =- /)\ ");     '  *
           System.out.println(" '..'  ':::'  === * /\ *     .'/.\'.  '        ._____ ");
           System.out.println("  *            |   *..*         :              |.    |' .---"| ");
           System.out.println("    *          |      _                .--'|   ||    | _|    | ");
           System.out.println("    *          |   .-'|           ___  |   |   |     ||      | ");
           System.out.println("     .-----.   |   |' |  ||      |   | |   |   |     ||      | ");
           System.out.println(" ___'       ' /"\  |  '-."".         '-'   '- .'     '`      |___ "  
           System.out.println("\n=====================================================================");
            System.out.println("              ______________________________________________________          _\r\n" );
            System.out.println("            /   ____________________________________________________ \\  /\r\n" );
            System.out.println("           |   |                                                     |    |\r\n" );
            System.out.println("           |   |                                                     |    |\r\n" );
            System.out.println("           |   |  C:\\> 1. Suma hasta el n-avo numero de fibonacci    |    |\r\n" );
            System.out.println("           |   |        2. n-avo numero primo                        |    |\r\n" );
            System.out.println("           |   |        3. Raices de una ecuacion cuadratica         |    |\r\n" );
            System.out.println("           |   |        4. Promedio n-numero                         |    |\r\n" );
            System.out.println("           |   |        5. Adivinar número                           |    |\r\n" );
            System.out.println("           |   |        6. Tabla de multiplicar                      |    |\r\n" );
            System.out.println("           |   |        7. Salir                                     |    |\r\n" );
            System.out.println("           |   |        Seleccione:                                  |    |\r\n" );
            System.out.println("           |   |                                                     |    |\r\n" );
            System.out.println("           |   |                                                     | @ \\_______/@\r\n" );
            System.out.println("           |   |                                                     |    |\r\n" );
            System.out.println("           |   |                                                     |    |\r\n" );
            System.out.println("           |   |_____________________________________________________|    |\r\n" );
            System.out.println("           |                                                              |\r\n" ); 
            System.out.println("           \\____________________________________________________________ /\r\n" );
            System.out.println("                   \\___________________________________/\r\n" );
            System.out.println("                ___________________________________________\r\n" );
            System.out.println("             _-'    .-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.  --- `-_\r\n" );
            System.out.println("          _-'.-.-. .---.-.-.-.-.-.-.-.-.-.-.-.-.-.-.--.  .-.-.`-_\r\n" );
            System.out.println("       _-'.-.-.-. .---.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-`__`. .-.-.-.`-_\r\n" );
            System.out.println("    _-'.-.-.-.-. .-----.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-----. .-.-.-.-.`-_\r\n" );
            System.out.println(" _-'.-.-.-.-.-. .---.-. .-------------------------. .-.---. .---.-.-.-.`-_\r\n" );
            System.out.println(":-------------------------------------------------------------------------:\r\n" );
            System.out.println("`---._.-------------------------------------------------------------._.---'");
            
            System.out.println("\n======= MENU =====");
            System.out.println("1. Fibonacci");
            System.out.println("2. Número primo");
            System.out.println("3. Ecuación cuadrática");
            System.out.println("4. Promedio");
            System.out.println("5. Adivinar número");
            System.out.println("6. Tabla de multiplicar");
            System.out.println("7. Salir");
            System.out.print("Seleccione: ");


            try {
                opcion = sc.nextInt();

                switch (opcion) {

                    case 1:
                        try {
                            System.out.print("Ingrese n: ");
                            int n = sc.nextInt();

                            if (n <= 0) {
                                System.out.println("Error: n debe ser mayor que 0");
                                break;
                            }

                            int a = 0, b = 1, c;
                            for (int i = 1; i < n; i++) {
                                c = a + b;
                                a = b;
                                b = c;
                            }

                            System.out.println("Resultado: " + a);

                        } catch (InputMismatchException e) {
                            System.out.println("Error: debe ingresar un número entero.");
                            sc.next();
                        }
                        break;

                    case 2:
                        try {
                            System.out.print("Ingrese n: ");
                            int num = sc.nextInt();

                            if (num <= 0) {
                                System.out.println("Error: n debe ser mayor que 0");
                                break;
                            }

                            int contador = 0, numero = 2;

                            while (contador < num) {
                                boolean primo = true;

                                for (int i = 2; i <= Math.sqrt(numero); i++) {
                                    if (numero % i == 0) {
                                        primo = false;
                                        break;
                                    }
                                }

                                if (primo) contador++;
                                numero++;
                            }

                            System.out.println("Primo #" + num + ": " + (numero - 1));

                        } catch (InputMismatchException e) {
                            System.out.println("Error: debe ingresar un número entero.");
                            sc.next();
                        }
                        break;

                    case 3:
                        try {
                            System.out.print("Ingrese a: ");
                            double A = sc.nextDouble();
                            System.out.print("Ingrese b: ");
                            double B = sc.nextDouble();
                            System.out.print("Ingrese c: ");
                            double C = sc.nextDouble();

                            if (A == 0) {
                                System.out.println("Error: 'a' no puede ser 0");
                                break;
                            }

                            double d = (B * B) - (4 * A * C);

                            if (d > 0) {
                                double x1 = (-B + Math.sqrt(d)) / (2 * A);
                                double x2 = (-B - Math.sqrt(d)) / (2 * A);
                                System.out.println("Raíces: " + x1 + " y " + x2);
                            } else if (d == 0) {
                                double x = -B / (2 * A);
                                System.out.println("Raíz única: " + x);
                            } else {
                                double real = -B / (2 * A);
                                double imag = Math.sqrt(-d) / (2 * A);
                                System.out.println("Complejas:");
                                System.out.println(real + " + " + imag + "i");
                                System.out.println(real + " - " + imag + "i");
                            }

                        } catch (InputMismatchException e) {
                            System.out.println("Error: debe ingresar números válidos.");
                            sc.next();
                        }
                        break;

                    case 4:
                        try {
                            System.out.print("Cantidad: ");
                            int cant = sc.nextInt();

                            if (cant <= 0) {
                                System.out.println("Error: debe ser mayor que 0");
                                break;
                            }

                            double suma = 0;

                            for (int i = 1; i <= cant; i++) {
                                System.out.print("Número " + i + ": ");
                                suma += sc.nextDouble();
                            }

                            System.out.println("Promedio = " + (suma / cant));

                        } catch (InputMismatchException e) {
                            System.out.println("Error: ingrese números válidos.");
                            sc.next();
                        }
                        break;

                    case 5:
                        Random rand = new Random();
                        int secreto = rand.nextInt(100) + 1;
                        int intento;

                        do {
                            try {
                                System.out.print("Adivina (1-100): ");
                                intento = sc.nextInt();

                                if (intento < 1 || intento > 100) {
                                    System.out.println("Fuera de rango");
                                } else if (intento < secreto) {
                                    System.out.println("Muy bajo");
                                } else if (intento > secreto) {
                                    System.out.println("Muy alto");
                                }

                            } catch (InputMismatchException e) {
                                System.out.println("Error: número inválido.");
                                sc.next();
                                intento = 0;
                            }

                        } while (intento != secreto);

                        System.out.println("¡Correcto!");
                        break;

                    case 6:
                        try {
                            System.out.print("Número: ");
                            int tabla = sc.nextInt();

                            for (int i = 1; i <= 10; i++) {
                                System.out.println(tabla + " x " + i + " = " + (tabla * i));
                            }

                        } catch (InputMismatchException e) {
                            System.out.println("Error: debe ingresar un entero.");
                            sc.next();
                        }
                        break;

                    case 7:
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Opción inválida");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: opción inválida.");
                sc.next();
            }

        } while (opcion != 7);

        sc.close();
    }
}