import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Center_Finder extends Button_templete{
    int point_counter = 0;
    int k=1;
    int j = 0;
    public JButton Conic;
    private float num1,num2,num3,num4;
    Center_Finder(){
        super.frame();
        super.setTitle("Center Finder");
        super.container();
        super.setBounds(250, 180, 435, 355);
        Button_Listener();

    }
    public void Button_Listener() {
        Conic = new JButton("Conic");
        Conic.setBounds(310, 100, 73, 38);
        container.add(Conic);
        Font f1 = new Font("Arial", Font.BOLD, 18);
        display.setText("A = ?");
        display.setFont(f1);
        Conic.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Conic_finder cf = new Conic_finder();
                cf.setVisible(true);
                dispose();
            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("A = ?");
                point_counter = 0;
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

        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
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
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (j == 0) {
                        num1 = Float.valueOf(display.getText());
                        display.setText("C = ?");
                        j++;
                        k++;
                    }
                    if (j == 1) {
                        num2 = Float.valueOf(display.getText());
                        display.setText("D = ?");
                        j++;
                        k++;
                    }
                    if (j == 2) {
                        num3 = Float.valueOf(display.getText());
                        display.setText("E = ?");
                        j++;
                        k++;
                    }
                    if (j == 3) {
                        num4 = Float.valueOf(display.getText());
                        //display.setText("B = ?");
                        // j++;
                        //k++;
                        float result1, result2;
                        result1 = (float) ((-num3) / (2 * num1));
                        result2 = (float) ((-num4) / (2 * num2));
                        display.setText("X = " + result1 + " Y = " + result2);
                        j = 0;
                        k=1;

                    }
                }catch (Exception exception){

                }

            }
        });

    }
    /*public static void main(String[] args) {
        Center_Finder cf = new Center_Finder();
        cf.setVisible(true);
    }*/
}
