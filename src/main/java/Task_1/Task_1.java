package Task_1;

import java.text.DecimalFormat;

public class Task_1 {
    public static void main(String[] args) {
        int [] a = new int[2];
        a[0]=1 ;
        a[1]=2 ;
        int [] b = new int [2];
       b[0] = 2;
        b[1]=50;
        System.out.println(new DecimalFormat( "#.##" ).format(VectorLen(a,b)));
        Point2D a1 = new Point2D();
        a1.x=1;
        a1.y=2;
        System.out.println(a1.toString());
        Point2D b1 = new Point2D();
        b1.x = 2;
        b1.y =50;
        System.out.println(b1.toString());
        System.out.println(OOPVectorLen(a1,b1));

    }
    public static double VectorLen(int [] a1, int [] b1){

        return Math.sqrt(Math.pow((b1[0] - a1[0]), 2) + Math.pow((b1[1] - a1[1]), 2));
    }
    public static double OOPVectorLen(Point2D a1, Point2D b1){
        return Math.sqrt(Math.pow((a1.x-b1.x),2)+Math.pow((a1.y-b1.y),2));
    }
}

