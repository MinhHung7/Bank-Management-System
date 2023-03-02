public class Banking{
    public static void main(String[] args) {
        Card card = new Card();
        Account account = new Account();
        new LogInOutFrame(card,account);
    }
}