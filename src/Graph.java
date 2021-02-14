import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Graph extends Button_templete {
    int point_counter = 0;
    int k=1;
    int j = 0;
   private float width,height;

    public JButton Conic;
    Graph(){
        super.frame();
        super.setTitle("Graph");
        super.container();
        super.setBounds(250, 180, 435, 355);
        Button_Listener();
    }

public void Button_Listener(){
    Conic = new JButton("Conic");
    Conic.setBounds(310, 100, 73, 38);
    container.add(Conic);
    Conic.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Conic_finder cf = new Conic_finder();
            cf.setVisible(true);
            dispose();
        }
    });
        display.setText("Width = ?");
    clear.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            display.setText(" Width = ?");
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
            display.setText("Negative value not allowed");
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

                if (j==0) {
                    width = Float.valueOf(display.getText());
                    display.setText("Height = ?");
                    j++;
                    k=1;
                }
                else if(j==1){
                    height = Float.valueOf(display.getText());
                    j=0;
                    k=1;
                     if (width==0 || height==0) {
                        display.setText("Invalid Input");
                    }else{
                         DrawGraph dr = new DrawGraph(width,height);
                         if(width==0 || height==0){
                         }
                         else if(width==height){
                             JFrame frame = new JFrame(" Circle");
                            // frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                             frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                             frame.getContentPane().add(new DrawGraph(width,height));
                             // frame.pack();
                             frame.setSize(new Dimension(600, 600));
                             frame.setVisible(true);
                             frame.setResizable(false);
                         }
                         else
                         {
                             JFrame frame1 = new JFrame("Ellipse");
                             //frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                             frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                             frame1.getContentPane().add(new DrawGraph(width,height));
                             // frame.pack();
                             frame1.setSize(new Dimension(600, 600));
                             frame1.setVisible(true);
                             frame1.setResizable(false);
                         }
                     }
                    }
                    k=1;
                }
            catch (Exception exception){

            }

        }
    });
}
    /*public static void main(String[] args) {
        Graph g = new Graph();
        g.setVisible(true);


    }*/
}
