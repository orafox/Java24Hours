package com.ch20;

import java.time.LocalDateTime;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfDatesTest {
    public static void main(String[] args) {
        Supplier<LocalDateTime> stopWatch = () -> {
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return LocalDateTime.now();
        };
        Stream<LocalDateTime> timeStream = Stream.generate(stopWatch);
        timeStream.forEach(System.out::println);

    }

}
