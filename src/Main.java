import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        char letra;

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("1.-Sueldo");
            System.out.println("2.-Proovedor");
            System.out.println("3.-Biblioteca");

            opcion = entrada.nextInt();

            switch (opcion){
                case 1:
                    Sueldo obj = new Sueldo();
                    obj.data();

                    break;

                case 2:
                    Proovedores obj1 = new Proovedores();
                    obj1.metodo1();

                    break;

                case 3:
                    System.out.println("Profe no supe hacerlo (F)");
                    break;
            }

            System.out.println("Programa realizado por Rivas Gutierrez Leonardo 3IV8");
            System.out.println("¿Deseas volver al menu? si lo deseas escribe s");
            letra = entrada.next().charAt(0);

        }while(letra == 's');
    }
}
