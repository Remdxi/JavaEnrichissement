public class StringReversal {
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
        public static void main(String[] args) {
          String original = "lana";
          String reversed = reverseString(original);
          System.out.println("Original string :"+ original);
          System.out.println("Reversed string :"+ reversed);
        }
      }
