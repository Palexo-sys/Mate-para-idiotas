package Main;
import java.lang.Math;
public class Procesos {
    public Procesos(){
    }
    public static double Pendiente(double x2,double x1,double y2,double y1){
        double prod,pro1,pro2,res;
        pro1 = y2-y1;
        pro2 = x2-x1;
        prod = pro2/pro1;
        res = Math.tanh(prod);
        return res;
    }
    public static double Distancia(double x2,double x1,double y2,double y1){
        double res = 0;
        double sx,sy,sx2,sy2,rxy2;
        sx = x2-x1;
        sy = y2-y1;
        sx2 = sx*sx;
        sy2 = sy*sy;
        rxy2 = sx2+sy2;
        res = Math.sqrt(rxy2);
        return res;
    }
    public static void PM(double x2,double x1,double y2,double y1){
        double reX,reY;
       reX = (x1+x2)/2;
       reY = (y1+y2)/2;
       System.out.println("X="+reX+"Y="+reY);
    }
}
