package Function.ParameterAndReturn;
class numberRev{
    void revNums(int number){
        if(number<1){
            return;
        }
        else{
            int d=number%10;
            System.out.print(d);
            revNums(number/10);
        }
    }
}
public class revNumber {
    public static void main(String[] args) {
        numberRev ob=new numberRev();
        ob.revNums(5);
        System.out.println();
    }
}
