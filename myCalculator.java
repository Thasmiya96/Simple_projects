import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;

public class myCalculator extends JFrame implements ActionListener{
    JTextField tf;
    char operator;
    double num1,num2,result;
    JButton numberButton[]=new JButton[10];
    JButton addButton,subButton,mulButton,divButton,eqButton,clrButton,delButton,negButton,decButton;
    JPanel panel;
     
    myCalculator(){
        setSize(420, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setTitle("MyCalculator");
        Dimension d= Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(d.width/4,d.height/4);
        Font myfont=new Font("Arial",Font.BOLD,30);
        addButton=new JButton("+");
        subButton=new JButton("-");
        mulButton=new JButton("*");
        divButton=new JButton("/");
        eqButton=new JButton("=");
        clrButton=new JButton("C");
        delButton=new JButton("Del");
        negButton=new JButton("(-)");
        decButton=new JButton(".");
        addButton.setFont(myfont);
        subButton.setFont(myfont);
        mulButton.setFont(myfont);
        divButton.setFont(myfont);
        eqButton.setFont(myfont);   
        clrButton.setFont(myfont);
        delButton.setFont(myfont);
        negButton.setFont(myfont);
        decButton.setFont(myfont);

        for(int i=0 ; i<10;i++){
            numberButton[i]=new JButton(String.valueOf(i));
            numberButton[i].addActionListener(this);
			numberButton[i].setFont(myfont);
			numberButton[i].setFocusable(false);

        }
        tf=new JTextField(35);
        tf.setBounds(50, 25, 300, 50);
        tf.setFont(myfont);
        tf.setEditable(false);
        negButton.setBounds(50,430,100,50);
		delButton.setBounds(150,430,100,50);
		clrButton.setBounds(250,430,100,50);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
		panel.setLayout(new GridLayout(4,4,10,10));
        add(tf);
        panel.add(numberButton[1]);
		panel.add(numberButton[2]);
		panel.add(numberButton[3]);
		panel.add(addButton);
		panel.add(numberButton[4]);
		panel.add(numberButton[5]);
		panel.add(numberButton[6]);
		panel.add(subButton);
		panel.add(numberButton[7]);
		panel.add(numberButton[8]);
		panel.add(numberButton[9]);
		panel.add(mulButton);
		panel.add(decButton);
		panel.add(numberButton[0]);
		panel.add(eqButton);
		panel.add(divButton);
        add(panel);
        add(negButton);
        add(delButton);
        add(clrButton);
        clrButton.addActionListener(this);
        delButton.addActionListener(this);
        negButton.addActionListener(this);
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);
        eqButton.addActionListener(this);
        decButton.addActionListener(this);


        setVisible(true);
    }
   
    public void actionPerformed(ActionEvent e){
 		for(int i=0;i<10;i++) {
			if(e.getSource() == numberButton[i]) {
				tf.setText(tf.getText().concat(String.valueOf(i)));
			}
		}
		if(e.getSource()==decButton) {
			tf.setText(tf.getText().concat("."));
		}
		if(e.getSource()==addButton) {
			num1 = Double.parseDouble(tf.getText());
			operator ='+';
			tf.setText("");
		}
		if(e.getSource()==subButton) {
			num1 = Double.parseDouble(tf.getText());
			operator ='-';
			tf.setText("");
		}
		if(e.getSource()==mulButton) {
			num1 = Double.parseDouble(tf.getText());
			operator ='*';
			tf.setText("");
		}
		if(e.getSource()==divButton) {
			num1 = Double.parseDouble(tf.getText());
			operator ='/';
			tf.setText("");
		}
		if(e.getSource()==eqButton) {
			num2=Double.parseDouble(tf.getText());
			
			switch(operator) {
			case'+':
				result=num1+num2;
				break;
			case'-':
				result=num1-num2;
				break;
			case'*':
				result=num1*num2;
				break;
			case'/':
				result=num1/num2;
				break;
			}
			tf.setText(String.valueOf(result));
			num1=result;
		}
		if(e.getSource()==clrButton) {
			tf.setText("");
		}
		if(e.getSource()==delButton) {
			String string = tf.getText();
			tf.setText("");
			for(int i=0;i<string.length()-1;i++) {
				tf.setText(tf.getText()+string.charAt(i));
			}
		}
		if(e.getSource()==negButton) {
			double temp = Double.parseDouble(tf.getText());
			temp*=-1;
			tf.setText(String.valueOf(temp));
		}
       

    }

}