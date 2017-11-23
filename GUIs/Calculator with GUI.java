//Written by Anthony Rojas
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.beans.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;
import java.text.*;

public class Calculator extends JPanel implements PropertyChangeListener, ActionListener {
	// Values for the fields
	private double amount = 0;
	private double rate = 0;
	private int years = 0;

	// Labels to identify the fields
	private JLabel amountLabel;
	private JLabel rateLabel;
	private JLabel yearsLabel;
	private JLabel futureValueLabel;

	// Fields for data entry
	private JFormattedTextField amountField;
	private JFormattedTextField rateField;
	private JFormattedTextField yearsField;
	private JFormattedTextField futureValueField;
	
	private Button submit;
	
	// Formats to format and parse numbers
	private NumberFormat amountFormat;
	private NumberFormat percentFormat;
	private NumberFormat futureValueFormat;

	public Calculator() {
        super(new BorderLayout());
		amountFormat = NumberFormat.getNumberInstance();
		percentFormat = NumberFormat.getNumberInstance();
		percentFormat.setMinimumFractionDigits(2);
		futureValueFormat = NumberFormat.getCurrencyInstance();
        double payment = getFutureValue(amount, rate, years);
        
        submit = new Button("Submit");
        submit.addActionListener(this);
        
        //Create the labels.
        amountLabel = new JLabel("Investment Amount: ");
        rateLabel = new JLabel("Annual Interest Rate (%): ");
        yearsLabel = new JLabel("Years: ");
        futureValueLabel = new JLabel("Future Value: ");
 
        //Create the text fields and set them up.
        amountField = new JFormattedTextField(amountFormat);
        amountField.setValue(new Double(amount));
        amountField.setColumns(10);
        amountField.addPropertyChangeListener("value", this);
 
        rateField = new JFormattedTextField(percentFormat);
        rateField.setValue(new Double(rate));
        rateField.setColumns(10);
        rateField.addPropertyChangeListener("value", this);
 
        yearsField = new JFormattedTextField();
        yearsField.setValue(new Integer(years));
        yearsField.setColumns(10);
        yearsField.addPropertyChangeListener("value", this);
 
        futureValueField = new JFormattedTextField(futureValueFormat);
        futureValueField.setValue(new Double(payment));
        futureValueField.setColumns(10);
        futureValueField.setEditable(false);
 
        //Tell accessibility tools about label/textfield pairs.
        amountLabel.setLabelFor(amountField);
        rateLabel.setLabelFor(rateField);
        yearsLabel.setLabelFor(yearsField);
        futureValueLabel.setLabelFor(futureValueField);
 
        //Lay out the labels in a panel.
        JPanel labelPane = new JPanel(new GridLayout(0,1));
        labelPane.add(amountLabel);
        labelPane.add(rateLabel);
        labelPane.add(yearsLabel);
        labelPane.add(futureValueLabel);
 
        //Layout the text fields in a panel.
        JPanel fieldPane = new JPanel(new GridLayout(0,1));
        fieldPane.add(amountField);
        fieldPane.add(rateField);
        fieldPane.add(yearsField);
        fieldPane.add(futureValueField);
        
        JPanel buttonPane = new JPanel(new FlowLayout());
        buttonPane.add(submit);
        
        //Put the panels in this panel, labels on left,
        //text fields on right.
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        add(labelPane, BorderLayout.CENTER);
        add(fieldPane, BorderLayout.LINE_END);
        add(buttonPane, BorderLayout.AFTER_LAST_LINE);
    }

	/** Called when a field's "value" property changes. */
	public void propertyChange(PropertyChangeEvent e) {
		Object source = e.getSource();
		if (source == amountField) {
			amount = ((Number) amountField.getValue()).doubleValue();
		} else if (source == rateField) {
			rate = ((Number) rateField.getValue()).doubleValue();
		} else if (source == yearsField) {
			years = ((Number) yearsField.getValue()).intValue();
		}
	}

	/**
	 * Create the GUI and show it. For thread safety, this method should be
	 * invoked from the event dispatch thread.
	 */
	private static void runGUI() {
		// Create and set up the window.
		JFrame frame = new JFrame("Investment Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Add contents to the window.
		frame.add(new Calculator());
		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		runGUI();
	}

	// Compute the monthly payment based on the loan amount,
	// APR, and length of loan.
	double getFutureValue(double amt, double rate, int years) {
		//futureValeue = investmentAmount * (1+monthlyInterestRate) years*12
		double futureValue = amt + ((amt*(rate/100))*years);
		return futureValue;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		double value = getFutureValue(amount, rate, years);
		futureValueField.setValue(new Double(value));
	}
}
