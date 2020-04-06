package GUI_Exercises;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame implements ActionListener {

    JLabel display = new JLabel("Play a game of TicTacToe");

    String whoTurn = "X";
    boolean winner = false;
    boolean draw = false;

    String TL = "";
    String TC = "";
    String TR = "";
    String ML = "";
    String MC = "";
    String MR = "";
    String BL = "";
    String BC = "";
    String BR = "";

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

    public void CheckWin(){
        System.out.println("Checkwin doet het");
        if(TL.equals("X") && TC.equals("X") && TR.equals("X")){
            System.out.println("De if doet het");
            display.setText("X WINS!");
            winner = true;
        }else if(ML == "X" && MC == "X" && MR == "X"){
            display.setText("X WINS!");
            winner = true;
        }else if(BL == "X" && BC == "X" && BR == "X"){
            display.setText("X WINS!");
            winner = true;
        }else if(TL == "X" && ML == "X" && BL == "X"){
            display.setText("X WINS!");
            winner = true;
        }else if(TC == "X" && MC == "X" && BC == "X"){
            display.setText("X WINS!");
            winner = true;
        }else if(TR == "X" && MR == "X" && BR == "X"){
            display.setText("X WINS!");
            winner = true;
        }else if(TL == "X" && MC == "X" && BR == "X"){
            display.setText("X WINS!");
            winner = true;
        }else if(TR == "X" && MC == "X" && BL == "X"){
            display.setText("X WINS!");
            winner = true;
        }else if(TL == "O" && TC == "O" && TR == "O"){
            display.setText("O WINS!");
            winner = true;
        }else if(ML == "O" && MC == "O" && MR == "O"){
            display.setText("O WINS!");
            winner = true;
        }else if(BL == "O" && BC == "O" && BR == "O"){
            display.setText("O WINS!");
            winner = true;
        }else if(TL == "O" && ML == "O" && BL == "O"){
            display.setText("O WINS!");
            winner = true;
        }else if(TC == "O" && MC == "O" && BC == "O"){
            display.setText("O WINS!");
            winner = true;
        }else if(TR == "O" && MR == "O" && BR == "O"){
            display.setText("O WINS!");
            winner = true;
        }else if(TL == "O" && MC == "O" && BR == "O"){
            display.setText("O WINS!");
            winner = true;
        }else if(TR == "O" && MC == "O" && BL == "O"){
            display.setText("O WINS!");
            winner = true;
        }else if(TL != "" && TC != "" && TR != "" && ML != "" && MC != "" && MR != "" && BL != "" && BC != "" && BR != ""){
            draw = true;
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
        JButton clickedButton = (JButton)e.getSource();
        String currentButton = clickedButton.getName();
        System.out.println(currentButton);

        if (whoTurn == "X"){
            switch (currentButton){
                case "TL":
                    clickedButton.setText("X");
                    TL = "X";
                    break;
                case "TC":
                    clickedButton.setText("X");
                    TC = "X";
                    break;
                case "TR":
                    clickedButton.setText("X");
                    TR = "X";
                    break;
                case "ML":
                    clickedButton.setText("X");
                    ML = "X";
                    break;
                case "MC":
                    clickedButton.setText("X");
                    MC = "X";
                    break;
                case "MR":
                    clickedButton.setText("X");
                    MR = "X";
                    break;
                case "BL":
                    clickedButton.setText("X");
                    BL = "X";
                    break;
                case "BC":
                    clickedButton.setText("X");
                    BC = "X";
                    break;
                case "BR":
                    clickedButton.setText("X");
                    BR = "X";
                    break;
                default:
                    display.setText("ERROR");
                    break;
            }

            whoTurn = "O";

        }else if(whoTurn == "O"){
            switch (currentButton){
                case "TL":
                    clickedButton.setText("O");
                    TL = "O";
                    break;
                case "TC":
                    clickedButton.setText("O");
                    TC = "O";
                    break;
                case "TR":
                    clickedButton.setText("O");
                    TR = "O";
                    break;
                case "ML":
                    clickedButton.setText("O");
                    ML = "O";
                    break;
                case "MC":
                    clickedButton.setText("O");
                    MC = "O";
                    break;
                case "MR":
                    clickedButton.setText("O");
                    MR = "O";
                    break;
                case "BL":
                    clickedButton.setText("O");
                    BL = "O";
                    break;
                case "BC":
                    clickedButton.setText("O");
                    BC = "O";
                    break;
                case "BR":
                    clickedButton.setText("O");
                    BR = "O";
                    break;
                default:
                    display.setText("ERROR");
                    break;
            }

            whoTurn = "X";

    }
        CheckWin();
}
}
