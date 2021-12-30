package com.company;

import java.awt.*;

public class CreatingFrame {
    public static void main(String[] args) {
        Frame f = new Frame("This is my First Frame");
        f.setResizable(false); //wont be able to resize
        f.setSize(400,400);
        f.setVisible(true);
        f.setBackground(Color.green);
    }
}
