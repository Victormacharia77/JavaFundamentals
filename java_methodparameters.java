public class java_methodparameters {
    public static void main(String[] args){
sayHi();
add(7, 9);
//method declaration;parameters

    }

    public static void sayHi() {
        System.out.println("hi");
    }

    public static  int add(int x, int y ) { 
       return x + y; //method call;arguments
    }
}