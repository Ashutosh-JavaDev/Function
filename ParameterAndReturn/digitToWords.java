package Function.ParameterAndReturn;
class WtoD{
    void digitToword(int num){
        if(num<1){
            return;
        }
        else{
            int d=num%10;
            switch(d){
                case 1:
                System.out.print("one");
                break;
                case 2:
                System.out.print("Two");
                break;
                case 3:
                System.out.print("Three");
                break;
                default:
                System.out.println("Invalid Error");
                break;
            }
            digitToword(num/10);
        }
    }
}
public class digitToWords {
    
}
