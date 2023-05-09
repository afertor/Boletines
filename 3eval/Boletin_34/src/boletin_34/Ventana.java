package boletin_34;


import boletin_34.Empleados;
import boletin_34.Contratados;
import boletin_34.Indefinido;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.util.ArrayList;

public class Ventana extends javax.swing.JFrame {

    ArrayList<Empleados> empleados = new ArrayList<>();

    public Ventana() {

        initComponents();
        this.setLocationRelativeTo(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelDni = new javax.swing.JLabel();
        jLabelSalario = new javax.swing.JLabel();
        jLabelFechaContrato = new javax.swing.JLabel();
        jTextFieldApellidos = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldDNI = new javax.swing.JTextField();
        jTextFieldSalario = new javax.swing.JTextField();
        jTextFieldFecha = new javax.swing.JTextField();
        jButtonCrear = new javax.swing.JButton();
        jButtonMostrar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        cmbTipoContrato = new javax.swing.JComboBox<>();
        jButtonNuevo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaMostrar = new javax.swing.JTextArea();
        jPanelClienteContratados = new javax.swing.JPanel();
        jLabeClientesCaptado = new javax.swing.JLabel();
        jTextFieldCientesContratados = new javax.swing.JTextField();

        jScrollPane2.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabelNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNombre.setText("Nombre:");

        jLabelApellido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelApellido.setForeground(new java.awt.Color(0, 0, 0));
        jLabelApellido.setText("Apellidos:");

        jLabelDni.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelDni.setForeground(new java.awt.Color(0, 0, 0));
        jLabelDni.setText("Dni:");

        jLabelSalario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelSalario.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSalario.setText("Salario:");

        jLabelFechaContrato.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelFechaContrato.setForeground(new java.awt.Color(0, 0, 0));
        jLabelFechaContrato.setText("Fecha de contrato:");

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });

        jTextFieldFecha.setText(" \"dia/mes/año\"");

