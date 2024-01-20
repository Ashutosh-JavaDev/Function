package Function.ParameterAndReturn;
class WtoD{
    void digitToword(int num){
        if(num<1){
            return;
        }
        else{
            digitToword(num/10);
            int d=num%10;
            switch(d){
                case 1:
                System.out.print("One"+" ");
                break;
                case 2:
                System.out.print("Two"+" ");
                break;
                case 3:
                System.out.print("Three"+" ");
                break;
                case 4:
                System.out.print("Four"+" ");
                break;
                case 5:
                System.out.print("Five"+" ");
                break;
                case 6:
                System.out.println("Six"+" ");
                break;
                case 7:
                System.out.print("Seven"+" ");
                break;
                case 8:
                System.out.print("Eight"+" ");
                break;
                case 9:
                System.out.print("Nine"+" ");
                break;
                case 0:
                System.out.print("Zero"+" ");
                break;
                default:
                System.out.println("Invalid Error");
                break;
            }
           
        }
    }
}
public class digitToWords {
    public static void main(String[] args) {
        WtoD ob=new WtoD();
        ob.digitToword(4325);
        System.out.println();
    }
}
