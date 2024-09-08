import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    private JLabel userLabel;
    private JTextField userText;
    private JLabel passwordLabel;
    private JPasswordField passwordText;
    private JButton button;
    private JLabel status;
    
    public Login() {
        
        setTitle("Login");
        setSize(350,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  // ทำให้หน้าต่างเปิดตรงกลางหน้าจอ
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        add(panel);

        userLabel = new JLabel("Username");
        userLabel.setBounds(10, 20, 80, 25); 
        panel.add(userLabel);

        userText = new JTextField();
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        /*เมื่อกดปุ่มจะเรียกใช้ Interface ที่ Implement 
        ผ่าน ActionListener ในไลบราลี่ java.awt*/
        button.addActionListener(this);
        panel.add(button);

        //สร้าง Object แสดงสถานะการล็อกอิน
        status = new JLabel("");
        status.setBounds(10, 110, 300, 25);
        panel.add(status);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String username = userText.getText();
        // แปลง password เป็น String
        String password = new String(passwordText.getPassword()); 
        
        //ตั้งค่าชื่อผู้ใช้และรหัสผ่านสำหรับเข้าใช้งาน
        if (username.equals("Boss") && password.equals("1234")) {
            //แสดงสถานะ Login successful! เมื่อกรอกชื่อผู้ใช้และรหัสผ่านได้ถูกต้อง
            status.setText("Login successful!");
            Form form = new Form();
            form.setVisible(true);
            this.dispose();
        } else {
        //แสดงสถานะ Login failed! เมื่อกรอกชื่อผู้ใช้และรหัสผ่านได้ถูกต้อง
            status.setText("Login failed!");
        }
    }
}

