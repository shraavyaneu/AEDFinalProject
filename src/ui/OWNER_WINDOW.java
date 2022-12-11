package ui;


import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shraavyarao
 */
public class OWNER_WINDOW extends javax.swing.JFrame {

   
    public OWNER_WINDOW() {
        initComponents();
        
        Border panel_title_border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(60,70,200));
        jPanel_Title.setBorder(panel_title_border);
        
        Border button_border = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(255,255,255));
        jButton_Add_Owner.setBorder(button_border);
        jButton_Edit_Owner.setBorder(button_border);
        jButton_Remove_Owner.setBorder(button_border);
        jButton_Refresh.setBorder(button_border);
        jButton_Owner_Properties.setBorder(button_border);
        
        fillJtableWithOwnersData();
    }
    
    

    public void fillJtableWithOwnersData()
    {
        P_OWNER owner = new P_OWNER();
        ArrayList<P_OWNER> ownersList = owner.ownersList();
        
        String[] colNames = {"ID","First Name","Last Name","Phone","Email","Address"};
        
        Object[][] rows = new Object[ownersList.size()][6];
        
        for(int i = 0; i < ownersList.size(); i++)
        {
            rows[i][0] = ownersList.get(i).getId();
            rows[i][1] = ownersList.get(i).getFname();
            rows[i][2] = ownersList.get(i).getLname();
            rows[i][3] = ownersList.get(i).getPhone();
            rows[i][4] = ownersList.get(i).getEmail();
            rows[i][5] = ownersList.get(i).getAddress();
        }
        
        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable1.setModel(model);
       
        jTable1.setRowHeight(40);
        jTable1.setSelectionBackground(new Color(235,47,6));
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(25);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(150);
        
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_Title = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Id = new javax.swing.JTextField();
        jTextField_FName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Address = new javax.swing.JTextArea();
        jButton_Add_Owner = new javax.swing.JButton();
        jButton_Edit_Owner = new javax.swing.JButton();
        jButton_Remove_Owner = new javax.swing.JButton();
        jButton_Refresh = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField_LName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_Phone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_Email = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_Owner_Properties = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jPanel_Title.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setBackground(new java.awt.Color(102, 102, 255));
        jLabel1.setFont(new java.awt.Font("Symbol", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Owner Details");

        javax.swing.GroupLayout jPanel_TitleLayout = new javax.swing.GroupLayout(jPanel_Title);
        jPanel_Title.setLayout(jPanel_TitleLayout);
        jPanel_TitleLayout.setHorizontalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TitleLayout.createSequentialGroup()
                .addGap(462, 462, 462)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_TitleLayout.setVerticalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 204));
        jLabel2.setText("Owner ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 204));
        jLabel3.setText("First Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 204));
        jLabel4.setText("Address:");

        jTextField_Id.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jTextField_FName.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jTextArea_Address.setColumns(20);
        jTextArea_Address.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        jTextArea_Address.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Address);

        jButton_Add_Owner.setBackground(new java.awt.Color(102, 0, 204));
        jButton_Add_Owner.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Add_Owner.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Add_Owner.setText("Add");
        jButton_Add_Owner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Add_Owner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_OwnerActionPerformed(evt);
            }
        });

        jButton_Edit_Owner.setBackground(new java.awt.Color(102, 0, 204));
        jButton_Edit_Owner.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Edit_Owner.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Edit_Owner.setText("Edit");
        jButton_Edit_Owner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Edit_Owner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_OwnerActionPerformed(evt);
            }
        });

        jButton_Remove_Owner.setBackground(new java.awt.Color(102, 0, 204));
        jButton_Remove_Owner.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Remove_Owner.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Remove_Owner.setText("Remove");
        jButton_Remove_Owner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Remove_Owner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Remove_OwnerActionPerformed(evt);
            }
        });

        jButton_Refresh.setBackground(new java.awt.Color(102, 0, 255));
        jButton_Refresh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Refresh.setForeground(new java.awt.Color(204, 204, 255));
        jButton_Refresh.setText("Refresh");
        jButton_Refresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RefreshActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 204));
        jLabel5.setText("Last Name:");

        jTextField_LName.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 204));
        jLabel6.setText("Phone:");

        jTextField_Phone.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 204));
        jLabel7.setText("Email:");

        jTextField_Email.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton_Owner_Properties.setBackground(new java.awt.Color(102, 0, 204));
        jButton_Owner_Properties.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Owner_Properties.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Owner_Properties.setText("Owner Properties");
        jButton_Owner_Properties.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Owner_Properties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Owner_PropertiesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField_Phone)
                                .addComponent(jTextField_LName, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_FName)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButton_Add_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Edit_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Remove_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(jButton_Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(452, 452, 452)
                        .addComponent(jButton_Owner_Properties, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_FName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_LName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Phone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Email))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Add_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Edit_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Remove_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton_Owner_Properties, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Add_OwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_OwnerActionPerformed


        String fname = jTextField_FName.getText();
        String lname = jTextField_LName.getText();
        String phone = jTextField_Phone.getText();
        String email = jTextField_Email.getText();
        String address = jTextArea_Address.getText();
        
        P_OWNER owner = new P_OWNER();
        
        if( fname.trim().equals("") || lname.trim().equals("") || phone.trim().equals("") || address.trim().equals("") )
        {
            JOptionPane.showMessageDialog(null, "Enter The Required Owner Information [first name, last name, phone, address] ", "Add Owner", 2);
        }
        else
        {
            if(owner.addNewOwner(new P_OWNER(0, fname, lname, phone, email, address)))
            {
              JOptionPane.showMessageDialog(null, "New Owner Added To The System", "Add Owner", 1);
            }
          else{
             JOptionPane.showMessageDialog(null, "Owner NOT Added To The System", "Add Owner", 2);
           }
        }
    }//GEN-LAST:event_jButton_Add_OwnerActionPerformed

    private void jButton_Edit_OwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_OwnerActionPerformed

       String fname = jTextField_FName.getText();
        String lname = jTextField_LName.getText();
        String phone = jTextField_Phone.getText();
        String email = jTextField_Email.getText();
        String address = jTextArea_Address.getText();

        P_OWNER owner = new P_OWNER();
        
        try{
            
            int ownerId = Integer.valueOf(jTextField_Id.getText());
            
            
            if( fname.trim().equals("") || lname.trim().equals("") || phone.trim().equals("") || address.trim().equals("") )
            {
              JOptionPane.showMessageDialog(null, "Enter The Required Owner Information [first name, last name, phone, address] ", "Edit Owner", 2);
            }
           else
            {
                if(owner.editOwnerData(new P_OWNER(ownerId, fname, lname, phone, email, address)))
                {
                  JOptionPane.showMessageDialog(null, "Owner Data Edited", "Edit Owner", 1);
                }
              else{
                 JOptionPane.showMessageDialog(null, "Owner Data NOT Edited", "Edit Owner", 2);
               }
            } 
        }catch(Exception ex)
          {
            JOptionPane.showMessageDialog(null, ex.getMessage()+ " Enter a Valid Owner ID ", "Invalid Id", 0);
          }
        
        
    }//GEN-LAST:event_jButton_Edit_OwnerActionPerformed

    private void jButton_Remove_OwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Remove_OwnerActionPerformed

      
    }//GEN-LAST:event_jButton_Remove_OwnerActionPerformed

    // get owner data on jtable mouse click
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
      
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RefreshActionPerformed
      
    }//GEN-LAST:event_jButton_RefreshActionPerformed

    private void jButton_Owner_PropertiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Owner_PropertiesActionPerformed
    
        
    }//GEN-LAST:event_jButton_Owner_PropertiesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OWNER_WINDOW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add_Owner;
    private javax.swing.JButton jButton_Edit_Owner;
    private javax.swing.JButton jButton_Owner_Properties;
    private javax.swing.JButton jButton_Refresh;
    private javax.swing.JButton jButton_Remove_Owner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Title;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea_Address;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_FName;
    private javax.swing.JTextField jTextField_Id;
    private javax.swing.JTextField jTextField_LName;
    private javax.swing.JTextField jTextField_Phone;
    // End of variables declaration//GEN-END:variables
}
