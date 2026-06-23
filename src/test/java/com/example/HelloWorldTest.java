package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;

class HelloWorldTest {
    @Test
    void printsExpectedMessage() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        try {
            HelloWorld.main(new String[0]);
        } finally {
            System.setOut(originalOut);
        }

        assertEquals("Hello from DevOps!" + System.lineSeparator(), output.toString(StandardCharsets.UTF_8));
    }
}
