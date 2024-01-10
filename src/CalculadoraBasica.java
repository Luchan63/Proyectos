import java.util.Scanner;

public class CalculadoraBasica
{
    // ejercicio de crear un menu
        public static Scanner scan = new Scanner(System.in);
        public static void main(String[] args)
        {
            int opcion;
            do {
                System.out.println("eleige una opcion.\n1- suma\n2- resta\n3- division\n4- multiplicacion\n0- para salir");
                opcion = scan.nextInt();
                switch (opcion) {
                    case 1:
                        suma();
                        break;
                    case 2:
                        resta();
                        break;
                    case 3:
                        dividir();
                        break;
                    case 4:
                        multiplicar();
                        break;
                }
            } while (opcion != 0);
        }

        public static void suma()
        {
            System.out.println("ingrese num1");
            int num1 = scan.nextInt();

            System.out.println("ingrese num2");
            int num2 = scan.nextInt();

            int resultado = num1 + num2;
            System.out.println("LA sumas es: " +resultado);
        }
        public static void resta()
        {
            System.out.println("ingrese num1");
            int num1 = scan.nextInt();

            System.out.println("ingrese num2");
            int num2 = scan.nextInt();

            int resultado = num1 - num2;
            System.out.println("LA resta es: " +resultado);
        }
        public static void multiplicar()
        {
            System.out.println("ingrese num1");
            int num1 = scan.nextInt();

            System.out.println("ingrese num2");
            int num2 = scan.nextInt();

            int resultado = num1 * num2;
            System.out.println("LA multiplicacion es: " +resultado);
        }
        public static void dividir()
        {
            System.out.println("ingrese num1");
            double num1 = scan.nextInt();

            System.out.println("ingrese num2");
            double num2 = scan.nextInt();

            double resultado = num1 / num2;
            System.out.println("LA division es: " +resultado);
        }
    }


