/**
 * this file only does math things iteratively 
 */
public class Practice01MathIterative implements Practice01Math{
public int fact(int n) throws Exception{
    //if n is a negative number throw an exception
    if(n<0){
    throw new Exception();
       }
    
    int x=1;
    for(int i=1;i<=n;i++){
        x=x*i; // x is updated every time the loop is going,starts at 1 *1 than stops at n(input)
    }//end for
    return x;
}
public int fib(int n) throws Exception{
    //if n is a negative number throw an exception
    if(n<0){
        throw new Exception();
    }
    //if n is one return 1
    if(n <= 1) {
        return n;
    }
    
    int fib = 1;
    int prevFib = 1;
    
    for(int i=2; i<n; i++) {
        int temp = fib;
        fib+= prevFib;
        prevFib = temp;
    }//end for
    return fib;
}//found on geeks for geeks
}