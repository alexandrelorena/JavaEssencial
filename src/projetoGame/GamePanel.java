package projetoGame;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
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
    private JButton githubButton; // Novo botão para o GitHub
    private GameLogic gameLogic;

    public GamePanel() {
        gameLogic = new GameLogic();

        setLayout(new GridLayout(5, 1));

        operacaoLabel = new JLabel();
        operacaoLabel.setHorizontalAlignment(JLabel.CENTER);
        add(operacaoLabel);

        respostaField = new JTextField(10);
        add(respostaField);

        verificarButton = new JButton("Verificar");
        verificarButton.addActionListener(new VerificarListener());
        add(verificarButton);

        pontosLabel = new JLabel("Pontos: 0");
        pontosLabel.setHorizontalAlignment(JLabel.CENTER);
        add(pontosLabel);

        githubButton = new JButton("Abrir GitHub");
        githubButton.addActionListener(new GithubListener());
        add(githubButton);

        mostrarNovaOperacao();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300, 250); // Ajustei a altura para acomodar o novo botão
    }

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
                    playAcertoSound(); // Toca o som de acerto
                } else {
                    playErroSound(); // Toca o som de erro
                }
                mostrarNovaOperacao();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(GamePanel.this, "Informe um número válido");
            }
        }
    }

    private class GithubListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            abrirGitHubNoNavegador();
        }

        private void abrirGitHubNoNavegador() {
            try {
                URI githubURI = new URI("https://github.com/alexandrelorena/projetos-em-java.git");
                java.awt.Desktop.getDesktop().browse(githubURI);
            } catch (IOException | URISyntaxException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void playErroSound() {
        playSound("D:/Java/PROJETOS/JavaEssencial/src/projetoGame/error.wav");
    }

    private void playAcertoSound() {
        playSound("D:/Java/PROJETOS/JavaEssencial/src/projetoGame/success.wav");
    }

    private void playSound(String filePath) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filePath));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}
