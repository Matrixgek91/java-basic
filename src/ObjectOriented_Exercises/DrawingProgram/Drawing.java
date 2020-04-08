package ObjectOriented_Exercises.DrawingProgram;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Drawing extends JFrame implements MouseListener, ActionListener {

    String[] figureType = {"Line", "Rectangle", "Oval", "Triangle"};
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
        figure.xCoordinates.add(e.getX());
        figure.yCoordinates.add(e.getY());
        figure.pointCount++;

        switch (drawType) {
            case "Line":
                if (figure.pointCount == 2){
                    figure.x1 = figure.xCoordinates.get(0);
                    figure.x2 = figure.xCoordinates.get(1);
                    figure.y1 = figure.yCoordinates.get(0);
                    figure.y2 = figure.yCoordinates.get(1);
                    figure = new Line();
                    figures.add(figure);
                    repaint();
                    figure.xCoordinates.clear();
                    figure.yCoordinates.clear();
                    figure.pointCount = 0;
                }
                break;
            case "Rectangle":
                if (figure.pointCount == 2){
                    figure.x1 = figure.xCoordinates.get(0);
                    figure.x2 = figure.xCoordinates.get(1);
                    figure.y1 = figure.yCoordinates.get(0);
                    figure.y2 = figure.yCoordinates.get(1);
                    figure = new Rectangle();
                    figures.add(figure);
                    repaint();
                    figure.xCoordinates.clear();
                    figure.yCoordinates.clear();
                    figure.pointCount = 0;
                }
                break;
            case "Oval":
                if (figure.pointCount == 2){
                    figure.x1 = figure.xCoordinates.get(0);
                    figure.x2 = figure.xCoordinates.get(1);
                    figure.y1 = figure.yCoordinates.get(0);
                    figure.y2 = figure.yCoordinates.get(1);
                    figure = new Oval();
                    figures.add(figure);
                    repaint();
                    figure.xCoordinates.clear();
                    figure.yCoordinates.clear();
                    figure.pointCount = 0;
                }
                break;
            case "Triangle":
                if (figure.pointCount == 3){
                    figure.x1 = figure.xCoordinates.get(0);
                    figure.x2 = figure.xCoordinates.get(1);
                    figure.x3 = figure.xCoordinates.get(2);
                    figure.y1 = figure.yCoordinates.get(0);
                    figure.y2 = figure.yCoordinates.get(1);
                    figure.y3 = figure.yCoordinates.get(2);
                    figure = new Triangle();
                    figures.add(figure);
                    repaint();
                    figure.xCoordinates.clear();
                    figure.yCoordinates.clear();
                    figure.pointCount = 0;
                }
                break;
        }




//        switch (drawType) {
//            case "Line":
//                figure = new Line();
//                break;
//            case "Rectangle":
//                figure = new Rectangle();
//                break;
//            case "Oval":
//                figure = new Oval();
//                break;
//        }
//
//        figure.x1 = e.getX();
//        figure.y1 = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
//        figure.x2 = e.getX();
//        figure.y2 = e.getY();
//        figures.add(figure);
//        repaint();
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
