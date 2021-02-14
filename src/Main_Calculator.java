import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Main_Calculator extends LayCon {

     int point_counter = 0;
     int equal_counter =0;
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton zero;
    private JButton plus;
    private JButton minus;
    private JButton mul;
    private JButton divide;
    private JButton equal;
    private JButton point;
    private JButton clear;
    private JButton conic_finder;
    private JButton center_finder;
    private JButton graph;
    private JLabel minibar;
    private JTextField display;
    private static  String action;
    private float num1,num2;
    private float result;
    int k=0,j=0;
    private int count = 0;

 Main_Calculator(){
     super.frame();
     super.setTitle("Calculator");
     super.container();
     initcomponents();
 }
    public void initcomponents() {
        Font font  = new Font("Arial", Font.BOLD, 30);
        Font f1 = new Font("Arial", Font.BOLD, 18);
        minibar = new JLabel("");
        minibar.setBounds(350, 18, 100, 25);
        minibar.setFont(font);
        container.add(minibar);
        display = new JTextField();
        display.setBounds(40, 55, 341, 45);
        display.setEditable(false);
        display.setFont(f1);

        container.add(display);

        one = new JButton("1");
        one.setBounds(40, 270, 73, 38);
        container.add(one);

        two = new JButton("2");
        two.setBounds(130, 270, 73, 38);
        container.add(two);

        three = new JButton("3");
        three.setBounds(220, 270, 73, 38);
        container.add(three);

        four = new JButton("4");
        four.setBounds(40, 220, 73, 38);
        container.add(four);

        five = new JButton("5");
        five.setBounds(130, 220, 73, 38);
        container.add(five);

        six = new JButton("6");
        six.setBounds(220, 220, 73, 38);
        container.add(six);

        mul = new JButton("*");
        mul.setBounds(310, 170, 73, 38);
        container.add(mul);

        seven = new JButton("7");
        seven.setBounds(40, 170, 73, 38);
        container.add(seven);

        eight = new JButton("8");
        eight.setBounds(130, 170, 73, 38);
        container.add(eight);

        nine = new JButton("9");
        nine.setBounds(220, 170, 73, 38);
        container.add(nine);

        divide = new JButton("/");
        divide.setBounds(310, 220, 73, 38);
        container.add(divide);

        conic_finder = new JButton("Conic");
        conic_finder.setBounds(130, 120, 73, 38);
        container.add(conic_finder);

        center_finder = new JButton("Center");
        center_finder.setBounds(220, 120, 73, 38);
        container.add(center_finder);

        graph = new JButton("Graph");
        graph.setBounds(310, 120, 73, 38);
        container.add(graph);

        zero = new JButton("0");
        zero.setBounds(130, 320, 73, 38);
        container.add(zero);

        plus = new JButton("+");
        plus.setBounds(310, 320, 73, 38);
        container.add(plus);

        minus = new JButton("-");
        minus.setBounds(310, 270, 73, 38);
        container.add(minus);

        clear = new JButton("C");
        clear.setBounds(40, 120, 73, 38);
        container.add(clear);

        point = new JButton(".");
        point.setBounds(40, 320, 73, 38);
        container.add(point);

        equal = new JButton("=");
        equal.setBounds(220, 320, 73, 38);
        container.add(equal);

        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(k==1){
                    display.setText(" ");
                    display.setText(display.getText()+"1");
                    k=0;
                }
                else {
                    display.setText(display.getText() + "1");
                }

            }
        });
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(k==1){
                    display.setText(" ");
                    display.setText(display.getText()+"2");
                    k=0;
                }
                else {
                    display.setText(display.getText() + "2");
                }

            }
        });
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(k==1){
                    display.setText(" ");
                    display.setText(display.getText()+"3");
                    k=0;
                }
                else {
                    display.setText(display.getText() + "3");
                }

            }
        });
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(k==1){
                    display.setText(" ");
                    display.setText(display.getText()+"4");
                    k=0;
                }
                else {
                    display.setText(display.getText() + "4");
                }

            }
        });
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(k==1){
                    display.setText(" ");
                    display.setText(display.getText()+"5");
                    k=0;
                }
                else {
                    display.setText(display.getText() + "5");
                }

            }
        });
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(k==1){
                    display.setText(" ");
                    display.setText(display.getText()+"6");
                    k=0;
                }
                else {
                    display.setText(display.getText() + "6");
                }

            }
        });
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(k==1){
                    display.setText(" ");
                    display.setText(display.getText()+"7");
                    k=0;
                }
                else {
                    display.setText(display.getText() + "7");
                }

            }
        });
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(k==1){
                    display.setText(" ");
                    display.setText(display.getText()+"8");
                    k=0;
                }
                else {
                    display.setText(display.getText() + "8");
                }

            }
        });
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(k==1){
                    display.setText(" ");
                    display.setText(display.getText()+"9");
                    k=0;
                }
                else {
                    display.setText(display.getText() + "9");
                }

            }
        });
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(k==1){
                    display.setText(" ");
                    display.setText(display.getText()+"0");
                    k=0;
                }
                else {
                    display.setText(display.getText() + "0");
                }

            }
        });
        point.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (count == 0 && k ==0)

                {
                  // if (!"Syntax Error".equals(display.getText())) {
                        display.setText(display.getText() + ".");
                        count++;
                        k = 0;
                  //  }
                }
                else if(count ==0 && k==1){
                    display.setText(" ");
                    display.setText(display.getText()+".");
                    count++;
                    k=0;
                }

            }
        });
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Float.valueOf(display.getText());
                    action = "+";
                    display.setText("");
                    count=0;

                } catch (Exception E) {
                    display.setText("+");

                }
                point_counter = 0;
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    num1 = Float.valueOf(display.getText());
                    //display.setText("-");
                    action = "-";
                    display.setText("");
                    k=0;
                    count=0;
                } catch (Exception E) {
                    display.setText("-");
                    k=0;
                }
                    point_counter = 0;
                }
        });

        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Float.valueOf(display.getText());
                    action = "/";
                    display.setText("");
                    count=0;
                } catch (Exception E) {
                    display.setText("/");
                }
                point_counter = 0;
            }
        });

        mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Float.valueOf(display.getText());
                    action = "*";
                    display.setText("");
                    count=0;
                } catch (Exception E) {
                    display.setText("*");
                }
                point_counter = 0;
            }
        });

        graph.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graph graph = new Graph();
                graph.setVisible(true);
                dispose();
            }
        });
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    equal_counter = 1;
                    if (action == "+") {
                        num2 = Float.valueOf(display.getText());
                       // float result;
                        result = (float) (num1 + num2);
                        String str = String.valueOf(result);
                        display.setText(num1 + " " + " + " + num2 + " = " + str);
                        k=1;
                        action=" ";
                       // point_counter=0;
                        count=0;
                    }
                    if (action == "-") {
                        num2 = Float.valueOf(display.getText());
                      //  float result;
                        result = (float) (num1 - num2);
                        String str = String.valueOf(result);
                        display.setText(num1  +"  -  " + num2 + " = " + str);
                        k=1;
                        action=" ";
                        //point_counter=0;
                        count = 0;
                    }
                    if (action == "/") {
                        num2 = Float.valueOf(display.getText());
                       // float result;
                        result = (float) (num1 / num2);
                        String str = String.valueOf(result);
                        display.setText(num1  +"  /  " + num2 + " = " + str);
                        k=1;
                        action=" ";
                      //  point_counter=0;
                        count = 0;
                    }
                    if (action == "*") {
                        num2 = Float.valueOf(display.getText());
                      //  float result;
                        result = (float) (num1 * num2);
                        String str = String.valueOf(result);
                        display.setText(num1  +"  *  " + num2 + "  =  " + str);
                        k=1;
                        action=" ";
                      //  point_counter=0;
                        count = 0;
                    }
                } catch (Exception E) {

                }

               // point_counter=0;
            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("");
                point_counter = 0;
                k=0;
            }
        });
        center_finder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Center_Finder cf = new Center_Finder();
                cf.setVisible(true);
               dispose();
            }
        });
        conic_finder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Conic_finder cf = new Conic_finder();
                cf.setVisible(true);
                dispose();

            }
        });
    }
    public static void main(String[] args) {
        Main_Calculator mc = new Main_Calculator();
        mc.setVisible(true);
    }
}