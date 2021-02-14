import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Button_templete extends JFrame {
    public JButton one, two, three,four, five, six, seven, eight, nine,  zero, minus, equal,backStep, clear, main;
    public JTextField display;
    public Container container ;

    public void frame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(250, 180, 435, 355);
        this.setResizable(false);
    }

    public void container(){
        container = this.getContentPane();
        container.setLayout(null);
        container.setBackground(new Color(146, 141, 141));
        Button_Method();
    }

    public void Button_Method(){

        display = new JTextField();
        display.setBounds(40, 28, 341, 45);
        display.setEditable(false);
        container.add(display);

        one = new JButton("1");
        one.setBounds(40, 200, 73, 38);
        container.add(one);

        two = new JButton("2");
        two.setBounds(130, 200, 73, 38);
        container.add(two);

        three = new JButton("3");
        three.setBounds(220, 200, 73, 38);
        container.add(three);

        five = new JButton("5");
        five.setBounds(40, 150, 73, 38);
        container.add(five);

        four = new JButton("4");
        four.setBounds(310, 200, 73, 38);
        container.add(four);

        six = new JButton("6");
        six.setBounds(130, 150, 73, 38);
        container.add(six);

        seven = new JButton("7");
        seven.setBounds(220, 150, 73, 38);
        container.add(seven);

        eight = new JButton("8");
        eight.setBounds(310, 150, 73, 38);
        container.add(eight);

        nine = new JButton("9");
        nine.setBounds(40, 100, 73, 38);
        container.add(nine);

        clear = new JButton("C");
        clear.setBounds(130, 100, 73, 38);
        container.add(clear);

        main = new JButton("Main");
        main.setBounds(220, 100, 73, 38);
        container.add(main);

        zero = new JButton("0");
        zero.setBounds(130, 250, 73, 38);
        container.add(zero);

        backStep = new JButton("X");
        backStep.setBounds(40, 250, 73, 38);
        container.add(backStep);

        minus = new JButton("-");
        minus.setBounds(220, 250, 73, 38);
        container.add(minus);

        equal = new JButton("=");
        equal.setBounds(310, 250, 73, 38);
        container.add(equal);

        main.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main_Calculator mc = new Main_Calculator();
                mc.setVisible(true);
                dispose();
            }
        });
    }

   /* public static void main(String[] args) {
        Button_templete bt = new Button_templete();
        bt.setVisible(true);
    }*/
}
