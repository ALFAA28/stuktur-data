/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS_4_INHERITANCE;
    import javax.swing.*;
import java.awt.*;
/**
 *
 * @author alfa wijaya
 */
public class video extends JFrame  {

    public video() {
        setTitle("Video Frame");
        setSize(1080, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JLabel label = new JLabel(new ImageIcon("src/music/videoplayback.gif"));
        panel.add(label);
        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new video().setVisible(true));
    }
}

    

