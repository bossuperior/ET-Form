import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Loading extends JFrame {
    
    private JPanel panel;
    private JProgressBar progressBar;
    private JLabel loadingLabel;
    
    public Loading() {
        setTitle("Load to Login");
        setSize(300, 80);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  // ทำให้หน้าต่างเปิดตรงกลางหน้าจอ
        
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        
        loadingLabel = new JLabel("", JLabel.CENTER);
        panel.add(loadingLabel, BorderLayout.CENTER);
        
        progressBar = new JProgressBar();
        progressBar.setMinimum(0);
        progressBar.setMaximum(100);
        progressBar.setStringPainted(true);
        
        panel.add(progressBar, BorderLayout.SOUTH);
        add(panel);
    }

    public static void main(String[] args) {
        // การสร้างหน้าต่าง Loading และแสดงขึ้นมา
        Loading load = new Loading();
        load.setVisible(true);

            for (int i = 1; i <= 100; i++) {
                try {
                    Thread.sleep(80);
                    load.progressBar.setValue(i);

                    if (i % 2 == 0) {
                        load.loadingLabel.setText("Loading...");
                    } else {
                        load.loadingLabel.setText("Loading");
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Loading.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            load.setVisible(false);  // ซ่อนหน้าต่าง Loading

                Login login = new Login();
                login.setVisible(true);
            
    }
}

