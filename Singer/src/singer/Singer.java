/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singer;

/**
 *
 * @author Michael Crane
 */
public class Singer {
    public static String sing() {
        return "la";
    }
    
    public class Tenor extends Singer {
        public static String sing() {
            return "fa";
        }
    }
    public static void main(String[] args) {
        Tenor t = new Tenor();
        Singer s = new Tenor();
        System.out.print(t.sing() + "" + s.sing());
    }
    
}
