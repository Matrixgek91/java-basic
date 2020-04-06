package GUI_Exercises;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame implements ActionListener {

    JLabel display = new JLabel("Hoi");

    String TL;
    String TC;
    String TR;
    String ML;
    String MC;
    String MR;
    String BL;
    String BC;
    String BR;

    String[] labels = {
            TL, TC, TR,
            ML, MC, MR,
            BL, BC, BR
    };
    String[] names = {
            "TL", "TC", "TR",
            "MR", "MC", "MR",
            "BL", "BC", "BR"
    };

    public TicTacToe(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,3));
        panel.setPreferredSize(new Dimension(400,400));
        getContentPane().add(display, BorderLayout.NORTH);
        getContentPane().add(panel, BorderLayout.SOUTH);

        for (int i = 0 ; i < 9 ; i++){
            JButton button = new JButton(labels [i]);
            button.setName(names [i]);
            panel.add(button);
            button.addActionListener(this);
        }

    }


    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.setSize(400,500);
        ticTacToe.setVisible(true);
        ticTacToe.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton o = (JButton)e.getSource();
        String currentButton = o.getName();
        System.out.println(currentButton);
    }
}
