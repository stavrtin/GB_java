package less_6_classes;

public class Point {
    int x;
    int y;

    @Override
    public String toString() {
        return "{X = " + x + " Y = " + y + "}";
    }


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }



    public static void main(String[] args) {
        Point pointPoint = new Point(4,6);
//        pointPoint.x = 4;
//        pointPoint.y = 34;

        System.out.println(pointPoint);
    }





}
