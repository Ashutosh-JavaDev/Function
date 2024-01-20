package Function.ParameterAndReturn;
class CountDown{
    void countData(int term){
        if(term<0){
            System.out.print(term+" ");
        }
        else{
            System.out.print(term);
            countData(term-1);
        }
    }
}
public class countDown {
    
}
