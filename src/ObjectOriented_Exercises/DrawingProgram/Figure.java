package ObjectOriented_Exercises.DrawingProgram;

import java.awt.*;
import java.util.ArrayList;

public abstract class Figure {

    ArrayList<Integer> xCoordinates = new ArrayList<Integer>();
    ArrayList<Integer> yCoordinates = new ArrayList<Integer>();

    int x1;
    int x2;
    int x3;

    int y1;
    int y2;
    int y3;

    int pointCount = 0;



    public abstract void draw(Graphics g);
}
