package academic;

/*
 * This is a Student class for generating students in a class.
 * @author Harry Pinkerton
 * @version 1.0
*/

import java.util.Arrays;

public class Student {                         
   
   // Class variables
   public static final int DEFAULT_NUMSCORES = 3;
   public static final String DEFAULT_NAME = "";
   
   //Instance Variables
   private String name;
   private int[] scores;
   private double avg; 
   
   /**
    * Constructor to create a student given a name and number of scores
    * @param name - String representing a student's name
    * @param scores - An array of ints that hold the students' scores
    *
    */
    public Student(String name, int numscores){
       scores = new int[numscores];
       this.name = name;
   }
   
   public Student(String name){
      this(name, DEFAULT_NUMSCORES);
   }
   
   public Student(){
      this(DEFAULT_NAME, DEFAULT_NUMSCORES);
   }
  
  /**
   *Getter that returns the name of the student
   *@return a string representing the name of the student
   */

  public String getname(){
      return name;
  }
  
  /**
   *Getter that returns a single score of the student
   *@param position - the index position of the desired score in the array
   *@return an int representing one of the scores of the student
   */

  public int getscore(int position){
      return scores[position];
  }
  
  
  /**
   *Setter that creates a value for a student given an index position
   *@param value - the value of the score to give to the student
   *@param position - the index position in the array to place the score
   *@ThrowsIllegalArguementException if the score is less than 0.
   */

  public void setscore(int value, int position){
      if (value < 0 ){
         throw new IllegalArgumentException("Value must be" +
                                             " a positive" +
                                             " number");
      }
      scores[position] = value;
  }
  
  /**
   * Returns the number of scores in the array for a given student
   * @return an int representing the number of scores a student has recieved
   */
  
  public int numscores(){
      int counter = 0;
      for(int i = 0; i < scores.length; i ++){
         counter += 1;
      }
      return counter;
  }
  /**
   *Returns the average score for all of the scores a student has
   *@return a double representing the average of all of the student's scores in the array
   */
  
  public double Average(){
      double sum = 0;
      double counter = 0;
      for (int i = 0; i < scores.length; i++){
         sum +=  scores[i];
         counter += 1;
      }
      double avg = sum / counter;   
      return avg;
  }
  
  /**
   *Returns the highest score a student has recieved
   *@return an int that represents the greatest value present in the scores array
   */
  
  public int highscore(){
      int high = scores[0];
      int next; 
      for (int i = 1; i < scores.length; i++){
         if (scores[i] > high){
            high = scores[i]; 
         }
      }
      return high;
  }
  
  /**
   *Compares two students and determines if they are the same person
   *@param other - the object to compare the student to
   *@return a boolean value true if the students are the same object or false if they
   *are different objects
   */
  
  public boolean equals(Object other) {
   if (this == other) {
      return true;
   } else if (! (other instanceof Student)) {
      return false;
   } else {
      Student s = (Student) other;
      return (this.name == s.name && this.scores.equals(s.scores));
   }
  }
   
   /**
    *Displays all of the information for student in string format
    *@returns a string representation of the student object
    */
   
   public String toString() {
      String str = "";
      str += "Name: " + name + "\n";
      str += "Scores:" + "\n";
      for (int i = 0; i < scores.length; i++)
      {
         str+= this.getscore(i) + "\n";
      }
      str += "Average: " + this.Average() + "\n";
   
      return str;
   }
   
   /**
    *Compares two students' averages and returns a value representing which student
    *had a higher average
    *@param other - the object to compare the student to
    *@return an int value -1 if this is less than other, 0 if this is equal to
    *other, and 1 if this is greater than other.
    */
   
   public int compareTo(Student other) {    
      double diff = this.Average() - other.Average();
    
      if (diff == 0.0) {
        return 0;
      } else if (diff < 0.0) {
        return -1;
      } else {
        return 1;
      }      
   }

  
}

   
   
   
   
   
   
   
   
