/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.novelis;

import classe.Chargement;
import classe.Fonctions;
import db.DBAlliage;
import db.DBChargement;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author bunela
 */
public class Fenetre_principale extends javax.swing.JFrame {

    
    /**
     * Creates new form Fenetre_principale
     */
    public Fenetre_principale() {
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

        panel_identite = new javax.swing.JPanel();
        label_relais = new javax.swing.JLabel();
        label_nom1 = new javax.swing.JLabel();
        label_nom2 = new javax.swing.JLabel();
        label_alliage = new javax.swing.JLabel();
        label_typefour = new javax.swing.JLabel();
        label_pdb = new javax.swing.JLabel();
        typefour_value = new javax.swing.JComboBox();
        alliage_value = new javax.swing.JComboBox();
        relais_value = new javax.swing.JComboBox();
        nom1_value = new javax.swing.JTextField();
        nom2_value = new javax.swing.JTextField();
        pdb_value = new javax.swing.JTextField();
        bouton_annuler = new javax.swing.JButton();
        bouton_creerchargement = new javax.swing.JButton();
        menu = new javax.swing.JMenuBar();
        fichier = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        rechercher_menu = new javax.swing.JMenu();
        aide_menu = new javax.swing.JMenu();
        imprimer_menu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label_relais.setText("Relais :");

        label_nom1.setText("Nom1 :");

        label_nom2.setText("Nom2 :");

        label_alliage.setText("Alliage:");

        label_typefour.setText("Type de four :");

        label_pdb.setText("Poids pieds de bain :");

        typefour_value.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Thermcon" , "Demag"}));

        alliage_value.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1050","1200","8011","8906","8979","8079","8666","8006" }));

        relais_value.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Matin", "Après-midi", "Nuit" }));

        bouton_annuler.setText("Annuler");

        bouton_creerchargement.setText("Créer chargement");
        bouton_creerchargement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton_creerchargementActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_identiteLayout = new javax.swing.GroupLayout(panel_identite);
        panel_identite.setLayout(panel_identiteLayout);
        panel_identiteLayout.setHorizontalGroup(
            panel_identiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_identiteLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(panel_identiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_pdb)
                    .addComponent(label_typefour, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_identiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(label_alliage)
                        .addGroup(panel_identiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_relais, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_nom1)
                            .addComponent(label_nom2))))
                .addGap(29, 29, 29)
                .addGroup(panel_identiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nom2_value)
                    .addComponent(typefour_value, 0, 106, Short.MAX_VALUE)
                    .addComponent(nom1_value)
                    .addComponent(relais_value, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pdb_value)
                    .addComponent(alliage_value, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_identiteLayout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addComponent(bouton_creerchargement)
                .addGap(29, 29, 29)
                .addComponent(bouton_annuler)
                .addGap(78, 78, 78))
        );
        panel_identiteLayout.setVerticalGroup(
            panel_identiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_identiteLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panel_identiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(relais_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_relais))
                .addGap(18, 18, 18)
                .addGroup(panel_identiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nom1_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_nom1))
                .addGap(18, 18, 18)
                .addGroup(panel_identiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nom2)
                    .addComponent(nom2_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_identiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_alliage)
                    .addComponent(alliage_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_identiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typefour_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_typefour))
                .addGap(18, 18, 18)
                .addGroup(panel_identiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_pdb)
                    .addComponent(pdb_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(panel_identiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bouton_annuler)
                    .addComponent(bouton_creerchargement))
                .addContainerGap())
        );

        fichier.setText("Fichier");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Nouveau chargement");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        fichier.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Ouvrir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        fichier.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Enregistrer");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        fichier.add(jMenuItem3);

        menu.add(fichier);

        rechercher_menu.setText("Rechercher");
        menu.add(rechercher_menu);

        aide_menu.setText("Aide");
        menu.add(aide_menu);

        imprimer_menu.setText("Imprimer");
        menu.add(imprimer_menu);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(panel_identite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1514, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(panel_identite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1009, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void relais_value2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relais_value2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_relais_value2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public boolean saisieFormulaireOk ( String []tab )
    {
        boolean formOk = true;

        for ( int i = 0 ; i < tab.length ; i++)
        {
                if ( tab[i].equals(""))
                        formOk = false;
        }
        return formOk;
    }
    
    private void bouton_creerchargementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton_creerchargementActionPerformed

        String tabInfo[] = new String[6];
        int typeFour;
        int reponse = 2;
            // On stock le formulaire dans un tableau qu'on enverra a la feuilleFour
              
            tabInfo[0] 	= nom1_value.getText();
            tabInfo[1] 	= nom2_value.getText();
            tabInfo[2] 	= pdb_value.getText();
            tabInfo[3] 	= relais_value.getSelectedItem().toString();
            tabInfo[4] 	= alliage_value.getSelectedItem().toString();
            tabInfo[5]	= typefour_value.getSelectedItem().toString();
                    
            if ( tabInfo[5].equals("Thermcon"))     typeFour = 1;
			
            else                                    typeFour = 0;
            
            reponse = JOptionPane.showConfirmDialog(null, "Voulez vous créer ce nouveau chargement", "Confirmation de la création", JOptionPane.YES_NO_CANCEL_OPTION);	
		
            
		
            int idAlliage = 0 ;

            // Si le formulaire et correct et qu'on a validé
            // On envoie le tableau de saisie a la feuille principale pour créer le chargement
            if ( reponse == 0 )
            {
                    if ( ! saisieFormulaireOk( tabInfo ) ) 
                            JOptionPane.showMessageDialog(null, "Vous devez remplir tous les champs pour créer le chargement", "Erreur de saisie", JOptionPane.ERROR_MESSAGE); 	

                    else
                    {
                            if ( ! Fonctions.isInteger(tabInfo[2]))
                            {
                                    JOptionPane.showMessageDialog(null, "Le pied de bain ne doit comporter que les chiffres", "Erreur de saisie", JOptionPane.ERROR_MESSAGE);
                            }
                            else
                            {
                           
                           

                   
                       //     DBAlliage DBAlliage = new DBAlliage();
                       //     idAlliage = DBAlliage.getIdAlliage(Integer.parseInt(tabInfo[4])); // On recupere l'id de l'alliage en fonction de la saisie
                     
                   

                    DBChargement DB = null;
                    int num = 0;

                    try 
                    {
                            DB = new DBChargement();
                    } 
                    catch (ClassNotFoundException e1) 
                    {
                            e1.printStackTrace();
                    } 
                    catch (SQLException e1) 
                    {
                            e1.printStackTrace();
                    }	

                    try 
                    {
                            num = DB.getNumeroDernierChargement();
                    } 
                    catch (SQLException e2) 
                    {
                            e2.printStackTrace();
                    }
                    Chargement chargementCreate = new Chargement( num+1 , typeFour, tabInfo[3], tabInfo[0], tabInfo[1], idAlliage , Integer.parseInt(tabInfo[2]) );

                    try 
                    {
                            DB.insertChargement(chargementCreate);
                    } 
                    catch (SQLException e1) 
                    {
                            e1.printStackTrace();
                    }

                    //remove(panelCentral);
                   
                          //  this.feuilleFour.afficherFenetrePrincipal ( chargementCreate );
                     
                  
            } 
                           
                    } 
                                    
                            }
                    
			
    }//GEN-LAST:event_bouton_creerchargementActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fenetre_principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fenetre_principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fenetre_principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fenetre_principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Fenetre_principale().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aide_menu;
    private javax.swing.JComboBox alliage_value;
    private javax.swing.JButton bouton_annuler;
    private javax.swing.JButton bouton_creerchargement;
    private javax.swing.JMenu fichier;
    private javax.swing.JMenu imprimer_menu;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JLabel label_alliage;
    private javax.swing.JLabel label_nom1;
    private javax.swing.JLabel label_nom2;
    private javax.swing.JLabel label_pdb;
    private javax.swing.JLabel label_relais;
    private javax.swing.JLabel label_typefour;
    private javax.swing.JMenuBar menu;
    private javax.swing.JTextField nom1_value;
    private javax.swing.JTextField nom2_value;
    private javax.swing.JPanel panel_identite;
    private javax.swing.JTextField pdb_value;
    private javax.swing.JMenu rechercher_menu;
    private javax.swing.JComboBox relais_value;
    private javax.swing.JComboBox typefour_value;
    // End of variables declaration//GEN-END:variables
}
