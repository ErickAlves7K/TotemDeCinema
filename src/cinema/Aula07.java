package cinema;

import java.awt.*;
import javax.swing.*;
public class Aula07 extends JPanel{  
	private static final long serialVersionUID = 1L;
	private JTabbedPane tpAbas; //componente que cria abas na janela
	private JButton[] botoes = new JButton[15];
	private JPanel panel1, panel2, panel3;//componente invisivel que agrupa outros componentes dentro dele
	
	public Aula07(){
		inicializarComponentes();
	}
	
	private void inicializarComponentes(){
		setLayout(null);
		for(int i =0; i<15;i++){
			botoes[i] = new JButton("Botão" +(i + 1));
		}
		//GridLayout - organiza os componentes baseado no número de linhas e colunas
		panel1 = new JPanel(new GridLayout(2,3,10,10));//como preencher (número de linhas, número de colunas, dintacia no eixo x(opcional), distância no eixo y(opcional));
		for(int i = 0; i<5; i++){
			panel1.add(botoes[i]);
		}
		//FlowLayout
		panel2 = new JPanel(new FlowLayout(1));// o número dentro indica o alinhamento dos itens - 0 pra esqueda, 1 centro e 2 pra direita
		for(int i=5; i<10; i++){
			panel2.add(botoes[i]);
		}
		//BorderLayout
		panel3 = new JPanel(new BorderLayout(10,20)); //dentro do parentese colocar a distância entre os componentes no eixo x e no eixo y
		panel3.add(botoes[10], "North");
		panel3.add(botoes[11], "West");
		panel3.add(botoes[12], "Center");
		panel3.add(botoes[13], "East");
		panel3.add(botoes[14], "South");
		
		tpAbas = new JTabbedPane();
		tpAbas.addTab("GridLayout",panel1);
		tpAbas.addTab("FlowLayout",panel2);
		tpAbas.addTab("BorderLayout",panel3);
		tpAbas.setBounds(0,0,500,500);
		add(tpAbas);
	}
	public static void main(String args[]){
 		JFrame frame = new JFrame("Layouts  ");
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.getContentPane().add(new Aula07());
		 frame.setBounds(300,300,1000,1000);
		 frame.setVisible(true);
	 }
}