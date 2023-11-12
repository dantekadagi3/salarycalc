import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class SALARYCALC {

	private JFrame frame;
	private JTextField Rate;
	private JTextField hours;
	private JTextField Days;
	private JTextField GROSS;
	private JTextField Tax;
	private JTextField deduct;
	private JTextField Phil;
	private JTextField textField_7;
	private JTextField SSS;
	private JTextField gross;
	private JTextField deduction;
	private JTextField netsal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SALARYCALC window = new SALARYCALC();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SALARYCALC() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(225, 225, 225));
		frame.setBounds(100, 100, 934, 339);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Name :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(26, 70, 108, 13);
		frame.getContentPane().add(lblNewLabel);
		
		Rate = new JTextField();
		Rate.setBounds(154, 106, 128, 26);
		frame.getContentPane().add(Rate);
		Rate.setColumns(10);
		
		hours = new JTextField();
		hours.setBounds(154, 142, 128, 26);
		frame.getContentPane().add(hours);
		hours.setColumns(10);
		
		Days = new JTextField();
		Days.setBounds(154, 178, 128, 26);
		frame.getContentPane().add(Days);
		Days.setColumns(10);
		
		GROSS = new JTextField();
		GROSS.setEditable(false);
		GROSS.setBounds(154, 214, 128, 26);
		frame.getContentPane().add(GROSS);
		GROSS.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Rate Per Hour :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(36, 111, 96, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(" Hour Per Day :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(26, 144, 96, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Number days worked :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(10, 183, 134, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("GROSS SALARY :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(10, 221, 134, 13);
		frame.getContentPane().add(lblNewLabel_4);
		
		Tax = new JTextField();
		Tax.setEditable(false);
		Tax.setBounds(474, 106, 128, 26);
		frame.getContentPane().add(Tax);
		Tax.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("TOTAL DEDUCTION :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(292, 221, 171, 13);
		frame.getContentPane().add(lblNewLabel_5);
		
		deduct = new JTextField();
		deduct.setEditable(false);
		deduct.setBounds(474, 214, 128, 26);
		frame.getContentPane().add(deduct);
		deduct.setColumns(10);
		
		JButton btnNewButton = new JButton("Compute");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int rate=Integer.parseInt(Rate.getText());
				int hrs=Integer.parseInt(hours.getText());
				int days=Integer.parseInt(Days.getText());
				
				DecimalFormat df=new DecimalFormat("0");
				 
				int Grossf=rate*hrs*days;
				double tax=Grossf*0.15;
				double phil=Grossf*0.05;
				double sss=0.02*Grossf;
				double totalded=tax+sss+phil;
				double netsalary=Grossf-totalded;
				
				
				GROSS.setText(String.valueOf(df.format(Grossf)));
				gross.setText(String.valueOf(df.format( Grossf)));
				Tax.setText(String.valueOf(df.format(tax)));
				SSS.setText(String.valueOf(df.format(sss)));
				deduct.setText(String.valueOf(df.format(totalded)));
				deduction.setText(String.valueOf(df.format(totalded)));
				netsal.setText(String.valueOf(df.format(netsalary)));
				Phil.setText(String.valueOf(df.format(phil)));
				
				
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.setBackground(new Color(0, 128, 128));
		btnNewButton.setBounds(355, 258, 108, 34);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("Simple  Payroll System");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_6.setBounds(292, 10, 253, 26);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("DEDUCTION OF SALARY:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7.setForeground(new Color(153, 0, 0));
		lblNewLabel_7.setBounds(333, 70, 171, 24);
		frame.getContentPane().add(lblNewLabel_7);
		
		Phil = new JTextField();
		Phil.setEditable(false);
		Phil.setBounds(474, 142, 128, 26);
		frame.getContentPane().add(Phil);
		Phil.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("TAX 15% of Monthly Wage");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_8.setBounds(304, 112, 160, 13);
		frame.getContentPane().add(lblNewLabel_8);
		
		textField_7 = new JTextField();
		textField_7.setBounds(154, 65, 128, 26);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		SSS = new JTextField();
		SSS.setEditable(false);
		SSS.setBounds(474, 178, 128, 26);
		frame.getContentPane().add(SSS);
		SSS.setColumns(10);
		
		gross = new JTextField();
		gross.setEditable(false);
		gross.setBounds(735, 106, 128, 26);
		frame.getContentPane().add(gross);
		gross.setColumns(10);
		
		deduction = new JTextField();
		deduction.setEditable(false);
		deduction.setBounds(735, 142, 128, 26);
		frame.getContentPane().add(deduction);
		deduction.setColumns(10);
		
		netsal = new JTextField();
		netsal.setEditable(false);
		netsal.setBounds(735, 214, 128, 26);
		frame.getContentPane().add(netsal);
		netsal.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Philhealth 5%");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_9.setBounds(375, 155, 83, 13);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("SSS 2%");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_10.setBounds(385, 184, 56, 13);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("NET SALARY :");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_11.setBounds(616, 220, 131, 13);
		frame.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Gross Salary :");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_12.setBounds(640, 112, 96, 13);
		frame.getContentPane().add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Deduction :");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_13.setBounds(655, 155, 81, 13);
		frame.getContentPane().add(lblNewLabel_13);
	}
}
