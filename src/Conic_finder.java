// Here k is used for clear the text area;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Conic_finder extends Button_templete{
    public JButton center;

    private int k=1;
    private  int j = 0;
    private float num1 ,num2;
    int point_counter = 0;
    private static String action;
    Conic_finder(){
        super.frame();
        super.setTitle("Conic Finder");
        super.container();
        super.setBounds(250, 180, 435, 355);
        Button_Listener();
    }
public void Button_Listener(){

    Font f1 = new Font("Arial", Font.BOLD, 18);
    center = new JButton("Center");
    center.setBounds(310, 100, 73, 38);
    container.add(center);
    display.setText("A = ?");
    display.setFont(f1);

    center.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Center_Finder cf = new Center_Finder();
            cf.setVisible(true);
            dispose();
        }
    });
    clear.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            display.setText("");
            point_counter = 0;
            k=1;
        }
    });
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
    backStep.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int length = display.getText().length();
            int number = display.getText().length() - 1;
            String store;
            if (length > 0) {
                StringBuilder back = new StringBuilder(display.getText());
                back.deleteCharAt(number);
                store = back.toString();
                display.setText(store);
            }

        }
    });
    minus.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                action = "-";
                display.setText("-");
                num1 = Float.valueOf(display.getText());
                display.setText("");
                k=0;

            } catch (Exception E) {
               display.setText("-");
               k=0;
               // count=0;
            }
            point_counter = 0;
        }
    });
    equal.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if (j==0) {
                    num1 = Float.valueOf(display.getText());
                    display.setText("C = ?");
                    j++;
                    k=1;
                }
                else if(j==1){
                    num2 = Float.valueOf(display.getText());

                    float result;
                    result = num1*num2;
                    if(num1==0 && num2==0){
                        display.setText("This is not a Conic");
                        // k=1;
                    }

                    else if(num1==num2 && num1!=0 && num2!=0){
                        display.setText("Circle");
                        k=1;
                    }
                   else if(result>0 && num1!=num2){
                        display.setText("Ellipse");
                        k=1;
                    }
                   else if(result<0){
                        display.setText("Hyperbola");
                        k=1;
                    }
                   else if (result==0){
                        display.setText("Parabola");
                        k=1;
                    }
                    j=0;
                    k=1;
                }


            } catch (Exception E) {

            }

            point_counter=1;
        }
    });
}
  /*  public static void main(String[] args) {
        Conic_finder cf = new Conic_finder();
        cf.setVisible(true);
    }*/
}
