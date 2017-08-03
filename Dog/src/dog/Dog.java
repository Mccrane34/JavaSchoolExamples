/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dog;

/**
 *
 * @author Michael Crane
 */
public class Dog {
    public void bark() {
        System.out.print("woof");
    }
    class Hound extends Dog {
        public void sniff() {
            System.out.print("sniff");
        }
        public void bark() {
            System.out.print("howl ");
        }
    }
    public class Dogshow {
      public static void main(String[] args) {
      new DogShow().go();
    } 
      void go() {
          new Hound().bark();
          ((Dog) new Hound().bark();
          ((Dog) new Hound().sniff()));
      }
    }
   


