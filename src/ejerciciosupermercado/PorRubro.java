/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosupermercado;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raven
 */
public class PorRubro extends javax.swing.JInternalFrame {

 private DefaultTableModel model=new DefaultTableModel(){
        
        public boolean isCellEditable(int f, int c ){
          return false;  
        }
    };   
 
  // constructor
 
    public PorRubro() {   
        initComponents();
        cargarCombo();
        armarCabecera();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jlrubro = new javax.swing.JLabel();
        jcrubro = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbproductos = new javax.swing.JTable();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 102, 255));
        jLabel1.setText("Listado de Productos por Rubro");

        jlrubro.setBackground(new java.awt.Color(204, 204, 255));
        jlrubro.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlrubro.setForeground(new java.awt.Color(204, 102, 255));
        jlrubro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlrubro.setText("Rubro");

        jcrubro.setBackground(new java.awt.Color(204, 204, 255));
        jcrubro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jcrubro.setForeground(new java.awt.Color(153, 51, 255));
        jcrubro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcrubroItemStateChanged(evt);
            }
        });
        jcrubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcrubroActionPerformed(evt);
            }
        });

        jtbproductos.setBackground(new java.awt.Color(204, 204, 255));
        jtbproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtbproductos.setEnabled(false);
        jScrollPane1.setViewportView(jtbproductos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jlrubro, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcrubro, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcrubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlrubro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 99, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcrubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcrubroActionPerformed
        // TODO add your handling code here:
      
        
    }//GEN-LAST:event_jcrubroActionPerformed

    private void jcrubroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcrubroItemStateChanged
        // TODO add your handling code here:
         borrarFilas();
        
        Categoria opcion = (Categoria) jcrubro.getSelectedItem();
        

        for (Producto producto : Menu.listaProductos) {

            if (opcion == producto.getRubro()) {
                model.addRow(new Object[]{producto.getCodigo(), producto.getDescripcion(), producto.getPrecio(), producto.getStock()});
            }

        }
       
        //Con el Profe:
//     Categoria rubro;
//     
//     if(jcrubro.getModel().getSelectedItem()== Categoria.COMESTIBLE){
//         
//         rubro=Categoria.COMESTIBLE;
//         
//     }else if (jcrubro.getModel().getSelectedItem()== Categoria.LIMPIEZA){
//         
//         rubro=Categoria.LIMPIEZA;
//         
//     }else{
//        
//         rubro=Categoria.PERFUMERIA;}
//     
//     if(evt.getStateChange()== java.awt.event.ItemEvent.DESELECTED){
//        
//         borrarFilas();
//         for (Producto pro : Menu.listaProductos) {
//             if(pro.getRubro()==rubro){
//                 model.addRow(new Object[]{pro.getCodigo(), pro.getDescripcion(),pro.getPrecio(), pro.getStock()});
//             }
//             
//         }
//         
//     }
        
        
        
    }//GEN-LAST:event_jcrubroItemStateChanged

    private void cargarCombo(){
        jcrubro.addItem(Categoria.COMESTIBLE);
        jcrubro.addItem(Categoria.PERFUMERIA);
        jcrubro.addItem(Categoria.LIMPIEZA);
    }
    
    
    private void armarCabecera(){
         model.addColumn("Codigo");
         model.addColumn("Descripcion");
         model.addColumn("Precio");
         model.addColumn("Stock");
         jtbproductos.setModel(model);
    }
    
    
         private void borrarFilas(){
         
         int f=model.getRowCount()-1;
         
         for(;f>=0;f--){
             
             model.removeRow(f);
         }
         
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Categoria> jcrubro;
    private javax.swing.JLabel jlrubro;
    private javax.swing.JTable jtbproductos;
    // End of variables declaration//GEN-END:variables
}
