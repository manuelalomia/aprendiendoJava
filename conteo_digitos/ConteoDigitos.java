
public class ConteoDigitos{
    
    static int conteoDigitos(int n){
        int respuesta = 0;
        if (n < 10){
            respuesta = 1;
        }else{
            respuesta = conteoDigitos(n/10)+1;
        }
        return respuesta;
    }

    public static void main (String [] args){

        int n = 1243;       

        System.out.println(conteoDigitos(n));

    }
}

