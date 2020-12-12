package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    Window() {
        setLayout(null);
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lText = new JLabel("Сила притяжения планеты (м/с^2):");
        JLabel lPlanet = new JLabel("Выберите планету:");

        JTextField text = new JTextField();

        JButton mercury = new JButton("Меркурий");
        JButton venus = new JButton("Венера");
        JButton earth = new JButton("Земля");
        JButton mars = new JButton("Марс");
        JButton jupiter = new JButton("Юпитер");
        JButton saturn = new JButton("Сатурн");
        JButton uranus = new JButton("Уран");
        JButton neptune = new JButton("Нептун");

        lText.setBounds(10, 10, 250, 25);
        text.setBounds(10, 60, 500, 25);
        lPlanet.setBounds(10, 110, 200, 25);
        mercury.setBounds(10, 160, 100, 25);
        venus.setBounds(150, 160, 100, 25);
        earth.setBounds(290, 160, 100, 25);
        mars.setBounds(10, 260, 100, 25);
        jupiter.setBounds(150, 260, 100, 25);
        saturn.setBounds(290, 260, 100, 25);
        uranus.setBounds(10, 360, 100, 25);
        neptune.setBounds(150, 360, 100, 25);

        add(lText);
        add(lPlanet);
        add(text);
        add(mercury);
        add(venus);
        add(earth);
        add(mars);
        add(jupiter);
        add(saturn);
        add(uranus);
        add(neptune);

        setVisible(true);
        setLocationRelativeTo(null);

        setListener(mercury, venus, earth, mars, jupiter, saturn, uranus, neptune, text);
    }
    private void setListener(JButton mercury, JButton venus, JButton earth, JButton mars,
                             JButton jupiter, JButton saturn, JButton uranus, JButton neptune, JTextField text) {
        mercury.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(Planet.MERCURY.surfaceGravity());
            }
        });

        venus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(Planet.VENUS.surfaceGravity());
            }
        });

        earth.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(Planet.EARTH.surfaceGravity());
            }
        });

        mars.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(Planet.MARS.surfaceGravity());
            }
        });

        jupiter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(Planet.JUPITER.surfaceGravity());
            }
        });

        saturn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(Planet.SATURN.surfaceGravity());
            }
        });

        uranus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(Planet.URANUS.surfaceGravity());
            }
        });

        neptune.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(Planet.NEPTUNE.surfaceGravity());
            }
        });
    }
}
