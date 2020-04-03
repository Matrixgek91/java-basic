import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessTheNumber extends JFrame implements ActionListener {

    int Random_int1;
    int guessedNumber;

    JLabel assignment = new JLabel("Guess a number between 1 and 1000", SwingConstants.CENTER);
    JLabel result = new JLabel("Your answer is: ", SwingConstants.CENTER);
    JTextField input = new JTextField();
    JButton confirmInput = new JButton("Confirm");

    public GuessTheNumber() {
        this.setTitle("Guess the number");
        Random preRandom = new Random();
        Random_int1 = preRandom.nextInt(1000);

        System.out.println("You read the mind of the computer.....\nThe random number is: " + Random_int1);

        assignment.setPreferredSize(new Dimension(400,50));
        result.setPreferredSize(new Dimension(400,50));
        input.setPreferredSize(new Dimension(285,50));
        confirmInput.setPreferredSize(new Dimension(100,50));

        assignment.setFont(new Font("Arial", Font.PLAIN,20));
        input.setFont(new Font("Arial", Font.PLAIN,20));
        result.setFont(new Font("Arial", Font.PLAIN,20));

        getContentPane().add(assignment, BorderLayout.NORTH);
        getContentPane().add(input, BorderLayout.WEST);
        getContentPane().add(confirmInput, BorderLayout.EAST);
        getContentPane().add(result, BorderLayout.SOUTH);
        confirmInput.addActionListener(this);
    }

    public static void main(String[] args) {
        GuessTheNumber guessTheNumber = new GuessTheNumber();
        guessTheNumber.setSize(400,200);
        guessTheNumber.setVisible(true);
        guessTheNumber.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String currentButton = e.getActionCommand();

        if(currentButton.equals("Confirm")){
            guessedNumber = Integer.parseInt(input.getText());
            System.out.println("Guessed right = " + (guessedNumber == Random_int1));

            if(guessedNumber > 1000 || guessedNumber < 1){
                result.setText("Your input is invalid");
            }else if(Random_int1 == guessedNumber){
                result.setText("Correct!");
            }else if(Random_int1 > guessedNumber){
                result.setText("You guessed too low.");
            }else if(Random_int1 < guessedNumber){
                result.setText("You guessed too high.");
            }else{
                result.setText("ERROR");
            }
        }
    }
}
