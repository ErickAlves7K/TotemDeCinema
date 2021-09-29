package cinema;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class interfaceCinema extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	private JButton conf, conf2;
	private JButton[] seats = new JButton[100];
	private JRadioButton card, money;
	private JPanel panel; 
	private JLabel label, nmTickets, lbValue;
	private JProgressBar pbSeats;
	private int i, tickets = 0;
	private double value;
	
	public void hell() {
		seats[0].addActionListener(this);
		seats[1].addActionListener(this);
		seats[2].addActionListener(this);
		seats[3].addActionListener(this);
		seats[4].addActionListener(this);
		seats[5].addActionListener(this);
		seats[6].addActionListener(this);
		seats[7].addActionListener(this);
		seats[8].addActionListener(this);
		seats[9].addActionListener(this);
		seats[10].addActionListener(this);
		seats[11].addActionListener(this);
		seats[12].addActionListener(this);
		seats[13].addActionListener(this);
		seats[14].addActionListener(this);
		seats[15].addActionListener(this);
		seats[16].addActionListener(this);
		seats[17].addActionListener(this);
		seats[18].addActionListener(this);
		seats[19].addActionListener(this);
		seats[20].addActionListener(this);
		seats[21].addActionListener(this);
		seats[22].addActionListener(this);
		seats[23].addActionListener(this);
		seats[24].addActionListener(this);
		seats[25].addActionListener(this);
		seats[26].addActionListener(this);
		seats[27].addActionListener(this);
		seats[28].addActionListener(this);
		seats[29].addActionListener(this);
		seats[30].addActionListener(this);
		seats[31].addActionListener(this);
		seats[32].addActionListener(this);
		seats[33].addActionListener(this);
		seats[34].addActionListener(this);
		seats[35].addActionListener(this);
		seats[36].addActionListener(this);
		seats[37].addActionListener(this);
		seats[38].addActionListener(this);
		seats[39].addActionListener(this);
		seats[40].addActionListener(this);
		seats[41].addActionListener(this);
		seats[42].addActionListener(this);
		seats[43].addActionListener(this);
		seats[44].addActionListener(this);
		seats[45].addActionListener(this);
		seats[46].addActionListener(this);
		seats[47].addActionListener(this);
		seats[48].addActionListener(this);
		seats[49].addActionListener(this);
		seats[50].addActionListener(this);
		seats[51].addActionListener(this);
		seats[52].addActionListener(this);
		seats[53].addActionListener(this);
		seats[54].addActionListener(this);
		seats[55].addActionListener(this);
		seats[56].addActionListener(this);
		seats[57].addActionListener(this);
		seats[58].addActionListener(this);
		seats[59].addActionListener(this);
		seats[60].addActionListener(this);
		seats[61].addActionListener(this);
		seats[62].addActionListener(this);
		seats[63].addActionListener(this);
		seats[64].addActionListener(this);
		seats[65].addActionListener(this);
		seats[66].addActionListener(this);
		seats[67].addActionListener(this);
		seats[68].addActionListener(this);
		seats[69].addActionListener(this);
		seats[70].addActionListener(this);
		seats[71].addActionListener(this);
		seats[72].addActionListener(this);
		seats[73].addActionListener(this);
		seats[74].addActionListener(this);
		seats[75].addActionListener(this);
		seats[76].addActionListener(this);
		seats[77].addActionListener(this);
		seats[78].addActionListener(this);
		seats[79].addActionListener(this);
		seats[80].addActionListener(this);
		seats[81].addActionListener(this);
		seats[82].addActionListener(this);
		seats[83].addActionListener(this);
		seats[84].addActionListener(this);
		seats[85].addActionListener(this);
		seats[86].addActionListener(this);
		seats[87].addActionListener(this);
		seats[88].addActionListener(this);
		seats[89].addActionListener(this);
		seats[90].addActionListener(this);
		seats[91].addActionListener(this);
		seats[92].addActionListener(this);
		seats[93].addActionListener(this);
		seats[94].addActionListener(this);
		seats[95].addActionListener(this);
		seats[96].addActionListener(this);
		seats[97].addActionListener(this);
		seats[98].addActionListener(this);
		seats[99].addActionListener(this);
		seats[0].setBackground(Color.green);
		seats[1].setBackground(Color.green);
		seats[2].setBackground(Color.green);
		seats[3].setBackground(Color.green);
		seats[4].setBackground(Color.green);
		seats[5].setBackground(Color.green);
		seats[6].setBackground(Color.green);
		seats[7].setBackground(Color.green);
		seats[8].setBackground(Color.green);
		seats[9].setBackground(Color.green);
		seats[10].setBackground(Color.green);
		seats[11].setBackground(Color.green);
		seats[12].setBackground(Color.green);
		seats[13].setBackground(Color.green);
		seats[14].setBackground(Color.green);
		seats[15].setBackground(Color.green);
		seats[16].setBackground(Color.green);
		seats[17].setBackground(Color.green);
		seats[18].setBackground(Color.green);
		seats[19].setBackground(Color.green);
		seats[20].setBackground(Color.green);
		seats[21].setBackground(Color.green);
		seats[22].setBackground(Color.green);
		seats[23].setBackground(Color.green);
		seats[24].setBackground(Color.green);
		seats[25].setBackground(Color.green);
		seats[26].setBackground(Color.green);
		seats[27].setBackground(Color.green);
		seats[28].setBackground(Color.green);
		seats[29].setBackground(Color.green);
		seats[30].setBackground(Color.green);
		seats[31].setBackground(Color.green);
		seats[32].setBackground(Color.green);
		seats[33].setBackground(Color.green);
		seats[34].setBackground(Color.green); 
		seats[35].setBackground(Color.green); 
		seats[36].setBackground(Color.green); 
		seats[37].setBackground(Color.green); 
		seats[38].setBackground(Color.green); 
		seats[39].setBackground(Color.green); 
		seats[40].setBackground(Color.green); 
		seats[41].setBackground(Color.green); 
		seats[42].setBackground(Color.green); 
		seats[43].setBackground(Color.green); 
		seats[44].setBackground(Color.green); 
		seats[45].setBackground(Color.green); 
		seats[46].setBackground(Color.green); 
		seats[47].setBackground(Color.green); 
		seats[48].setBackground(Color.green); 
		seats[49].setBackground(Color.green); 
		seats[50].setBackground(Color.green); 
		seats[51].setBackground(Color.green); 
		seats[52].setBackground(Color.green); 
		seats[53].setBackground(Color.green); 
		seats[54].setBackground(Color.green); 
		seats[55].setBackground(Color.green); 
		seats[56].setBackground(Color.green); 
		seats[57].setBackground(Color.green); 
		seats[58].setBackground(Color.green); 
		seats[59].setBackground(Color.green); 
		seats[60].setBackground(Color.green); 
		seats[61].setBackground(Color.green); 
		seats[62].setBackground(Color.green); 
		seats[63].setBackground(Color.green); 
		seats[64].setBackground(Color.green); 
		seats[65].setBackground(Color.green); 
		seats[66].setBackground(Color.green); 
		seats[67].setBackground(Color.green); 
		seats[68].setBackground(Color.green); 
		seats[69].setBackground(Color.green); 
		seats[70].setBackground(Color.green); 
		seats[71].setBackground(Color.green); 
		seats[72].setBackground(Color.green); 
		seats[73].setBackground(Color.green); 
		seats[74].setBackground(Color.green); 
		seats[75].setBackground(Color.green); 
		seats[76].setBackground(Color.green); 
		seats[77].setBackground(Color.green); 
		seats[78].setBackground(Color.green); 
		seats[79].setBackground(Color.green); 
		seats[80].setBackground(Color.green); 
		seats[81].setBackground(Color.green); 
		seats[82].setBackground(Color.green);
		seats[83].setBackground(Color.green);
		seats[84].setBackground(Color.green);
		seats[85].setBackground(Color.green);
		seats[86].setBackground(Color.green);
		seats[87].setBackground(Color.green);
		seats[88].setBackground(Color.green);
		seats[89].setBackground(Color.green);
		seats[90].setBackground(Color.green);
		seats[91].setBackground(Color.green);
		seats[92].setBackground(Color.green);
		seats[93].setBackground(Color.green);
		seats[94].setBackground(Color.green);
		seats[95].setBackground(Color.green);
		seats[96].setBackground(Color.green);
		seats[97].setBackground(Color.green);
		seats[98].setBackground(Color.green);
		seats[99].setBackground(Color.green);
	}
		public interfaceCinema() {
			setLayout(null);
			setSize(1080, 720);
			setTitle("Cinema");
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
			setVisible(true);
			getContentPane().setBackground(Color.DARK_GRAY);
			
			panel = new JPanel();
			panel.setLayout(new GridLayout(10, 10, 2, 2));
			for(i = 0; i < seats.length; i++){
				seats[i] = new JButton("" + (i + 1));
				
				panel.add(seats[i]);
			}
			label = new JLabel("Escolha o assento.");
			label.setForeground(Color.white);
			label.setBounds(500, 50, 300, 50);
			panel.setBounds(250, 200, 600, 300);
			
			pbSeats = new JProgressBar();
			pbSeats.setBounds(400, 520, 300, 25);
			
			panel.setBackground(Color.DARK_GRAY);
			panel.setVisible(true);
			
			hell();
			
			conf = new JButton("Confirmar");
			conf.addActionListener(this);
			conf.setBounds(500, 600, 100, 50);
				
			add(panel);
			add(label);
			add(conf);
			add(pbSeats);
			
			
		}
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==seats[0]) {
				seats[0].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);				
			}else if(e.getSource()==seats[1]) {
				seats[1].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[2]) {                                                                
				seats[2].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[3]) {                                                                
				seats[3].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[4]) {                                                                
				seats[4].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[5]) {                                                                 
				seats[5].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[6]) {                                                                
				seats[6].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[7]) {                                                                
				seats[7].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[8]) {                                                                
				seats[8].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[9]) {                                                                
				seats[9].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[10]) {                                                               
				seats[10].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[11]) {                                                                
				seats[11].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[12]) {                                                                
				seats[12].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[13]) {                                                                
				seats[13].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[14]) {                                                                
				seats[14].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[15]) {                                                                
				seats[15].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[16]) {                                                                
				seats[16].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[17]) {                                                                
				seats[17].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[18]) {                                                                
				seats[18].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[19]) {                                                                
				seats[19].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[20]) {   
				seats[20].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[21]) {                                                                
				seats[21].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[22]) {                                                                
				seats[22].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[23]) {                                                                
				seats[23].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[24]) {                                                                
				seats[24].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[25]) {                                                                
				seats[25].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[26]) {                                                                
				seats[26].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[27]) {                                                                
				seats[27].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[28]) {                                                                
				seats[28].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[29]) {                                                                
				seats[29].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[30]) {                        
				seats[30].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[31]) {                                                                
				seats[31].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[32]) {                                                                
				seats[32].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[33]) {                                                                
				seats[33].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[34]) {                                                                
				seats[34].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[35]) {                                                                
				seats[35].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[36]) {                                                                
				seats[36].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[37]) {                                                                
				seats[37].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[38]) {                                                                
				seats[38].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[39]) {                                                                
				seats[39].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[40]) {                                                                
				seats[40].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[41]) {                                                                
				seats[41].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[42]) {                                                                
				seats[42].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[43]) {                                                                
				seats[43].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[44]) {                                                                
				seats[44].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[45]) {                                                                
				seats[45].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[46]) {                                                                
				seats[46].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[47]) {                                                                
				seats[47].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[48]) {                                                                
				seats[48].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[49]) {                                                                
				seats[49].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[50]) {                                                                
				seats[50].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[51]) {                                                                
				seats[51].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[52]) {                                                                
				seats[52].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[53]) {                                                                
				seats[53].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[54]) {                                                                
				seats[54].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[55]) {                                                                
				seats[55].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[56]) {                                                                
				seats[56].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[57]) {                                                                
				seats[57].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[58]) {                                                                
				seats[58].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[59]) {                                                                
				seats[59].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[60]) {                                                                
				seats[60].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[61]) {                                                                
				seats[61].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[62]) {                                                                
				seats[62].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[63]) {                                                                
				seats[63].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[64]) {                                                                
				seats[64].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[65]) {                                                                
				seats[65].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[66]) {                                                                
				seats[66].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[67]) {                                                                
				seats[67].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[68]) {                                                                
				seats[68].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[69]) {                                                                
				seats[69].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[70]) {                                                                
				seats[70].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[71]) {                                                                
				seats[71].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[72]) {                                                                
				seats[72].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[73]) {                                                                
				seats[73].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[74]) {                                                                
				seats[74].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[75]) {                                                                
				seats[75].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[76]) {                                                                
				seats[76].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[77]) {                                                                
				seats[77].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[78]) {                                                                
				seats[78].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[79]) {                                                                
				seats[79].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[80]) {                                                                
				seats[80].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[81]) {                                                                
				seats[81].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[82]) {                                                                
				seats[82].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[83]) {                                                                
				seats[83].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[84]) {                                                                
				seats[84].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[85]) {                                                                
				seats[85].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[86]) {                                                                
				seats[86].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[87]) {                                                                
				seats[87].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[88]) {                                                                
				seats[88].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[89]) {                                                                
				seats[89].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[90]) {                                                                
				seats[90].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[91]) {                                                                
				seats[91].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[92]) {                                                                
				seats[92].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[93]) {                                                                
				seats[93].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[94]) {                                                                
				seats[94].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[95]) {                                                                
				seats[95].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[96]) {                                                                
				seats[96].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[97]) {                                                                
				seats[97].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[98]) {                                                                
				seats[98].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}else if(e.getSource()==seats[99]) {                                                                
				seats[99].setBackground(Color.red); tickets = tickets+1; pbSeats.setValue(pbSeats.getValue()+1);
			}     
			
			if(pbSeats.getValue()==100) {
				pbSeats.setForeground(Color.red);
			}
			
			if(e.getSource()==conf) {                                    
				JFrame pay = new JFrame();                               
				pay.setLayout(null);                                     
				pay.setSize(1080, 720);                                  
				pay.setTitle("Cinema");                                  
				pay.setDefaultCloseOperation(EXIT_ON_CLOSE);             
				pay.setLocationRelativeTo(null);                         
				pay.setVisible(true);                                    
				pay.getContentPane().setBackground(Color.LIGHT_GRAY);
				                                                         
				nmTickets = new JLabel();                                                         
				nmTickets.setText("Número de assentos: " + tickets);
				
				value = tickets * 16.90;
				
				lbValue = new JLabel();
				lbValue.setText("Subtotal: " + value);
				
				card = new JRadioButton("Cartão");
				money = new JRadioButton("Dinheiro");
				
				card.addActionListener(this);
				money.addActionListener(this);
				
				conf2 = new JButton("Confirmar");
				conf2.addActionListener(this);
				
				ButtonGroup methods = new ButtonGroup();
				card.setBackground(pay.getBackground());
				money.setBackground(pay.getBackground());
				methods.add(card);
				methods.add(money);
				                             
				pay.add(nmTickets);
				pay.add(lbValue);
				pay.add(card);
				pay.add(money);
				pay.add(conf2);
					
				nmTickets.setBounds(300, 150, 200, 50);
				lbValue.setBounds(300, 200, 200, 50);
				card.setBounds(600, 150, 200, 50);
				money.setBounds(600, 200, 200, 50);
				conf2.setBounds(conf.getBounds());
				
				conf2.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent arg0){
						JOptionPane.showMessageDialog(null, "Obrigado pela preferência!");
					}});
				}
			}                                                            
			                                                                                                    
		public static void main(String args[]) {
			new interfaceCinema();
	}	
}
