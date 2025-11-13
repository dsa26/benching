package src.main.java.bench;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Thread)

@Warmup(iterations = 3, time = 1)
@Measurement(iterations = 5, time = 2)
@Fork(1)

public class SortBench {
    private static int[] list50 = new int[50];
    private static int[] list500 = new int[500];
    private static int[] list1000 = new int[1000];
    private static int[] list2000 = new int[2000];
    private static int[] list4000 = new int[4000];
    private static int[] list10000 = new int[10000];
    private static int[] list100000 = new int[100000];
    private static int[] list500000 = new int[500000];

    @Setup(Level.Trial)
    public static void setup() {
        for (int i = 0; i < 50; i++) {
            list50[i] = (int) Math.floor(Math.random() * 50);
        }

        for (int i = 0; i < 500; i++) {
            list500[i] = (int) Math.floor(Math.random() * 500);
        }

        for (int i = 0; i < 1000; i++) {
            list1000[i] = (int) Math.floor(Math.random() * 1000);
        }

        for (int i = 0; i < 2000; i++) {
            list2000[i] = (int) Math.floor(Math.random() * 2000);
        }

        for (int i = 0; i < 4000; i++) {
            list4000[i] = (int) Math.floor(Math.random() * 4000);
        }

        for (int i = 0; i < 10000; i++) {
            list10000[i] = (int) Math.floor(Math.random() * 10000);
        }

        for (int i = 0; i < 100000; i++) {
            list100000[i] = (int) Math.floor(Math.random() * 100000);
        }

        for (int i = 0; i < 500000; i++) {
            list500000[i] = (int) Math.floor(Math.random() * 500000);
        }
    }

    // @Benchmark
    // public static void quick50() {
    // Sort.quick(list50);
    // }

    // @Benchmark
    // public static void quick500() {
    // Sort.quick(list500);
    // }

    // @Benchmark
    // public static void quick1000() {
    // Sort.quick(list1000);
    // }

    // @Benchmark
    // public static void quick2000() {
    // Sort.quick(list2000);
    // }

    // @Benchmark
    // public static void quick4000() {
    // Sort.quick(list4000);
    // }

    // @Benchmark
    // public static void selection50() {
    // Sort.selection(list50);
    // }

    // @Benchmark
    // public static void selection500() {
    // Sort.selection(list500);
    // }

    // @Benchmark
    // public static void selection1000() {
    // Sort.selection(list1000);
    // }

    // @Benchmark
    // public static void selection2000() {
    // Sort.selection(list2000);
    // }

    // @Benchmark
    // public static void selection4000() {
    // Sort.selection(list4000);
    // }

    // @Benchmark
    // public static void insertion50() {
    //     Sort.insertion(list50);
    // }

    // @Benchmark
    // public static void insertion500() {
    //     Sort.insertion(list500);
    // }

    // @Benchmark
    // public static void insertion1000() {
    //     Sort.insertion(list1000);
    // }

    // @Benchmark
    // public static void insertion2000() {
    //     Sort.insertion(list2000);
    // }

    // @Benchmark
    // public static void insertion4000() {
    //     Sort.insertion(list4000);
    // }

    // @Benchmark
    // public static void insertion10000() {
    //     Sort.insertion(list10000);
    // }

    // @Benchmark
    // public static void insertion100000() {
    //     Sort.insertion(list100000);
    // }

    // @Benchmark
    // public static void insertion500000() {
    //     Sort.insertion(list500000);
    // }

    @Benchmark
    public static void merge50() {
    Sort.merge(list50);
    }

    @Benchmark
    public static void merge500() {
    Sort.merge(list500);
    }

    @Benchmark
    public static void merge1000() {
    Sort.merge(list1000);
    }

    @Benchmark
    public static void merge2000() {
    Sort.merge(list2000);
    }

    @Benchmark
    public static void merge4000() {
    Sort.merge(list4000);
    }
}
