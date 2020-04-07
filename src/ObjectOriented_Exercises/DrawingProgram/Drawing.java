package ObjectOriented_Exercises.DrawingProgram;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Drawing extends JFrame implements MouseListener {

    ArrayList<Figure> figures = new ArrayList<>();

    Figure figure = new Oval();



    public Drawing() {
        this.addMouseListener(this);
    }





    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        drawing.setSize(500,500);
        drawing.setVisible(true);
        drawing.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Figure f : figures){
            f.draw(g);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        figure = new Rectangle();
        figure.x1 = e.getX();
        figure.y1 = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        figure.x2 = e.getX();
        figure.y2 = e.getY();
        figures.add(figure);
        repaint();
    }


















    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
