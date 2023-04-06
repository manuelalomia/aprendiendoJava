package Recursividad;
public class SumaRecursiva{       

    public static int sumaVector(int numeros[], int inicio, int fin){
        int resultado=0;
        if(inicio==fin){
            resultado=numeros[inicio];
        }else{
            int resultadoIzquierda=sumaVector(numeros,inicio, (inicio+fin)/2);
            int resultadoDerecha=sumaVector(numeros,(inicio+fin)/2+1, fin);
            resultado=resultadoIzquierda+resultadoDerecha;  
        }
        return resultado;
    }

    public static void main (String [] args){
        int [] numeros = {6,2,7};
        int n = numeros.length;      
        int resultado=sumaVector(numeros,0,n-1);
        System.out.println("La suma del vector es = " + resultado);
    }
}