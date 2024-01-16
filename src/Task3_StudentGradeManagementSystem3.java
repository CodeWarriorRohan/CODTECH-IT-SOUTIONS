import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
public class Task3_StudentGradeManagementSystem3 extends JFrame implements ActionListener {
    JLabel l1; JLabel l2;  JLabel l3;JLabel l4;
    JLabel l5; JLabel l6;  JLabel l7;JLabel l8;
    JTextField tf1; JTextField tf2; JTextField tf3;
    JTextField tf4; JTextField tf5 ; JTextField tf6;
    JButton b1;JButton b2; Choice rollno;
    Task3_StudentGradeManagementSystem3() {
        setSize(800,730);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("Update Student's Details");

        JLabel sear = new JLabel("Search by Rollno :");
        sear.setBounds(100, 120, 180, 40);
        sear.setFont(new Font("arial", Font.BOLD, 18));

        rollno = new Choice();
        rollno.setBounds(350,120,200,40);
        rollno.setFont(new Font("arial",Font.BOLD,18));
        rollno.setBackground(Color.WHITE);

        try {
            Connection conn = ConnectionProvider.getConnnection();
            String q = "select * from Students";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(q);
            while (rs.next())
            {
                rollno.add(rs.getString("roll_no"));
            }
        }catch (Exception ex1)
        {
            ex1.printStackTrace();
        }

        rollno.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                try {
                    Connection conn = ConnectionProvider.getConnnection();
                    String q = "select * from Students where roll_no ='"+ rollno.getSelectedItem() + "' ";
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery(q);
                    while (rs.next())
                    {
                        l2.setText(rs.getString("Roll_no"));
                        tf1.setText(rs.getString("Name"));
                        tf2.setText(rs.getString("Email"));
                        tf3.setText(rs.getString("Contact"));
                        tf4.setText(rs.getString("Address"));
                        tf5.setText(rs.getString("DOB"));
                        tf6.setText(rs.getString("Gender"));
                    }
                }catch (Exception ex2)
                {
                    ex2.printStackTrace();
                }
            }
        });

        JLabel tittle = new JLabel("Update Student's Details");
        tittle.setBounds(230, 40, 500, 40);
        tittle.setFont(new Font("arial", Font.BOLD, 30));

        l1 = new JLabel("Roll no. : ");
        l1.setBounds(100, 200, 250, 40);
        l1.setFont(new Font("arial", Font.BOLD, 18));

        l2 = new JLabel();
        l2.setBounds(350,200,200,40);
        l2.setFont(new Font("arial",Font.BOLD,24));

        l3 = new JLabel("Name : ");
        l3.setBounds(100, 250, 150, 40);
        l3.setFont(new Font("arial", Font.BOLD, 18));

        tf1 = new JTextField();
        tf1.setBounds(350, 250, 260, 30);
        tf1.setFont(new Font("arial", Font.BOLD, 18));

        l4 = new JLabel("Email Address: ");
        l4.setBounds(100, 300, 300, 40);
        l4.setFont(new Font("arial", Font.BOLD, 18));

        tf2 = new JTextField();
        tf2.setBounds(350, 300, 260, 30);
        tf2.setFont(new Font("arial", Font.BOLD, 18));

        l5 = new JLabel("Contact No : ");
        l5.setBounds(100, 350, 200, 40);
        l5.setFont(new Font("arial", Font.BOLD, 18));

        tf3 = new JTextField();
        tf3.setBounds(350, 350, 260, 30);
        tf3.setFont(new Font("arial", Font.BOLD, 18));

        l6 = new JLabel("Address : ");
        l6.setBounds(100, 400, 200, 40);
        l6.setFont(new Font("arial", Font.BOLD, 18));

        tf4 = new JTextField();
        tf4.setBounds(350, 400, 260, 30);
        tf4.setFont(new Font("arial", Font.BOLD, 18));

        l7 = new JLabel("DOB :");
        l7.setBounds(100,450,250,40);
        l7.setFont(new Font("arial",Font.BOLD,18));

        tf5 = new JTextField();
        tf5.setBounds(350, 450, 260, 30);
        tf5.setFont(new Font("arial", Font.BOLD, 18));

        l8 = new JLabel("Gender :");
        l8.setBounds(100,500,250,40);
        l8.setFont(new Font("arial",Font.BOLD,18));

        tf6 = new JTextField();
        tf6.setBounds(350, 500, 260, 30);
        tf6.setFont(new Font("arial", Font.BOLD, 18));

        try {
            Connection conn = ConnectionProvider.getConnnection();
            String q = "select * from Students where roll_no ='"+ rollno.getSelectedItem() + "' ";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(q);
            while (rs.next())
            {
                l2.setText(rs.getString("Roll_no"));
                tf1.setText(rs.getString("Name"));
                tf2.setText(rs.getString("Email"));
                tf3.setText(rs.getString("Contact"));
                tf4.setText(rs.getString("Address"));
                tf5.setText(rs.getString("DOB"));
                tf6.setText(rs.getString("Gender"));
            }
        }catch (Exception ex2)
        {
            ex2.printStackTrace();
        }

        b2 = new JButton("Update");
        b2.setBounds(490, 620, 120, 40);
        b2.setFont(new Font("arial", Font.BOLD, 18));

        b1 = new JButton("Back");
        b1.setBounds(350, 620, 120, 40);
        b1.setFont(new Font("arial", Font.BOLD, 18));

        add(tittle); add(l1); add(l2); add(l3);
        add(l4); add(l5); add(l6); add(l7); add(l8);
        add(tf1); add(tf2); add(tf3); add(tf4); add(tf5); add(tf6);
        add(sear); add(rollno); add(b1); add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            setVisible(false);
            new Task3_StudentGradeManagementSystem2().setVisible(true);
        }

        if (e.getSource() == b2) {
            try {
                String rollno = "" + l2.getText();
                String name = "" + tf1.getText();
                String email = "" + tf2.getText();
                String cont_no = "" + tf3.getText();
                String address = "" + tf4.getText();
                String dob = "" + tf5.getText();
                String gender = "" + tf6.getText();

                try {
                    Connection conn = ConnectionProvider.getConnnection();
                    String q1 = "update Students set Name = '" + name + "', Email = '" + email + "', Contact = '" + cont_no + "', Address = '" + address + "', dob = '" + dob + "', gender = '" + gender + "' where roll_no = '" + rollno + "'";
                    Statement stmt = conn.createStatement();
                    stmt.executeUpdate(q1);
                    System.out.println("Database connected..");
                    System.out.println("Your data has been updated..");

                    setVisible(false);
                    new Task3_StudentGradeManagementSystem2().setVisible(true);
                    JOptionPane.showMessageDialog(null, "Student's Details Updated Successfully");
                }catch (Exception ex)
                {
                    ex.printStackTrace();
                }
            } catch (Exception ex1) {
                ex1.getStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        new Task3_StudentGradeManagementSystem3();
    }
}