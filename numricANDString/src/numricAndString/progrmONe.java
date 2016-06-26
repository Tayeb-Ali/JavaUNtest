package numricAndString;
import static java.awt.SystemColor.text;
import java.util.Scanner;
import javax.swing.*;

public class progrmONe {
    /*
    ما هذا البرنامج ..؟
هو مجموعة من البرامج  تقوم بعمليات علي مستوي الاعداد  و الSTring
الحالة الأول برنامج يقوم بعمليات حسابية 
والحالة الثانية يقوم بعمليات علي الحروف والكلمات
اسم المستخدم وكلمة المرور
admin
123
    
    ///
    what is this program ..?
Is a collection of programs conducting operations at the level of preparation and the STring
The first state program based calculations
The second case carries out the letters and words
The user name and password
admin
123*/
    
    public static void main(String[] args) {
    
       int number1;
       int number2;
       int number3;
       int number4,cont=1;
       int fac=1;
       String input;
       JTextField username = new JTextField();
       JTextField password = new JTextField();
       Object[] message ={
         "Username:",username,
         "Password:",password
       };

       int login = JOptionPane.showConfirmDialog(null,message,"Login",JOptionPane.OK_CANCEL_OPTION);
       if (login == JOptionPane.OK_OPTION){
           if (username.getText().equals("admin") && password.getText().equals("123")) {
               number1 = Integer.parseInt(JOptionPane.showInputDialog("Menu\n "
                       + "1.Numeric\n"
                       + "2.String\n"
                       + "3.Quit"));
               switch(number1) {
                   case 1:{
                                
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
                       break;}
                  //case  String
                   case 2:
                        do
        {
                       number4=Integer.parseInt(JOptionPane.showInputDialog("Menu\n"
                               + "1.ToUpper\n"
                               + "2.ToLower\n"
                               + "3.Trim\n"
                               + "4.Reverse String\n"
                               + "5.Index\n"
                               + "6.Substring\n"
                               + "7.Equals\n"
                               + "8.Vertical Reverse String\n"
                               + "9. Compare to\n"
                               + "10.Quit"));
                       switch(number4) {
                           case 1:{
                               String name;
                               String name2;
                               name=JOptionPane.showInputDialog("Enter a text: ");
                               name2 = name.toUpperCase();
                               JOptionPane.showMessageDialog(null,"your convertewd text "+name2);
                               break;}
                           case 2:{
                   String name = "" , name2; 
                           name=JOptionPane.showInputDialog("Enter a text: ");
                           name2= name.toLowerCase();
                           JOptionPane.showMessageDialog(null,"your convertewd text "+name2);
                               break;    
                           }
                           case 3:{
                           String name = "" , name2;
                               
                                       name=JOptionPane.showInputDialog("Enter a text: ");
                           name2= name.trim();
                           JOptionPane.showMessageDialog(null,"your convertewd text "+name2);
                               break; 
                           }
                           
                           case 4:{
                           String txt="";
                           txt=JOptionPane.showInputDialog("Enter a text: ");
      String reverse = new StringBuffer(txt).
      reverse().toString();
            JOptionPane.showMessageDialog(null,"\nString before reverse: "+txt);
              JOptionPane.showMessageDialog(null,"String after reverse:"+reverse);
              break;
                           }
                           case 5:{
                               
                               String line = "";

	String a =JOptionPane.showInputDialog("Enter txt : ");
	String sho =JOptionPane.showInputDialog("Enter letar: ");
	
      JOptionPane.showMessageDialog(null,sho + " = " + a.indexOf(sho) );

                     
    break;}
                           case 6:{
                                String Str = "";
                  
                              Str=  JOptionPane.showInputDialog("Enter the txt You must be at least 8 characters" + Str);

      JOptionPane.showMessageDialog(null,"Return Value :" );
      JOptionPane.showMessageDialog(null,Str.substring(2) );

     JOptionPane.showMessageDialog(null,"Return Value :" );
     JOptionPane.showMessageDialog(null,Str.substring(4, 6) );
      break;
                           }
                           case 7:
                           {
                              String Str1 ="";
      String Str2 = Str1;
      String Str3 ="";
      JOptionPane.showInputDialog("Enter the txt number one " + Str1);
      JOptionPane.showInputDialog("Enter the txt number two " + Str3);
      boolean retVal1 = false ,retVal2 = false;

     if(Str1==Str3){
         JOptionPane.showMessageDialog(null,"your retVal is true");
     }
     else{
     JOptionPane.showMessageDialog(null,"your retVal is fuls" );
     }
     break;
                           }
                           case 8:{
                           
                           String display="";
             String vr = JOptionPane.showInputDialog("Enter the Text:\n");
                for (int xy = vr.length() - 1; xy >= 0 ; --xy){
                    //new StringBuilder(vr).reverse();
                    display+=vr.charAt(xy)+"\n";
                }
                     JOptionPane.showMessageDialog(null, "The Vertical Reverse is: "+display);
                 
                          break; 
                           }
                           
                           case 9:
                           {
                           
           
           
                 String comp = JOptionPane.showInputDialog("Enter First text to Compare:\n");
                String comp2 = JOptionPane.showInputDialog("Enter Second text to Compare:\n");
                int compInt = comp.compareToIgnoreCase(comp2);
                if (compInt == 0){
                    JOptionPane.showMessageDialog(null, "First word  Equals the to second  \n");
                }
                else if (compInt < 0){
                    JOptionPane.showMessageDialog(null, "First word appears Before the second   \n");
                }
                else if (compInt > 0){
                    JOptionPane.showMessageDialog(null, "First word appears after the second   \n");
                }
                
               
 
         
            
            break;
            
                           }
                           
                       }
                        
                
               } 
                        
                        while (cont==1);
                         break; 
                   case 8:{
                   
                   }
                
                   case 9:
            System.exit(0);
                      

	    }
                        
           }
 else {
               JOptionPane.showMessageDialog(null,"Wrong password!");
 }
       }

    }

    private static void toLowerCase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

    
    

