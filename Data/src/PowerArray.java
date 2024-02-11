
public class PowerArray {
    public static void main(String[] args) {
        int size = 4;
        int power = 2;
        int[] result = toPower(size, power);

        
        for (int value : result) {
            System.out.print(value + " ");
        }
    }

    public static int[] toPower(int size, int power) {
        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            result[i] = (int) Math.pow(i, power);
        }

        return result;
    }
}
