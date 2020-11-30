package Project3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Game g = new Game();
        JFrame window = new JFrame("TicTacToe");
        window.setBounds(100,100,200,200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().add(g);
        window.setVisible(true);
    }
}
