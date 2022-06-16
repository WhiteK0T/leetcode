package easy.N1114PrintInOrder;

public interface SuperFoo {
    void first(Runnable printFirst) throws InterruptedException;

    void second(Runnable printSecond) throws InterruptedException;

    void third(Runnable printThird) throws InterruptedException;
}
