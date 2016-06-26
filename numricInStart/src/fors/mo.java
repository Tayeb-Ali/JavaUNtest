package fors;

import javax.swing.JOptionPane;

public class mo {
     public static void main(String[] args) {
          int number1 = Integer.parseInt(JOptionPane.showInputDialog("3 or 5 ??" ));
               switch(number1) {
                   case 3:{
      String dis= "";
        int x ,y;
        for(x=1;x<=3;x++){
        for(y=1;y<=x;y++){
          dis+="\t * \t";
            
        }
    dis+="\n";
        }
            JOptionPane.showMessageDialog(null,dis);
        break;
        
    }
                   //end case 1
                   case 5:{
                       
                      String dis= "";
        int x ,y;
        for(x=1;x<=5;x++){
        for(y=1;y<=x;y++){
          dis+="\t * \t";
            
        }
    dis+="\n";
        }
            JOptionPane.showMessageDialog(null,dis);
        
         
                       
                   }}
     }}
