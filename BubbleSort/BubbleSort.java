public class BubbleSort{
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i-1;j++){ // inner loop
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];  
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printArry(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {8,9,10,15,1};
        bubbleSort(arr);
        printArry(arr);
    } 
}

