public class MyClass {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            if (i == 5) {
                break; // Exit the loop when i equals 5
            }
            System.out.println(i++); 
        }
    }
}