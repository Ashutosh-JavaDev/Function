package Function.ParameterAndReturn;
class Digitsum{
    int sumDig(int number){
        if(number<1){
            return 0;
        }
        else{
            return (number%10)+sumDig(number/10);
        }
    }
}
public class sumOfDigit {
    public static void main(String[] args) {
        Digitsum ob=new  Digitsum();
        int result=ob.sumDig(12345);
        System.out.println("Result: "+result);
    }
}
