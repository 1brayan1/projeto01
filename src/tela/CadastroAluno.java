/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import entidade.Aluno;
import javax.swing.JOptionPane;

/**
 *
 * @author brayan.waltrick
 */
public class CadastroAluno extends javax.swing.JFrame {

    private Aluno aluno;

    /**
     * Creates new form CadastroAluno
     */
    public CadastroAluno() {
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

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        principal = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        lb_nome = new javax.swing.JLabel();
        varNome = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        lb_idade = new javax.swing.JLabel();
        varIdade = new javax.swing.JFormattedTextField();
        lb_telefone = new javax.swing.JLabel();
        varTelefone = new javax.swing.JFormattedTextField();
        lb_numero = new javax.swing.JLabel();
        varSalario = new javax.swing.JFormattedTextField();
        lb_salario1 = new javax.swing.JLabel();
        lb_logradouro = new javax.swing.JLabel();
        lb_salario3 = new javax.swing.JLabel();
        lb_bairro = new javax.swing.JLabel();
        lb_cpf = new javax.swing.JLabel();
        varCpf = new javax.swing.JFormattedTextField();
        varLogradouro = new javax.swing.JTextField();
        varNumero = new javax.swing.JTextField();
        varBairro = new javax.swing.JTextField();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Cadastro Aluno");

        lb_nome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_nome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_nome.setText("Nome:");

        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        lb_idade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_idade.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_idade.setText("Idade:");

        varIdade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        lb_telefone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_telefone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_telefone.setText("Telefone:");

        try {
            varTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lb_numero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_numero.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_numero.setText("Número:");

        varSalario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));

        lb_salario1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_salario1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_salario1.setText("Número:");

        lb_logradouro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_logradouro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_logradouro.setText("Logradouro:");

        lb_salario3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_salario3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_salario3.setText("Salário:");

        lb_bairro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_bairro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_bairro.setText("Bairro:");

        lb_cpf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_cpf.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_cpf.setText("CPF:");

        try {
            varCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(principalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(principalLayout.createSequentialGroup()
                        .addComponent(lb_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(varNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(principalLayout.createSequentialGroup()
                        .addComponent(lb_idade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(varIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lb_salario1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, principalLayout.createSequentialGroup()
                            .addComponent(lb_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(varBairro))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, principalLayout.createSequentialGroup()
                            .addComponent(lb_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(varCpf))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, principalLayout.createSequentialGroup()
                            .addComponent(lb_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(varNumero))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, principalLayout.createSequentialGroup()
                            .addComponent(lb_logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(varLogradouro))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, principalLayout.createSequentialGroup()
                            .addComponent(lb_salario3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(varSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, principalLayout.createSequentialGroup()
                            .addComponent(lb_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(varTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(principalLayout.createSequentialGroup()
                        .addComponent(lb_salario1)
                        .addGap(244, 244, 244))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalLayout.createSequentialGroup()
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(principalLayout.createSequentialGroup()
                                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lb_nome)
                                    .addComponent(varNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lb_idade)
                                    .addComponent(varIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lb_telefone))
                            .addComponent(varTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(varSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_salario3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_logradouro)
                            .addComponent(varLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_numero)
                    .addComponent(varNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_bairro)
                    .addComponent(varBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_cpf)
                    .addComponent(varCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btSalvar)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        aluno = new Aluno();

        boolean erro = validarFormulario();
        if (!erro) {
            //TODO chamar metodo que salva no bd
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private boolean validarFormulario() {
        String nome = varNome.getText().trim();
        if (validarCampo3Valor(nome)) {
            JOptionPane.showMessageDialog(null, "Digite um nome correto!");
            return true;
        }

        if (validarIdade()) {
            JOptionPane.showMessageDialog(null, "Digite uma idade correta!");
            return true;
        }

        if (validarTelefone()) {
            JOptionPane.showMessageDialog(null, "Digite um telefone correto!");
            return true;
        }

        if (validarSalario()) {
            JOptionPane.showMessageDialog(null, "Digite um telefone correto!");
            return true;
        }

        String logradouro = varLogradouro.getText().trim();
        if (validarCampo3Valor(logradouro)) {
            JOptionPane.showMessageDialog(null, "Digite um logradouro correto!");
            return true;

        }

        if (validarNumero()) {
            JOptionPane.showMessageDialog(null, "Digite um número correto!");
            return true;
        }

        String bairro = varBairro.getText().trim();
        if (validarCampo3Valor(bairro)) {
            JOptionPane.showMessageDialog(null, "Digite um bairro correto!");
            return true;
        }

        if (validarCpf()) {
            JOptionPane.showMessageDialog(null, "Digite um CPF correto!");
            return true;
        }

        return false;
    }

    private boolean validarCpf() {
        String cpf = varCpf.getText();
        char indice = cpf.charAt(0);
        return indice == ' ';

    }

    private boolean validarNumero() {
        String numero = varNumero.getText().trim();
        return numero.equals("") || numero.equals("0");
    }

    private boolean validarIdade() {
        String idade = varIdade.getText().trim();
        if (idade.equals("")) {
            return true;
        } else {
            int valorIdade = Integer.parseInt(idade);
            return valorIdade <= 16 || valorIdade >= 100;
        }
    }

    private boolean validarCampo3Valor(String valor) {
        return valor.length() < 3;
    }

    private boolean validarTelefone() {
        String telefone = varTelefone.getText().trim();
        return telefone.length() < 11;

    }

    private boolean validarSalario() {
        String salario = varSalario.getText().trim();
        return salario.equals("") || salario.equals(",00");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalvar;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel lb_bairro;
    private javax.swing.JLabel lb_cpf;
    private javax.swing.JLabel lb_idade;
    private javax.swing.JLabel lb_logradouro;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JLabel lb_numero;
    private javax.swing.JLabel lb_salario1;
    private javax.swing.JLabel lb_salario3;
    private javax.swing.JLabel lb_telefone;
    private javax.swing.JPanel principal;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField varBairro;
    private javax.swing.JFormattedTextField varCpf;
    private javax.swing.JFormattedTextField varIdade;
    private javax.swing.JTextField varLogradouro;
    private javax.swing.JTextField varNome;
    private javax.swing.JTextField varNumero;
    private javax.swing.JFormattedTextField varSalario;
    private javax.swing.JFormattedTextField varTelefone;
    // End of variables declaration//GEN-END:variables
}
