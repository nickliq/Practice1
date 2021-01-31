package Practice1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ErrTrain {
    public static void main(String[] args) {
        System.out.println("Это будет первым?");
        System.err.println("Это что? Это ошибка?");
    }
}
