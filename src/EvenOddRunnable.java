// write a java program using 2 threads which are running concurrently one thread to print even nos and another to print odd no, each thread has its own even odd runnable instance which help us to find if it should print even or odd number based on a boolean flag past the constructor

class EvenOddRunnable implements Runnable {
    private final int limit;
    private final boolean isEvenNumber;
    private final Object lock;

    public EvenOddRunnable(int limit, boolean isEvenNumber, Object lock) {
        this.limit = limit;
        this.isEvenNumber = isEvenNumber;
        this.lock = lock;
    }

    @Override
    public void run() {
        int number = isEvenNumber ? 2 : 1;
        while (number <= limit) {
            if (isEvenNumber) {
                printEven(number);
            } else {
                printOdd(number);
            }
            number += 2;
        }
    }

    private void printEven(int number) {
        synchronized (lock) {
            while (!isEven(number)) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("Even Thread: " + number);
            lock.notifyAll();
        }
    }

    private void printOdd(int number) {
        synchronized (lock) {
            while (isEven(number)) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("Odd Thread: " + number);
            lock.notifyAll();
        }
    }

    private boolean isEven(int number) {
        return number % 2 == 0;
    }
}

