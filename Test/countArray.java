public class countArray {
    public static void main(String[] args) {
        // left to right
        byte[] byteCount = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        System.out.println("Byte values:");
        for (int i = 0; i < byteCount.length; i++) {
            System.out.println(byteCount[i]);
        }

        // right to left
        int[] intCount = { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
        System.out.println("Int values:");
        for (int i = intCount.length - 1; i > 0; i--) {
            System.out.println(intCount[i]);
        }

        // Middle to left
        float[] floatIndex = { 481.10f, 42.20f, 49.01f, 44.55f, 45.98f, 46.12f, 47.0f, 48.0f, 49.0f, 50.0f, 12.2f,
                67.0f,
                32.12f, 15.56f, 23.43f, 76.00f, 78.65f, 89.98f };
        System.out.println("Middle to left values:");
        for (int i = floatIndex.length - 9; i >= 0; i--) {
            System.out.println(floatIndex[i]);
        }

        // Skipping one element
        char[] valueChar = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q' };
        System.out.println("Skip One value:");
        for (int i = 0; i < valueChar.length; i = i + 2) {
            System.out.println(valueChar[i]);
        }

    }

}
