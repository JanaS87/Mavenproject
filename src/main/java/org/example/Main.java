package org.example;

import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String asciiWord = FigletFont.convertOneLine("Hello World!");
        System.out.println(asciiWord);
	System.out.println("How are you today?");
    }
}
