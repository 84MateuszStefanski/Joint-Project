package sda.oop.zadanie1;

public class Line {


    private float startX;
    private float startY;
    private float endX;
    private float endY;
    private Point2D startPoint = new Point2D(startX, startY);
    private Point2D endPoint = new Point2D(endX, endY);


    public Line(Point2D startPoint, Point2D endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    //zadanie 5
    public Line(float startX,float startY,float endX,float endY){
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.startPoint.setX(startX);
        this.startPoint.setY(startY);
        this.endPoint.setX(endX);
        this.endPoint.setY(endY);
    }


    public Point2D getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point2D startPoint) {
        this.startPoint = startPoint;
    }

    public Point2D getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point2D endPoint) {
        this.endPoint = endPoint;
    }

    public void getLineLength(){
        double endX = (double) endPoint.getX();
        double startX = (double)startPoint.getX();
        double endY = (double)endPoint.getY();
        double startY = (double)startPoint.getY();
        double result1 = Math.pow((endX-startX),2);
        double result2 = Math.pow((endY-startY),2);
        double result3 = result1+result2;
        System.out.println("Line length is: " + Math.sqrt(result3));
    }

    public float[] getCenterOfTheLine(){
        float[] center = new float[2];
        center[0] = (endPoint.getX() +startPoint.getX()) /2;
        center[1] = (endPoint.getY()+startPoint.getY()) /2;
        return center;
    }
}
