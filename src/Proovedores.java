import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Scanner;



public class Proovedores {
    public Object Proovedores;

    public Proovedores(){

    }

    public String Costo1,Costo2,Costo3,Costo4,Costo5,Costo6,Costo7,Costo8,Costo9,Costo10,Cantidad1,Cantidad2,Cantidad3,Cantidad4,Cantidad5,Cantidad6,Cantidad7,Cantidad8,Cantidad9,Cantidad10;
    public String Cliente1,Cliente2,Cliente3,Cliente4,Cliente5,Cliente6,Cliente7,Cliente8,Cliente9,Cliente10,Producto1,Producto2,Producto3,Producto4,Producto5,Producto6,Producto7,Producto8,Producto9,Producto10;

    public void metodo1(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Cliente 1");
        Cliente1 = sc.nextLine();
        System.out.println("Producto 1");
        Producto1 = sc.nextLine();
        System.out.println("Costo 1");
        Costo1 = sc.nextLine();
        System.out.println("Cantidad 1");
        Cantidad1 = sc.nextLine();

        System.out.println("Cliente2");
        Cliente2 = sc.nextLine();
        System.out.println("Producto 2");
        Producto2 = sc.nextLine();
        System.out.println("Costo 2");
        Costo2 = sc.nextLine();
        System.out.println("Cantidad 2");
        Cantidad2 = sc.nextLine();

        System.out.println("Cliente 3");
        Cliente3 = sc.nextLine();
        System.out.println("Producto 3");
        Producto3 = sc.nextLine();
        System.out.println("Costo 3");
        Costo3 = sc.nextLine();
        System.out.println("Cantidad 3");
        Cantidad3 = sc.nextLine();

        System.out.println("Cliente 4");
        Cliente4 = sc.nextLine();
        System.out.println("Producto 4");
        Producto4 = sc.nextLine();
        System.out.println("Costo 4");
        Costo4 = sc.nextLine();
        System.out.println("Cantidad 4");
        Cantidad4 = sc.nextLine();

        System.out.println("Cliente 5");
        Cliente5 = sc.nextLine();
        System.out.println("Producto 5");
        Producto5 = sc.nextLine();
        System.out.println("Costo 5");
        Costo5 = sc.nextLine();
        System.out.println("Cantidad 5");
        Cantidad5 = sc.nextLine();

        System.out.println("Cliente 6");
        Cliente6 = sc.nextLine();
        System.out.println("Producto 6");
        Producto6 = sc.nextLine();
        System.out.println("Costo 6");
        Costo6 = sc.nextLine();
        System.out.println("Cantidad 6");
        Cantidad6 = sc.nextLine();

        System.out.println("Cliente 7");
        Cliente7 = sc.nextLine();
        System.out.println("Producto 7");
        Producto7 = sc.nextLine();
        System.out.println("Costo 7");
        Costo7 = sc.nextLine();
        System.out.println("Cantidad 7");
        Cantidad7 = sc.nextLine();

        System.out.println("Cliente 8");
        Cliente8 = sc.nextLine();
        System.out.println("Producto 8");
        Producto8 = sc.nextLine();
        System.out.println("Costo 8");
        Costo8 = sc.nextLine();
        System.out.println("Cantidad 8");
        Cantidad8 = sc.nextLine();

        System.out.println("Cliente 9");
        Cliente9 = sc.nextLine();
        System.out.println("Producto 9");
        Producto9 = sc.nextLine();
        System.out.println("Costo 9");
        Costo9 = sc.nextLine();
        System.out.println("Cantidad 9");
        Cantidad9 = sc.nextLine();

        System.out.println("Cliente 10");
        Cliente10 = sc.nextLine();
        System.out.println("Producto 10");
        Producto10 = sc.nextLine();
        System.out.println("Costo 10");
        Costo10 = sc.nextLine();
        System.out.println("Cantidad 10");
        Cantidad10 = sc.nextLine();

        String[][] tabla = new String[10][10];
        tabla[0][0]=Cliente1;
        tabla[1][0]=Producto1;
        tabla[2][0]=Costo1;
        tabla[3][0]=Cantidad1;
        tabla[0][1]=Cliente2;
        tabla[1][1]=Producto2;
        tabla[2][1]=Costo2;
        tabla[3][1]=Cantidad2;
        tabla[0][2]=Cliente3;
        tabla[1][2]=Producto3;
        tabla[2][2]=Costo3;
        tabla[3][2]=Cantidad3;
        tabla[0][3]=Cliente4;
        tabla[1][3]=Producto4;
        tabla[2][3]=Costo4;
        tabla[3][3]=Cantidad4;
        tabla[0][4]=Cliente5;
        tabla[1][4]=Producto5;
        tabla[2][4]=Costo5;
        tabla[3][4]=Cantidad5;
        tabla[0][5]=Cliente6;
        tabla[1][5]=Producto6;
        tabla[2][5]=Costo6;
        tabla[3][5]=Cantidad6;
        tabla[0][6]=Cliente7;
        tabla[1][6]=Producto7;
        tabla[2][6]=Costo7;
        tabla[3][6]=Cantidad7;
        tabla[0][7]=Cliente8;
        tabla[1][7]=Producto8;
        tabla[2][7]=Costo8;
        tabla[3][7]=Cantidad8;
        tabla[0][8]=Cliente9;
        tabla[1][8]=Producto9;
        tabla[2][8]=Costo9;
        tabla[3][8]=Cantidad9;
        tabla[0][9]=Cliente10;
        tabla[1][9]=Producto10;
        tabla[2][9]=Costo10;
        tabla[3][9]=Cantidad10;

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn(Cliente1);
        modelo.addColumn(Cliente2);
        modelo.addColumn(Cliente3);
        modelo.addColumn(Cliente4);
        modelo.addColumn(Cliente5);
        modelo.addColumn(Cliente6);
        modelo.addColumn(Cliente7);
        modelo.addColumn(Cliente8);
        modelo.addColumn(Cliente9);
        modelo.addColumn(Cliente10);

        String[]p1={Producto1,Costo1,Cantidad1};
        String[]p2={Producto2,Costo2,Cantidad2};
        String[]p3={Producto3,Costo3,Cantidad3};
        String[]p4={Producto4,Costo4,Cantidad4};
        String[]p5={Producto5,Costo5,Cantidad5};
        String[]p6={Producto6,Costo6,Cantidad6};
        String[]p7={Producto7,Costo7,Cantidad7};
        String[]p8={Producto8,Costo8,Cantidad8};
        String[]p9={Producto9,Costo9,Cantidad9};
        String[]p10={Producto10,Costo10,Cantidad10};

        modelo.addRow(p1);
        modelo.addRow(p2);
        modelo.addRow(p3);
        modelo.addRow(p4);
        modelo.addRow(p5);
        modelo.addRow(p6);
        modelo.addRow(p7);
        modelo.addRow(p8);
        modelo.addRow(p9);
        modelo.addRow(p10);

        JTable table =new JTable(modelo);

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                System.out.print(tabla[i][j] + "\t");
            }
            System.out.println();

    }

    }
}
