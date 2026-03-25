
import java.util.Random;
import java.util.Scanner;

public class Ciclos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            // ===== ASCII ART =====
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

            while (!sc.hasNextInt()) {
                System.out.println("Error: ingrese un número válido.");
                sc.next();
            }
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese n: ");
                    int n = sc.nextInt();

                    int a = 0, b = 1, c;
                    for (int i = 1; i < n; i++) {
                        c = a + b;
                        a = b;
                        b = c;
                    }

                    System.out.println("Resultado: " + a);
                    break;

                case 2:
                    System.out.print("Ingrese n: ");
                    int num = sc.nextInt();

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
                    break;

                case 3:
                    System.out.print("Ingrese a: ");
                    double A = sc.nextDouble();
                    System.out.print("Ingrese b: ");
                    double B = sc.nextDouble();
                    System.out.print("Ingrese c: ");
                    double C = sc.nextDouble();

                    double d = (B * B) - (4 * A * C);

                    if (d > 0) {
                        double x1 = (-B + Math.sqrt(d)) / (2 * A);
                        double x2 = (-B - Math.sqrt(d)) / (2 * A);
                        System.out.println("Raíces reales: " + x1 + " y " + x2);
                    } else if (d == 0) {
                        double x = -B / (2 * A);
                        System.out.println("Raíz única: " + x);
                    } else {
                        // 👇 AQUÍ ESTÁ LO NUEVO (COMPLEJOS)
                        double real = -B / (2 * A);
                        double imaginario = Math.sqrt(-d) / (2 * A);

                        System.out.println("Raíces complejas:");
                        System.out.println("x1 = " + real + " + " + imaginario + "i");
                        System.out.println("x2 = " + real + " - " + imaginario + "i");
                    }
                    break;

                case 4:
                    System.out.print("Cantidad de números: ");
                    int cantidad = sc.nextInt();

                    double suma = 0;

                    for (int i = 1; i <= cantidad; i++) {
                        System.out.print("Número " + i + ": ");
                        suma += sc.nextDouble(); // ✅ permite decimales
                    }

                    double promedio = suma / cantidad;
                    System.out.println("Promedio = " + promedio);
                    break;

                case 5:
                    Random rand = new Random();
                    int secreto = rand.nextInt(100) + 1;
                    int intento;

                    do {
                        System.out.print("Adivina (1-100): ");
                        intento = sc.nextInt();

                        if (intento < secreto) System.out.println("Muy bajo");
                        else if (intento > secreto) System.out.println("Muy alto");

                    } while (intento != secreto);

                    System.out.println("¡Correcto!");
                    break;

                case 6:
                    System.out.print("Número: ");
                    int tabla = sc.nextInt();

                    for (int i = 1; i <= 10; i++) {
                        System.out.println(tabla + " x " + i + " = " + (tabla * i));
                    }
                    break;

                case 7:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 7);

        sc.close();
    }
}

