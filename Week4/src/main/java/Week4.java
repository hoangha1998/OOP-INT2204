package main.java;

public class Week4 {
    public static int max2Int(int a, int b) {
        if(a > b) return a;
        else{
            if(a == b)return a;
            else return b;
        }
    }

    /**
     *
     * @param arr
     * @return min of array $arr
     */
    public static int minArray(int[] arr) {
        int min = arr[0];
        for(int a = 1; a < arr.length; a++ ){
            if(arr[a] <= min){
                min = arr[a];
            }
        }

        return min;
    }

    /**
     *
     * @param weight: in kg
     * @param height: in m
     * @return BMI index
     */
    public static String calculateBMI(double weight, double height) {
        double bmi = Math.round( weight / (height*height));

        if( bmi <= 18.5) return "Thiếu cân";
        else if(bmi <= 22.9)return"Bình thường";
        else if(bmi <= 23.9)return "Thừa cân";
        return "Béo phì";

    }

    public static void main(String[] args ){
        System.out.println(max2Int(4,9));

        int arr[]={11, 5, 64, 2, 4, 96};
        System.out.println(minArray(arr));
        System.out.println(calculateBMI(65,1.7));
    }
}
