package com.igordudek;

/**
 * Created by VADMIN on 2017-03-10.
 */
public class PointController {

    public void addX (Point p) {
        p.setX(p.getX()+1);
    }

    public  void minuxX (Point p) {
        p.setX(p.getX()-1);
    }

    public void addY (Point p) {
        p.setY(p.getY()+1);
    }

    public void minusY (Point p) {
        p.setY(p.getY()-1);
    }


}
