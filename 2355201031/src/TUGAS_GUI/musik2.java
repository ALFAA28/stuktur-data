/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS_GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author alfa wijaya
 */
public class musik2 extends JFrame{

/**
 *
 * @author alfa wijaya
 */
    private musik musicPlayer1;

    public musik2() {
        initUI();
    }

    private void initUI() {
        musicPlayer1 = new musik();

        JPanel panel = new JPanel();
        //menambahkan gambar
        ImageIcon imageIcon = new ImageIcon("src/gambar/die with a smile.jpg"); // Ganti gambar 
        JLabel imageLabel = new JLabel(imageIcon);
        //tombol control music
        JButton playButton = new JButton("PUTAR");
        JButton stopButton = new JButton("BERHENTI");
        JButton loopButton = new JButton("ULANGI TERUS");

        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                musicPlayer1.playMusic("src/music/Die With a Smile.wav"); //Ganti audio
            }
        });

        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                musicPlayer1.stopMusic();
            }
        });

        loopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                musicPlayer1.loopMusic();
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
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE
        );
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                musik2 ex = new musik2();
                ex.setVisible(true);
            }
        });
    }
}

    

