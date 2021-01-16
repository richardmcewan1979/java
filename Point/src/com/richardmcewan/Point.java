package com.richardmcewan;

public class Point {

    private int x;
    private int y;

    public Point() {
        this(0,0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public double distance(){
    //return distance between this p(x,y) and p(0,0)
        return distance(0,0);
    }

    public double distance(int a, int b){
        //return distance between p(x,y) distance(a,b)
        //just want to see if this works
        return Math.sqrt(Math.pow(a-this.x, 2) + Math.pow(b-this.y, 2));
    }

    public double distance(Point a){
        //return distance between this point and another
        return distance(a.x, a.y);
        
    }


        //end curly
}


/*
Alternative function

return Math.sqrt( ((a - this.x) * (a - this.x)) + ((b - this.y) * (b - this.y)) );

 */