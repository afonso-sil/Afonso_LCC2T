/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package projecto.views;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projecto.controllers.ClientesController;
import static projecto.controllers.ClientesController.clienteList;

/**
 *
 * @author Cins
 */
public class Clientes extends javax.swing.JPanel {
    ClientesController clientesController = new ClientesController();
    /**
     * Creates new form Clientes
     */
    public Clientes() {
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

        conteudo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btn_salvar = new javax.swing.JButton();
        txt_nome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_telefone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_endereco = new javax.swing.JTextField();
        btn_actualizar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        comboBoxCategoria = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaCliente = new javax.swing.JTable();
        pesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btn_verTodos = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        conteudo.setBackground(new java.awt.Color(0, 102, 153));
        conteudo.setPreferredSize(new java.awt.Dimension(813, 651));

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nome Completo");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telefone");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Endereço");

        btn_actualizar.setText("Actualizar");
        btn_actualizar.setEnabled(false);
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar");
        btn_eliminar.setEnabled(false);
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        comboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Especial", "Premium", " " }));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Categoria");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Clientes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_nome, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txt_telefone)
                        .addComponent(txt_endereco)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGap(176, 176, 176))
                        .addComponent(jLabel7)
                        .addComponent(comboBoxCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_eliminar))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(5, 5, 5)
                .addComponent(comboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome Completo", "Categoria", "Telefone", "Endereço"
            }
        ));
        tabelaCliente.setGridColor(new java.awt.Color(255, 255, 255));
        tabelaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaCliente);

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btn_verTodos.setText("Ver todos dados");
        btn_verTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(pesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisar)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_verTodos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pesquisa)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addComponent(btn_verTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout conteudoLayout = new javax.swing.GroupLayout(conteudo);
        conteudo.setLayout(conteudoLayout);
        conteudoLayout.setHorizontalGroup(
            conteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteudoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        conteudoLayout.setVerticalGroup(
            conteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteudoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(conteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        add(conteudo, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        String nome = txt_nome.getText();
        String telefone = txt_telefone.getText();
        String endereco = txt_endereco.getText();
        String categoria = String.valueOf(comboBoxCategoria.getSelectedItem());
        
        if(!txt_nome.getText().isEmpty() && !txt_endereco.getText().isEmpty() && !txt_telefone.getText().isEmpty() && !categoria.isEmpty()){
            clientesController.criarCliente(nome, telefone, endereco, categoria);
            actualizaDados();
            limpaCampos();       
        }else{
            JOptionPane.showMessageDialog(new JFrame(), "Campos obrigatório", "Dialog", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void tabelaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClienteMouseClicked
        int selectedRow = tabelaCliente.getSelectedRow();
        
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(new JFrame(), "Nenhum cliente selecionado", "Dialog", JOptionPane.ERROR_MESSAGE);
        }else{
            int id = (int) tabelaCliente.getValueAt(selectedRow, 0);

            pegarId(id);
            
            btn_actualizar.setEnabled(true);
            btn_eliminar.setEnabled(true);
        }
    }//GEN-LAST:event_tabelaClienteMouseClicked

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        int selectedRow = tabelaCliente.getSelectedRow();
        
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(new JFrame(), "Nenhuma distribuidora selecionado", "Dialog", JOptionPane.ERROR_MESSAGE);
        }else{
            int id = (int) tabelaCliente.getValueAt(selectedRow, 0);
            String categoria = String.valueOf(comboBoxCategoria.getSelectedItem());
            
            if(!txt_nome.getText().isEmpty() && !txt_endereco.getText().isEmpty() && !txt_telefone.getText().isEmpty() && !categoria.isEmpty()){
                clientesController.actualizarCliente(id, txt_nome.getText(), txt_telefone.getText(), txt_endereco.getText(), categoria);
                actualizaDados();
                limpaCampos();
                btn_actualizar.setEnabled(false);
                btn_eliminar.setEnabled(false);
            }else{
                JOptionPane.showMessageDialog(new JFrame(), "Campos obrigatório", "Dialog", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        int selectedRow = tabelaCliente.getSelectedRow();
        
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(new JFrame(), "Nenhuma distribuidora selecionada", "Dialog", JOptionPane.ERROR_MESSAGE);
        }else{
            int id = (int) tabelaCliente.getValueAt(selectedRow, 0);

            clientesController.deletaCliente(id);
            
            actualizaDados();
            limpaCampos();
            btn_eliminar.setEnabled(false);
            btn_actualizar.setEnabled(false);
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        
        if(!pesquisa.getText().isEmpty()){
            DefaultTableModel model = (DefaultTableModel) tabelaCliente.getModel();

            model.setRowCount(0);
            clientesController.pesquisaCliente(pesquisa.getText(), model);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btn_verTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verTodosActionPerformed
        pesquisa.setText("");
        actualizaDados();
        
    }//GEN-LAST:event_btn_verTodosActionPerformed

    public void pegarId(int id){
        for(projecto.models.Cliente cliente: clienteList){
            if(cliente.getId() == id){
                txt_nome.setText(cliente.getNome());
                txt_endereco.setText(cliente.getEndereco());
                txt_telefone.setText(cliente.getTelefone());
                comboBoxCategoria.setSelectedItem(cliente.getCategoria());
            }
            
        }
    }
    private void actualizaDados(){
       
        DefaultTableModel model = (DefaultTableModel) tabelaCliente.getModel();

        model.setRowCount(0);
        clientesController.buscarTodosClientes(model);
    }
     
    public void limpaCampos(){
        txt_nome.setText("");
        txt_endereco.setText("");
        txt_telefone.setText("");
        comboBoxCategoria.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JButton btn_verTodos;
    private javax.swing.JComboBox<String> comboBoxCategoria;
    private javax.swing.JPanel conteudo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField pesquisa;
    private javax.swing.JTable tabelaCliente;
    private javax.swing.JTextField txt_endereco;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_telefone;
    // End of variables declaration//GEN-END:variables
}
