public class JavaTypecasting {
    public static void main(String[] args){
     //type casting refers to converting one data type to another 

     //Widening casting 

     int myInt = 9;
     double myDouble = myInt;
    
     //Automatic casting ; int to double 
     System.out.println(myInt);
     System.out.println(myDouble);

     //Narrowing Casting
     double Double1 = 9.78;
     int Int1 = (int) Double1 ;
     //Manual casting : Double to Int 

     System.out.println(Double1);
     System.out.println(Int1);

     //Set the maximum score to 500 
     int MaxScore = 500;

     // The actual score of the user 
     int Userscore = 423;

     /*Calculte the percentage of score 
      Convert userscore to float 
      */

      float percentage = 
      (float) Userscore / MaxScore * 100.0f;

      //print the result 
      System.out.println("User percentage is " + percentage);

    }
}

