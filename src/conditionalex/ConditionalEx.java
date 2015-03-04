/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalex;

import javax.swing.JOptionPane;

/**
 *
 * @author class
 */
public class ConditionalEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int y = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the value of y: "));
        int x = 5;
        if (y == 20) {
            x = 0;
        }
        JOptionPane.showMessageDialog(null, " x = " + x);

    }

}
