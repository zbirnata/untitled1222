

public class Arrays {
    public static void main (String [] args){

        //Завдання 1
        int odd [] = new int [50];
        for(int i = 1, j = 0; i <= 99; i++){
            if(i%2 != 0){
                odd[j] = i;
                System.out.println(odd[j] + "");
                j++;
            }
        }

        //Завдання 2
        int[] rndm = new int[20];
        for (int i = 0; i < rndm.length; i++) {
            rndm[i] = (int)(10*Math.random());
            System.out.print(rndm[i] + " ");
        }
        System.out.println(" ");
        for (int j = 1; j < rndm.length; j += 2) {
            rndm[j] = 0;
        }
        for (int i = 0; i < rndm.length; i++) {
            System.out.print(rndm[i] + " ");
        }

        //Завдання 3
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] array3 = new int[5];
        double sum1 = 0, sum2 = 0, sum3 = 0;

        System.out.println(" ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int)(6*Math.random());
            System.out.print(array1[i] + " ");
            sum1 += array1[i];
        }
        double result1 = sum1/array1.length;
        System.out.print("Середнє значення 1-го масиву рівне " + result1);
        System.out.println(" ");

        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int)(6*Math.random());
            System.out.print(array2[i] + " ");
            sum2 += array2[i];
        }
        double result2=sum2/array2.length;
        System.out.print("Середнє значення 2-го масиву рівне " + result2);
        System.out.println(" ");

        for (int i = 0; i < array3.length; i++) {
            array3[i] = (int)(6*Math.random());
            System.out.print(array3[i] + " ");
            sum3 += array3[i];
        }
        double result3=sum3/array3.length;
        System.out.print("Середнє значення 3-го масиву рівне " + result3);
        System.out.println(" ");

        if(result1 > result2 && result1 > result3 ){
            System.out.println("Середнє значення 1-го масиву є більшим за інші");
        } else if(result2 > result1 && result2 > result3){
            System.out.println("Середнє значення 2-го масиву є більшим за інші");
        } else if(result3 > result1 && result3 > result2){
            System.out.println("Середнє значення 3-го масиву є більшим за інші");
        } else if(result1 == result1 && result2 == result3){
            System.out.println("Середні значення масивів є рівними");
        }

        //Завдання 4
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int)(Math.random()*11);
            System.out.print(arr1[i] + " ");
        }
        System.out.println(" ");

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int)(Math.random()*11);
            System.out.print(arr2[i] + " ");
        }
        System.out.println(" ");

        int[] arr3 = new int[10];

        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = arr1[i] + arr2[i];
            System.out.print(arr3[i] + " ");
        }

        //Завдання 5
        int[] numbers = new int[15];
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random()*11);
            System.out.print(numbers[i] + " ");
            if(numbers[i] % 2 == 0){
                counter++;
            }
        }
        System.out.println("\nКількість парних елементів в масиві: " + counter);
    }
}
