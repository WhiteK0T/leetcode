package easy;

import easy.N1114PrintInOrder.Foo;
import easy.N1114PrintInOrder.FooRLock;
import easy.N1114PrintInOrder.FooSemaphore;
import easy.N1114PrintInOrder.SuperFoo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

class N1114PrintInOrderTest {

    final AtomicInteger count = new AtomicInteger(0);

    /*
        Input: nums = [1,2,3]
        Output: "firstsecondthird"
        Explanation: There are three threads being fired asynchronously. The input [1,2,3] means thread A calls first(),
        thread B calls second(), and thread C calls third(). "firstsecondthird" is the correct output.
     */

    @ParameterizedTest
    @ValueSource(classes = {Foo.class, FooRLock.class, FooSemaphore.class})
    void testFoo(Class<SuperFoo> clazz) throws InterruptedException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        SuperFoo foo = clazz.getDeclaredConstructor().newInstance();
        StringBuilder sb = new StringBuilder();
        Thread thread1 = new Thread(() -> {
            try {
                foo.first(() -> {
                    count.incrementAndGet();
                    System.out.printf("ClassName = %-15s   first", foo.getClass().getSimpleName());
                    sb.append("first");
                });
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        thread1.start();

        Thread thread3 = new Thread(() -> {
            try {
                foo.third(() -> {
                    System.out.println("third");
                    sb.append("third");
                });
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        thread3.start();

        Thread thread2 = new Thread(() -> {
            try {
                foo.second(() -> {
                    System.out.print("second");
                    sb.append("second");
                });
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        thread2.start();
        thread3.join();
        String expected = "firstsecondthird";
        String actual = sb.toString();
        assertEquals(expected, actual);
    }
}