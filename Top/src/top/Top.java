/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package top;

import static java.time.Clock.system;

/**
 *
 * @author Michael Crane
 */
 class Top {

    public Top(String s){  
        System.out.print("D");

    }
    public class Bottom2 extends Top {
         public Botttom2(String s) {
         System.out.print("D");
        }
    }
        public static void main(String[] args) {
        new Bottom2("C");
        System.out.print("");
    }
    
}
