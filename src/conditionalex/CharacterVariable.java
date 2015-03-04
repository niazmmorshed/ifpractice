/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conditionalex;

import java.util.Scanner;

/**
 *
 * @author class
 */
public class CharacterVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Please enter a character: ");
        
        char aCharacterVariable = scanner.next().charAt(0);
        
        System.out.println("You enterd: " + aCharacterVariable);
        
        if (aCharacterVariable < 'Z'){
            System.out.println(aCharacterVariable + "is less that z");
        }
    }
}
