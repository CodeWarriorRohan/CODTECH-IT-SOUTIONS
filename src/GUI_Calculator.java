import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI_Calculator extends JFrame implements ActionListener
{
    JFrame f = new JFrame("GUI Calculator");
    JTextField tf = new JTextField();
    static double a = 0,b = 0,result = 0;
    static int operator = 0;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24;
    GUI_Calculator()
    {
        tf.setBounds(10,10,515,120);
        tf.setForeground(Color.BLACK);
        tf.setFont(new Font("arial",Font.BOLD,30));


        b21 = new JButton("Back");
        b21.setBounds(10,230,120,70);
        b21.setForeground(Color.WHITE);
        b21.setBackground(Color.BLUE);
        b21.setFont(new Font("arial",Font.BOLD,20));

        b22 = new JButton("^");
        b22.setBounds(140,150,120,70);
        b22.setForeground(Color.BLACK);
        b22.setBackground(Color.WHITE);
        b22.setFont(new Font("arial",Font.BOLD,20));

        b23 = new JButton("!");
        b23.setBounds(270,150,120,70);
        b23.setForeground(Color.BLACK);
        b23.setBackground(Color.WHITE);
        b23.setFont(new Font("arial",Font.BOLD,20));

        b24 = new JButton("Pi");
        b24.setBounds(400,150,120,70);
        b24.setForeground(Color.BLACK);
        b24.setBackground(Color.WHITE);
        b24.setFont(new Font("arial",Font.BOLD,20));

        b1 = new JButton("AC");
        b1.setBackground(Color.RED);
        b1.setBounds(10,150,120,70);
        b1.setFont(new Font("arial",Font.BOLD,20));

        b2 = new JButton("(");
        b2.setBounds(140,230,120,70);
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        b2.setFont(new Font("arial",Font.BOLD,20));

        b3 = new JButton(")");
        b3.setBounds(270,230,120,70);
        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.BLACK);
        b3.setFont(new Font("arial",Font.BOLD,20));

        b4 = new JButton("%");
        b4.setBounds(400,230,120,70);
        b4.setForeground(Color.BLACK);
        b4.setBackground(Color.WHITE);
        b4.setFont(new Font("arial",Font.BOLD,20));

        b5 = new JButton("7");
        b5.setBounds(10,310,120,70);
        b5.setForeground(Color.WHITE);
        b5.setBackground(Color.BLACK);
        b5.setFont(new Font("arial",Font.BOLD,20));

        b6 = new JButton("8");
        b6.setBounds(140,310,120,70);
        b6.setForeground(Color.WHITE);
        b6.setBackground(Color.BLACK);
        b6.setFont(new Font("arial",Font.BOLD,20));

        b7 = new JButton("9");
        b7.setBounds(270,310,120,70);
        b7.setForeground(Color.WHITE);
        b7.setBackground(Color.BLACK);
        b7.setFont(new Font("arial",Font.BOLD,20));

        b8 = new JButton("/");
        b8.setBounds(400,310,120,70);
        b8.setForeground(Color.BLACK);
        b8.setBackground(Color.WHITE);
        b8.setFont(new Font("arial",Font.BOLD,20));

        b9 = new JButton("4");
        b9.setBounds(10,390,120,70);
        b9.setForeground(Color.WHITE);
        b9.setBackground(Color.BLACK);
        b9.setFont(new Font("arial",Font.BOLD,20));

        b10 = new JButton("5");
        b10.setBounds(140,390,120,70);
        b10.setForeground(Color.WHITE);
        b10.setBackground(Color.BLACK);
        b10.setFont(new Font("arial",Font.BOLD,20));

        b11 = new JButton("6");
        b11.setBounds(270,390,120,70);
        b11.setForeground(Color.WHITE);
        b11.setBackground(Color.BLACK);
        b11.setFont(new Font("arial",Font.BOLD,20));

        b12 = new JButton("*");
        b12.setBounds(400,390,120,70);
        b12.setForeground(Color.BLACK);
        b12.setBackground(Color.WHITE);
        b12.setFont(new Font("arial",Font.BOLD,20));

        b13 = new JButton("1");
        b13.setBounds(10,470,120,70);
        b13.setForeground(Color.WHITE);
        b13.setBackground(Color.BLACK);
        b13.setFont(new Font("arial",Font.BOLD,20));

        b14 = new JButton("2");
        b14.setBounds(140,470,120,70);
        b14.setForeground(Color.WHITE);
        b14.setBackground(Color.BLACK);
        b14.setFont(new Font("arial",Font.BOLD,20));

        b15 = new JButton("3");
        b15.setBounds(270,470,120,70);
        b15.setForeground(Color.WHITE);
        b15.setBackground(Color.BLACK);
        b15.setFont(new Font("arial",Font.BOLD,20));

        b16 = new JButton("-");
        b16.setBounds(400,470,120,70);
        b16.setForeground(Color.BLACK);
        b16.setBackground(Color.WHITE);
        b16.setFont(new Font("arial",Font.BOLD,20));

        b17 = new JButton("0");
        b17.setBounds(10,550,120,70);
        b17.setForeground(Color.WHITE);
        b17.setBackground(Color.BLACK);
        b17.setFont(new Font("arial",Font.BOLD,20));

        b18 = new JButton(".");
        b18.setBounds(140,550,120,70);
        b18.setForeground(Color.BLACK);
        b18.setBackground(Color.WHITE);
        b18.setFont(new Font("arial",Font.BOLD,20));

        b19 = new JButton("=");
        b19.setBounds(270,550,120,70);
        b19.setForeground(Color.BLACK);
        b19.setBackground(Color.WHITE);
        b19.setFont(new Font("arial",Font.BOLD,20));

        b20 = new JButton("+");
        b20.setBounds(400,550,120,70);
        b20.setForeground(Color.BLACK);
        b20.setBackground(Color.WHITE);
        b20.setFont(new Font("arial",Font.BOLD,20));

        f.add(b1); f.add(b2); f.add(b3); f.add(b4); f.add(b5); f.add(b6);
        f.add(b7); f.add(b8); f.add(b9); f.add(b10); f.add(b11); f.add(b12);
        f.add(b13); f.add(b14); f.add(b15); f.add(b16); f.add(b17); f.add(b18);
        f.add(b19); f.add(b20); f.add(b21); f.add(b22); f.add(b23); f.add(b24);
        f.add(tf);

        f.setSize(550,750);
        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

        b1.addActionListener(this); b2.addActionListener(this); b3.addActionListener(this);
        b4.addActionListener(this); b5.addActionListener(this); b6.addActionListener(this);
        b7.addActionListener(this); b8.addActionListener(this); b9.addActionListener(this);
        b10.addActionListener(this); b11.addActionListener(this); b12.addActionListener(this);
        b13.addActionListener(this); b14.addActionListener(this); b15.addActionListener(this);
        b16.addActionListener(this); b17.addActionListener(this); b18.addActionListener(this);
        b19.addActionListener(this); b20.addActionListener(this); b21.addActionListener(this);
        b22.addActionListener(this); b23.addActionListener(this); b24.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b1)
        {
            tf.setText(null);
        }

        if(e.getSource() == b2)
        {
            tf.setText(tf.getText().concat("("));
        }

        if(e.getSource() == b3)
        {
            tf.setText(tf.getText().concat(")"));
        }

        if(e.getSource() == b4)
        {
//            tf.setText(tf.getText().concat("%"));
            a = Double.parseDouble(tf.getText());
            operator = 5;
            tf.setText("");
        }

        if(e.getSource() == b5)
        {
            tf.setText(tf.getText().concat("7"));
        }

        if(e.getSource() == b6)
        {
            tf.setText(tf.getText().concat("8"));
        }

        if(e.getSource() == b7)
        {
            tf.setText(tf.getText().concat("9"));
        }

        if(e.getSource() == b8)
        {
//            tf.setText(tf.getText().concat("/"));

            a = Double.parseDouble(tf.getText());
            operator = 4;
            tf.setText("");
        }

        if(e.getSource() == b9)
        {
            tf.setText(tf.getText().concat("4"));
        }

        if(e.getSource() == b10)
        {
            tf.setText(tf.getText().concat("5"));
        }

        if(e.getSource() == b11)
        {
            tf.setText(tf.getText().concat("6"));
        }

        if(e.getSource() == b12)
        {
//            tf.setText(tf.getText().concat("*"));

            a = Double.parseDouble(tf.getText());
            operator = 3;
            tf.setText("");
        }

        if(e.getSource() == b13)
        {
            tf.setText(tf.getText().concat("1"));
        }

        if(e.getSource() == b14)
        {
            tf.setText(tf.getText().concat("2"));
        }

        if(e.getSource() == b15)
        {
            tf.setText(tf.getText().concat("3"));
        }

        if(e.getSource() == b16)
        {
//            tf.setText(tf.getText().concat("-"));

            a = Double.parseDouble(tf.getText());
            operator = 2;
            tf.setText("");
        }

        if(e.getSource() == b17)
        {
            tf.setText(tf.getText().concat("0"));
        }

        if(e.getSource() == b18)
        {
            tf.setText(tf.getText().concat("."));
        }

        if(e.getSource() == b19)
        {
//            tf.setText(tf.getText().concat("="));

            b = Double.parseDouble(tf.getText());
            switch (operator)
            {
                case 1: result = a+b;
                    break;
                case 2: result = a-b;
                    break;
                case 3: result = a*b;
                    break;
                case 4: result = a/b;
                    break;
                case 5: result = a % b;
                    break;
            }
            tf.setText(""+result);
        }

        if(e.getSource() == b20)
        {
//            tf.setText(tf.getText().concat("+"));

            a = Double.parseDouble(tf.getText());
            operator = 1;
            tf.setText("");
        }

        if(e.getSource() == b21)
        {
            String s = tf.getText();
            tf.setText("");
            for (int i = 0;i < s.length()-1;i++)
            {
                tf.setText(tf.getText()+s.charAt(i));
            }
        }

        if(e.getSource() == b22)
        {
            tf.setText(tf.getText().concat("^"));
        }

        if(e.getSource() == b23)
        {
            tf.setText(tf.getText().concat("!"));

        }

        if(e.getSource() == b24)
        {
            tf.setText(tf.getText().concat("Pi"));
        }

    }

    public static void main(String[] args)
    {
        new GUI_Calculator();
    }
}


