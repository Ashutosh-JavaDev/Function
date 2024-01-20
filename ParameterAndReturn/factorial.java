package Function.ParameterAndReturn;
class facto{
    int fact(int num){
        if(num<=1){
            return 1; 
        }
        return num*fact(num-1);
    }
}
public class factorial {
    public static void main(String[] args) {
        facto ob=new facto();
        ob.fact(5);
    }
}
