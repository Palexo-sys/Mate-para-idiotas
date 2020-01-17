/*
   <MATE PARA IDIOTAS> AUTOR:Palexo guns(Ulises Alejandro) VERSION: 0.1
*/
package Main;
import java.util.Scanner;
public class Main {
    public static Scanner input = new Scanner(System.in);
    private static double p2,p1,r2,r1;
    private static void pedirValores(){
        System.out.println("Inserte valor X de la primera coordenada");
        p1 = input.nextDouble();
        System.out.println("Inserte valor Y de la primera coordenada");
        r1 = input.nextDouble();
        System.out.println("Inserte valor X de la segunda coordenada");
        p2 = input.nextDouble();
        System.out.println("Inserte valor Y de la segunda coordenada");
        r2 = input.nextDouble();
    }
    private static void MedirPM(){
        pedirValores();
        Procesos.PM(p2, p1, r2, r1);
        
    }
    private static void Medirpendiente(){
        pedirValores();
        System.out.println(Procesos.Pendiente(p2, p1, r2, r1));
    }
    private static void Medirdistancia(){
        pedirValores();
        System.out.println(Procesos.Distancia(p2, p1, r2, r1));
    }
    public static void main(String[] args) {
        int a = 0;
        boolean estado = true;
        Procesos pro = new Procesos();
       do{
        System.out.println("<----Menu principal---->");
        System.out.println("1.-Medir distancia");
        System.out.println("2.-Medir Punto medio");
        System.out.println("3.-Medir pendiente");
        System.out.println("456.-cerrar programa");
        a = input.nextInt();
        switch(a){
            case 1:
                Medirdistancia();
                break;
            case 2:
                MedirPM();
                break;
            case 3:
                Medirpendiente();
            case 456:
                estado = false;
            default:
                break;
        }
       }while(estado);
    }
    
}
