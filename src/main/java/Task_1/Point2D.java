package Task_1;

public class Point2D {
    int x,y;
    public Point2D(int valueX,int valueY){
        x=valueX;
        y=valueY;
    }
    public Point2D(){
        x=0;
        y=0;
    }
    public Point2D(int value){
        x=value;
        y=value;
    }
    public  String getInfo(){
        return String.format("x:%d , y:%d",x, y);
    }
}
