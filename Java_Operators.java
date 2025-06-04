public class Java_Operators {
    public static void main(String [] args){

        //ASSIGNMENT OPERATORS]

        //addition opertor 
        int x = 100 + 50 ;
        System.out.println(x);
        //subtraction operator 
        int y = 100 - 50 ;
        System.out.println(y);
        // multiplication operator 
        int z = 10 * 6 ;
        System.out.println(z);
        // division operator 
        int d = 50 / 10 ; 
        System.out.println(d);
        // modulus operator 
        int k = 10 % 3 ;
        System.out.println(k);
        //increment operator 
        int u = 7;
        u ++;
        System.out.println(u);
        //decrement operator 
        int i = 8; 
        System.out.println(i);
        i --;
        System.out.println(i);

        //ASSIGNMENT OPERATORS - assigning values to variables 
        //equals 
        int s = 10;
        System.out.println(s);
        //plus equals 
        s += 5 ; 
        System.out.println(s);
        //minus equal operator 
        s -= 5;
        System.out.println(s);
        // Other operators 
        int c = 5 ;
        int r = 10 ; 
        int g = 15 ; 
        System.out.println(c);
        System.out.println(r);
        System.out.println(g);
        c *= 3;
        r /= 2;
        z %= 2;
        System.out.println(c);
        System.out.println(r);
        System.out.println(g);
        
        //Comparison operators 
        //equals operator 
        int p = 5; 
        System.out.println(p == 5);
        
        // not equals operator 
        
        System.out.println(p != 5);

        System.out.println(10 > 5 );
        System.out.println(3 < 2 );

        //greater|less than or equal 
        System.out.println(5 >= 5);

        //LOGICAL OPERATORS 
        //AND operator 
        int v = 4;
        System.out.println(v < 5 && v < 10);
        //Or operator 
        System.out.println(v < 5 || v < 4);
        //not operator 
        System.out.println(!(v < 5 && v < 10));
    }
}
