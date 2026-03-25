
import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        


        while (true) { 
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
            System.out.println("1. Suma hasta el n-avo numero de fibonacci");
            System.out.println("2. n-avo numero primo");
            System.out.println("3. Raices de una ecuacion cuadratica");
            System.out.println("4. Promedio n-numero");
            System.out.println("5. Salir");

            int opcion = sc.nextInt();
            sc.nextInt();

            switch (opcion) {
            case 1:
            System.out.println("Ingrese la opcion 1" );
            int n = sc.nextInt();

            int f0 = 0, f1 = 1, Suma = 1;
            for (int i = 2; i <= n; i++) {
                int fn = f0 + f1;
                Suma += fn;
                f0 = f1;
                f1 = fn;
            }

            System.out.println("La suma Fibonacci n es: " + Suma);
            break;
                
            case 2:
            System.out.println("Ingrese la opcion 2");
            int num = sc.nextInt();

            int contador = 0;
            int numero = 2;

            while (contador < num) { 
                
                boolean primo = true;

                for (int i = 2; i <= numero / 2; i++) {
                    if (numero % i == 0) {
                        primo = false;
                        break;
                        
                    }
                    
                }
                if (primo) {
                   contador++;
                   if (contador == num) {
                    System.out.println("El primo # " + num + "es: " + numero);

                   }
                }
            }
            break;

            case 3:
            System.out.println("Ingrese la opcion 3");

            System.out.println("Ingrese a: ");
            double a = sc.nextDouble();

            System.out.println("Ingrese b: ");
            double b = sc.nextDouble();

            System.out.println("Ingrese c: ");
            double c = sc.nextDouble();

            double d = (b * b) - (4 * a * c);

            if (d > 0) {
                
                double x1 = (-b + Math.sqrt(d)) / (2 * a);
                double x2 = (-b - Math.sqrt(d)) / (2 * a);

                System.out.println("Raiz 1: " + x1);
                System.out.println("Raiz 2: " + x2);
            } else if (d == 0) {

                double x = (-b) / (2 * a);
                System.out.println("Raiz unica: " + x);

            } else {
                System.out.println("No tiene soluciones reales");
            } 
            
            break;

            case 4:
            System.out.println("Ingrese la opcion 4");

            System.out.println("Cuantos numeros desea ingresar: ");
            int cantidad = sc.nextInt();

            double SumaNum = 0;

            for (int i = 1; i < cantidad; i++) {

                System.out.println("Ingrese numero " + i + ":");
                SumaNum += sc.nextDouble();
            }

            double promedio = SumaNum / cantidad;

            System.out.println("El promedio es: " + promedio);
            break;
                
            case 5:
            System.out.println("Ingrese la opcion 5 Salir");
            System.out.println("Saliendo...");
            return;

            default:
                System.out.println("Opcion invalida.");
            }

            System.out.println("\nPresione ENTER para volver al menu...");
            sc.nextLine();
            sc.nextLine();
                
            }


        }
    }



