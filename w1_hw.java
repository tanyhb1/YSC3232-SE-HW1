public class w1_hw {

    // a method to get the maximum value of an int array
    public static int getMax (int[] arr) {
	// sanity check that arr is not empty
        assert arr.length == 0;
	//initialize maxValue arbitrarily
            int maxValue = arr[0];
	    //iterate through arr; if we find a larger value than maxValue, update maxValue
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > maxValue) {
                    maxValue = arr[i];
                }
            }
	    //finally, return 
            return maxValue;
        }

    // a method to get the minimum value of an int array
    public static int getMin (int[] arr){
	// sanity check that arr is not empty
        assert arr.length == 0;
	//initialize minValue arbitrarily
            int minValue = arr[0];
	    //iterate through arr; if we find a larger value than maxValue, update maxValue
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < minValue) {
                    minValue = arr[i];
                }
            }
	    //finally, return
            return minValue;
        }

    // a method to get the average value of an int array
    public static float getAvg (int[] arr) {
	// sanity check that arr is not empty
        assert arr.length == 0;
	//initialize our totalValue as 0
            int totalValue = 0;
	    //for each number in arr, increment totalValue by the value of that number
            for (int i = 0; i < arr.length; i++) {
                totalValue = totalValue + arr[i];
            }
	    //find the average by taking totalValue divded by length of array.
	    // we cast to float, since avgValue could be a decimal number and we would lose precision if we just used int.
            float avgValue = (float) totalValue / (float) arr.length;
            return avgValue;
        }

    public static void main (String[] args) {
	//sanity check that array is non-empty
        if (args.length == 0) {
            System.out.println("Please enter numerical values as arguments");
        } else {
	    //initialize a new int array
            int[] newArr = new int[args.length];
	    //convert args which is an array of strings into an array of integers
            for (int i = 0; i < args.length; i++) {
                newArr[i] = Integer.parseInt(args[i]);
            }
	    //print the solutions
            System.out.println("The minimum value in the given arguments is " + getMin(newArr));
            System.out.println("The maximum value in the given arguments is " + getMax(newArr));
            System.out.println("The average value of the given arguments is " + getAvg(newArr));
        }
    }
}
