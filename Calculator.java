import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame {

    public Calculator() {
        setTitle("CALCULATOR");
        this.setBackground(Color.cyan);
        
        Label l1 = new Label("Enter the first number");
        l1.setBounds(100, 100, 200, 20);
        Label l2 = new Label("Enter the second number");
        l2.setBounds(100, 200, 200, 20);
        Label l3 = new Label("Result");
        l3.setBounds(100, 450, 200, 20);
        
        TextField t1 = new TextField();
        t1.setBounds(300, 100, 200, 20);
        TextField t2 = new TextField();
        t2.setBounds(300, 200, 200, 20);
        TextField t3 = new TextField();
        t3.setBounds(300, 450, 200, 20);
        
        Button b1 = new Button("Addition");
        b1.setBackground(Color.white);
        b1.setBounds(100, 300, 200, 40);
        Button b2 = new Button("Subtraction");
        b2.setBackground(Color.gray);
        b2.setBounds(300, 300, 200, 40);
        Button b3 = new Button("Multiplication");
        b3.setBackground(Color.gray);
        b3.setBounds(100, 340, 200, 40);
        Button b4 = new Button("Division");
        b4.setBackground(Color.white);
        b4.setBounds(300, 340, 200, 40);
        
        setSize(600, 600);
        setLayout(null);
        setVisible(true);
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                t3.setText(String.valueOf(a + b));
            }
        });
        
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                t3.setText(String.valueOf(a - b));
            }
        });
        
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                t3.setText(String.valueOf(a * b));
            }
        });
        
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());
                t3.setText(String.valueOf(a / b));
            }
        });
        
        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(b1); add(b2);
        add(b3); add(b4);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
