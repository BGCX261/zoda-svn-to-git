/*
 * PeriodicFilter.java
 *
 * Created on 08.Tem.2009, 09:38:16
 */

package org.zoda.gui;

import java.text.ParseException;
import java.util.Date;
import java.text.DateFormat;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.zoda.dao.impl.PeriodicDao;
import org.zoda.dao.impl.PersonDao;
import org.zoda.dao.impl.PersonEmployeeDao;
import org.zoda.model.Periodic;
import org.zoda.model.Person;
import org.zoda.model.PersonEmployee;

/**
 *
 * @author Furkan KAMACI
 */
public class PeriodicFilter extends javax.swing.JFrame {

    /** Creates new form PeriodicFilter */
    public PeriodicFilter() {
        initComponents();
        initMyComponents();
    }

    private void initMyComponents(){

       tableHeaders = new Vector<String>();
       tableHeaders.add("Company");
       tableHeaders.add("Ad");
       tableHeaders.add("Soyad");
       tableHeaders.add("Telsic");
       tableHeaders.add("Periyodik Muayene");
       tableHeaders.add("Tarih");
        
        jTarihBas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dateFocusLost(evt);
            }
        });

        jCalendarButton1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dateOnlyPopupChanged(evt);
            }
        });

        jTarihSon.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dateFocusLost2(evt);
            }
        });

         jCalendarButton2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dateOnlyPopupChanged2(evt);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableTarih = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jTarihBas = new javax.swing.JTextField();
        jTarihSon = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jCalendarButton1 = new org.sourceforge.jcalendarbutton.JCalendarButton();
        jCalendarButton2 = new org.sourceforge.jcalendarbutton.JCalendarButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPFsicil = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSicil = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAdSoyad = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jAAdi = new javax.swing.JTextField();
        jASoyadi = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTcNo = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableTC = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableHerkes = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("BAÞLANGIÇ:");

        jTableTarih.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Company", "Ad", "Soyad", "Telsic", "Periyodik Muayenesi", "Tarih"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTableTarih);

        jLabel6.setText("BÝTÝÞ:");

        jButton4.setText("SORGULA");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jCalendarButton1.setText("SEÇ");
        jCalendarButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCalendarButton1ActionPerformed(evt);
            }
        });

        jCalendarButton2.setText("SEÇ");
        jCalendarButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCalendarButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTarihSon, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(jTarihBas, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCalendarButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCalendarButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTarihBas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCalendarButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTarihSon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jCalendarButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(jButton4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("TARÝH ARALIÐI", jPanel1);

        jLabel2.setText("SÝCÝL:");

        jButton1.setText("SORGULA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTableSicil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Company", "Ad", "Soyad", "Telsic", "Periyodik Muayenesi", "Tarih"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableSicil);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPFsicil, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jPFsicil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("SÝCÝL", jPanel2);

        jTableAdSoyad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Company", "Ad", "Soyad", "Telsic", "Periyodik Muayenesi", "Tarih"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableAdSoyad);

        jLabel3.setText("ADI:");

        jLabel4.setText("SOYADI:");

        jButton2.setText("SORGULA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jASoyadi)
                        .addComponent(jAAdi, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jAAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jASoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ADI SOYADI", jPanel3);

        jLabel5.setText("TC NO:");

        jButton3.setText("SORGULA");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTableTC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Company", "Ad", "Soyad", "Telsic", "Periyodik Muayenesi", "Tarih"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableTC);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jTcNo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3)
                        .addGap(33, 33, 33)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTcNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("TC NO", jPanel4);

        jTableHerkes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Company", "Ad", "Soyad", "Telsic", "Periyodik Muayenesi", "Tarih"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTableHerkes);

        jButton5.setText("LÝSTELE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(288, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("HERKESÝ LÝSTELE", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
       PersonEmployeeDao pd = new PersonEmployeeDao();
       List<PersonEmployee> list = pd.listByProperty(PersonEmployee.class,"telsic",Long.parseLong(jPFsicil.getText()));
       
       Vector tableData = new Vector();

        for (PersonEmployee pe: list) {

            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(pe.getCompany().getCompanyName());
            oneRow.add(pe.getPerson().getName());
            oneRow.add(pe.getPerson().getSurname());
            oneRow.add(pe.getTelsic());

             List<Periodic> lis = pe.getPerson().getPeriodic();
             for (Periodic per: lis) {
                  Vector<Object> Row = oneRow;
                  Row.add(per.isPM());
                  Row.add(per.getDatePeriodic());
                  //Every row is adding to tableData. One person may have many Periodic srutinies
                  tableData.add(Row);
             }
             
            jTableSicil.setModel(new javax.swing.table.DefaultTableModel(tableData, tableHeaders){
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        PersonDao pd = new PersonDao();
        List<Person> list=null;
        Vector tableData = new Vector();

        if( jAAdi.getText().trim().equals("") == false){
            if(jASoyadi.getText().trim().equals("") == false){
                // Check for name and surname
                list = pd.listByNameSurname(Person.class,"name","surname",jAAdi.getText(),jASoyadi.getText());
            }
            else{
               // Check for name
                list = pd.listByProperty(Person.class,"name", jAAdi.getText());
            }
        }
        else{
            if(jASoyadi.getText().trim().equals("") == false){
                // Check for surname
                list = pd.listByProperty(Person.class,"surname", jASoyadi.getText());
            }
            else{
                // Name and surname fields are empty!
                JOptionPane.showMessageDialog(rootPane, "Lütfen Ad veya Soyad Kýsmýný Doldorunuz!", "Sorgu Hatasý", JOptionPane.ERROR_MESSAGE);
            }
        }


       for(Person p:list){

       List<Periodic> lis = p.getPeriodic();

       List<PersonEmployee> li = p.getEmployees();
       for (PersonEmployee pm: li) {
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(pm.getCompany().getCompanyName());
            oneRow.add(pm.getPerson().getName());
            oneRow.add(pm.getPerson().getSurname());
            oneRow.add(pm.getTelsic());


       for (Periodic per: lis) {
           Vector<Object> Row = oneRow;
           Row.add(per.isPM());
           Row.add(per.getDatePeriodic());
           //Every row is adding to tableData. One person may have many Periodic srutinies
           tableData.add(Row);
        }
       }
      }

           jTableAdSoyad.setModel(new javax.swing.table.DefaultTableModel(tableData, tableHeaders){
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        PersonDao pd = new PersonDao();
        List<Person> list = pd.listByProperty(Person.class,"TCno",Long.parseLong(jTcNo.getText()));
        Vector tableData = new Vector();

       for(Person p:list){

        List<PersonEmployee> li = p.getEmployees();
        for (PersonEmployee pm: li) {
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(pm.getCompany().getCompanyName());
            oneRow.add(pm.getPerson().getName());
            oneRow.add(pm.getPerson().getSurname());
            oneRow.add(pm.getTelsic());

            List<Periodic> lis = p.getPeriodic();
            for (Periodic per: lis) {
                  Vector<Object> Row = oneRow;
                  Row.add(per.isPM());
                  Row.add(per.getDatePeriodic());
                  //Every row is adding to tableData. One person may have many Periodic srutinies
                  tableData.add(Row);
            }
        }
      }

            jTableTC.setModel(new javax.swing.table.DefaultTableModel(tableData, tableHeaders){
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCalendarButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCalendarButton1ActionPerformed

    }//GEN-LAST:event_jCalendarButton1ActionPerformed

    private void jCalendarButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCalendarButton2ActionPerformed

    }//GEN-LAST:event_jCalendarButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      
       PeriodicDao pd = new PeriodicDao();
       List<Periodic> list = null;
        try {
            list = pd.listByTwoDate(Periodic.class, "datePeriodic", dateFormat.parse(jTarihBas.getText()), dateFormat.parse(jTarihSon.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(PeriodicFilter.class.getName()).log(Level.SEVERE, null, ex);
        }

       Vector tableData = new Vector();
       //Check here!!
        for (Periodic peo: list) {
            Vector<Object> oneRow = new Vector<Object>();

            //Person'a ait PersonEmployee olur hep ama size 0 mý bak!
            List<PersonEmployee> pemp = peo.getPerson().getEmployees();
            int size = pemp.size();
            PersonEmployee pe = pemp.get(size-1);

            oneRow.add(pe.getCompany().getCompanyName());
            oneRow.add(peo.getPerson().getName());
            oneRow.add(peo.getPerson().getSurname());
            oneRow.add(pe.getTelsic());
            oneRow.add(peo.isPM());
            oneRow.add(peo.getDatePeriodic());

            tableData.add(oneRow);
        }

            jTableTC.setModel(new javax.swing.table.DefaultTableModel(tableData, tableHeaders){
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        
        PersonDao pd = new PersonDao();
        List<Person> list = pd.list(Person.class);
        Vector tableData = new Vector();

       for(Person p:list){

        List<PersonEmployee> li = p.getEmployees();
        for (PersonEmployee pm: li) {
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(pm.getCompany().getCompanyName());
            oneRow.add(pm.getPerson().getName());
            oneRow.add(pm.getPerson().getSurname());
            oneRow.add(pm.getTelsic());

            List<Periodic> lis = p.getPeriodic();
            for (Periodic per: lis) {
                  Vector<Object> Row = oneRow;
                  Row.add(per.isPM());
                  Row.add(per.getDatePeriodic());
                  //Every row is adding to tableData. One person may have many Periodic srutinies
                  tableData.add(Row);
            }
        }
      }
        jTableHerkes.setModel(new javax.swing.table.DefaultTableModel(tableData, tableHeaders){
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });

    }//GEN-LAST:event_jButton5ActionPerformed
    
    public void setDate(String dateString)
    {
		Date date = null;
		try	{
            if ((dateString != null) && (dateString.length() > 0))
                date = dateFormat.parse(dateString);
		} catch (Exception e)	{
            date = null;
		}
        this.setDate(date);
    }

    public void setDate(Date date)
    {
        String dateString = "";
        if (date != null)
    		dateString = dateFormat.format(date);
        jTarihBas.setText(dateString);
        jCalendarButton1.setTargetDate(date);
    }
    
    public void setDateSon(String dateString)
    {
		Date date = null;
		try	{
            if ((dateString != null) && (dateString.length() > 0))
                date = dateFormat.parse(dateString);
		} catch (Exception e)	{
            date = null;
		}
        this.setDateSon(date);
    }

    public void setDateSon(Date date)
    {
        String dateString = "";
        if (date != null)
    		dateString = dateFormat.format(date);
        jTarihSon.setText(dateString);
        jCalendarButton2.setTargetDate(date);
    }

        private void dateFocusLost(java.awt.event.FocusEvent evt) {
        String date = jTarihBas.getText();
        setDate(date);
    }

       private void dateFocusLost2(java.awt.event.FocusEvent evt) {
        String date = jTarihSon.getText();
        setDateSon(date);
    }

    private void dateOnlyPopupChanged(java.beans.PropertyChangeEvent evt) {
        if (evt.getNewValue() instanceof Date)
            setDate((Date)evt.getNewValue());
    }
    
    private void dateOnlyPopupChanged2(java.beans.PropertyChangeEvent evt) {
        if (evt.getNewValue() instanceof Date)
            setDateSon((Date)evt.getNewValue());
    }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PeriodicFilter().setVisible(true);
            }
        });
    }

public static DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);
private Vector<String> tableHeaders;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAAdi;
    private javax.swing.JTextField jASoyadi;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private org.sourceforge.jcalendarbutton.JCalendarButton jCalendarButton1;
    private org.sourceforge.jcalendarbutton.JCalendarButton jCalendarButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jPFsicil;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableAdSoyad;
    private javax.swing.JTable jTableHerkes;
    private javax.swing.JTable jTableSicil;
    private javax.swing.JTable jTableTC;
    private javax.swing.JTable jTableTarih;
    private javax.swing.JTextField jTarihBas;
    private javax.swing.JTextField jTarihSon;
    private javax.swing.JTextField jTcNo;
    // End of variables declaration//GEN-END:variables

}
