public class Main {
    public static void main(String[] args) {
        String incomingText = "yourapp the quick brown fox jumps over the lazy dog";
        TOP10Words countWords = new TOP10Words(incomingText);
        countWords.printResult();
    }
}
