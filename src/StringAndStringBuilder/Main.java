package StringAndStringBuilder;

public class Main {

    static String prefix(String[] arr) {
        String prefix = arr[0];
        for (int i = 1; i < arr.length; i++) {
            while (arr[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] arr = {"flower", "flow", "flight"};
//        System.out.println(arr[0].substring(0,4));
        System.out.println(prefix(arr));
    }


}
