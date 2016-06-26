package fors;

import javax.swing.JOptionPane;

public class baseNumber {
    public static void main(String[] args) {
      String menu="";
        int men,again;
        do
        {
        men= Integer.parseInt(JOptionPane.showInputDialog
        (       "Chose a number from the list\n"+menu+
                "Enter\n"+
                "1- for Even/Odd Choice\n"+menu+
                "2- for Factorial Choice\n"+menu+
                "3- for Sum of Factorial Choice\n"+menu+
                "4- for Prime/Composite Choice\n"+menu+
                "5- to Quit\n"+menu));
        
    switch (men)
    {
        case 1:
        {
            
           
            int resulteven= Integer.parseInt(JOptionPane.showInputDialog("Enter number"));
            
            if(resulteven%2==0)
                JOptionPane.showMessageDialog(null,"The number is even");
            else 
                JOptionPane.showMessageDialog(null,"The Factorial is odd");
        break;
        }
        
        case 2:
        {
        int number, fact=1;
        number= Integer.parseInt(JOptionPane.showInputDialog("Enter number"));
        for (int x=number;x>=1;x--){
        fact = x * fact;
        }
        JOptionPane.showMessageDialog(null,"The Factorial is "+fact);
        break;
        }
        
        case(3):
        {
            int fact ,number = 0;
                int sum=0;
             number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number:"));
                for (int i=1;i<=number;i++){
                    fact=1;
                    for (int j=1;j<=i;j++){
                        fact=fact*j;
                    }
                    sum = sum+fact;
                }
                JOptionPane.showMessageDialog(null,"Your fact sum:"+sum);
                break;
        }
      case 4: 
             String ans="",pri="";
int n=1,k=2,m=2;
        int number5 = Integer.parseInt(JOptionPane.showInputDialog("ENTER Number :"));
        if (number5==5){JOptionPane.showMessageDialog(null,"prime") ;}
        else{
        
for(k=2,m=2;k<number5;k++)
{
    for(k=2,m=2;k<number5;k++)
    {

    }
    if(k%2 ==0)
    {
       JOptionPane.showMessageDialog(null,"prime") ;
    }
 else
    {
        JOptionPane.showMessageDialog(null,"composite");
 }
}}
                break;

        default:
            System.exit(0);
    }
    again=Integer.parseInt(JOptionPane.showInputDialog("Enter 1 to continue"));
        } while (again==1);
                       break;
    }
}

        
