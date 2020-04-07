package ObjectOriented_Exercises.DrawingProgram;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Drawing extends JFrame implements MouseListener, ActionListener {

    String[] figureType = {"Line", "Rectangle", "Oval"};
    String drawType = "Line";
    ArrayList<Figure> figures = new ArrayList<>();

    Figure figure = new Oval();



    public Drawing() {
        this.setTitle("Drawing");
        this.addMouseListener(this);
        JComboBox typeSelect = new JComboBox(figureType);
        getContentPane().add(typeSelect,BorderLayout.NORTH);
        typeSelect.addActionListener(this);
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
        switch (drawType) {
            case "Line":
                figure = new Line();
                break;
            case "Rectangle":
                figure = new Rectangle();
                break;
            case "Oval":
                figure = new Oval();
                break;
        }

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
    public void actionPerformed(ActionEvent e) {
        JComboBox cb = (JComboBox)e.getSource();
        String selectedType = (String)cb.getSelectedItem();
        drawType = selectedType;
        System.out.println(selectedType);
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
