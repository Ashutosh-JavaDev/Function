package Function.ParameterAndReturn;
class fiboo{
    int fibo(int term, int a,int b){
       if(term<1){
        return 1;
       }
       else{
        System.out.print(a+" ");
        int c=a+b;
        return fibo(term-1, b, c);
       }
        
    }
}
public class fibonacci {
    public static void main(String[] args) {
        fiboo ob=new fiboo();
        ob.fibo(5, 0, 1);
    }
}
