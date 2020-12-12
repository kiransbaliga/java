import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class trafficlight extends JFrame implements ActionListener {
    JRadioButton buttonRed, buttonorange, buttonGreen;

    Signal green = new Signal(Color.green);
    Signal orange = new Signal(Color.orange);
    Signal red = new Signal(Color.red);

    public trafficlight(){

        setLayout(new FlowLayout());
        buttonRed = new JRadioButton("Red");
        buttonorange = new JRadioButton("orange");
        buttonGreen = new JRadioButton("Green");
        buttonRed.addActionListener(this);
        buttonorange.addActionListener(this);
        buttonGreen.addActionListener(this);

        JPanel trafficPanel = new JPanel(new GridLayout(3,1));
        trafficPanel.add(red);
        trafficPanel.add(orange);
        trafficPanel.add(green);
        JPanel lightPanel = new JPanel(new FlowLayout());
        lightPanel.add(buttonRed);
        lightPanel.add(buttonorange);
        lightPanel.add(buttonGreen);
        add(trafficPanel);
        add(lightPanel);
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args){
        new trafficlight();
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == buttonRed){
            buttonGreen.setSelected(false);
            buttonorange.setSelected(false);
            green.turnOn(false);
            orange.turnOn(false);
            red.turnOn(true);
        } else if (e.getSource() == buttonorange){
            buttonGreen.setSelected(false);
            buttonRed.setSelected(false);
            orange.turnOn(true);
            green.turnOn(false);
            red.turnOn(false);
        } else if (e.getSource() == buttonGreen){
            buttonRed.setSelected(false);
            buttonorange.setSelected(false);
            red.turnOn(false);
            orange.turnOn(false);
            green.turnOn(true);
        }
    }
}
class Signal extends JPanel{

    Color on;
    boolean change;

    Signal(Color color){
        on = color;
        change = false;
    }

    public void turnOn(boolean a){
        change = a;
        repaint();
    }
    public Dimension getPreferredSize(){
        int size = (50)*2;
        return new Dimension( size, size );
    }
    public void paintComponent(Graphics g){

        g.setColor(Color.black);
        g.fillRect(0,0,150,250);
        if (change){
            g.setColor( on );
        } else {
            g.setColor(Color.white);
        }
        g.fillOval(10, 10, 80, 80);
        g.setColor(Color.red);
        g.drawOval(10,10,80,80);
    }
}