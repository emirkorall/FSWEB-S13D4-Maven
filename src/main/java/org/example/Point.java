package org.example;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }
    public double distance(Point point){
        int dx=point.getX()-this.x;
        int dy=point.getY()-this.y;
        return Math.sqrt(Math.pow(dx,2)+Math.pow(dy,2));

    }
    public double distance(int a, int b) {
        int dx = a - this.x;
        int dy = b - this.y;
        return Math.sqrt(Math.pow(dx,2)+Math.pow(dy,2));
    }
}
