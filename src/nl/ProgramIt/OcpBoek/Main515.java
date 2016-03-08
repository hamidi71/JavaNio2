package nl.ProgramIt.OcpBoek;

/**
 * Created by baddi on 1-3-2016.
 */
import java.io.*;
import java.nio.file.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main515 implements ActionListener {
    JFrame f = new JFrame("OCP Java SE 7 - New FlashCard");
    JTextField tfMainObj = null;
    JTextField tfSubObj = null;
    JTextField tfNote = null;
    JButton btnSave = null;
    JButton btnClear = null;
    JButton btnExit = null;
    private void buildUI() {
        tfMainObj = new JTextField();
        tfSubObj = new JTextField();
        tfNote = new JTextField();
        btnSave = new JButton("Save");
        btnSave.addActionListener(this);
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(6,2));
        topPanel.add(new JLabel(""));
        topPanel.add(new JLabel(""));
        topPanel.add(new JLabel(" Main objective number"));
        topPanel.add(tfMainObj);
        topPanel.add(new JLabel(""));
        topPanel.add(new JLabel(""));
        topPanel.add(new JLabel(" Sub objective number"));
        topPanel.add(tfSubObj);
        topPanel.add(new JLabel(""));
        topPanel.add(new JLabel(""));
        topPanel.add(new JLabel(" Flashcard text:"));
        topPanel.add(new JLabel(""));
        JPanel middlePanel = new JPanel();
        middlePanel.setLayout(new BorderLayout());
        middlePanel.add(tfNote);
        JPanel bottomPanel = new JPanel();
        bottomPanel.add(btnSave);
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(BorderLayout.NORTH, topPanel);
        mainPanel.add(BorderLayout.CENTER, middlePanel);
        mainPanel.add(BorderLayout.SOUTH, bottomPanel);
        f.getContentPane().setLayout(new BorderLayout());
        f.setSize(500, 250);
        f.getContentPane().add(mainPanel);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
// Code to execute when Save button is activated
    }
    public static void main(String[] args) {
        Main515 nfc = new Main515();
        nfc.buildUI();
    }
}
