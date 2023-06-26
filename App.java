public class App {
    // BEGIN
    public static String getHiddenCard(String cardNumber, int starsCount) {
        var visibleDigitsLine = cardNumber.substring(12);
        return "*".repeat(starsCount) + visibleDigitsLine;
    }

    public static String getHiddenCard(String cardNumber) {
        return App.getHiddenCard(cardNumber, 4);
    }

    // END
    public static void main(String[] args) {
        var a = "1234567891478965";
        var res = App.getHiddenCard(a);
        System.out.println(res);
    }
}