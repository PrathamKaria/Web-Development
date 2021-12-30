package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Labels {
    public Labels() {
        Frame f = new Frame();
        f.setVisible(true);
        f.setSize(500, 500);
        Button b = new Button("Click me");
        b.setBounds(20,40,90,100);
        Label l1 = new Label("Hello Bitches");
        l1.setBounds(20,150,100,20);
        TextField t1 = new TextField("Hello Devi");
        t1.setBounds(20,180,100,20);
        TextArea ta1 = new TextArea("Hello Devina");
        ta1.setBounds(20,220,90,100);
        f.setResizable(true);
        b.setBackground(Color.CYAN);
        b.setForeground(Color.BLACK);
        l1.setBackground(Color.CYAN);
        l1.setForeground(Color.BLACK);
        t1.setBackground(Color.CYAN);
        t1.setForeground(Color.BLACK);

        ta1.setBackground(Color.CYAN);
        ta1.setForeground(Color.BLACK);
        f.add(b);
        f.add(l1);
        f.add(t1);
        f.add(ta1);

        f.setBackground(Color.CYAN);
        f.setLayout(null);
        f.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowOpened(WindowEvent e) {
//                System.out.println("Window Opened");
//            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window Closed");

    f.dispose();
            }

//            @Override
//            public void windowClosed(WindowEvent e) {
//                System.out.println("Window Closed");
//
//            }

//            @Override
//            public void windowIconified(WindowEvent e) {
//                System.out.println("Window Iconified");
//            }

//            @Override
//            public void windowDeiconified(WindowEvent e) {
//                System.out.println("Window Deiconified");
//            }

//            @Override
//            public void windowActivated(WindowEvent e) {
//                System.out.println("Window Activated");
//
//            }

//            @Override
//            public void windowDeactivated(WindowEvent e) {
//                System.out.println("Window Deactivated");
//            }
        });
    }


    public static void main(String[] args) {
Labels object1=new Labels();
    }
}
