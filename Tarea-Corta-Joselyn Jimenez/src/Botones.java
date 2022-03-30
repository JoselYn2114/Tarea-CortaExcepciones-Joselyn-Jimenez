import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton; 
import java.awt.event.*; //importa el ActionListener

public class Botones implements ActionListener { //manejar todos los eventos de acción 

	JButton UsoPrimerBoton;
	JButton UsoSegundoBoton;
	JButton UsoTercerBoton; 
	String palabra;
	JFrame frame;

	public Botones () {
		frame = new JFrame("Demo application");
		frame.setSize(300, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);
	}

	private void placeComponents(JPanel panel) {

		panel.setLayout(null);

	   JLabel userLabel = new JLabel("User");
		userLabel.setBounds(40, 10, 80, 25);
		panel.add(userLabel);

		UsoPrimerBoton= new JButton("Primero");
		UsoPrimerBoton.addActionListener(this);
		UsoPrimerBoton.setBounds(10, 10, 80, 50); //posicion "x" "y" "ancho" "alto"
		panel.add(UsoPrimerBoton); 

		UsoSegundoBoton= new JButton("Segundo");
		UsoSegundoBoton.addActionListener(this);
		UsoSegundoBoton.setBounds(10, 65, 110, 50); //posicion "x" "y" "ancho" "alto"
		panel.add(UsoSegundoBoton); 

		UsoTercerBoton= new JButton("Tercero");
		UsoTercerBoton.addActionListener(this);
		UsoTercerBoton.setBounds(10, 120, 120, 50); //posicion "x" "y" "ancho" "alto"
		panel.add(UsoTercerBoton); 
	}

	@Override 
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(UsoPrimerBoton)) { //quien le envio el mensaje 
			palabra += "a";
			if (!(palabra.equals ("a"))) {
				JOptionPane.showMessageDialog(frame, "Secuencia equivocada");
				palabra = "";
			}
        }

        if (e.getSource().equals(UsoSegundoBoton)) {
			palabra += "b";
			if (!(palabra.equals ("ab"))) {
				JOptionPane.showMessageDialog(frame, "Secuencia equivocada");
				palabra = "";

			}
            
        }

        if (e.getSource().equals(UsoTercerBoton)) {
			palabra += "c";
			if (!(palabra.equals ("abc"))) {
				JOptionPane.showMessageDialog(frame, "Secuencia equivocada");
				palabra = "";
			}

			else {
				JOptionPane.showMessageDialog(frame, "Secuencia correcta");
				palabra = "";



			}

        }


    }
}


