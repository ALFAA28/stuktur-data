/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS_GUI;

import java.awt.EventQueue;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

/**
 *
 * @author alfa wijaya
 */
public class musik3 extends JFrame {

    private musik musicPlayer;

    public musik3() {
        initUI();
    }

    private void initUI() {
        musicPlayer = new musik();

        JPanel panel = new JPanel();
        //menambahkan gambar
        ImageIcon imageIcon = new ImageIcon("src/gambar/APT..jpg"); // Ganti gambar
        JLabel imageLabel = new JLabel(imageIcon);
        //tombol control music
        JButton playButton = new JButton("PUTAR");
        JButton stopButton = new JButton("BERHENTI");
        JButton loopButton = new JButton("ULANGI TERUS");

        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                musicPlayer.playMusic("src/music/APT..wav"); //Ganti audio
            }
        });

        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                musicPlayer.stopMusic();
            }
        });

        loopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                musicPlayer.loopMusic();
            }
        });

        //menambahkan tomobol ke panel
        panel.add(playButton);
        panel.add(stopButton);
        panel.add(loopButton);

    add(imageLabel, BorderLayout.CENTER);
    add(panel, BorderLayout.SOUTH);

        setTitle("SPRODIFY");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                musik3 ex = new musik3();
                ex.setVisible(true);
            }
        });
    }
}
