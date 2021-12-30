package com.company;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ExtendingFrame extends Frame{
    public ExtendingFrame(){

        setVisible(true);
        Button b = new Button("Click me");
        b.setBounds(20,40,80,120);
        setSize(300,300);
        Label l = new Label();
        l.setBounds(100,100,500,500);

        Checkbox c1 = new Checkbox("Java");
        c1.setBounds(20,150,100,30);
        Checkbox c2 = new Checkbox("Python");
        c2.setBounds(20,170,100,30);
        add(c1);
        add(c2);
        add(b);
        add(l);

        setLayout(null);


        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            l.setText("Hello Friends,Button was clicked successfully");
            }
        });
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
        Frame f = (Frame)e.getSource();
        f.dispose();
            }
        });

    }

    public static void main(String[] args) {
        ExtendingFrame object1=new ExtendingFrame();
    }
}
