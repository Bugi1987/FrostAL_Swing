package FrostAL_PRO;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;


import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.math.BigDecimal;

import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;
import FrostAL_PRO.App_Pro;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;

public class App_Pro {

	private JFrame frame;
	private JTextField waterInput;
	private JTextField fatInput;
	private JTextField infeedTempInput;
	private JTextField outfeedTempInput;
	private JTextField lengthInput;
	private JTextField lengthClearInput;
	private JTextField widthInput;
	private JTextField widthClearInput;
	private JTextField heightInput;
	private JTextField weightInput;
	private JTextField retTimeInput;
	private JTextField productInput;
	private JTextField customerInput;
	private JTextField productionInput;
	private JTextField daysPerYearInput;
	private JTextField hoursPerDayInput;
	private JTextField startupsPerYearInput;
	private JTextField customerLocationInput;
	private JTextField priceInput;
	

	public static double round(double number, int decimalPlace) {
		BigDecimal bd = new BigDecimal(number);
		bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
		return bd.doubleValue();
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App_Pro window = new App_Pro();
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
	public App_Pro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		frame.getContentPane().setForeground(SystemColor.textHighlight);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(0, 0, 1024, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Image img = new ImageIcon(this.getClass().getResource("/logo.png")).getImage();

		JLabel dryMatterX = new JLabel("");
		dryMatterX.setHorizontalAlignment(SwingConstants.CENTER);
		dryMatterX.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		dryMatterX.setBounds(123, 188, 35, 14);
		frame.getContentPane().add(dryMatterX);

		JLabel lblNewLabel_1 = new JLabel("LIN Consumption Calculator");
		lblNewLabel_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_1.setFont(new Font("Roboto Lt", Font.PLAIN, 36));
		lblNewLabel_1.setBounds(198, 11, 595, 59);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("PRODUCT DATA");
		lblNewLabel_2.setFont(new Font("Roboto Lt", Font.BOLD, 16));
		lblNewLabel_2.setBounds(20, 86, 138, 26);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblWater = new JLabel("% water");
		lblWater.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblWater.setBounds(30, 126, 46, 14);
		frame.getContentPane().add(lblWater);

		JLabel lblFat = new JLabel("% fat");
		lblFat.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblFat.setBounds(30, 157, 46, 14);
		frame.getContentPane().add(lblFat);

		JLabel lblDryMatter = new JLabel("% dry matter");
		lblDryMatter.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblDryMatter.setBounds(30, 188, 73, 14);
		frame.getContentPane().add(lblDryMatter);

		waterInput = new JTextField();
		waterInput.setHorizontalAlignment(SwingConstants.CENTER);
		waterInput.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		waterInput.setBounds(123, 123, 35, 20);
		frame.getContentPane().add(waterInput);
		waterInput.setColumns(10);

		fatInput = new JTextField();
		fatInput.setHorizontalAlignment(SwingConstants.CENTER);
		fatInput.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		fatInput.setBounds(123, 154, 35, 20);
		frame.getContentPane().add(fatInput);
		fatInput.setColumns(10);

		JLabel lblInfeedTemp = new JLabel("Infeed temp. \u00B0 C");
		lblInfeedTemp.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblInfeedTemp.setBounds(30, 219, 87, 14);
		frame.getContentPane().add(lblInfeedTemp);

		JLabel lblOutfeedTemp = new JLabel("Outfeed temp. \u00B0 C");
		lblOutfeedTemp.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblOutfeedTemp.setBounds(30, 250, 102, 14);
		frame.getContentPane().add(lblOutfeedTemp);

		JLabel lblTempDiff = new JLabel("Temp. diff. \u00B0 C");
		lblTempDiff.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblTempDiff.setBounds(30, 281, 86, 14);
		frame.getContentPane().add(lblTempDiff);

		JLabel lblNewLabel_4 = new JLabel("Product length");
		lblNewLabel_4.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(198, 126, 92, 14);
		frame.getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Clearance in length");
		lblNewLabel_5.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblNewLabel_5.setBounds(198, 157, 117, 14);
		frame.getContentPane().add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Product width");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblNewLabel_6.setBounds(198, 188, 109, 14);
		frame.getContentPane().add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("Clearance in width");
		lblNewLabel_7.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblNewLabel_7.setBounds(198, 219, 92, 14);
		frame.getContentPane().add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("Product height");
		lblNewLabel_8.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblNewLabel_8.setBounds(198, 250, 87, 14);
		frame.getContentPane().add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("Product weight");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_9.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblNewLabel_9.setBounds(198, 281, 109, 14);
		frame.getContentPane().add(lblNewLabel_9);

		JLabel lblNewLabel_10 = new JLabel("Est. Retention time");
		lblNewLabel_10.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblNewLabel_10.setBounds(198, 312, 101, 14);
		frame.getContentPane().add(lblNewLabel_10);

		infeedTempInput = new JTextField();
		infeedTempInput.setHorizontalAlignment(SwingConstants.CENTER);
		infeedTempInput.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		infeedTempInput.setBounds(123, 216, 35, 20);
		frame.getContentPane().add(infeedTempInput);
		infeedTempInput.setColumns(10);

		outfeedTempInput = new JTextField();
		outfeedTempInput.setHorizontalAlignment(SwingConstants.CENTER);
		outfeedTempInput.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		outfeedTempInput.setBounds(123, 247, 35, 20);
		frame.getContentPane().add(outfeedTempInput);
		outfeedTempInput.setColumns(10);

		lengthInput = new JTextField();
		lengthInput.setHorizontalAlignment(SwingConstants.CENTER);
		lengthInput.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lengthInput.setBounds(300, 123, 35, 20);
		frame.getContentPane().add(lengthInput);
		lengthInput.setColumns(10);

		lengthClearInput = new JTextField();
		lengthClearInput.setHorizontalAlignment(SwingConstants.CENTER);
		lengthClearInput.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lengthClearInput.setBounds(300, 154, 35, 20);
		frame.getContentPane().add(lengthClearInput);
		lengthClearInput.setColumns(10);

		widthInput = new JTextField();
		widthInput.setHorizontalAlignment(SwingConstants.CENTER);
		widthInput.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		widthInput.setBounds(300, 185, 35, 20);
		frame.getContentPane().add(widthInput);
		widthInput.setColumns(10);

		widthClearInput = new JTextField();
		widthClearInput.setHorizontalAlignment(SwingConstants.CENTER);
		widthClearInput.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		widthClearInput.setBounds(300, 216, 35, 20);
		frame.getContentPane().add(widthClearInput);
		widthClearInput.setColumns(10);

		heightInput = new JTextField();
		heightInput.setHorizontalAlignment(SwingConstants.CENTER);
		heightInput.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		heightInput.setBounds(300, 247, 35, 20);
		frame.getContentPane().add(heightInput);
		heightInput.setColumns(10);

		weightInput = new JTextField();
		weightInput.setHorizontalAlignment(SwingConstants.CENTER);
		weightInput.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		weightInput.setBounds(300, 278, 35, 20);
		frame.getContentPane().add(weightInput);
		weightInput.setColumns(10);

		retTimeInput = new JTextField();
		retTimeInput.setHorizontalAlignment(SwingConstants.CENTER);
		retTimeInput.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		retTimeInput.setBounds(300, 309, 35, 20);
		frame.getContentPane().add(retTimeInput);
		retTimeInput.setColumns(10);

		JLabel lblNewLabel_11 = new JLabel("mm");
		lblNewLabel_11.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblNewLabel_11.setBounds(345, 126, 46, 14);
		frame.getContentPane().add(lblNewLabel_11);

		JLabel lblNewLabel_12 = new JLabel("mm");
		lblNewLabel_12.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblNewLabel_12.setBounds(345, 157, 46, 14);
		frame.getContentPane().add(lblNewLabel_12);

		JLabel lblMm = new JLabel("mm");
		lblMm.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblMm.setBounds(345, 188, 46, 14);
		frame.getContentPane().add(lblMm);

		JLabel lblNewLabel_13 = new JLabel("mm");
		lblNewLabel_13.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblNewLabel_13.setBounds(345, 219, 46, 14);
		frame.getContentPane().add(lblNewLabel_13);

		JLabel lblNewLabel_14 = new JLabel("mm");
		lblNewLabel_14.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblNewLabel_14.setBounds(345, 250, 46, 14);
		frame.getContentPane().add(lblNewLabel_14);

		JLabel lblG = new JLabel("g");
		lblG.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblG.setBounds(345, 281, 46, 14);
		frame.getContentPane().add(lblG);

		JLabel lblS = new JLabel("min");
		lblS.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblS.setBounds(345, 312, 46, 14);
		frame.getContentPane().add(lblS);

		JLabel lblNewLabel_15 = new JLabel("PRODUCTION DATA");
		lblNewLabel_15.setFont(new Font("Roboto Lt", Font.BOLD, 16));
		lblNewLabel_15.setBounds(20, 365, 174, 14);
		frame.getContentPane().add(lblNewLabel_15);

		JLabel lblProduct = new JLabel("Product");
		lblProduct.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblProduct.setBounds(30, 405, 102, 14);
		frame.getContentPane().add(lblProduct);

		JLabel lblCustomer = new JLabel("Customer");
		lblCustomer.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblCustomer.setBounds(30, 436, 102, 14);
		frame.getContentPane().add(lblCustomer);

		JLabel lblProduction = new JLabel("Production");
		lblProduction.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblProduction.setBounds(30, 498, 102, 14);
		frame.getContentPane().add(lblProduction);

		JLabel lblDaysYear = new JLabel("Days / Year");
		lblDaysYear.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblDaysYear.setBounds(30, 529, 102, 14);
		frame.getContentPane().add(lblDaysYear);

		JLabel lblNewLabel_16 = new JLabel("Hours / Day");
		lblNewLabel_16.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblNewLabel_16.setBounds(30, 560, 102, 14);
		frame.getContentPane().add(lblNewLabel_16);

		JLabel lblStartupsYear = new JLabel("Startups / Year");
		lblStartupsYear.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblStartupsYear.setBounds(30, 591, 102, 14);
		frame.getContentPane().add(lblStartupsYear);

		JLabel lblNewLabel_18 = new JLabel("FrostAL\u00AE - Cryogenic Software");
		lblNewLabel_18.setForeground(SystemColor.textHighlight);
		lblNewLabel_18.setFont(new Font("Roboto Lt", Font.BOLD, 12));
		lblNewLabel_18.setBounds(198, 60, 451, 14);
		frame.getContentPane().add(lblNewLabel_18);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(20, 0, 295, 75);
		frame.getContentPane().add(lblNewLabel);

		productInput = new JTextField();
		productInput.setHorizontalAlignment(SwingConstants.CENTER);
		productInput.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		productInput.setBounds(142, 402, 193, 20);
		frame.getContentPane().add(productInput);
		productInput.setColumns(10);

		customerInput = new JTextField();
		customerInput.setHorizontalAlignment(SwingConstants.CENTER);
		customerInput.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		customerInput.setBounds(142, 433, 193, 20);
		frame.getContentPane().add(customerInput);
		customerInput.setColumns(10);

		productionInput = new JTextField();
		productionInput.setHorizontalAlignment(SwingConstants.CENTER);
		productionInput.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		productionInput.setBounds(142, 495, 86, 20);
		frame.getContentPane().add(productionInput);
		productionInput.setColumns(10);

		daysPerYearInput = new JTextField();
		daysPerYearInput.setHorizontalAlignment(SwingConstants.CENTER);
		daysPerYearInput.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		daysPerYearInput.setBounds(142, 526, 86, 20);
		frame.getContentPane().add(daysPerYearInput);
		daysPerYearInput.setColumns(10);

		hoursPerDayInput = new JTextField();
		hoursPerDayInput.setHorizontalAlignment(SwingConstants.CENTER);
		hoursPerDayInput.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		hoursPerDayInput.setBounds(142, 557, 86, 20);
		frame.getContentPane().add(hoursPerDayInput);
		hoursPerDayInput.setColumns(10);

		startupsPerYearInput = new JTextField();
		startupsPerYearInput.setHorizontalAlignment(SwingConstants.CENTER);
		startupsPerYearInput.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		startupsPerYearInput.setBounds(142, 588, 86, 20);
		frame.getContentPane().add(startupsPerYearInput);
		startupsPerYearInput.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("kg / h");
		lblNewLabel_3.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(243, 498, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);

		JLabel lblDays = new JLabel("days");
		lblDays.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblDays.setBounds(243, 529, 46, 14);
		frame.getContentPane().add(lblDays);

		JLabel lblNewLabel_19 = new JLabel("hours");
		lblNewLabel_19.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblNewLabel_19.setBounds(243, 560, 46, 14);
		frame.getContentPane().add(lblNewLabel_19);

		JLabel lblTimes = new JLabel("times");
		lblTimes.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblTimes.setBounds(243, 591, 46, 14);
		frame.getContentPane().add(lblTimes);

		JLabel lbltonns = new JLabel("tonns");
		lbltonns.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lbltonns.setBounds(243, 622, 46, 14);
		frame.getContentPane().add(lbltonns);

		JPanel dryMatterFrm = new JPanel();
		dryMatterFrm.setBackground(new Color(255, 255, 255));
		dryMatterFrm.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		dryMatterFrm.setBounds(123, 185, 35, 20);
		frame.getContentPane().add(dryMatterFrm);

		JLabel lblAnnualProduction = new JLabel("Annual production");
		lblAnnualProduction.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblAnnualProduction.setBounds(30, 622, 97, 14);
		frame.getContentPane().add(lblAnnualProduction);

		JLabel lblCustomerLocation = new JLabel("Customer location");
		lblCustomerLocation.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblCustomerLocation.setBounds(30, 467, 117, 14);
		frame.getContentPane().add(lblCustomerLocation);

		customerLocationInput = new JTextField();
		customerLocationInput.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		customerLocationInput.setBounds(142, 464, 193, 20);
		frame.getContentPane().add(customerLocationInput);
		customerLocationInput.setColumns(10);

		

		JLabel annualProdX = new JLabel("");
		annualProdX.setHorizontalAlignment(SwingConstants.CENTER);
		annualProdX.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		annualProdX.setBounds(142, 622, 86, 14);
		frame.getContentPane().add(annualProdX);

		JPanel annualProdFrm = new JPanel();
		annualProdFrm.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		annualProdFrm.setBackground(Color.WHITE);
		annualProdFrm.setBounds(142, 619, 86, 20);
		frame.getContentPane().add(annualProdFrm);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new LineBorder(new Color(0, 102, 153), 2));
		panel.setBounds(475, 86, 508, 565);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblReport = new JLabel("ESTIMATION OF PRODUCT ENTHALPIE AND LIN CONSUMPTION");
		lblReport.setHorizontalAlignment(SwingConstants.CENTER);
		lblReport.setFont(new Font("Roboto Lt", Font.BOLD, 15));
		lblReport.setBounds(10, 9, 488, 28);
		panel.add(lblReport);

		JLabel entConWat = new JLabel("Enthalpie considering water:");
		entConWat.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		entConWat.setBounds(20, 46, 224, 14);
		panel.add(entConWat);

		JLabel entConFat = new JLabel("Enthalpie considering fat:");
		entConFat.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		entConFat.setBounds(20, 69, 224, 14);
		panel.add(entConFat);

		JLabel entConDry = new JLabel("Enthalpie considering dry matter:");
		entConDry.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		entConDry.setBounds(20, 92, 224, 14);
		panel.add(entConDry);

		JLabel theoProdEnt = new JLabel("THEORETICAL PRODUCT ENTHALPIE:");
		theoProdEnt.setFont(new Font("Roboto Lt", Font.BOLD, 11));
		theoProdEnt.setBounds(20, 115, 224, 14);
		panel.add(theoProdEnt);

		JLabel theoLinConKg = new JLabel("Theoretical LIN consumption (kg of product):");
		theoLinConKg.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		theoLinConKg.setBounds(20, 138, 224, 14);
		panel.add(theoLinConKg);

		JLabel startUpCon = new JLabel("Start up consumption (kg of product):");
		startUpCon.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		startUpCon.setBounds(20, 161, 224, 14);
		panel.add(startUpCon);

		JLabel idilingCon = new JLabel("Idling consumption (kg of product):");
		idilingCon.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		idilingCon.setBounds(20, 184, 224, 14);
		panel.add(idilingCon);

		JLabel lbltotalLinKg = new JLabel("TOTAL LIN CONSUMPTION (KG OF PRODUCT):");
		lbltotalLinKg.setFont(new Font("Roboto Lt", Font.BOLD, 11));
		lbltotalLinKg.setBounds(20, 207, 274, 14);
		panel.add(lbltotalLinKg);

		JLabel entConWatX = new JLabel("");
		entConWatX.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		entConWatX.setBounds(314, 46, 184, 14);
		panel.add(entConWatX);

		JLabel entConFatX = new JLabel("");
		entConFatX.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		entConFatX.setBounds(314, 69, 184, 14);
		panel.add(entConFatX);

		JLabel entConDryX = new JLabel("");
		entConDryX.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		entConDryX.setBounds(314, 92, 184, 14);
		panel.add(entConDryX);

		JLabel theoProdEntX = new JLabel("");
		theoProdEntX.setFont(new Font("Tahoma", Font.BOLD, 11));
		theoProdEntX.setBounds(314, 115, 184, 14);
		panel.add(theoProdEntX);

		JLabel theoLinConKgX = new JLabel("");
		theoLinConKgX.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		theoLinConKgX.setBounds(314, 138, 184, 14);
		panel.add(theoLinConKgX);

		JLabel startUpConX = new JLabel("");
		startUpConX.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		startUpConX.setBounds(314, 161, 184, 14);
		panel.add(startUpConX);

		JLabel lblNEWidling = new JLabel("");
		lblNEWidling.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblNEWidling.setBounds(314, 184, 184, 14);
		panel.add(lblNEWidling);

		JLabel lblNEWtotalLinKg = new JLabel("");
		lblNEWtotalLinKg.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblNEWtotalLinKg.setBounds(314, 207, 184, 14);
		panel.add(lblNEWtotalLinKg);

		JLabel lblProperSelectionOfTheCryogenicTunnel = new JLabel("PROPER SELECTION OF THE CRYOGENIC TUNNEL");
		lblProperSelectionOfTheCryogenicTunnel.setHorizontalAlignment(SwingConstants.CENTER);
		lblProperSelectionOfTheCryogenicTunnel.setFont(new Font("Roboto Lt", Font.BOLD, 15));
		lblProperSelectionOfTheCryogenicTunnel.setBounds(10, 299, 488, 28);
		panel.add(lblProperSelectionOfTheCryogenicTunnel);

		JLabel lblFP1_60_6 = new JLabel("CRYO TUNNEL - FP1     60cm W x 6m L");
		lblFP1_60_6.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblFP1_60_6.setBounds(20, 336, 274, 14);
		panel.add(lblFP1_60_6);

		JLabel lblFP1_120_6 = new JLabel("CRYO TUNNEL - FP1   120cm W x 6m L");
		lblFP1_120_6.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblFP1_120_6.setBounds(20, 382, 274, 14);
		panel.add(lblFP1_120_6);

		JLabel lblFP1_60_9 = new JLabel("CRYO TUNNEL - FP1     60cm W x 9m L");
		lblFP1_60_9.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblFP1_60_9.setBounds(20, 405, 274, 14);
		panel.add(lblFP1_60_9);

		JLabel lblFP1_90_9 = new JLabel("CRYO TUNNEL - FP1     90cm W x 9m L");
		lblFP1_90_9.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblFP1_90_9.setBounds(20, 428, 274, 14);
		panel.add(lblFP1_90_9);

		JLabel lblFP1_120_9 = new JLabel("CRYO TUNNEL - FP1   120cm W x 9m L");
		lblFP1_120_9.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblFP1_120_9.setBounds(20, 451, 274, 14);
		panel.add(lblFP1_120_9);

		JLabel lblFP1_60_12 = new JLabel("CRYO TUNNEL - FP1   60cm W x 12m L");
		lblFP1_60_12.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblFP1_60_12.setBounds(20, 474, 274, 14);
		panel.add(lblFP1_60_12);

		JLabel lblFP1_90_12 = new JLabel("CRYO TUNNEL - FP1   90cm W x 12m L");
		lblFP1_90_12.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblFP1_90_12.setBounds(20, 497, 274, 14);
		panel.add(lblFP1_90_12);

		JLabel lblFP1_120_12 = new JLabel("CRYO TUNNEL - FP1 120cm W x 12m L");
		lblFP1_120_12.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblFP1_120_12.setBounds(20, 520, 274, 14);
		panel.add(lblFP1_120_12);

		JLabel lblFP1_90_6 = new JLabel("CRYO TUNNEL - FP1     90cm W x 6m L");
		lblFP1_90_6.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblFP1_90_6.setBounds(20, 359, 274, 14);
		panel.add(lblFP1_90_6);

		JLabel lblX_FP1_60_6 = new JLabel("");
		lblX_FP1_60_6.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblX_FP1_60_6.setBounds(314, 336, 184, 14);
		panel.add(lblX_FP1_60_6);

		JLabel lblX_FP1_90_6 = new JLabel("");
		lblX_FP1_90_6.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblX_FP1_90_6.setBounds(314, 359, 184, 14);
		panel.add(lblX_FP1_90_6);

		JLabel lblX_FP1_120_6 = new JLabel("");
		lblX_FP1_120_6.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblX_FP1_120_6.setBounds(314, 382, 184, 14);
		panel.add(lblX_FP1_120_6);

		JLabel lblX_FP1_60_9 = new JLabel("");
		lblX_FP1_60_9.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblX_FP1_60_9.setBounds(314, 405, 184, 14);
		panel.add(lblX_FP1_60_9);

		JLabel lblX_FP1_90_9 = new JLabel("");
		lblX_FP1_90_9.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblX_FP1_90_9.setBounds(314, 428, 184, 14);
		panel.add(lblX_FP1_90_9);

		JLabel lblX_FP1_120_9 = new JLabel("");
		lblX_FP1_120_9.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblX_FP1_120_9.setBounds(314, 451, 184, 14);
		panel.add(lblX_FP1_120_9);

		JLabel lblX_FP1_60_12 = new JLabel("");
		lblX_FP1_60_12.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblX_FP1_60_12.setBounds(314, 474, 184, 14);
		panel.add(lblX_FP1_60_12);

		JLabel lblX_FP1_90_12 = new JLabel("");
		lblX_FP1_90_12.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblX_FP1_90_12.setBounds(314, 497, 184, 14);
		panel.add(lblX_FP1_90_12);

		JLabel lblX_FP1_120_12 = new JLabel("");
		lblX_FP1_120_12.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblX_FP1_120_12.setBounds(314, 520, 184, 14);
		panel.add(lblX_FP1_120_12);

		JLabel lblCostPerKg = new JLabel("Cost of LIN per kg of product:");
		lblCostPerKg.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblCostPerKg.setBounds(20, 253, 274, 14);
		panel.add(lblCostPerKg);

		JLabel lblCostPerSt = new JLabel("Cost of LIN per piece:");
		lblCostPerSt.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblCostPerSt.setBounds(20, 276, 274, 14);
		panel.add(lblCostPerSt);

		JLabel lbltotLinYear = new JLabel("TOTAL LIN CONSUMPTION (PER YEAR):");
		lbltotLinYear.setFont(new Font("Roboto Lt", Font.BOLD, 11));
		lbltotLinYear.setBounds(20, 230, 274, 14);
		panel.add(lbltotLinYear);

		JLabel lblNEWtotalLinYear = new JLabel("");
		lblNEWtotalLinYear.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblNEWtotalLinYear.setBounds(314, 230, 184, 14);
		panel.add(lblNEWtotalLinYear);

		JLabel lblXCostPerKg = new JLabel("");
		lblXCostPerKg.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblXCostPerKg.setBounds(314, 253, 184, 14);
		panel.add(lblXCostPerKg);

		JLabel lblXCostPerPiece = new JLabel("");
		lblXCostPerPiece.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblXCostPerPiece.setBounds(314, 276, 184, 14);
		panel.add(lblXCostPerPiece);

		JLabel lblNewLabel_17 = new JLabel("Price per ton");
		lblNewLabel_17.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblNewLabel_17.setBounds(30, 312, 87, 14);
		frame.getContentPane().add(lblNewLabel_17);

		priceInput = new JTextField();
		priceInput.setHorizontalAlignment(SwingConstants.CENTER);
		priceInput.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		priceInput.setBounds(123, 309, 35, 20);
		frame.getContentPane().add(priceInput);
		priceInput.setColumns(10);

		JLabel tempDiffX = new JLabel("");
		tempDiffX.setHorizontalAlignment(SwingConstants.CENTER);
		tempDiffX.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		tempDiffX.setBounds(123, 278, 35, 21);
		frame.getContentPane().add(tempDiffX);

		JPanel tempDiffFrm = new JPanel();
		tempDiffFrm.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		tempDiffFrm.setBackground(Color.WHITE);
		tempDiffFrm.setBounds(123, 278, 35, 20);
		frame.getContentPane().add(tempDiffFrm);

		JLabel lblPLN = new JLabel("PLN");
		lblPLN.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblPLN.setBounds(168, 312, 28, 14);
		frame.getContentPane().add(lblPLN);

		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

							
				//dry matter content
				double wat = Double.parseDouble(waterInput.getText());
				double fat = Double.parseDouble(fatInput.getText());
				double dry = 100 - (wat + fat);
				String dryPrint;
				if (dry < 0 || dry > 100) {
				dryPrint = "###";
				} else {
				dryPrint = String.valueOf(dry);
				}
				dryMatterX.setText(dryPrint);

				// temperatures
				double inF = Double.parseDouble(infeedTempInput.getText());
				double outF = Double.parseDouble(outfeedTempInput.getText());
				double tempD = inF - outF;
				String tempDPrint = String.valueOf(tempD);
				tempDiffX.setText(tempDPrint);

				// annual production
				double prodI = Double.parseDouble(productionInput.getText());
				double daysI = Double.parseDouble(daysPerYearInput.getText());
				double hoursI = Double.parseDouble(hoursPerDayInput.getText());
				double annualP = (prodI * daysI * hoursI) / 1000;
				String annualPPrint = String.valueOf(annualP);
				annualProdX.setText(annualPPrint);

				// enthalpie considering water
				double watEnt1 = (Double.parseDouble(waterInput.getText()) / 100)
						* Double.parseDouble(infeedTempInput.getText()) * 4.19;
				double watEnt2 = (Double.parseDouble(waterInput.getText()) / 100) * 335;
				double watEnt3 = (Double.parseDouble(waterInput.getText()) / 100)
						* (Double.parseDouble(outfeedTempInput.getText()) * (-1)) * 2.1;
				double watEntTOTAL = watEnt1 + watEnt2 + watEnt3;
				String watEntPrint = String.valueOf(round(watEntTOTAL, 2));
				entConWatX.setText(watEntPrint + " kJ");

				// enthalpie considering fat
				double fatEnt = (Double.parseDouble(fatInput.getText()) / 100) * tempD * 2.1;
				String fatEntPrint = String.valueOf(round(fatEnt, 2));
				entConFatX.setText(fatEntPrint + " kJ");

				// enthalpie considering dry matter
				double dryEnt = (dry / 100) * tempD * 1.1;
				String dryEntPrint = String.valueOf(round(dryEnt, 2));
				entConDryX.setText(dryEntPrint + " kJ");

				// theoretical product enthalpie
				double totEnt = watEntTOTAL + fatEnt + dryEnt;
				String totEntPrint = String.valueOf(round(totEnt, 2));
				theoProdEntX.setText(totEntPrint + " kJ/kg");

				// theoretical lin consumption per kg
				double theoLin = totEnt / 320;
				String theoLinPrint = String.valueOf(round(theoLin, 2));
				theoLinConKgX.setText(theoLinPrint + " kg");

				// startup consumption
				double startUps = (81.35 * Double.parseDouble(startupsPerYearInput.getText())) / (annualP * 1000);
				String startUpsPrint = String.valueOf(round(startUps, 2));
				startUpConX.setText(startUpsPrint + " kg");

				// idling consumption per kg product
				double idling = 58.75 / Double.parseDouble(productionInput.getText());
				String idlingPrint = String.valueOf(round(idling, 2));
				lblNEWidling.setText(idlingPrint + " kg");

				// total lin consumption per kg product
				double totalLinKg = theoLin + startUps + idling;
				String totalLinKgPrint = String.valueOf(round(totalLinKg, 2));
				lblNEWtotalLinKg.setText(totalLinKgPrint + " kg");

				// total lin consumption per year
				double totalLinYear = totalLinKg * annualP * 1000;
				String totalLinYearPrint = String.valueOf(round(totalLinYear, 2));
				lblNEWtotalLinYear.setText(totalLinYearPrint + " kg");

				// price per kg of product
				double priceKg = (Double.parseDouble(priceInput.getText()) / 1000) * totalLinKg;
				String priceKgPrint = String.valueOf(round(priceKg, 2));
				lblXCostPerKg.setText(priceKgPrint + " PLN");

				// price per piece
				double pricePiece = Double.parseDouble(weightInput.getText()) * (priceKg / 1000);
				String pricePiecePrint = String.valueOf(round(pricePiece, 2));
				lblXCostPerPiece.setText(pricePiecePrint + " PLN");

				// pcs abreast length rounded down
				double abreast600double = 600
						/ (Double.parseDouble(widthInput.getText()) + Double.parseDouble(widthClearInput.getText()));
				int abreast600 = (int) abreast600double;
				double abreast900double = 900
						/ (Double.parseDouble(widthInput.getText()) + Double.parseDouble(widthClearInput.getText()));
				int abreast900 = (int) abreast900double;
				double abreast1200double = 1200
						/ (Double.parseDouble(widthInput.getText()) + Double.parseDouble(widthClearInput.getText()));
				int abreast1200 = (int) abreast1200double;

				// pcs/m belt length rounded down
				double pcsM600double = (1000
						/ ((Double.parseDouble(lengthInput.getText()) + Double.parseDouble(lengthClearInput.getText())))
						* abreast600);
				int pcsMbelt600 = (int) pcsM600double;
				double pcsM900double = (1000
						/ ((Double.parseDouble(lengthInput.getText()) + Double.parseDouble(lengthClearInput.getText())))
						* abreast900);
				int pcsMbelt900 = (int) pcsM900double;
				double pcsM1200double = (1000
						/ ((Double.parseDouble(lengthInput.getText()) + Double.parseDouble(lengthClearInput.getText())))
						* abreast1200);
				int pcsMbelt1200 = (int) pcsM1200double;

				// belt load kg/m belt
				double belt600 = pcsMbelt600 * Double.parseDouble(weightInput.getText()) / 1000;
				double belt900 = pcsMbelt900 * Double.parseDouble(weightInput.getText()) / 1000;
				double belt1200 = pcsMbelt1200 * Double.parseDouble(weightInput.getText()) / 1000;

				// capacity & tunnel recomendation
				double capacity60x6 = belt600 * 6 * (60 / Double.parseDouble(retTimeInput.getText()));
				if (capacity60x6 < Double.parseDouble(productionInput.getText())) {
					lblX_FP1_60_6.setText("UNSUITABLE");
				} else {
					lblX_FP1_60_6.setText("OK");
				}
				double capacity90x6 = belt900 * 6 * (60 / Double.parseDouble(retTimeInput.getText()));
				if (capacity90x6 < Double.parseDouble(productionInput.getText())) {
					lblX_FP1_90_6.setText("UNSUITABLE");
				} else {
					lblX_FP1_90_6.setText("OK");
				}
				double capacity120x6 = belt1200 * 6 * (60 / Double.parseDouble(retTimeInput.getText()));
				if (capacity120x6 < Double.parseDouble(productionInput.getText())) {
					lblX_FP1_120_6.setText("UNSUITABLE");
				} else {
					lblX_FP1_120_6.setText("OK");
				}
				double capacity60x9 = belt600 * 9 * (60 / Double.parseDouble(retTimeInput.getText()));
				if (capacity60x9 < Double.parseDouble(productionInput.getText())) {
					lblX_FP1_60_9.setText("UNSUITABLE");
				} else {
					lblX_FP1_60_9.setText("OK");
				}
				double capacity90x9 = belt900 * 9 * (60 / Double.parseDouble(retTimeInput.getText()));
				if (capacity90x9 < Double.parseDouble(productionInput.getText())) {
					lblX_FP1_90_9.setText("UNSUITABLE");
				} else {
					lblX_FP1_90_9.setText("OK");
				}
				double capacity120x9 = belt1200 * 9 * (60 / Double.parseDouble(retTimeInput.getText()));
				if (capacity120x9 < Double.parseDouble(productionInput.getText())) {
					lblX_FP1_120_9.setText("UNSUITABLE");
				} else {
					lblX_FP1_120_9.setText("OK");
				}
				double capacity60x12 = belt600 * 12 * (60 / Double.parseDouble(retTimeInput.getText()));
				if (capacity60x12 < Double.parseDouble(productionInput.getText())) {
					lblX_FP1_60_12.setText("UNSUITABLE");
				} else {
					lblX_FP1_60_12.setText("OK");
				}
				double capacity90x12 = belt900 * 12 * (60 / Double.parseDouble(retTimeInput.getText()));
				if (capacity90x12 < Double.parseDouble(productionInput.getText())) {
					lblX_FP1_90_12.setText("UNSUITABLE");
				} else {
					lblX_FP1_90_12.setText("OK");
				}
				double capacity120x12 = belt1200 * 12 * (60 / Double.parseDouble(retTimeInput.getText()));
				if (capacity120x12 < Double.parseDouble(productionInput.getText())) {
					lblX_FP1_120_12.setText("UNSUITABLE");
				} else {
					lblX_FP1_120_12.setText("OK");
				}

			}
		});
		
		
		
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		btnNewButton.setBounds(150, 670, 129, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnGeneratePdf = new JButton("Generate PDF");
		btnGeneratePdf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				

				// dry matter content
				double wat = Double.parseDouble(waterInput.getText());
				double fat = Double.parseDouble(fatInput.getText());
				double dry = 100 - (wat + fat);
				String dryPrint;
				if (dry < 0 || dry > 100) {
					dryPrint = "###";
				} else {
					dryPrint = String.valueOf(dry);
				}
				dryMatterX.setText(dryPrint);

				// temperatures
				double inF = Double.parseDouble(infeedTempInput.getText());
				double outF = Double.parseDouble(outfeedTempInput.getText());
				double tempD = inF - outF;
				String tempDPrint = String.valueOf(tempD);
				tempDiffX.setText(tempDPrint);

				// annual production
				double prodI = Double.parseDouble(productionInput.getText());
				double daysI = Double.parseDouble(daysPerYearInput.getText());
				double hoursI = Double.parseDouble(hoursPerDayInput.getText());
				double annualP = (prodI * daysI * hoursI) / 1000;
				String annualPPrint = String.valueOf(annualP);
				annualProdX.setText(annualPPrint);

				// enthalpie considering water
				double watEnt1 = (Double.parseDouble(waterInput.getText()) / 100)
						* Double.parseDouble(infeedTempInput.getText()) * 4.19;
				double watEnt2 = (Double.parseDouble(waterInput.getText()) / 100) * 335;
				double watEnt3 = (Double.parseDouble(waterInput.getText()) / 100)
						* (Double.parseDouble(outfeedTempInput.getText()) * (-1)) * 2.1;
				double watEntTOTAL = watEnt1 + watEnt2 + watEnt3;
				String watEntPrint = String.valueOf(round(watEntTOTAL, 2));
				entConWatX.setText(watEntPrint + " kJ");

				// enthalpie considering fat
				double fatEnt = (Double.parseDouble(fatInput.getText()) / 100) * tempD * 2.1;
				String fatEntPrint = String.valueOf(round(fatEnt, 2));
				entConFatX.setText(fatEntPrint + " kJ");

				// enthalpie considering dry matter
				double dryEnt = (dry / 100) * tempD * 1.1;
				String dryEntPrint = String.valueOf(round(dryEnt, 2));
				entConDryX.setText(dryEntPrint + " kJ");

				// theoretical product enthalpie
				double totEnt = watEntTOTAL + fatEnt + dryEnt;
				String totEntPrint = String.valueOf(round(totEnt, 2));
				theoProdEntX.setText(totEntPrint + " kJ/kg");

				// theoretical lin consumption per kg
				double theoLin = totEnt / 320;
				String theoLinPrint = String.valueOf(round(theoLin, 2));
				theoLinConKgX.setText(theoLinPrint + " kg");

				// startup consumption
				double startUps = (81.35 * Double.parseDouble(startupsPerYearInput.getText())) / (annualP * 1000);
				String startUpsPrint = String.valueOf(round(startUps, 2));
				startUpConX.setText(startUpsPrint + " kg");

				// idling consumption per kg product
				double idling = 58.75 / Double.parseDouble(productionInput.getText());
				String idlingPrint = String.valueOf(round(idling, 2));
				lblNEWidling.setText(idlingPrint + " kg");

				// total lin consumption per kg product
				double totalLinKg = theoLin + startUps + idling;
				String totalLinKgPrint = String.valueOf(round(totalLinKg, 2));
				lblNEWtotalLinKg.setText(totalLinKgPrint + " kg");

				// total lin consumption per year
				double totalLinYear = totalLinKg * annualP * 1000;
				String totalLinYearPrint = String.valueOf(round(totalLinYear, 2));
				lblNEWtotalLinYear.setText(totalLinYearPrint + " kg");

				// price per kg of product
				double priceKg = (Double.parseDouble(priceInput.getText()) / 1000) * totalLinKg;
				String priceKgPrint = String.valueOf(round(priceKg, 2));
				lblXCostPerKg.setText(priceKgPrint + " PLN");

				// price per piece
				double pricePiece = Double.parseDouble(weightInput.getText()) * (priceKg / 1000);
				String pricePiecePrint = String.valueOf(round(pricePiece, 2));
				lblXCostPerPiece.setText(pricePiecePrint + " PLN");

				// pcs abreast length rounded down
				double abreast600double = 600
						/ (Double.parseDouble(widthInput.getText()) + Double.parseDouble(widthClearInput.getText()));
				int abreast600 = (int) abreast600double;
				double abreast900double = 900
						/ (Double.parseDouble(widthInput.getText()) + Double.parseDouble(widthClearInput.getText()));
				int abreast900 = (int) abreast900double;
				double abreast1200double = 1200
						/ (Double.parseDouble(widthInput.getText()) + Double.parseDouble(widthClearInput.getText()));
				int abreast1200 = (int) abreast1200double;

				// pcs/m belt length rounded down
				double pcsM600double = (1000
						/ ((Double.parseDouble(lengthInput.getText()) + Double.parseDouble(lengthClearInput.getText())))
						* abreast600);
				int pcsMbelt600 = (int) pcsM600double;
				double pcsM900double = (1000
						/ ((Double.parseDouble(lengthInput.getText()) + Double.parseDouble(lengthClearInput.getText())))
						* abreast900);
				int pcsMbelt900 = (int) pcsM900double;
				double pcsM1200double = (1000
						/ ((Double.parseDouble(lengthInput.getText()) + Double.parseDouble(lengthClearInput.getText())))
						* abreast1200);
				int pcsMbelt1200 = (int) pcsM1200double;

				// belt load kg/m belt
				double belt600 = pcsMbelt600 * Double.parseDouble(weightInput.getText()) / 1000;
				double belt900 = pcsMbelt900 * Double.parseDouble(weightInput.getText()) / 1000;
				double belt1200 = pcsMbelt1200 * Double.parseDouble(weightInput.getText()) / 1000;

				// capacity & tunnel recomendation
				double capacity60x6 = belt600 * 6 * (60 / Double.parseDouble(retTimeInput.getText()));
				if (capacity60x6 < Double.parseDouble(productionInput.getText())) {
					lblX_FP1_60_6.setText("UNSUITABLE");
				} else {
					lblX_FP1_60_6.setText("OK");
				}
				double capacity90x6 = belt900 * 6 * (60 / Double.parseDouble(retTimeInput.getText()));
				if (capacity90x6 < Double.parseDouble(productionInput.getText())) {
					lblX_FP1_90_6.setText("UNSUITABLE");
				} else {
					lblX_FP1_90_6.setText("OK");
				}
				double capacity120x6 = belt1200 * 6 * (60 / Double.parseDouble(retTimeInput.getText()));
				if (capacity120x6 < Double.parseDouble(productionInput.getText())) {
					lblX_FP1_120_6.setText("UNSUITABLE");
				} else {
					lblX_FP1_120_6.setText("OK");
				}
				double capacity60x9 = belt600 * 9 * (60 / Double.parseDouble(retTimeInput.getText()));
				if (capacity60x9 < Double.parseDouble(productionInput.getText())) {
					lblX_FP1_60_9.setText("UNSUITABLE");
				} else {
					lblX_FP1_60_9.setText("OK");
				}
				double capacity90x9 = belt900 * 9 * (60 / Double.parseDouble(retTimeInput.getText()));
				if (capacity90x9 < Double.parseDouble(productionInput.getText())) {
					lblX_FP1_90_9.setText("UNSUITABLE");
				} else {
					lblX_FP1_90_9.setText("OK");
				}
				double capacity120x9 = belt1200 * 9 * (60 / Double.parseDouble(retTimeInput.getText()));
				if (capacity120x9 < Double.parseDouble(productionInput.getText())) {
					lblX_FP1_120_9.setText("UNSUITABLE");
				} else {
					lblX_FP1_120_9.setText("OK");
				}
				double capacity60x12 = belt600 * 12 * (60 / Double.parseDouble(retTimeInput.getText()));
				if (capacity60x12 < Double.parseDouble(productionInput.getText())) {
					lblX_FP1_60_12.setText("UNSUITABLE");
				} else {
					lblX_FP1_60_12.setText("OK");
				}
				double capacity90x12 = belt900 * 12 * (60 / Double.parseDouble(retTimeInput.getText()));
				if (capacity90x12 < Double.parseDouble(productionInput.getText())) {
					lblX_FP1_90_12.setText("UNSUITABLE");
				} else {
					lblX_FP1_90_12.setText("OK");
				}
				double capacity120x12 = belt1200 * 12 * (60 / Double.parseDouble(retTimeInput.getText()));
				if (capacity120x12 < Double.parseDouble(productionInput.getText())) {
					lblX_FP1_120_12.setText("UNSUITABLE");
				} else {
					lblX_FP1_120_12.setText("OK");
				}
				
				
				
				
				try {
					String FONT = "resources/Roboto-Light.ttf";
					
					Document document=new Document();
					com.itextpdf.text.Font font = FontFactory.getFont(FONT, "Cp1250", BaseFont.EMBEDDED);
					
					
					
					PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("FrostAL_Calc_Report.pdf"));
					document.addAuthor("FrostAL Cryogenic Software by BANANA BRAIN");
					document.addTitle("LIN Consumption Report");
					
					document.open();
					
					Paragraph head = new Paragraph("FROSTAL CALCULATION REPORT", font);
					head.setAlignment(Element.ALIGN_CENTER);
					document.add(head);
					
					document.add(new Paragraph(" "));
					document.add(new Paragraph(" "));
					document.add(new Paragraph(" "));
					
					//document.add(image1);
					document.add(new Paragraph("Product: "+productInput.getText(), font));
					document.add(new Paragraph("Customer: "+customerInput.getText(), font));
					document.add(new Paragraph("Customer location: "+customerLocationInput.getText(), font));
					document.add(new Paragraph(" "));
					document.add(new Paragraph("PRODUCT DATA:", font));
					document.add(new Paragraph("Product length: "+lengthInput.getText() + "mm / Clearance in length: " +lengthClearInput.getText()+ "mm", font ));
					document.add(new Paragraph("Product width: "+widthInput.getText()+"mm / Clearance in width: "+widthClearInput.getText()+"mm", font));
					document.add(new Paragraph("Product height: "+heightInput.getText()+"mm", font));
					document.add(new Paragraph("Product weight: "+weightInput.getText()+"g", font));
					document.add(new Paragraph("Content of water: "+waterInput.getText()+"% / Content of fat: "+fatInput.getText()+"% / Content of dry matter: "+dryPrint+"%", font));
					document.add(new Paragraph(" "));
					
					//add estimation of product enthalpie
					document.add(new Paragraph("PRODUCT ENTHALPIE:", font));
					document.add(new Paragraph("Enthalpie considering water: "+watEntPrint+"kJ", font));
					document.add(new Paragraph("Enthalpie considering fat: "+fatEntPrint+"kJ", font));
					document.add(new Paragraph("Enthalpie considering dry matter: "+dryEntPrint+"kJ", font));
					document.add(new Paragraph("Theoretical product enthalpie: "+totEntPrint+"kJ/kg", font));
					document.add(new Paragraph(" "));
					
					// add estimation of lin consumption
					document.add(new Paragraph("ESTIMATION OF LIN CONSUMPTION:", font));
					document.add(new Paragraph("Theoretical LIN consumption (kg of product): "+theoLinPrint+"kg", font));
					document.add(new Paragraph("Start up consumption (kg of product): "+startUpsPrint+"kg", font));
					document.add(new Paragraph("Idling consumption (kg of product): "+idlingPrint+"kg", font));
					document.add(new Paragraph("Total LIN consumption (kg of product): "+totalLinKgPrint+"kg", font));
					document.add(new Paragraph("Total LIN consumption (per year): "+totalLinYearPrint+"kg", font));
					document.add(new Paragraph(" "));
					
					// Costs
					document.add(new Paragraph("ESTIMATION OF COSTS (only LIN consumption):", font));
					document.add(new Paragraph("Cost of LIN (kg of product): "+priceKgPrint+"PLN", font));
					document.add(new Paragraph("Cost of LIN (one product unit): "+pricePiecePrint+"PLN", font));
					
					
					document.close();
					writer.close();
					
					System.out.println("Wygenerowano plik");
				}
				catch(DocumentException e) {
				e.printStackTrace();	
				}
				catch(FileNotFoundException e) {
					e.printStackTrace();
				}
				
				
			}
		});
		btnGeneratePdf.setBackground(Color.WHITE);
		btnGeneratePdf.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		btnGeneratePdf.setBounds(664, 670, 129, 23);
		frame.getContentPane().add(btnGeneratePdf);
		
		
		
	}

	public JTextField getWaterInput() {
		return waterInput;
	}

	public JTextField getFatInput() {
		return fatInput;
	}
	
	
}
