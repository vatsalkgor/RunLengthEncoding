public class RunLengthEncoding {

    private static String sentence;

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sentence = new java.util.Scanner(System.in).nextLine();
        int counter = 1;
        for (int i = 0; i < sentence.length() - 1; i++) {
            if (sentence.charAt(i) == sentence.charAt(i + 1)) {
                ++counter;
                if (i + 1 == sentence.length() - 1) {
                    createRLE(sb, sentence.charAt(i - 1), counter);
                    counter = 1;
                }
            } else {
                createRLE(sb, sentence.charAt(i), counter);
                counter = 1;
            }
        }
        System.out.println(sb.toString());
    }

    private static void createRLE(StringBuilder sb, char c, int count) {
        sb.append(count);
        sb.append(c);
    }

}
