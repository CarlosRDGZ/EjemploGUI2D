package ejemplogui2d;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Banco extends javax.swing.JFrame implements Printable{
    private DefaultListModel clientes;
    private BancoFile archivo;

    public Banco()
    {
        initComponents();

        clientes = new DefaultListModel();
        lstClientes.setModel(clientes);
        //clientes.addElement("uno"); = Para agregar
        //clientes.addElement("dos");

        archivo = new BancoFile("miBanco.bin");

        ArrayList<Cuenta> todos = archivo.leerTodos();

        for(Cuenta c : todos)
        {
            clientes.addElement(c);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblNumeroCuenta = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        txtNumeroCuenta = new javax.swing.JTextField();
        txtSaldo = new javax.swing.JTextField();
        btnGrabar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstClientes = new javax.swing.JList();
        btnNuevo = new javax.swing.JButton();
        btnBuscarSaldo = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNombre.setText("Nombre");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        lblNumeroCuenta.setText("Numero de cuenta");

        lblSaldo.setText("Saldo");

        txtNumeroCuenta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNumeroCuentaFocusLost(evt);
            }
        });

        txtSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldoActionPerformed(evt);
            }
        });

        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        lstClientes.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstClientes);

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnBuscarSaldo.setText("Buscar");
        btnBuscarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarSaldoActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnImprimir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGrabar)
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblSaldo)
                                    .addComponent(lblNumeroCuenta)
                                    .addComponent(lblNombre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre)
                                    .addComponent(txtNumeroCuenta)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBuscarSaldo)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroCuenta)
                    .addComponent(txtNumeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSaldo)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarSaldo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGrabar)
                    .addComponent(btnNuevo)
                    .addComponent(btnBorrar)
                    .addComponent(btnImprimir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaldoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        //pARA MANDAR MENSAJES DE ADVERTENCIA
        //JOptionPane.showMessageDialog(this, "El mensaje", "Mi ventana", JOptionPane.ERROR_MESSAGE);
        if( camposLlenos() && isDataValid() )
        {
            Cuenta c = new Cuenta(txtNombre.getText(), txtNumeroCuenta.getText(), txtSaldo.getText());


            if(lstClientes.getSelectedIndex() > -1){

                Cuenta cSel = (Cuenta) clientes.get(lstClientes.getSelectedIndex());
                clientes.set(lstClientes.getSelectedIndex(), c);
                archivo.grabar(c, cSel.getNumRegistro());


            }
            else {
                c.setNumRegistro(archivo.numeroDeRegistros());
                clientes.addElement(c);
                archivo.grabar(c, lstClientes.getSelectedIndex());
            }

        }

    }//GEN-LAST:event_btnGrabarActionPerformed

    private void txtNumeroCuentaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumeroCuentaFocusLost
        //Error del float porque isDataValid evalua ese campo antes de ingrear algo
        isDataValid();
    }//GEN-LAST:event_txtNumeroCuentaFocusLost

    private void lstClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstClientesMouseClicked
        Cuenta cuenta =  (Cuenta) lstClientes.getSelectedValue();
        txtNombre.setText( cuenta.getNombre());
        txtNumeroCuenta.setText( String.valueOf( cuenta.getNumeroCuenta() ));
        txtSaldo.setText( String.valueOf(cuenta.getSaldo()));
    }//GEN-LAST:event_lstClientesMouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        txtNombre.setText("");
        txtNumeroCuenta.setText("");
        txtSaldo.setText("");
        lstClientes.clearSelection();

        txtNombre.requestFocus();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnBuscarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarSaldoActionPerformed
        // TODO add your handling code here:
        try
        {
            float saldo = Float.valueOf(txtSaldo.getText());

            txtNombre.setText("");
            txtNumeroCuenta.setText("");

            ArrayList<Cuenta>  resultado = archivo.buscarSaldo(saldo);

            clientes.clear();

            for(Cuenta c : resultado)
            {
                clientes.addElement(c);
            }

            JOptionPane.showMessageDialog(this, "Se encontratro "  + clientes.getSize() + "cuentas", "Resultado de la busqueda", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (NumberFormatException n)
        {
            txtSaldo.setText("");
            JOptionPane.showMessageDialog(this, "El Saldo debe ser un valor flotante", "Numero de saldo incorrecto", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarSaldoActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        Cuenta c = (Cuenta) lstClientes.getSelectedValue();
        archivo.borrar(c.getNumRegistro());
        clientes.remove(lstClientes.getSelectedIndex());

        JOptionPane.showMessageDialog(this, "El cliente"+ c.getNombre()+" ha sido eliminido","Aviso",
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // TODO add your handling code here:
        PrinterJob job = PrinterJob.getPrinterJob();

        job.setPrintable(this);

        boolean imprimir = job.printDialog();

        if(imprimir == true)
        {
            try
            {
                job.print();

            } catch (PrinterException ex) {
               JOptionPane.showMessageDialog(this, ex.getMessage(), "Error al intentar imprimir",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private boolean isDataValid()
    {
        try{
            int numeroCuenta = Integer.valueOf( txtNumeroCuenta.getText() );

        } catch ( NumberFormatException e )
        {
            txtNumeroCuenta.setText("");
            JOptionPane.showMessageDialog(this, "El número de cuenta debe ser un valor entero", "Número de cuenta incorrecto", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        try{
            float saldo = Float.valueOf( txtSaldo.getText() );

        } catch ( NumberFormatException e )
        {
            txtSaldo.setText("");
            JOptionPane.showMessageDialog(this, "El Saldo debe ser un valor flotante", "Numero de saldo incorrecto", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private boolean camposLlenos()
    {
        if( txtNombre.getText().isEmpty() || txtNumeroCuenta.getText().isEmpty() || txtSaldo.getText().isEmpty() )
        {
            JOptionPane.showMessageDialog(this, "Debe de llenar todos los campos", "Error Campos vacíos", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else
        {
            return true;
        }
    }

    private DefaultListModel filtrar(float saldo)
    {
        DefaultListModel resultado = new DefaultListModel();

        for (int i = 0; i < clientes.size(); i++)
        {
            Cuenta c = (Cuenta) clientes.get(i);

            if(c.getSaldo() < saldo)
            {
                resultado.addElement(c);
            }
        }

        return resultado;
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
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Banco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscarSaldo;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumeroCuenta;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JList lstClientes;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroCuenta;
    private javax.swing.JTextField txtSaldo;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics grphcs, PageFormat pf, int i) throws PrinterException
    {
        if(i > 0)
        {
          return NO_SUCH_PAGE;
        }

        Graphics2D g2d = (Graphics2D) grphcs;

        g2d.translate(pf.getImageableX(), pf.getImageableY());

        for(int j = 0;  j < clientes.getSize(); j++)
        {
            Cuenta c = (Cuenta) clientes.get(j);
            grphcs.drawString((j+1) + c.getNombre() + "Saldo: $" + c.getSaldo(), 100,50+(j*20));
        }

        return PAGE_EXISTS;

    }
}