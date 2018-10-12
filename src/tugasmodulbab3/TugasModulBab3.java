/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasmodulbab3;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author windows10
 */
public class TugasModulBab3 {

    public static void Tugas1()
    {
        Scanner scan = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("Number 1 = ");
        n1 = scan.nextInt();
        System.out.print("Number 2 = ");
        n2 = scan.nextInt();
        System.out.print("Number 3 = ");
        n3 = scan.nextInt();
        System.out.println("Rata-Rata = "+ (n1+n2+n3)/(float)3);
    }
    
    public static void Tugas2()
    {
        String number1 = JOptionPane.showInputDialog("Masukkan Number 1 : ");
        String number2 = JOptionPane.showInputDialog("Masukkan Number 2 : ");
        String number3 = JOptionPane.showInputDialog("Masukkan Number 3 : ");
                
        int n1 = Integer.parseInt(number1);
        int n2 = Integer.parseInt(number2);
        int n3 = Integer.parseInt(number3);
        
        String msg = "Number 1 = "+ n1+"\nNumber 2 = "+ n2+"\nNumber 3 = "+ n3 +"\nRata-Rata = "+ (n1+n2+n3)/(float)3;
        JOptionPane.showMessageDialog(null, msg);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TugasModulBab3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(TugasModulBab3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TugasModulBab3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TugasModulBab3.class.getName()).log(Level.SEVERE, null, ex);
        }
               
        Tugas1();
        Tugas2();
    }
    
}
