import java.util.Scanner;
public class calculator {
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
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Menu\n 1.Addition\n 2.Substraction \n 3.Multiplication \n4.Division \n 5.Modulus");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        calculator c = new calculator();
        double result=0;
        switch(choice){
            case 1 :
                    result=c.add( a , b );
                    break ;
            case 2 :
                    result=c.sub( a , b );
                    break ;       
            case 3 :
                    result=c.mul( a , b );
                    break ;
            case 4 :
                    result=c.div( a , b );
                    break ;
            case 5 :
                    result=c.mod( a , b );
                    break ;

        }
        System.out.println("Result :"+result);
        sc.close();
    }
}