        jButtonCrear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonCrear.setText("Crear");
        jButtonCrear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearjButtonCrearActionPerformed(evt);
            }
        });

        jButtonMostrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonMostrar.setText("Mostrar");
        jButtonMostrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarjButtonVizualizarActionPerformed(evt);
            }
        });

        jButtonSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirjButtonSalirActionPerformed(evt);
            }
        });

        cmbTipoContrato.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        cmbTipoContrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Indefinido", "Contratado" }));
        cmbTipoContrato.setBorder(null);
        cmbTipoContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoContratoActionPerformed(evt);
            }
        });

        jButtonNuevo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonNuevo.setText("Nuevo");
        jButtonNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });

        jTextAreaMostrar.setBackground(new java.awt.Color(204, 204, 204));
        jTextAreaMostrar.setColumns(20);
        jTextAreaMostrar.setRows(5);
        jTextAreaMostrar.setBorder(null);
        jScrollPane1.setViewportView(jTextAreaMostrar);

        jPanelClienteContratados.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanelClienteContratadosLayout = new javax.swing.GroupLayout(jPanelClienteContratados);
        jPanelClienteContratados.setLayout(jPanelClienteContratadosLayout);
        jPanelClienteContratadosLayout.setHorizontalGroup(
            jPanelClienteContratadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelClienteContratadosLayout.setVerticalGroup(
            jPanelClienteContratadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        jLabeClientesCaptado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabeClientesCaptado.setForeground(new java.awt.Color(0, 0, 0));
        jLabeClientesCaptado.setText("Clientes contratados:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelDni, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabelNombre)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabelApellido)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jButtonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(jButtonMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanelClienteContratados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(65, 65, 65))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabeClientesCaptado, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCientesContratados, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbTipoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelSalario)
                                .addGap(12, 12, 12)
                                .addComponent(jTextFieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelFechaContrato)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(cmbTipoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelApellido))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSalario)
                    .addComponent(jTextFieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDni, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFechaContrato)
                    .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeClientesCaptado)
                    .addComponent(jTextFieldCientesContratados))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jPanelClienteContratados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonNuevo)
                    .addComponent(jButtonCrear)
                    .addComponent(jButtonMostrar)
                    .addComponent(jButtonSalir))
                .addGap(138, 138, 138))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonCrear, jButtonMostrar, jButtonNuevo});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(467, 467, 467))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCrearjButtonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearjButtonCrearActionPerformed
        Empleados empleado;
        try {
            String dniIntroducido = jTextFieldDNI.getText();
            String nombreIntroducido = jTextFieldNombre.getText();
            String apellidosIntroducido = jTextFieldApellidos.getText();
            double salarioBaseIntroducido = Double.parseDouble(jTextFieldSalario.getText());
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate date = LocalDate.parse(jTextFieldFecha.getText(), formatter);

            String selectedOption = cmbTipoContrato.getSelectedItem().toString();

            if (selectedOption.equalsIgnoreCase("PERMANENTE")) {
                int ClienteContratado = Integer.parseInt(jTextFieldCientesContratados.getText());

                empleado = new Indefinido(dniIntroducido, nombreIntroducido, apellidosIntroducido, ClienteContratado, salarioBaseIntroducido, date);

            } else {
                empleado = new Contratados(dniIntroducido, nombreIntroducido, apellidosIntroducido, salarioBaseIntroducido, date);
            }

            empleados.add(empleado);
        } catch (java.time.format.DateTimeParseException ex) {
            JOptionPane.showMessageDialog(null, "Formato de fecha invalido");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Formato de numero invalido");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

    }//GEN-LAST:event_jButtonCrearjButtonCrearActionPerformed

    private void jButtonMostrarjButtonVizualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarjButtonVizualizarActionPerformed

        jTextAreaMostrar.setText(visualizar(empleados));

    }//GEN-LAST:event_jButtonMostrarjButtonVizualizarActionPerformed

    private void jButtonSalirjButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirjButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirjButtonSalirActionPerformed

    private void cmbTipoContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoContratoActionPerformed
        String selectedOption = cmbTipoContrato.getSelectedItem().toString();
        if (selectedOption.equalsIgnoreCase("PERMANENTE")) {
            jPanelClienteContratados.setVisible(true);
        } else {
            jPanelClienteContratados.setVisible(false);
        }
    }//GEN-LAST:event_cmbTipoContratoActionPerformed

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        jTextFieldDNI.setText("");
        jTextFieldNombre.setText("");
        jTextFieldApellidos.setText("");
        jTextFieldSalario.setText("");
        jTextFieldFecha.setText("");
        jTextFieldCientesContratados.setText("");
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private static String visualizar(ArrayList<Empleados> empleados) {
        StringBuilder sb = new StringBuilder();
        if (empleados.isEmpty()) {
            sb.append("No hay empleados registrados");
        } else {
            for (Empleados emp : empleados) {
                if (emp instanceof Contratados) {
                    Contratados contratado = (Contratados) emp;
                    sb.append("Empleado Contratado:").append(emp.toString())
                            .append("\nEl salario basico: €").append(contratado.calcularSalar()).append("\n\n");
                } else if (emp instanceof Indefinido) {
                    Indefinido permanente = (Indefinido) emp;
                    sb.append("\nEmpleado Permanente: ").append(emp.toString())
                            .append("\nEl salario basico: €").append(permanente.calcularSalar()).append("\n\n");
                }
            }
        }
        return sb.toString();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbTipoContrato;
    private javax.swing.JButton jButtonCrear;
    private javax.swing.JButton jButtonMostrar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabeClientesCaptado;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelDni;
    private javax.swing.JLabel jLabelFechaContrato;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelSalario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelClienteContratados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaMostrar;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldCientesContratados;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldSalario;
    // End of variables declaration//GEN-END:variables
}
