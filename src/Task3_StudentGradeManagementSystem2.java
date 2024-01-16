import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import net.proteanit.sql.DbUtils;
public class Task3_StudentGradeManagementSystem2 extends JFrame implements ActionListener
{
    Choice rollno; JTable table;
    JButton print; JButton search;
    JButton update; JButton delete;
    Task3_StudentGradeManagementSystem2()
    {
        setSize(815, 730);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("Show All Students Details");

        JLabel sear = new JLabel("Search by Rollno :");
        sear.setBounds(5, 20, 170, 40);
        sear.setFont(new Font("arial", Font.BOLD, 18));

        rollno = new Choice();
        rollno.setBounds(180,20,100,40);
        rollno.setFont(new Font("arial",Font.BOLD,18));
        rollno.setBackground(Color.WHITE);

        try {
            Connection conn = ConnectionProvider.getConnnection();
            System.out.println("Database connected..");
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

        search = new JButton("Search");
        search.setBounds(290,20,100,28);
        search.setFont(new Font("arial",Font.BOLD,18));
        search.addActionListener(this);

        print = new JButton("Print");
        print.setBounds(690,20,100,28);
        print.setFont(new Font("arial",Font.BOLD,18));
        print.addActionListener(this);

        update = new JButton("Update");
        update.setBounds(470,20,100,28);
        update.setFont(new Font("arial",Font.BOLD,18));
        update.addActionListener(this);

        delete = new JButton("Delete");
        delete.setBounds(580,20,100,28);
        delete.setFont(new Font("arial",Font.BOLD,18));
        delete.addActionListener(this);

        table = new JTable();

        try {
            Connection conn = ConnectionProvider.getConnnection();
            System.out.println("Database connected..");
            String q = "select * from Students";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(rs));

        }catch (Exception ex)
        {
            ex.printStackTrace();
        }

        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0,100,800, 730);

        add(sear);add(search);
        add(rollno);add(jsp);
        add(print);add(update);
        add(delete);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == update)
        {
            setVisible(false);
            new Task3_StudentGradeManagementSystem3().setVisible(true);
        }

        if (e.getSource() == delete)
        {
            setVisible(false);
            new Task3_StudentGradeManagementSystem4().setVisible(true);

        }
        if (e.getSource() == print)
        {
            try {
                table.print();

            }catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }
        if (e.getSource() == search)
        {
            String q = "select * from Students where roll_no = '"+rollno.getSelectedItem()+"'";
            try {
                Connection conn = ConnectionProvider.getConnnection();
                Statement stmt = conn.createStatement();
                ResultSet rs1 = stmt.executeQuery(q);
                table.setModel(DbUtils.resultSetToTableModel(rs1));

            }catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        new Task3_StudentGradeManagementSystem2();
    }
}