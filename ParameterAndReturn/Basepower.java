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
    
}
