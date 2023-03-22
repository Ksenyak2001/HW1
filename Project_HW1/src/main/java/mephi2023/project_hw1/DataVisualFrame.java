/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mephi2023.project_hw1;


import mephi2023.project_hw1.reading.ReadingName;
import mephi2023.project_hw1.reading.ReadingTitle;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import mephi2023.project_hw1.books.Bookable;
import mephi2023.project_hw1.humans.Person;
import mephi2023.project_hw1.humans.student.Student;
import mephi2023.project_hw1.humans.teacher.Teacher;

/**
 *
 * @author Kseny
 */
public class DataVisualFrame extends javax.swing.JFrame {

    /**
     * Creates new form DataVisualFrame
     */
    private ReadingTitle rt;
    private ReadingName rn;
    private DataManipulation dm;

    
    public DataVisualFrame() {
        super("���������");
        initComponents();
        
        setSize(600, 400);
        
        String ROOT = "����������";
        ArrayList<String> nodes = new ArrayList<>();
        nodes.add("�������������");
        nodes.add("��������");
        
        // �������� ����������� ���������
	DefaultMutableTreeNode root = new DefaultMutableTreeNode(ROOT);
        DefaultMutableTreeNode teachers = new DefaultMutableTreeNode(nodes.get(0));
	DefaultMutableTreeNode students = new DefaultMutableTreeNode(nodes.get(1));
        // ���������� ������ � �������� ������
	root.add(teachers);
	root.add(students);
        
        DefaultTreeModel treeModel1 = (DefaultTreeModel)jTree1.getModel();
        treeModel1.setRoot(root);
	jTree1.setModel(treeModel1);
        
        //jTree1.setVisible(rootPaneCheckingEnabled);
        //jTree1.setVisible(false);
        
        try {   
        rt = new ReadingTitle("D:\\Users\\Kseny\\OneDrive\\���������\\NetBeansProjects\\Project_HW1\\src\\main\\java\\mephi2023\\project_hw1\\DataHW1.xlsx");
        rn = new ReadingName("D:\\Users\\Kseny\\OneDrive\\���������\\NetBeansProjects\\Project_HW1\\src\\main\\java\\mephi2023\\project_hw1\\DataHW1.xlsx");
        dm = new DataManipulation();
        } catch (IOException ex){
            System.out.println("���� �� �����������");
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

        jPanel1 = new javax.swing.JPanel();
        jButtonLibrary = new javax.swing.JButton();
        jButtonVisitors = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButtonData = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 232, 209));

