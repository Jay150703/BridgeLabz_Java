package dsa.analysis;

/*
 * Compares performance of String, StringBuilder, and StringBuffer
 * for large-scale string concatenation.
 */

public class StringConcatenationAnalysis {

    public static void main(String[] args) {
        int count = 50_000;

        long start = System.nanoTime();
        String s = "";
        for (int i = 0; i < count; i++) {
            s += "a";
        }
        long stringTime = System.nanoTime() - start;

        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append("a");
        }
        long builderTime = System.nanoTime() - start;

        start = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            sbuf.append("a");
        }
        long bufferTime = System.nanoTime() - start;

        System.out.println("String Time (ns): " + stringTime);
        System.out.println("StringBuilder Time (ns): " + builderTime);
        System.out.println("StringBuffer Time (ns): " + bufferTime);
    }
}
