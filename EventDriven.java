import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventDriven_Hinampas extends JFrame implements ActionListener {
    FlowLayout fl = new FlowLayout();
    Font bFont = new Font("Ariel", Font.BOLD, 16);
    JLabel fname = new JLabel("first name: ");
    JTextField fn = new JTextField(10);
    JLabel lname = new JLabel("last name: ");
    JTextField ln = new JTextField(10);
    JLabel mname = new JLabel("middle name: ");
    JTextField mn = new JTextField(10);
    JLabel mobile_num = new JLabel("mobile number: ");
    JTextField mnum = new JTextField(10);
    JLabel mail = new JLabel("Email Address: ");
    JTextField m = new JTextField(10);
    JButton bt = new JButton("Click me!");
    JButton bt2 = new JButton("Clear!");

    public EventDriven_Hinampas() {
        super("Sample Event");
        setSize(275, 225);
        setVisible(true);
        setLayout(fl);
        fname.setFont(bFont);
        lname.setFont(bFont);
        mname.setFont(bFont);
        mobile_num.setFont(bFont);
        mail.setFont(bFont);
        add(fname);
        add(fn);
        add(lname);
        add(ln);
        add(mname);
        add(mn);
        add(mobile_num);
        add(mnum);
        add(mail);
        add(m);
        add(bt);
        add(bt2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bt.addActionListener(this);
    }

    public void addActionListener(ActionEvent e) {
        String Fname;
        String Lname;
        String Mname;
        String Mnum;
        String Email;
        if (e.getSource() == bt) {
            if (fname.getText() != "") {
                Fname = fname.getText();
            } else {
                fn.setText("Enter First name First!");
            }

            if (lname.getText() != "") {
                Lname = lname.getText();
            } else {
                ln.setText("Enter Last Name!");
            }

            if (mname.getText() != "") {
                Mname = mname.getText();
            } else {
                mn.setText("Enter Middle Name!");
            }

            if (mobile_num.getText() != "") {
                Mnum = mobile_num.getText();
            } else {
                mnum.setText("Enter Email First!");
            }

            if (mail.getText() != "") {
                Email = mail.getText();
            } else {
                m.setText("Enter Email First!");
            }
        }
    }

    public static void main(String[] args) {
        EventDriven_Hinampas ED = new EventDriven_Hinampas();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    /**
     * InnerEventDriven_Hinampas extends JFrame
     */
    public class InnerEventDriven_Hinampas extends JFrame {
        public InnerEventDriven_Hinampas() {
            super("Sample Event");
            setSize(275, 225);
            setVisible(true);
            setLayout(fl);
        }
    }
}
