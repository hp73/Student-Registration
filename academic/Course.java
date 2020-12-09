package academic;

/*
 * This is a Course class that generates a course for Students to be enrolled in
 * @author Harry Pinkerton
 * @version 1.0
*/

import java.util.Arrays;

public class Course {                         
   
   //Class Variables
   
   public static final int DEFAULT_CAPACITY = 25;
   public static final String DEFAULT_COURSE = "";
   
   //Instance Variables
   
   private String coursename;
   private Student[] students;
   private int enrolled;
   
   /*
    * Constructor used to create a course given its name
    * @param coursename - String that represents the name of the course
    * 
    */
   
   public Course(String coursename){
      this.coursename = coursename;
      this.students = new Student[DEFAULT_CAPACITY];
      for(Student s : students){
         s = null;
      }
   }
   
   /**
   *Getter that returns the name of the course
   *@return a string representing the name of the course
   */

  public String getcourse(){
      return coursename;
  }
  
  /**
   *Getter that returns the student object
   *@return a string representing the student object
   */
  
  /**public String getstudent(String name){
    int check = 0;
    for (int i = 0; i < students.length; i ++){
      if(students[i].getname() == name){
        check = 1;
        return students[i];
      }  
    }
    if (check == 0){
      throw new IllegalArgumentException("This student isn't taking this course");
    }
    return null;
  }*/
  
  // Setters
  public void setcoursename(String name){
     this.coursename = name;
  }
  
   /**
   *Adds a student to the course
   *@param student - student object to be added to the class
   */
   
   public void addstudent(Student student){
    if (enrolled + 1 > DEFAULT_CAPACITY){
      throw new IllegalArgumentException("No more spots in course");
    }
    
    for (int i = 0; i < students.length; i ++){
      if(!(students[i] instanceof Student)){
        students[i] = student;
        enrolled +=1;
        break;
      }
    }
  }
   
   
   
   public int coursehighscore(){
    int max = 0;
    
    for(int i = 0; i <students.length; i ++){
      if (students[i] != null){
          if (students [i].highscore() > max){
            max = students[i].highscore();
      }
      }
    }
    return max;
  }
   
   
   public String toString() {
      String str = "";
      str += "Name: " + coursename + "\n";
      str += "Students:" + "\n";
      
      for(int i = 0; i < students.length; i++){
        str += students[i] + "\n";
      }
      
      return str;
   } 
      
}