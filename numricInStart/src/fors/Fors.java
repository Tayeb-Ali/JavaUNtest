package fors;
/*

Range of programs and my classes for a program of action figures come out in the following manner
12345
1234
123
12
1
====================
54321
4321
321
21
And form stars like this
*******
*****
***
**
*
=================
, And other formats


==================
مجموعة من البرامج والكلاسات  لعمل برنامج يخرج الارقام بالطريقة التالية
12345
1234
123
12
1
====================
54321
4321
321
21
و اشكال النجوم كالتالي 
*******
*****
***
**
*
=================
,وغيرها من الاشكال
 */
import static java.time.Clock.system;
import javax.swing.JOptionPane;

public class Fors {

   
    public static void main(String[] args) {
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
    
}
