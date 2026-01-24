package dsa.analysis;

import java.io.*;

/*
 * Compares FileReader and InputStreamReader performance
 * while reading a text file.
 */

public class FileReadingPerformanceAnalysis {

    public static void main(String[] args) throws Exception {
        File file = new File("sample.txt"); // small test file

        long start = System.nanoTime();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (br.readLine() != null) {}
        }
        long fileReaderTime = System.nanoTime() - start;

        start = System.nanoTime();
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(file)))) {
            while (br.readLine() != null) {}
        }
        long inputStreamReaderTime = System.nanoTime() - start;

        System.out.println("FileReader Time (ns): " + fileReaderTime);
        System.out.println("InputStreamReader Time (ns): " + inputStreamReaderTime);
    }
}
