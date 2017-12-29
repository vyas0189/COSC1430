public class Main {
//fU = 1, nE = 20, i = 1, 1 > 0, iA[0](35) > 20, iA[1] = 35, iA[0] = 20
    private static void main(String[] args) {
        int[] intArray = {35,20,-15,7,55,1,-22};

        for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++ ){
            int newElement = intArray[firstUnsortedIndex];
            int i;

            for(i = firstUnsortedIndex; i > 0 && intArray[i-1] >newElement; i--){
                for (int anIntArray : intArray) {
                    System.out.print(anIntArray + " ");
                }
                System.out.println("");
                intArray[i] = intArray[i-1];
            }
            for (int anIntArray : intArray) {
                System.out.print(anIntArray + ".... ");
            }
            System.out.println("");
            System.out.println("i = "+ i);
            intArray[i] = newElement;
        }

        for(int arr: intArray){
            System.out.print(arr + " ");
        }
    }
}