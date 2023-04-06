package Recursividad;
class InsertionSort{

    static void insertionSort(int[] A){
        for(int j = 1; j <= A.length - 1; j++){
            int key = A[j];
            int i = j - 1;
            while(i >=0 && A[i] > key){
                A[i + 1] = A[i];
                i = i - 1;                
            }
            A[i + 1] = key;
        }
    }

    static void printArray(int A[], int n){
        for(int i = 0; i < n; i++){
            System.out.print(A[i]);
        }
    }


    public static void main(String[] args) {

        int [] test = {5, 2, 4, 6, 1, 3};
        int n = test.length;

        insertionSort(test);
        printArray(test, n);
        
    }

}