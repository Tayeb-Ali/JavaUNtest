
package  sci520161;
import javax.swing.*;
public class CashRegisterTester
 {
    int av;
    public static void main(String[] args)
    {
int as , ss, dd;

        CashRegister register = new CashRegister();

       register.recordPurchase(0.75);
       register.recordPurchase(1.50);
       register.enterPayment(2, 0, 5, 0, 0);
       System.out.print("Change=");
       System.out.println(register.giveChange());

       register.recordPurchase(2.25);
       register.recordPurchase(19.25);
       register.enterPayment(23, 2, 0, 0, 0);
       System.out.print("Change=");
       System.out.println(register.giveChange());
    }
 }
