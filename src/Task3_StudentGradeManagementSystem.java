import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Task3_StudentGradeManagementSystem implements ActionListener {

    JFrame f;
    JLabel l0;  JLabel l1; JLabel l2;  JLabel l3;
    JLabel l4;  JLabel l5; JLabel l6;  JLabel l7;
    JTextField tf1; JTextField tf2; JTextField tf3;
    JTextField tf4; JTextField tf5; JTextArea ta6;
    JRadioButton jb1, jb2;
    JButton b1;JButton b2;
    Task3_StudentGradeManagementSystem(){

        f = new JFrame("Students Information Form");

        b1 = new JButton("Close");
        b2 = new JButton("Submit");

        l0 = new JLabel("Students Information Form");
        l0.setBounds(200,10,400,50);
        l0.setFont(new Font("arial",Font.BOLD,30));

        l1 = new JLabel("Roll number :");
        l1.setBounds(50,120,200,40);
        l1.setFont(new Font("arial",Font.BOLD,20));
        tf1 = new JTextField();
        tf1.setBounds(250,120,260,30);
        tf1.setFont(new Font("arial",Font.BOLD,20));

        l2 = new JLabel("Name :");
        l2.setBounds(50,170,200,40);
        l2.setFont(new Font("arial",Font.BOLD,20));
        tf2 = new JTextField();
        tf2.setBounds(250,170,260,30);
        tf2.setFont(new Font("arial",Font.BOLD,20));

        l3 = new JLabel("Email address :");
        l3.setBounds(50,220,200,40);
        l3.setFont(new Font("arial",Font.BOLD,20));
        tf3 = new JTextField();
        tf3.setBounds(250,220,260,30);
        tf3.setFont(new Font("arial",Font.BOLD,20));

        l4 = new JLabel("Date Of Birth :");
        l4.setBounds(50,270,200,40);
        l4.setFont(new Font("arial",Font.BOLD,20));
        tf4 = new JTextField();
        tf4.setBounds(250,270,260,30);
        tf4.setFont(new Font("arial",Font.BOLD,20));

        l5 = new JLabel("Contact number :");
        l5.setBounds(50,320,200,40);
        l5.setFont(new Font("arial",Font.BOLD,20));
        tf5 = new JTextField();
        tf5.setBounds(250,320,260,30);
        tf5.setFont(new Font("arial",Font.BOLD,20));

        l6 = new JLabel("Address :");
        l6.setBounds(50,430,200,40);
        l6.setFont(new Font("arial",Font.BOLD,20));
        ta6 = new JTextArea();
        ta6.setBounds(250,430,260,50);
        ta6.setFont(new Font("arial",Font.BOLD,20));

        l7 = new JLabel("Gender :");
        l7.setBounds(50,370,200,40);
        l7.setFont(new Font("arial",Font.BOLD,20));

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
        b2.setBounds(400,630,120,40);
        b2.setFont(new Font("arial",Font.BOLD,20));

        f.add(tf1); f.add(tf2); f.add(tf3);
        f.add(tf5); f.add(tf4); f.add(ta6);
        f.add(jb1); f.add(jb2);
        f.add(l0); f.add(l1); f.add(l2); f.add(l3);
        f.add(l4); f.add(l5); f.add(l6); f.add(l7);
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
        if (e.getSource() == b1) {
            f.setVisible(false);
        }

        if (e.getSource() == b2){
            try {
                String Rollno = "" + tf1.getText();
                String Name = "" + tf2.getText();
                String Email = "" + tf3.getText();
                String DOB = "" + tf4.getText();
                String Contactno = "" + tf5.getText();
                String Address = "" + ta6.getText();
                String Gender = null;
                if (jb1.isSelected()) {
                    Gender = "Male";
                }
                if (jb2.isSelected()) {
                    Gender = "Female";
                }

                if (Rollno.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please fill the  Roll Number");
                }else if (Name.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please fill the  Enrolment Number");
                } else if (Email.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please fill the First name field");
                }else if (DOB.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please fill the Last name field");
                }else if (Contactno.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please fill the Email Address");
                } else if (Address.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please fill the Contact Number");
                } else if (Gender.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please fill the Contact Number");
                }
                try {
                    String driver = "com.mysql.cj.jdbc.Driver";
                    String url = "jdbc:mysql://localhost:3306/student_grade_management_system";
                    String username = "root";
                    String password = "rna@2004";
                    Class.forName(driver);
                    Connection conn = DriverManager.getConnection(url, username, password);
                    System.out.println("Database connected..");
                    String q = "insert into Students value('" + Rollno + "','" + Name + "','" + Email + "','" + Contactno + "','" + Address + "','" + DOB + "','" + Gender + "')";
                    Statement stmt = conn.createStatement();
                    stmt.executeUpdate(q);
                    System.out.println("Your data has been inserted..");
                    f.setVisible(false);
                    new Task3_StudentGradeManagementSystem1().f.setVisible(true);
                    JOptionPane.showMessageDialog(null, "Student's  Details Stored Successfully");

                } catch (Exception ex1) {
                    ex1.getStackTrace();
                }
            }catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws IOException {
        new Task3_StudentGradeManagementSystem();
    }
}