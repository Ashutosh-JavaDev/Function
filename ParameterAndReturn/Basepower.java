package Function.ParameterAndReturn;
class PowerBase{
    float basePower(float base,int power){
        if(power==1){
            return base;
        }
        else{
            return base*basePower(base, power-1);
        }
    }
}
public class Basepower {
 public static void main(String[] args) {
    PowerBase ob=new PowerBase();
    float result=ob.basePower(5, 5);
    System.out.println("Result: "+result);
 }   
}
