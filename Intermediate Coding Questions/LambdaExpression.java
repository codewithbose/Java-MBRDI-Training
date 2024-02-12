public class LambdaExpression{
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread is running: " + i);
            }
            
        });
 
        thread.start();
    }
}
 