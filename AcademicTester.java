/*
 * This is a Tester for the methods in Student.java and Course.java
 * @author Harry Pinkerton
 * @version 1.0
*/

import java.util.Arrays;
import academic.*;

public class AcademicTester {
   
   public static void main (String [] args){
      
      Student student1 = new Student("James", 4);
      Student student2 = new Student("Joe", 4);
      
      student1.setscore(69,0);
      student1.setscore(69,1);
      student1.setscore(68,2);
      
      student2.setscore(66,0);
      student2.setscore(77,1);
      student2.setscore(88,2);
      student2.setscore(99,3);
      
      System.out.println(student1);
      System.out.println(student2);
      
      
      System.out.println("Gets name from student2: " + student2.getname());
      
      System.out.println("Highest score for student2: " +
                         + student2.highscore());
      
      System.out.println("Score at position 2 for student1: " +
                         student1.getscore(2));
      
      System.out.println("Number of scores for student2: " +
                         student2.numscores());
      
      System.out.println("Returns False for student1 = student2: " +
                         student1.equals(student2));
      
      System.out.println("Returns True for student1 = student1: " +
                         student1.equals(student1));
      
      System.out.println("Compares student1 to student2's Average: " +
                         student1.compareTo(student2) + "\n");
      
      
      Course course1 = new Course("Computer Science");
      Course course2 = new Course("Mathematics");
      course1.addstudent(student1);
      course2.addstudent(student2);
      System.out.println("Gets name of course2: " + course2.getcourse() + "\n");
      
      
      System.out.println(course1);
      System.out.println(course2);

      
      
   }
}