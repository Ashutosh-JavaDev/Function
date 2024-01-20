package Function.ParameterAndReturn;
class fiboo{
    void fibo(int term, int a,int b){
        if(term<=10)
        {
            int c=a+b;
              System.out.print(c+" ");
              a=b;
              b=c;
            fibo(term+1, a ,b);
        }
        
    }
}
public class fibonacci {
    public static void main(String[] args) {
        fiboo ob=new fiboo();
        ob.fibo(1, -1,1);
    }
}
