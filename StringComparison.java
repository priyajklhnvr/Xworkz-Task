public class StringComparison {
        public static void main(String[] args) {

                String studentName1 = "Priya";
                String programmingLanguage = "Java";
                String courseName = "Data Analysis";
                String database = "SQL";
                String cityName = "Shivamogga";
                String collegeName = "JNNCE";

                String cityNameNew = new String("Bangaluru");
                String programmingLanguageNew = new String("Python");
                String studentName3 = new String("Priya");
                String seasonNew = new String("summer");

                String certification = "Python";
                String season = "winter";
                String hobby = "Music";

                System.out.println("Comparing studentName1 and studentName3: " + studentName1.equals(studentName3));
                System.out.println("Comparing cityName and cityNameNew: " + cityName.equals(cityNameNew));
                System.out.println("Comparing collegeName and collegeNameNew: " + season.equals(seasonNew));

                String origin = "xworkz";
                String reverse = reverseString(origin);

                System.out.println("Original: " + origin);
                System.out.println("Reversed: " + reverse);
        }

        public static String reverseString(String input) {
                char[] charArray = input.toCharArray();
                String reversed = "";

                for (int i = charArray.length - 1; i >= 0; i--) {
                        reversed += charArray[i];

                }
                return reversed;

        }

}
