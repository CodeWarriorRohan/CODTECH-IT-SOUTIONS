import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
public class Task3_StudentGradeManagementSystem1 implements ActionListener {

    JFrame f;
    JLabel l0;  JLabel l1; JLabel l2;  JLabel l3; JLabel l4;  JLabel l5; JLabel l6;  JLabel l7; JLabel l8;
    JLabel l9; JLabel l10;  JLabel l11; JLabel l12;  JLabel l13; JLabel l14;  JLabel l15;JLabel l16;
    JLabel l17; JLabel l18;  JLabel l19; JLabel l20; JLabel l21; JLabel l22; JLabel l23; JLabel l24; JLabel l25;
    JTextField tf1; JTextField tf2; JTextField tf3; JTextField tf4; JTextField tf5 ; JTextField tf6; JTextField tf7;
    JRadioButton jb1, jb2; JButton b1; JButton b2;
    Task3_StudentGradeManagementSystem1(){

        f = new JFrame("Students Marks Record");

        b1 = new JButton("Submit");
        b2 = new JButton("Show Details");

        l0 = new JLabel("Students Marks Record");
        l0.setBounds(200,10,400,50);
        l0.setFont(new Font("arial",Font.BOLD,30));

        l1 = new JLabel("Subjects");
        l1.setBounds(50,120,200,40);
        l1.setFont(new Font("arial",Font.BOLD,20));

        l2 = new JLabel("Total Marks");
        l2.setBounds(290,120,260,40);
        l2.setFont(new Font("arial",Font.BOLD,20));

        l3 = new JLabel("Passing Marks");
        l3.setBounds(440,120,260,40);
        l3.setFont(new Font("arial",Font.BOLD,20));

        l4 = new JLabel("Obtained Marks");
        l4.setBounds(610,120,260,40);
        l4.setFont(new Font("arial",Font.BOLD,20));

        l5 = new JLabel("Physics :");
        l5.setBounds(50,170,200,40);
        l5.setFont(new Font("arial",Font.BOLD,18));

        l6 = new JLabel("100");
        l6.setBounds(320,170,260,30);
        l6.setFont(new Font("arial",Font.BOLD,18));

        l7 = new JLabel("33");
        l7.setBounds(480,170,260,30);
        l7.setFont(new Font("arial",Font.BOLD,18));

        l8 = new JLabel("Chemistry :");
        l8.setBounds(50,220,200,40);
        l8.setFont(new Font("arial",Font.BOLD,18));

        l9 = new JLabel("100");
        l9.setBounds(320,220,260,30);
        l9.setFont(new Font("arial",Font.BOLD,18));

        l10 = new JLabel("33");
        l10.setBounds(480,220,260,30);
        l10.setFont(new Font("arial",Font.BOLD,18));

        l11 = new JLabel("Mathematics :");
        l11.setBounds(50,270,200,40);
        l11.setFont(new Font("arial",Font.BOLD,18));

        l12 = new JLabel("100");
        l12.setBounds(320,270,260,30);
        l12.setFont(new Font("arial",Font.BOLD,18));

        l13 = new JLabel("33");
        l13.setBounds(480,270,260,30);
        l13.setFont(new Font("arial",Font.BOLD,18));

        l14 = new JLabel("Fundamental Electronics :");
        l14.setBounds(50,320,240,40);
        l14.setFont(new Font("arial",Font.BOLD,18));

        l15 = new JLabel("100");
        l15.setBounds(320,320,260,30);
        l15.setFont(new Font("arial",Font.BOLD,18));

        l16 = new JLabel("33");
        l16.setBounds(480,320,260,30);
        l16.setFont(new Font("arial",Font.BOLD,18));

        l17 = new JLabel("Technical Communication :");
        l17.setBounds(50,370,240,40);
        l17.setFont(new Font("arial",Font.BOLD,18));

        l18 = new JLabel("100");
        l18.setBounds(320,370,260,30);
        l18.setFont(new Font("arial",Font.BOLD,18));

        l19 = new JLabel("33");
        l19.setBounds(480,370,260,30);
        l19.setFont(new Font("arial",Font.BOLD,18));

        l20 = new JLabel("Total Obtained Marks ");
        l20.setBounds(50,430,260,40);
        l20.setFont(new Font("arial",Font.BOLD,20));

        l21 = new JLabel("500");
        l21.setBounds(320,430,260,40);
        l21.setFont(new Font("arial",Font.BOLD,20));

        l22 = new JLabel("165");
        l22.setBounds(475,430,260,40);
        l22.setFont(new Font("arial",Font.BOLD,20));

        l23 = new JLabel("Overall Percentage ");
        l23.setBounds(50,490,260,40);
        l23.setFont(new Font("arial",Font.BOLD,20));

        l24 = new JLabel("100%");
        l24.setBounds(320,490,260,40);
        l24.setFont(new Font("arial",Font.BOLD,20));

        l25 = new JLabel("33%");
        l25.setBounds(475,490,260,40);
        l25.setFont(new Font("arial",Font.BOLD,20));

        tf1 = new JTextField();
        tf1.setBounds(650,170,60,30);
        tf1.setFont(new Font("arial",Font.BOLD,18));

        tf2 = new JTextField();
        tf2.setBounds(650,220,60,30);
        tf2.setFont(new Font("arial",Font.BOLD,18));

        tf3 = new JTextField();
        tf3.setBounds(650,270,60,30);
        tf3.setFont(new Font("arial",Font.BOLD,18));

        tf4 = new JTextField();
        tf4.setBounds(650,320,60,30);
        tf4.setFont(new Font("arial",Font.BOLD,18));

        tf5 = new JTextField();
        tf5.setBounds(650,370,60,30);
        tf5.setFont(new Font("arial",Font.BOLD,18));

        tf6 = new JTextField();
        tf6.setBounds(630,430,100,30);
        tf6.setFont(new Font("arial",Font.BOLD,18));

        tf7 = new JTextField();
        tf7.setBounds(630,490,100,30);
        tf7.setFont(new Font("arial",Font.BOLD,18));

        jb1 = new JRadioButton("Male");
        jb1.setBounds(250,370,100,30);
        jb1.setFont(new Font("arial",Font.BOLD,20));
        jb2 = new JRadioButton("Female");
        jb2.setBounds(350,370,100,30);
        jb2.setFont(new Font("arial",Font.BOLD,20));

        ButtonGroup bg = new ButtonGroup();
        bg.add(jb1);
        bg.add(jb2);

        b1.setBounds(250,630,120,40);
        b1.setFont(new Font("arial",Font.BOLD,20));

        b2.setBounds(400,630,160,40);
        b2.setFont(new Font("arial",Font.BOLD,20));

        f.add(l0); f.add(l1); f.add(l2); f.add(l3); f.add(l4);
        f.add(l5); f.add(l6); f.add(l7); f.add(l7); f.add(l8);
        f.add(l9); f.add(l10); f.add(l11); f.add(l12); f.add(l13);
        f.add(l14); f.add(l15); f.add(l16); f.add(l17); f.add(l18);
        f.add(l19); f.add(l20); f.add(l21); f.add(l22); f.add(l23);
        f.add(l24); f.add(l25);

        f.add(tf1); f.add(tf2); f.add(tf3); f.add(tf4);
        f.add(tf5); f.add(tf6); f.add(tf7);

        f.add(b1); f.add(b2);
        f.setSize(800,730);
        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);

        b1.addActionListener(this);
        b2.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b2) {
            f.setVisible(false);
           new Task3_StudentGradeManagementSystem2().setVisible(true);
        }

        if (e.getSource() == b1){
            try {
                // Marks Calculation
                int[] marks  = new int[5];
                for (int i=0; i<5;i++){
                    marks[0] = Integer.parseInt(tf1.getText());
                    marks[1] = Integer.parseInt(tf2.getText());
                    marks[2] = Integer.parseInt(tf3.getText());
                    marks[3] = Integer.parseInt(tf4.getText());
                    marks[4] = Integer.parseInt(tf5.getText());
                }

                // Calculate total marks
                int totalMarks = 0;
                for (int mark : marks){
                    totalMarks += mark;
                }

                // Calculate percentage
                double percentage = (double)totalMarks/(5 * 100) * 100;

                // Display results
                tf6.setText(Integer.toString(totalMarks));
                tf7.setText(String.format("%.2f%%", percentage));

            }catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws IOException {
        new Task3_StudentGradeManagementSystem1();
    }
}