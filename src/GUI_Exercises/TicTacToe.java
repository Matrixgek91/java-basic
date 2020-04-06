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
        }else if(ML.equals("X") && MC.equals("X") && MR.equals("X")){
            display.setText("X WINS!");
            winner = true;
        }else if(BL.equals("X") && BC.equals("X") && BR.equals("X")){
            display.setText("X WINS!");
            winner = true;
        }else if(TL.equals("X") && ML.equals("X") && BL.equals("X")){
            display.setText("X WINS!");
            winner = true;
        }else if(TC.equals("X") && MC.equals("X") && BC.equals("X")){
            display.setText("X WINS!");
            winner = true;
        }else if(TR.equals("X") && MR.equals("X") && BR.equals("X")){
            display.setText("X WINS!");
            winner = true;
        }else if(TL.equals("X") && MC.equals("X") && BR.equals("X")){
            display.setText("X WINS!");
            winner = true;
        }else if(TR.equals("X") && MC.equals("X") && BL.equals("X")){
            display.setText("X WINS!");
            winner = true;
        }else if(TL.equals("O") && TC.equals("O") && TR.equals("O")){
            display.setText("O WINS!");
            winner = true;
        }else if(ML.equals("O") && MC.equals("O") && MR.equals("O")){
            display.setText("O WINS!");
            winner = true;
        }else if(BL.equals("O") && BC.equals("O") && BR.equals("O")){
            display.setText("O WINS!");
            winner = true;
        }else if(TL.equals("O") && ML.equals("O") && BL.equals("O")){
            display.setText("O WINS!");
            winner = true;
        }else if(TC.equals("O") && MC.equals("O") && BC.equals("O")){
            display.setText("O WINS!");
            winner = true;
        }else if(TR.equals("O") && MR.equals("O") && BR.equals("O")){
            display.setText("O WINS!");
            winner = true;
        }else if(TL.equals("O") && MC.equals("O") && BR.equals("O")){
            display.setText("O WINS!");
            winner = true;
        }else if(TR.equals("O") && MC.equals("O") && BL.equals("O")){
            display.setText("O WINS!");
            winner = true;
        }else if(!TL.equals("") && !TC.equals("") && !TR.equals("") && !ML.equals("") && !MC.equals("") && !MR.equals("") && !BL.equals("") && !BC.equals("") && !BR.equals("")){
            draw = true;
        }

    }

    public void WinDialog() {
        JDialog winDialog = new JDialog();
        JLabel dialogMessage = new JLabel("GAME OVER");
        JButton restartButton = new JButton("Restart the game");
        winDialog.add(dialogMessage, BorderLayout.NORTH);
        winDialog.add(restartButton, BorderLayout.SOUTH);
        winDialog.setSize(300, 200);
        winDialog.setVisible(true);
        restartButton.addActionListener(this);
    }

    public void WinOptionPane() {
        String message = "Test Message";
        JFrame frame = new JFrame();
        int winPane = JOptionPane.showConfirmDialog(
                frame,
                message,
                "GAME OVER",
                JOptionPane.OK_CANCEL_OPTION);
        if (winPane == JOptionPane.OK_OPTION){
            TL = TC = TR = ML = MC = MR = BL = BC = BR = "";
        }else if (winPane == JOptionPane.CANCEL_OPTION){
            TL = TC = TR = ML = MC = MR = BL = BC = BR = "";
        }


    }

    public void gameRestart() {
        TL = TC = TR = ML = MC = MR = BL = BC = BR = "";
        dispose();
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
        String resetClicked = e.getActionCommand();
        System.out.println(currentButton);

         if(resetClicked.equals("Restart the game")){
             gameRestart();
         }else if (whoTurn.equals("X")){
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

            }else if(whoTurn.equals("O")){
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

        if(winner || draw) WinOptionPane();

        }
}

