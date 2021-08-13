package sda.oop.zadanie1;

public class Main {

    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.setX(5);
        point2D.setY(5);

        for(int i = 0;i < point2D.getXY().length;i++){
            System.out.print( point2D.getXY()[i] + " ");
        }

        System.out.println();

        Point3D point3D = new Point3D(5,5,5);
        for(int i = 0;i < point3D.getXYZ().length;i++){
            System.out.print(point3D.getXYZ()[i] + " ");
        }

        System.out.println("");
        System.out.println(point3D);
        System.out.println("");

        Line line = new Line(1,2,3,4);
        System.out.println(line.getStartPoint());

        line.getLineLength();
        line.getCenterOfTheLine();

        for (float point:line.getCenterOfTheLine()){
            System.out.println(point);
        }


    }
}
