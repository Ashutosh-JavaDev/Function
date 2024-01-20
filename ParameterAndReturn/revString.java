package Function.ParameterAndReturn;
class revstrinG{
    void stringReverse(String str,int len){
        if(str.length()<2){
            System.out.println(str);
            // return str;
        }
        else{
            System.out.print(str.charAt(str.length()-1));
            stringReverse(str,str.length()-1);
        }
    }
}
public class revString {
    
}
