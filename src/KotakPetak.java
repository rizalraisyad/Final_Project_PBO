import javax.swing.*;
import java.awt.*;

public class KotakPetak extends JPanel {

    public void paint(Graphics g) {

        for(int i=50; i<=500; i+=80) {
            for(int j=50; j<=500; j+=80) {
                g.clearRect(i, j, 70, 70);
            }

        }

        for(int i=50; i<=500; i+=80) {
            for(int j=50; j<=500; j+=80) {
                if(j<300 && i<300) {
                    g.fillRect(i+80, j+80, 80, 80);
                }

            }
        }

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(800,800);
        frame.getContentPane().add(new KotakPetak());
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.GRAY);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
