package projetoGame;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GamePanel extends JPanel {
	private static final long serialVersionUID = 1L; // Número de versão serial

	private JTextField respostaField;
	private JButton verificarButton;
	private JLabel operacaoLabel;
	private JLabel pontosLabel;
	private GameLogic gameLogic;

	public GamePanel() {
		gameLogic = new GameLogic();

		setLayout(new GridLayout(4, 1));

		operacaoLabel = new JLabel();
		add(operacaoLabel);

		respostaField = new JTextField(10);
		add(respostaField);

		verificarButton = new JButton("Verificar");
		verificarButton.addActionListener(new VerificarListener());
		add(verificarButton);

		pontosLabel = new JLabel("Pontos: 0");
		add(pontosLabel);

		mostrarNovaOperacao();
		
		// -----------------------  Definir tamanho para os componentes -----------------------  
//        respostaField = new JTextField(10);
//        respostaField.setPreferredSize(new Dimension(100, 30)); // Define tamanho preferido
//        add(respostaField);
//
//        verificarButton = new JButton("Verificar");
//        verificarButton.setPreferredSize(new Dimension(100, 30)); // Define tamanho preferido
//        verificarButton.addActionListener(new VerificarListener());
//        add(verificarButton);
//        
//        respostaField = new JTextField(10);
//        respostaField.setPreferredSize(new Dimension(100, 30));
//        respostaField.setMaximumSize(respostaField.getPreferredSize()); // Define tamanho máximo igual ao preferido
//        add(respostaField);
//
//        verificarButton = new JButton("Verificar");
//        verificarButton.setPreferredSize(new Dimension(100, 30));
//        verificarButton.setMaximumSize(verificarButton.getPreferredSize()); // Define tamanho máximo igual ao preferido
//        verificarButton.addActionListener(new VerificarListener());
//        add(verificarButton);
    	// -------------------------------------------------------------------------------------------
	}
	
	// -----------------------  Definir tamanho para o painel -----------------------  
	
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300, 200); // Define o tamanho preferido do painel
    }
	
	// -------------------------------------------------------------------------------------------
    




	private void mostrarNovaOperacao() {
		gameLogic.gerarNovaOperacao();
		operacaoLabel.setText(gameLogic.getOperacaoTexto());
		respostaField.setText("");
	}

	private class VerificarListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				int resposta = Integer.parseInt(respostaField.getText());
				if (gameLogic.verificarResposta(resposta)) {
					gameLogic.incrementarPontos();
					pontosLabel.setText("Pontos: " + gameLogic.getPontos());
				}
				mostrarNovaOperacao();
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(GamePanel.this, "Informe um número válido");
			}
		}
	}
	
}
