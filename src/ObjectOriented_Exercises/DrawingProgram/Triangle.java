package ObjectOriented_Exercises.DrawingProgram;

import java.awt.*;

public class Triangle extends Figure {





    @Override
    public void draw(Graphics g) {
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x3, y3, x2, y2);
        g.drawLine(x1, y1, x3, y3);




    }
}
