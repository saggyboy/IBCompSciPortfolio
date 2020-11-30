package Project3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JPanel {
    private XOButton[] buttons = new XOButton[9];
    private boolean x = true;

    public Game() {
        this.setLayout(new GridLayout(3,3));
        for (int i = 0; i <buttons.length; i++) {
            XOButton b;
            b = new XOButton();
            b.addActionListener(new ButtonListener());
            b.setText("");
            buttons[i] = b;
            this.add(b);
        }
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            XOButton buttonClicked = (XOButton) e.getSource();
            if (buttonClicked.getText().equals("")) {
                buttonClicked.x = x;
                buttonClicked.full = true;
                if (x) {
                    buttonClicked.setText("X");
                } else {
                    buttonClicked.setText("O");
                }
                if (win()){
                    String team;
                    for (XOButton b:buttons) {
                        if (x){
                            team = "X";
                        } else {
                            team = "O";
                        }
                        b.setText(team + " Wins");
                    }
                }
                x = !x;
            }
        }
    }

    private boolean win(){
        for (int i = 0; i < 3; i++) {
            if ((buttons[i*3].full && buttons[i*3+1].full && buttons[i*3+2].full)) {
                if (buttons[i*3].x == buttons[i*3+1].x == buttons[i*3+2].x){
                    return true;
                }
            }
            if(buttons[i].full && buttons[i+3].full && buttons[i+6].full) {
                if (buttons[i].x == buttons[i+3].x == buttons[i+6].x) {
                    return true;
                }
            }
        }
        if (buttons[0].full && buttons[4].full && buttons[8].full){
            if (buttons[0].x == buttons[4].x == buttons[8].x){
                return true;
            }
        }
        if (buttons[2].full && buttons[4].full && buttons[6].full){
            if (buttons[2].x == buttons[4].x == buttons[6].x){
                return true;
            }
        }

        return false;
    }

    private class XOButton extends JButton {
        public boolean full = false;
        public boolean x;
    }
}
