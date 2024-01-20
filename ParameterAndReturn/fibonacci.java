package Function.ParameterAndReturn;
class fiboo{
    void fibo(int term, int a,int b){
        if(term==0){
            System.out.print(a+" "+b+" ");
        }
        int c=a+b;
        System.out.print(c+" ");
        fibo(term-1, b, c);
    }
}
public class fibonacci {
    public static void main(String[] args) {
        fiboo ob=new fiboo();
        ob.fibo(5-2, 0, 1);
    }
}
