import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.util.ArrayList;
import java.util.List;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.util.*;
import java.awt.event.ActionEvent; // Add this import statement

public class Main {
  public int randomNum;
  public int life;

  public Main() {
    JFrame scr = new JFrame("Guess The Numer");
    // scr.setSize(240,320);
    scr.setExtendedState(JFrame.MAXIMIZED_BOTH);
    scr.getContentPane().setBackground(new Color(51, 0, 51, 255));
    Image icon = Toolkit.getDefaultToolkit().getImage("logo2.png");
    List<Image> icons = new ArrayList<>();
    icons.add(icon);
    scr.setIconImages(icons);
    JLabel h1 = new JLabel("Wellcome to Guess The Number Game");
    h1.setBounds(100, 0, 500, 50);
    h1.setFont(new Font("Aerial", Font.BOLD, 20));
    h1.setForeground(Color.YELLOW);
    h1.setHorizontalAlignment(JLabel.CENTER);
    scr.getContentPane().add(h1, BorderLayout.CENTER);
    scr.add(h1);
    JLabel h2 = new JLabel("Guess The Number Between 1 to 100");
    h2.setBounds(170, 55, 500, 60);
    h2.setFont(new Font("Aerial", Font.BOLD, 15));
    h2.setForeground(Color.WHITE);
    scr.add(h2);

    JButton submit = new JButton("Submit");
    submit.setBounds(270, 170, 100, 30);
    submit.setBackground(Color.GREEN);
    scr.add(submit);

    JLabel h3 = new JLabel("Enter  number between 0 to 100");
    h3.setBounds(200, 200, 500, 60);
    h3.setForeground(Color.YELLOW);

    scr.add(h3);

    JTextField num = new JTextField();
    num.setBounds(280, 120, 80, 30);
    num.setFont(new Font("Aerial", Font.BOLD, 15));
    num.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        // Get the text from the text field
        String text = num.getText();
        if (!isnum(text)) {
          num.setText("");
        }

      }

    });
    scr.add(num);
    life = 5;
    randomNum = (int) (Math.random() * 100) + 1;
    submit.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        String text2 = num.getText();
        life--;
        h2.setText("Life:" + life);
        if (life <= 0) {
          h3.setText("GAME OVER!!! YOU LOST " + "\n" + "The number was " + randomNum);
          life = 5;
          randomNum = (int) (Math.random() * 100) + 1;
        }

        else {

          if (isnum(text2)) {

            if (randomNum < Integer.parseInt(text2)) {
              h3.setText("You Guess Too High!!");
            } else if (randomNum > Integer.parseInt(text2)) {
              h3.setText("You Guess Too Low!!");
            } else {
              h3.setText("CONGRATULATIONS!!! You Guessed It Right");
            }

          } else {
            h3.setText("Enter A Valid Number");
            num.setText("");
          }

        }
      }

    });

    scr.setLayout(null);

    scr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    scr.setVisible(true);
  }

  public boolean isnum(String text) {
    try {
      Integer.parseInt(text);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }

  public static void main(String[] args) {
    new Main();
  }
}
