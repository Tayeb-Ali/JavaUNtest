package fors;

import javax.swing.JOptionPane;

public class basp {
    public static void main(String[] args) {
        int number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter The Base" ));
               switch(number1) {
                   case 1:{
     String disp= "";
        int x ,y;
        for(x=1;x<=4;x++){
        for(y=1;y<=4;y++){
          disp+=" \t*\t ";
            
        }
    disp+="\n";
        }
            JOptionPane.showMessageDialog(null,disp);
            break;
                   }
                   case 2:{
                       
                  String disp= "";
        int x ,y;
         
        for(x=1;x<=2;x++){
        for(y=1;y<=2;y++){
         
          disp+=" * ";  
        }
    disp+="\n";
        }
            JOptionPane.showMessageDialog(null,disp);
            break;
                   } 
                   //end case 2
                   case 3:{
                   
                         String disp= "";
        int x ,y;
        for(x=1;x<=3;x++){
        for(y=1;y<=3;y++){
          disp+=" \t * \t ";
            
        }
    disp+="\n";
        }
            JOptionPane.showMessageDialog(null,disp);
        
        
                   }
                     //end case 3  
                   case 4:{ 
                      
     String disp= "";
        int x ,y;
        for(x=1;x<=4;x++){
        for(y=1;y<=4;y++){
          disp+=" \t*\t ";
            
        }
    disp+="\n";
        }
            JOptionPane.showMessageDialog(null,disp);
            break;
                   }
               }
               }
               
    
    }
    
    

