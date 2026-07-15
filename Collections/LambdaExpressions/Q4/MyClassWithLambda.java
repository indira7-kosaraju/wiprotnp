public class MyClassWithLambda {
    public static void main(String[] args) {

        WordCount wc = str -> {
            if (str.trim().isEmpty())
                return 0;
            return str.trim().split("\\s+").length;
        };

        String s = "Welcome to Wipro TalentNext";

        System.out.println("Word Count = " + wc.count(s));
    }
}