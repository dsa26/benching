package src.main.java.bench;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Thread)

@Warmup(iterations = 3, time = 1)
@Measurement(iterations = 5, time = 2)
@Fork(1)

public class BSTBench {
    @Param({"1000", "10000", "20000", "40000"})
    private int N;

    private BST<Boolean> best;
    private BST<Boolean> average;
    private BST<Boolean> worst;
    
    private static int[] shuffle(int[] arr) {
        // Not a perfect process, but good enough for benchmarking
        for (int i = 0; i < arr.length; i++) {
            int index1 = (int) Math.floor(Math.random() * arr.length);
            int index2 = (int) Math.floor(Math.random() * arr.length);
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        }
        return arr;
    }

    @Setup(Level.Trial)
    public void setup() {
        best = new BST<>();
        average = new BST<>();
        worst = new BST<>();

        for (int i = 0; i < N; i++) {
            worst.put(i, true);
        }

        best.put(N / 2, true);
        for (int i = 1; i < (N / 2); i++) {
            best.put((N / 2) + i, true);
            best.put((N / 2) - i, true);
        }

        int[] averageArr = new int[N];
        for (int i = 0; i < N; i++) {
            averageArr[i] = i;
        }
        averageArr = shuffle(averageArr);
        for (int i = 0; i < averageArr.length; i++) {
            average.put(averageArr[i], true);
        }
    }

    @Benchmark
    public void bestSearch() {
        best.search((int) Math.floor(Math.random() * (N - 1)));
    }

    @Benchmark
    public void bestInsert() {
        best.put(N + (int) Math.floor(Math.random() * (N - 1)), true);
    }

    @Benchmark
    public void bestDelete() {
        best.delete((int) Math.floor(Math.random() * (N - 1)));
    }

//     @Benchmark
//     public void averageSearch() {
//         average.search((int) Math.floor(Math.random() * (N - 1)));
//     }

//     @Benchmark
//     public void averageInsert() {
//         average.put(N + (int) Math.floor(Math.random() * (N - 1)), true);
//     }

//     @Benchmark
//     public void averageDelete() {
//         average.delete((int) Math.floor(Math.random() * (N - 1)));
//     }

//     @Benchmark
//     public void worstSearch() {
//         worst.search((int) Math.floor(Math.random() * (N - 1)));
//     }

//     @Benchmark
//     public void worstInsert() {
//         worst.put(N + (int) Math.floor(Math.random() * (N - 1)), true);
//     }

//     @Benchmark
//     public void worstDelete() {
//         worst.delete((int) Math.floor(Math.random() * (N - 1)));
//     }
}
