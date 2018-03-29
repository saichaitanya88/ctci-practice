package Recursion;

import java.awt.*;
import java.util.ArrayList;

public class RobotMovement {
    static ArrayList<Point> path = new ArrayList<Point>();
    public static void main(String[] args){
        System.out.println("getPaths: " + getPaths(5,6));
        System.out.println("getPaths: " + path);
    }
    public static boolean getPaths(int x, int y){
        Point p = new Point(x,y);
        boolean success = false;
        path.add(p);
        if (x == 0 && y == 0)
            return true;
        if (x >= 1 && isFree(x-1, y)){
            success = getPaths(x-1, y);
        }
        if (!success && y >= 1 && isFree(x,y-1)){
            success = getPaths(x, y - 1);
        }
        if (!success){
            path.remove(p);
        }
        return success;
    }
    public static boolean isFree(int x, int y){
        return true; // all spots are free to traverse true
    }
}
