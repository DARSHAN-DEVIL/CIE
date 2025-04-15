

public class greet {
    double add (int a, int b ){
        return a+b;

    }
    double sub(int a, int b ){
        return a-b;
        
    }
    double mul(int a, int b ){
        return a*b;
        
    }
    double div(int a, int b ){
        if (b==0){
            System.out.println("denominator cannot be 0");
            return -1 ;

        }
        
        return a/b;
        
    }
    double mod(int a, int b ){
        if (a==0){
            System.out.println("numerator cannot be 0");
            return -1 ;

        }
        
        return a%b;
    }
}