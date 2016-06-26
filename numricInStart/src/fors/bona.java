package fors;

import javax.swing.JOptionPane;

public class bona {
    
    
  public static void main(String[] args) {  
    int i, j, k;
    int n = 0;
    String soh="";
    n= Integer.parseInt(JOptionPane.showInputDialog("Enter the maximum number of *: " + n));
    for (i = 1; i <= n; i++)
    {
          for (j = 0; j < (n - i); j++)
              soh+=(" ");
          for (j = 1; j <= i; j++)
                  soh+=("*");
          for (k = 1; k < i; k++)
                  soh+=("*");
            soh+=("\n");
    }
 
    for (i = n - 1; i >= 1; i--)
    {
          for (j = 0; j < (n - i); j++)
                    soh+=(" ");
          for (j = 1; j <= i; j++)
                   soh+=("*");
          for (k = 1; k < i; k++)
                   soh+=("*");
            soh+=("\n");
    }
   
  
    soh+=("\n");
      JOptionPane.showMessageDialog(null,soh);
}
  
 

    
}