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

    Figure figure = new Line();

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
                if (figure.pointCount == 0){
                    figure = new Line();
                    figure.xCoordinates.add(e.getX());
                    figure.yCoordinates.add(e.getY());
                    figure.pointCount++;
                }else if (figure.pointCount == 1){
                    figure.xCoordinates.add(e.getX());
                    figure.yCoordinates.add(e.getY());
                    figure.x1 = figure.xCoordinates.get(0);
                    figure.x2 = figure.xCoordinates.get(1);
                    figure.y1 = figure.yCoordinates.get(0);
                    figure.y2 = figure.yCoordinates.get(1);
                    figures.add(figure);
                    repaint();
                    figure.xCoordinates.clear();
                    figure.yCoordinates.clear();
                    figure.pointCount = 0;
                }
                break;
            case "Rectangle":
                if (figure.pointCount == 0){
                    figure = new Rectangle();
                    figure.xCoordinates.add(e.getX());
                    figure.yCoordinates.add(e.getY());
                    figure.pointCount++;
                }else if (figure.pointCount == 1){
                    figure.xCoordinates.add(e.getX());
                    figure.yCoordinates.add(e.getY());
                    figure.x1 = figure.xCoordinates.get(0);
                    figure.x2 = figure.xCoordinates.get(1);
                    figure.y1 = figure.yCoordinates.get(0);
                    figure.y2 = figure.yCoordinates.get(1);
                    figures.add(figure);
                    repaint();
                    figure.xCoordinates.clear();
                    figure.yCoordinates.clear();
                    figure.pointCount = 0;
                }
                break;
            case "Oval":
                if (figure.pointCount == 0){
                    figure = new Oval();
                    figure.xCoordinates.add(e.getX());
                    figure.yCoordinates.add(e.getY());
                    figure.pointCount++;
                }else if (figure.pointCount == 1){
                    figure.xCoordinates.add(e.getX());
                    figure.yCoordinates.add(e.getY());
                    figure.x1 = figure.xCoordinates.get(0);
                    figure.x2 = figure.xCoordinates.get(1);
                    figure.y1 = figure.yCoordinates.get(0);
                    figure.y2 = figure.yCoordinates.get(1);
                    figures.add(figure);
                    repaint();
                    figure.xCoordinates.clear();
                    figure.yCoordinates.clear();
                    figure.pointCount = 0;
                }
                break;
            case "Triangle":
                if (figure.pointCount == 0){
                    figure = new Triangle();
                    figure.xCoordinates.add(e.getX());
                    figure.yCoordinates.add(e.getY());
                    figure.pointCount++;
                }else if (figure.pointCount == 1) {
                    figure.xCoordinates.add(e.getX());
                    figure.yCoordinates.add(e.getY());
                    figure.pointCount++;
                }else if (figure.pointCount == 2){
                    figure.xCoordinates.add(e.getX());
                    figure.yCoordinates.add(e.getY());
                    figure.x1 = figure.xCoordinates.get(0);
                    figure.x2 = figure.xCoordinates.get(1);
                    figure.x3 = figure.xCoordinates.get(2);
                    figure.y1 = figure.yCoordinates.get(0);
                    figure.y2 = figure.yCoordinates.get(1);
                    figure.y3 = figure.yCoordinates.get(2);
                    figures.add(figure);
                    repaint();
                    figure.xCoordinates.clear();
                    figure.yCoordinates.clear();
                    figure.pointCount = 0;
                }
                break;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JComboBox cb = (JComboBox)e.getSource();
        String selectedType = (String)cb.getSelectedItem();
        drawType = selectedType;
        System.out.println(selectedType);
    }


















    @Override
    public void mouseReleased(MouseEvent e) {

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