        jButtonLibrary.setBackground(new java.awt.Color(255, 204, 102));
        jButtonLibrary.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonLibrary.setText("���������� ����������");
        jButtonLibrary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLibraryActionPerformed(evt);
            }
        });

        jButtonVisitors.setBackground(new java.awt.Color(255, 204, 102));
        jButtonVisitors.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonVisitors.setText("��������� �����������");
        jButtonVisitors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisitorsActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(252, 232, 209));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButtonData.setBackground(new java.awt.Color(255, 204, 102));
        jButtonData.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonData.setText("������� ������");
        jButtonData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDataActionPerformed(evt);
            }
        });

        jButtonExit.setBackground(new java.awt.Color(255, 204, 102));
        jButtonExit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonExit.setText("������� ����������");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jTree1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButtonLibrary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonVisitors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1)))
                        .addComponent(jButtonData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonLibrary)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonVisitors)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                        .addComponent(jButtonData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonExit)))
                .addContainerGap())
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

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        // TODO add your handling code here:
        dispose();
        //System.exit(1);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDataActionPerformed
        // TODO add your handling code here:
        //DefaultMutableTreeNode main = new DefaultMutableTreeNode();
        //ArrayList<Person> Visitors = dm.getVisitors();
        /*for (Person p : Visitors){
            main.add(p.getNode());
        }*/
        //jTree1.setModel(new DefaultTreeModel(main));
        if (dm.getSizeVisitors() > 0){
            DrawTreeModel();
            this.jTextField1.setText("������ ������");
        } else {
            this.jTextField1.setText("��� ��� �����������");
        }
    }//GEN-LAST:event_jButtonDataActionPerformed

    private void jButtonVisitorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisitorsActionPerformed
        // TODO add your handling code here:
        if (dm.getSizeLibrary() > 0){
            dm.generateHumanData();
            dm.giveBookPerson();
            this.jTextField1.setText("������� ����������");
        } else {
            this.jTextField1.setText("��� ��� ����������");
        }

    }//GEN-LAST:event_jButtonVisitorsActionPerformed

    private void jButtonLibraryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLibraryActionPerformed
        // TODO add your handling code here:
        dm.generateBookData();
        this.jTextField1.setText("������� ����������");
    }//GEN-LAST:event_jButtonLibraryActionPerformed

    
    public void DrawTreeModel() {       
        final String ROOT = "����������";
        ArrayList<String> nodes = new ArrayList<>();
        nodes.add("�������������");
        nodes.add("��������");
        ArrayList<ArrayList<String>> leafs = new ArrayList<>();
        leafs.add(new ArrayList<>());
        leafs.add(new ArrayList<>());
        
        ArrayList<Person> Visitors = dm.getVisitors();
        ArrayList<ArrayList<String>> leafs_teachers = new ArrayList<>();
        int count_teacher = 0;
        ArrayList<ArrayList<String>> leafs_students = new ArrayList<>();
        int count_student = 0;
        for (Person p : Visitors){
            System.out.println(count_teacher+count_student);
            if (p.getType() instanceof Teacher){
                leafs.get(0).add(p.getName());
                leafs_teachers.add(new ArrayList<>());
                for (Bookable b : p.getBookList()){                    
                    leafs_teachers.get(count_teacher).add(b.getTitle());
                }
                count_teacher += 1;
            } else {
                leafs.get(1).add(p.getName());
                leafs_students.add(new ArrayList<>());
                for (Bookable b : p.getBookList()){
                    leafs_students.get(count_student).add(b.getTitle());
                }
                count_student += 1;
            }            
        }
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	// �������� ����������� ���������
	DefaultMutableTreeNode root = new DefaultMutableTreeNode(ROOT);
	// ����� ������� ������
	DefaultMutableTreeNode teachers = new DefaultMutableTreeNode(nodes.get(0));
	DefaultMutableTreeNode students = new DefaultMutableTreeNode(nodes.get(1));
	// ���������� ������ � �������� ������
	root.add(teachers);
	root.add(students);
	// ���������� � �������� ������ ����� �����
	//root.add(new DefaultMutableTreeNode("������", true));
	// ���������� �������
	/*for ( int i = 0; i < leafs.get(0).size(); i++) 
	    teachers.add(new DefaultMutableTreeNode(leafs.get(0).get(i), false));
	for ( int i = 0; i < leafs.get(1).size(); i++)
            students.add(new DefaultMutableTreeNode(leafs.get(1).get(i), false));
        */
        
	// ����� ������� ������   
        
        for (int j = 0; j < leafs.get(0).size(); ++j){
            DefaultMutableTreeNode teacher_j = new DefaultMutableTreeNode(leafs.get(0).get(j));
            teachers.add(teacher_j);
            for ( int h = 0; h < leafs_teachers.get(j).size(); h++){
                teacher_j.add(new DefaultMutableTreeNode(leafs_teachers.get(j).get(h), false));
            } 
        }
        for (int j = 0; j < leafs.get(1).size(); ++j){
            DefaultMutableTreeNode student_j = new DefaultMutableTreeNode(leafs.get(1).get(j));
            students.add(student_j);
            for ( int h = 0; h < leafs_students.get(j).size(); h++){
                student_j.add(new DefaultMutableTreeNode(leafs_students.get(j).get(h), false));
            } 
        }
        
	
	
	// �������� ����������� ������ � ������
	DefaultTreeModel treeModel1 = new DefaultTreeModel(root, true);
	//jTree1 = new JTree(treeModel1);
        jTree1.setModel(treeModel1);
	// �������� ������ ������, ������� � drink
	/*DefaultTreeModel treeModel2 = new DefaultTreeModel(teachers);
	JTree tree2 = new JTree(treeModel2);*/
	// ���������� �������� � ����������
	//JDialog contents = new JDialog();
	//contents.add(new JScrollPane(tree1));
	//contents.add(new JScrollPane(tree2));
	//setContentPane(contents);
	// ��������� ����
	//setSize(400, 300);
	//setVisible(true);
        //jTree1.setVisible(true);
        //jTree1.updateUI();
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
            java.util.logging.Logger.getLogger(DataVisualFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataVisualFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataVisualFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataVisualFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataVisualFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonData;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonLibrary;
    private javax.swing.JButton jButtonVisitors;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
