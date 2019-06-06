import javax.swing.*;
public class Formulario extends JFrame{
	private JLabel etiqueta1;
	public Formulario(){
		setLayout(null);
		etiqueta1=new JLabel("Que onda prros :v");
		etiqueta1.setBounds (10,20,200,300);
		add(etiqueta1);
	}

	public static void main(String args[]){
		Formulario formu1=new Formulario();
		formu1.setBounds(0,0,400,300);
		formu1.setVisible(true);
		formu1.setLocationRelativeTo(false);
	}
}