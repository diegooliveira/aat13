package br.com.globalcode.lab5;

import br.com.globalcode.lab5.model.AceleradorGrafico;
import br.com.globalcode.lab5.model.CPU;
import br.com.globalcode.lab5.model.Componente;
import br.com.globalcode.lab5.model.Computador;
import br.com.globalcode.lab5.model.ComputadorIterator;
import br.com.globalcode.lab5.model.HardDisk;
import br.com.globalcode.lab5.model.Memoria;
import br.com.globalcode.lab5.model.PlacaMae;
import br.com.globalcode.lab5.model.PlacaVideo;

public class MainUI extends javax.swing.JFrame {

    Computador dataModel;
    ComputadorIterator dataIterator;
    Componente dataCurrent;
    Componente oldData;
    MementoController mementoController;
    
    private StatusTela status = new StatusView();

    public MainUI() {
        initComponents();
        initApp();
        mementoController = new MementoController(this);
    }
    
    void setStatus(StatusTela status) {
        this.status = status;
    }

    public void initApp() {
        uiEditable(false);
        dataModel = buildComputer();
        dataIterator = dataModel.getComputadorIterator();
        dataCurrent = dataIterator.proximoComponente();
        bindCurrentRecord();
    }

    public void bindCurrentRecord() {
        if (dataCurrent != null) {
            this.textComponente.setText(dataCurrent.getClass().getName());
            this.textID.setText(dataCurrent.toString());
            if (dataCurrent.getOwner() != null) {
                this.textOwner.setText(dataCurrent.getOwner().getClass().getName());
            }
            this.textModelo.setText(dataCurrent.getModelo());
            this.textPrecoCusto.setText("" + dataCurrent.getPrecoCusto());
            this.textPrecoMin.setText("" + dataCurrent.getPrecoLucroMinimo());
            this.textPrecoMax.setText("" + dataCurrent.getPrecoLucroMaximo());
        }
    }

    private Computador buildComputer() {
        Computador c1 = new Computador();
        PlacaMae placaMae = new PlacaMae();
        placaMae.setModelo("ASUS 1987");
        Memoria memoria = new Memoria();
        memoria.setModelo("Dimm 1GB");
        CPU cpu = new CPU();
        cpu.setModelo("Dual Core");
        AceleradorGrafico aceleradorVideo = new AceleradorGrafico();
        aceleradorVideo.setModelo("Chipset 3030");
        PlacaVideo placaVideo = new PlacaVideo();
        placaVideo.setModelo("Trident");
        HardDisk hd1 = new HardDisk();
        hd1.setModelo("Quantum 100GB");
        HardDisk hd2 = new HardDisk();
        hd2.setModelo("Seagate 200GB");
        placaMae.add(memoria);
        placaMae.add(cpu);
        placaMae.add(placaVideo);
        c1.add(placaMae);
        c1.add(hd1);
        c1.add(hd2);
        return c1;
    }
    
    Memento saveToMement(){
        return new Memento(textModelo.getText());
    }
    
    void loadFromMemento(Memento memento){
        textModelo.setText(memento.getModelo());
    }
            

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        textPrecoCusto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textPrecoMin = new javax.swing.JTextField();
        textPrecoMax = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textComponente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textModelo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textOwner = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        buttonNovo = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        buttonProximo = new javax.swing.JButton();
        buttonAnterior = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textPrecoCusto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel5.setText("Preço Custo");

        jLabel6.setText("Preço Lucro Max");

        jLabel7.setText("Preço Lucro Mínimo");

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel5)
                    .add(textPrecoCusto, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 102, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(19, 19, 19)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(textPrecoMax, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 108, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel6))
                .add(21, 21, 21)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel7)
                    .add(textPrecoMin, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 105, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jLabel6)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(textPrecoMax, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jLabel5)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(textPrecoCusto, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jLabel7)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(textPrecoMin, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("ID ");

        jLabel2.setText("Componente");

        jLabel3.setText("Owner");

        jLabel4.setText("Modelo");

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel2)
                    .add(jLabel4)
                    .add(jLabel3)
                    .add(jLabel1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(textID, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                    .add(textOwner, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, textModelo, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                    .add(textComponente, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1)
                    .add(textID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(textComponente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(textModelo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel4))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(textOwner, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonNovo.setText("Novo");
        buttonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovoActionPerformed(evt);
            }
        });

        buttonEditar.setText("Editar");
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });

        buttonSalvar.setText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        buttonProximo.setText(">");
        buttonProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProximoActionPerformed(evt);
            }
        });

        buttonAnterior.setText("<");
        buttonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAnteriorActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(buttonAnterior)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(buttonNovo)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(buttonEditar)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(buttonSalvar)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(buttonCancelar)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(buttonProximo)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(buttonAnterior)
                    .add(buttonNovo)
                    .add(buttonEditar)
                    .add(buttonSalvar)
                    .add(buttonCancelar)
                    .add(buttonProximo))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(18, 18, 18)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
      status.cancelar(this);
  }//GEN-LAST:event_buttonCancelarActionPerformed

  private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
      status.editar(this);
  }//GEN-LAST:event_buttonEditarActionPerformed

  private void buttonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAnteriorActionPerformed
      status.moverParaAnterior(this); //ganho direto 0
  }//GEN-LAST:event_buttonAnteriorActionPerformed

  private void buttonProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProximoActionPerformed
      status.moverParaProximo(this); //ganho direto 0  
  }//GEN-LAST:event_buttonProximoActionPerformed

  private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
      status.salvar(this);
  }//GEN-LAST:event_buttonSalvarActionPerformed

  private void buttonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovoActionPerformed
      status.novo(this); //ganho direto 0
  }//GEN-LAST:event_buttonNovoActionPerformed
    public void uiEditable(boolean editable) {
        this.textID.setEditable(false);
        this.textComponente.setEditable(false);
        this.textModelo.setEditable(editable);
        this.textOwner.setEditable(false);
        this.textPrecoCusto.setEditable(editable);
        this.textPrecoMin.setEditable(editable);
        this.textPrecoMax.setEditable(editable);
        this.buttonSalvar.setEnabled(editable);
        this.buttonCancelar.setEnabled(editable);

        this.buttonAnterior.setEnabled(!editable);
        this.buttonEditar.setEnabled(!editable);
        this.buttonProximo.setEnabled(!editable);
        this.buttonNovo.setEnabled(!editable);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAnterior;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonNovo;
    private javax.swing.JButton buttonProximo;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField textComponente;
    private javax.swing.JTextField textID;
    private javax.swing.JTextField textModelo;
    private javax.swing.JTextField textOwner;
    private javax.swing.JTextField textPrecoCusto;
    private javax.swing.JTextField textPrecoMax;
    private javax.swing.JTextField textPrecoMin;
    // End of variables declaration//GEN-END:variables
}