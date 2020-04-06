package GUI_Exercises;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame implements ActionListener {

    JLabel display = new JLabel("Hoi");

    String[] labels = {
            "TL", "TC", "TR",
            "CL", "CC", "CR",
            "BL", "BC", "BR"
    };




    public TicTacToe(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,4));
        getContentPane().add(display, BorderLayout.NORTH);
        getContentPane().add(panel, BorderLayout.SOUTH);

        for (int i = 0 ; i < 9 ; i++){
            JButton button = new JButton(labels [i]);
            panel.add(button);
            button.addActionListener(this);
        }

    }


    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.setSize(400,400);
        ticTacToe.setVisible(true);
        ticTacToe.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
