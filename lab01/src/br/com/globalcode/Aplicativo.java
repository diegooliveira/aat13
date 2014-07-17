package br.com.globalcode;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Aplicativo extends JFrame implements ProgressPublissher, ActionListener{
    
    JTextArea taMensagens = new JTextArea();
    
    private FabricaComando fabrica;
    
    public static void main(String[] args) {
        new Aplicativo();
    }
    
    public Aplicativo() {
        super("Curso de Design Patterns - lab01");
        
        FabricaComandosAbstratos fabricaCommandos = new FabricaComandosAbstratos();
        fabrica = fabricaCommandos.build();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = montaPainelBotoes();
        add(panel,BorderLayout.SOUTH);
        add(taMensagens,BorderLayout.CENTER);
        setSize(700,200);
        setVisible(true);
    }
    
    private JPanel montaPainelBotoes() {
        JPanel panel = new JPanel();
        JButton btEnviarPedido = new JButton("Enviar Pedido");
        JButton btGerarPDF = new JButton("Gerar PDF");
        JButton btNovoPedido = new JButton("Novo Pedido");
        JButton btExcluirPedido = new JButton("Excluir Pedido");
        panel.add(btExcluirPedido);
        panel.add(btNovoPedido);
        panel.add(btGerarPDF);
        panel.add(btEnviarPedido);
        btEnviarPedido.addActionListener(this);
        btGerarPDF.addActionListener(this);
        btNovoPedido.addActionListener(this);
        btExcluirPedido.addActionListener(this);
        return panel;
    }
    
    public void start(String message){
        taMensagens.setText(message);   
    }
    
    public void progress(String message) {
        taMensagens.append(message);
    }

    public void actionPerformed(ActionEvent e) {
        fabrica.criar(e.getActionCommand()).execute(this);
    }
}
