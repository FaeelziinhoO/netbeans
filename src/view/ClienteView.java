package view;

import dao.ClienteDao;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cliente;

/**
 *
 * @author 931128
 */
public class ClienteView extends javax.swing.JFrame {

    public ClienteView() {
        initComponents();
        leiaJTable();
    }

    public void limpar() {
        txfNome.setText("");
        txfCpf.setText("");
        txfEmail.setText("");
        txfTelefone.setText("");
    }

    public void leiaJTable() {
        DefaultTableModel modelo = (DefaultTableModel) jtCliente.getModel();
        modelo.setNumRows(0);
        ClienteDao dao = new ClienteDao();

        for (Cliente cliente : dao.leitura()) {
            modelo.addRow(new Object[]{
                cliente.getIdCliente(),
                cliente.getNome(),
                cliente.getCpf(),
                cliente.getEmail(),
                cliente.getTelefone()

            });

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txfNome = new javax.swing.JTextField();
        btnSair = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        txfTelefone = new javax.swing.JTextField();
        txfCpf = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txfEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCliente = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("Cadastro de Clientes");

        jLabel6.setText("Nome:");

        txfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNomeActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(255, 255, 51));
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnCadastrar.setBackground(new java.awt.Color(0, 0, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        txfTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfTelefoneActionPerformed(evt);
            }
        });

        txfCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfCpfActionPerformed(evt);
            }
        });

        btnLimpar.setBackground(new java.awt.Color(255, 0, 0));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jLabel7.setText("Cpf:");

        jLabel8.setText("Email:");

        txfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfEmailActionPerformed(evt);
            }
        });

        jLabel9.setText("Telefone:");

        jtCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Cpf", "Email", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtCliente);

        btnExcluir.setBackground(new java.awt.Color(153, 153, 0));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(0, 255, 0));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel6))
                                        .addGap(25, 25, 25)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel1)
                                                .addComponent(txfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(139, 139, 139)
                                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(117, 117, 117)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel9)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(40, 40, 40)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txfTelefone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txfCpf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnLimpar)
                    .addComponent(btnSair)
                    .addComponent(btnExcluir)
                    .addComponent(btnEditar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(296, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(313, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNomeActionPerformed

    }//GEN-LAST:event_txfNomeActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Cliente clientes = new Cliente();

        clientes.setNome(txfNome.getText());
        clientes.setCpf(txfCpf.getText());
        clientes.setEmail(txfEmail.getText());
        clientes.setTelefone(txfTelefone.getText());

        if ((txfNome.getText().isEmpty()) || (txfCpf.getText().isEmpty()) || (txfEmail.getText().isEmpty()) || (txfTelefone.getText().isEmpty())) {

            JOptionPane.showMessageDialog(null, "Os campos não devem ficar vazios");

        } else {
            ClienteDao dao = new ClienteDao();
            dao.insert(clientes);
            JOptionPane.showMessageDialog(null, "Cliente: " + txfNome.getText() + " Cadastrado com sucesso");
        }
        leiaJTable();
        limpar();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txfTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfTelefoneActionPerformed

    private void txfCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCpfActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void txfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfEmailActionPerformed

    }//GEN-LAST:event_txfEmailActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (jtCliente.getSelectedRow() != -1) {
            Cliente cliente = new Cliente();
            cliente.setIdCliente((int) jtCliente.getValueAt(jtCliente.getSelectedRow(), 0));

            if ((txfNome.getText().isEmpty()) || (txfCpf.getText().isEmpty())
                    || (txfEmail.getText().isEmpty()) || (txfTelefone.getText().isEmpty())) {

                JOptionPane.showMessageDialog(null, "Os Campos nãp podem ficar Vazios");
            } else {

                ClienteDao dao = new ClienteDao();
                dao.delete(cliente);
                JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso!!");
                leiaJTable();
                limpar();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um cliente para excluir!");
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (jtCliente.getSelectedRow() != -1) {
            Cliente cliente = new Cliente();

            cliente.setNome(txfNome.getText());
            cliente.setCpf(txfCpf.getText());
            cliente.setEmail(txfEmail.getText());
            cliente.setTelefone(txfTelefone.getText());

            cliente.setIdCliente((int) jtCliente.getValueAt(jtCliente.getSelectedRow(), 0));
            if ((txfNome.getText().isEmpty()||txfCpf.getText().isEmpty()||txfEmail.getText().isEmpty()||txfTelefone.getText().isEmpty())){
                JOptionPane.showMessageDialog(null,"O campo não pode ficar vazio");
            }else{
                ClienteDao dao = new ClienteDao();
                dao.editar(cliente);
               JOptionPane.showMessageDialog(null,"Cliente "+txfNome.getText()+ " editado com sucesso");
            }
            limpar();
            leiaJTable();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um cliente para editar");
        }
        leiaJTable();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void jtClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtClienteMouseClicked
        if (jtCliente.getSelectedRow() != -1) {
            txfNome.setText(jtCliente.getValueAt(jtCliente.getSelectedRow(), 1).toString());
            txfCpf.setText(jtCliente.getValueAt(jtCliente.getSelectedRow(), 2).toString());
            txfEmail.setText(jtCliente.getValueAt(jtCliente.getSelectedRow(), 3).toString());
            txfTelefone.setText(jtCliente.getValueAt(jtCliente.getSelectedRow(), 4).toString());
        }
    }//GEN-LAST:event_jtClienteMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtCliente;
    private javax.swing.JTextField txfCpf;
    private javax.swing.JTextField txfEmail;
    private javax.swing.JTextField txfNome;
    private javax.swing.JTextField txfTelefone;
    // End of variables declaration//GEN-END:variables
}
