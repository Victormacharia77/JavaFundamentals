public class Java_if_statements {
    
    public static void main(String[] args){
//if statement = performs a lock of code if its condition evaluates to be true 
int age = 75;
if (age>=75) {
       System.out.println("ok Boomer");
}
else if(age>=18) { 
    System.out.println("You are an adult");

}
else if (age>=13){
    System.out.println("You are a teenager");
}
else{
    System.out.println("You are not an adult!");
}

//REAL lIFE EXAMPLE
int doorcode = 1357;
if (doorcode == 1337){
    System.out.println("Correct code.the door is now opened");
} else {
    System.out.println("Wrong code.The door remains closed");
}






    }
}
