import java.util.Random;
import java.util.Scanner;

public class Sueldo {
    public Object Sueldo0;

    public Sueldo() {

    }

    public int opcion, pagobase=5000, pago1, pago2, extra, total, A, B;
    public double sueldo, In, GM, ISR, sueldo_final;
    public String nomb;

    public void data() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu nombre");
        nomb = sc.nextLine();

        System.out.println("Elige tu puesto");
        System.out.println("1.- Obrero");
        System.out.println("2.- Trabajo de Planta");
        opcion = sc.nextInt();

        switch (opcion){
            case 1:
                Random ID1 = new Random();
                int M = ID1.nextInt(100);

                System.out.println("El trabajador es "+nomb);
                System.out.println("Su ID es "+M);

                Sueldo obj = new Sueldo();
                obj.process();

                break;

            case 2:
                Random ID = new Random();
                int N = ID.nextInt(100);

                System.out.println(nomb);
                System.out.println(N);

                Sueldo obj1 = new Sueldo();
                obj1.process1();

                break;
        }
    }

    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Horas extras en el dia?");
        A = sc.nextInt();
        System.out.println("¿Horas extras en la noche?");
        B = sc.nextInt();
        pago1 = 50*A;
        pago2 = 60*B;
        extra = pago1 + pago2;
        total = extra+pagobase;

        int[] Array={pagobase, pago1, pago2, extra};
        System.out.println("Pago base "+pagobase);
        System.out.println("Pago extra "+extra);
        System.out.println("Pago total "+total);

    }

    public void process1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cual es tu sueldo?");
        sueldo = sc.nextDouble();

        In = sueldo*0.2;
        GM = sueldo*0.1;
        ISR = sueldo*0.16;
        sueldo_final = sueldo - In - GM - ISR;

        double[] Array1={In, GM, ISR, sueldo_final};
        System.out.println("El costo de Infonavit "+In);
        System.out.println("Gastos Medicos "+GM);
        System.out.println("Gastos de ISR "+ISR);
        System.out.println("Tu pago es de "+sueldo_final);

    }
}

