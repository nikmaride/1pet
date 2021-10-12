public class Bubble {
    public static int[] swap(int [] arr) {
        int t;
        boolean sort = true;
        while (sort) {
            sort = false;
            for (int i=0; i<arr.length-1; i++)
                if (arr[i] > arr[i + 1]) {
                    t = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = t;
                    sort = true;
                }
        }
        return arr;
    }


}
