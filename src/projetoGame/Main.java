package projetoGame;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {

	 public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> {
	            JFrame frame = new JFrame("Jogo de Matemática");
	            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	            frame.getContentPane().add(new GamePanel());
	            frame.pack();
	            frame.setLocationRelativeTo(null);
	            frame.setVisible(true);
	        });
	    }

}
