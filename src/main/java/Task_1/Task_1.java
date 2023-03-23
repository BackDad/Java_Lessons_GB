package Task_1;

import java.text.DecimalFormat;

public class Task_1 {
    public static void main(String[] args) {


        Point2D a = new Point2D(1,2);

        System.out.println(a.toString());
        Point2D b = new Point2D(2,50);

        System.out.println(b.toString());
        System.out.println(OOPVectorLen(a,b));

    }
    public static double OOPVectorLen(Point2D a, Point2D b){
        return Math.sqrt(Math.pow((a.x-b.x),2)+Math.pow((a.y-b.y),2));
    }
}

