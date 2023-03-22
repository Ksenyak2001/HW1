/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mephi2023.project_hw1;



/**
 *
 * @author Kseny
 */
public class Project_HW1 {

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataVisualFrame().setVisible(true);
            }
        });
    }
  
    
    /*
    public static void main(String[] args) throws IOException {
        GenerateTitle gt = new GenerateTitle("D:\\Users\\Kseny\\OneDrive\\Документы\\NetBeansProjects\\Project_HW1\\src\\main\\java\\mephi2023\\project_hw1\\DataHW1.xlsx");
        GenerateName gn = new GenerateName("D:\\Users\\Kseny\\OneDrive\\Документы\\NetBeansProjects\\Project_HW1\\src\\main\\java\\mephi2023\\project_hw1\\DataHW1.xlsx");
        
        DataManipulation dm = new DataManipulation();
        dm.generateBookData();
        System.out.println("***");
        dm.generateHumanData();
        System.out.println("***");
        dm.giveBookPerson();
        //dm.printHumanData();
        //System.setProperty("log4j.configurationFile","./path_to_the_log4j2_config_file/log4j2.xml");
        
        //DataManipulation.readFromExcel("DataHW1.xlsx","names");
                
        /*for (int i = 0; i < 50; ++i){
            gn.generateRandomName();
        }
        for (int i = 0; i < 100; ++i){
            gt.generateRandomRussianTextBook();
        }
        for (int i = 0; i < 100; ++i){
            gt.generateRandomEnglishTextBook();
        }
        ArrayList<String> list=new ArrayList<>();
        for (int i = 0; i < 100; ++i){
            gt.generateRandomRussianFiction(list);
        }
        Set<String> set=new LinkedHashSet<>(list);
        System.out.println(set.size());
    }  */
}
