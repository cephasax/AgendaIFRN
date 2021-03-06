/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.informatica.poo.interfaces;

import br.edu.ifrn.informatica.poo.Agenda;
import br.edu.ifrn.informatica.poo.Contato;
import javax.swing.JOptionPane;

/**
 *
 * 
 */
public class JIFDetalhesContato extends javax.swing.JInternalFrame {

    public static Agenda agenda;
    public static Contato contato;
    
    /**
     * Creates new form JIFInserirContato
     */
    public JIFDetalhesContato(Agenda agenda, Contato contato) {
        this.agenda = agenda;
        this.contato = contato;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTextNome = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextCpf = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextTelefone = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextEmail = new javax.swing.JTextPane();
        JBConfirmar = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();
        JBEditar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Detalhes do Contato");
        setToolTipText("");

        JTextNome.setEditable(false);
        jScrollPane1.setViewportView(JTextNome);

        jLabel1.setText("Nome: ");

        jLabel2.setText("CPF: ");

        jTextCpf.setEditable(false);
        jScrollPane2.setViewportView(jTextCpf);

        jLabel3.setText("Telefone: ");

        jLabel4.setText("E-mail: ");

        jTextTelefone.setEditable(false);
        jScrollPane4.setViewportView(jTextTelefone);

        jTextEmail.setEditable(false);
        jScrollPane3.setViewportView(jTextEmail);

		JTextNome.setText(contato.getNome());
		jTextCpf.setText(contato.getCPF());
		jTextTelefone.setText(contato.getTelefone());
		jTextEmail.setText(contato.getEmail());
		
        JBConfirmar.setText("Confirmar");
        JBConfirmar.setEnabled(false);
        JBConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBConfirmarActionPerformed(evt);
            }
        });

        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        JBEditar.setText("Editar");
        JBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 189, Short.MAX_VALUE)
                        .addComponent(JBCancelar)
                        .addGap(11, 11, 11)
                        .addComponent(JBEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBConfirmar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1))))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBConfirmar)
                    .addComponent(JBCancelar)
                    .addComponent(JBEditar))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBConfirmarActionPerformed
        
        contato.setNome(JTextNome.getText());
        contato.setEmail(jTextEmail.getText());
        contato.setCPF(jTextCpf.getText());
        contato.setTelefone(jTextTelefone.getText());
        
        
        System.out.println(agenda.getContatos().size());
        JOptionPane.showMessageDialog(null, "Contato Editado com sucesso");
    }//GEN-LAST:event_JBConfirmarActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
            this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEditarActionPerformed
        JBConfirmar.setEnabled(true);
        JTextNome.setEditable(true);
        jTextCpf.setEditable(true);
        jTextEmail.setEditable(true);
        jTextTelefone.setEditable(true);
    }//GEN-LAST:event_JBEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBConfirmar;
    private javax.swing.JButton JBEditar;
    private javax.swing.JTextPane JTextNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextPane jTextCpf;
    private javax.swing.JTextPane jTextEmail;
    private javax.swing.JTextPane jTextTelefone;
    // End of variables declaration//GEN-END:variables
}
