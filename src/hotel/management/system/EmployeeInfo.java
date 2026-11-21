/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system;

import java.awt.BorderLayout;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;
import javax.swing.JTable;
import java.sql.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmployeeInfo extends JFrame {
    Connection conn = null;
    private JPanel contentPane;
    private JTable table;
    private JLabel lblNewLabel;
    private JLabel lblAge;
    private JLabel lblGender;
    private JLabel lblJob;
    private JLabel lblSalary;
    private JLabel lblPhone;
    private JLabel lblAadhar;
    private JLabel lblGmail;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    EmployeeInfo frame = new EmployeeInfo();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void close() {
        this.dispose();
    }

    /**
     * Create the frame.
     *
     * @throws SQLException
     */
    public EmployeeInfo() throws SQLException {
        //conn = Javaconnect.getDBConnection();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(430, 200, 1000, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        table = new JTable();
        table.setBounds(0, 34, 1000, 450);
        contentPane.add(table);

        JButton btnLoadData = new JButton("Load Data");
        btnLoadData.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Conn c = new Conn();
                    String displayCustomersql = "select * from Employee";
                    ResultSet rs = c.s.executeQuery(displayCustomersql);
                    table.setModel(DbUtils.resultSetToTableModel(rs));
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }

        });
        btnLoadData.setBounds(350, 500, 120, 30);
        btnLoadData.setBackground(Color.BLACK);
        btnLoadData.setForeground(Color.WHITE);
        contentPane.add(btnLoadData);

        JButton btnExit = new JButton("Back");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Reception().setVisible(true);
                setVisible(false);
            }
        });
        btnExit.setBounds(510, 500, 120, 30);
        btnExit.setBackground(Color.BLACK);
        btnExit.setForeground(Color.WHITE);
        contentPane.add(btnExit);

        lblNewLabel = new JLabel("Name");
        lblNewLabel.setBounds(41, 11, 46, 14);
        contentPane.add(lblNewLabel);

        lblAge = new JLabel("Age");
        lblAge.setBounds(159, 11, 46, 14);
        contentPane.add(lblAge);

        lblGender = new JLabel("Gender");
        lblGender.setBounds(273, 11, 46, 14);
        contentPane.add(lblGender);

        lblJob = new JLabel("Job");
        lblJob.setBounds(416, 11, 86, 14);
        contentPane.add(lblJob);

        lblSalary = new JLabel("Salary");
        lblSalary.setBounds(536, 11, 86, 14);
        contentPane.add(lblSalary);

        lblPhone = new JLabel("Phone");
        lblPhone.setBounds(656, 11, 86, 14);
        contentPane.add(lblPhone);

        lblGmail = new JLabel("Gmail");
        lblGmail.setBounds(786, 11, 86, 14);
        contentPane.add(lblGmail);

        lblAadhar = new JLabel("Aadhar");
        lblAadhar.setBounds(896, 11, 86, 14);
        contentPane.add(lblAadhar);

        getContentPane().setBackground(Color.WHITE);
    }
}