public class w1_hw {

    public static int getMax (int[] arr) {
        assert arr.length == 0;
            int maxValue = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > maxValue) {
                    maxValue = arr[i];
                }
            }
            return maxValue;
        }


    public static int getMin (int[] arr){
        assert arr.length == 0;
            int minValue = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < minValue) {
                    minValue = arr[i];
                }
            }
            return minValue;
        }


    public static int getAvg (int[] arr) {
        assert arr.length == 0;
            int avgValue = 0;
            for (int i = 0; i < arr.length; i++) {
                avgValue = avgValue + arr[i];
            }
            avgValue = avgValue / arr.length;
            return avgValue;
        }

    public static void main (String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter numerical values as arguments");
        } else {
            int[] newArr = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                newArr[i] = Integer.parseInt(args[i]);
            }
            System.out.println("The minimum value in the given arguments is " + getMin(newArr));
            System.out.println("The maximum value in the given arguments is " + getMax(newArr));
            System.out.println("The average value of the given arguments is " + getAvg(newArr));
        }
    }
}
