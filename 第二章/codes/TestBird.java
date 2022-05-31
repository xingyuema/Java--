public class TestBird {
    public static void main(String[] args) {
        Bird bird = new Duck();
        bird.call();
        Bird bird1 = new Turkey();
        bird1.call();
    }
}