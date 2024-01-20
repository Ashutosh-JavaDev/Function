package Function.ParameterAndReturn;
class CountDown{
    void countData(int term){
        if(term<0){
            return;
        }
        else{
            System.out.print(term+" ");
            countData(term-1);
        }
    }
}
public class countDown {
    public static void main(String[] args) {
        CountDown ob=new CountDown();
        ob.countData(5);
    }
}
