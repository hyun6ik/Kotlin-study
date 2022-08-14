package Lec07;

import java.io.*;

public class JavaFilePrinter {

    public void readFile() throws IOException {
        final File currentFile = new File(".");
        final File file = new File(currentFile.getAbsolutePath() + "/a.txt");
        final BufferedReader reader = new BufferedReader(new FileReader(file));
        System.out.println(reader.readLine());
        reader.close();
    }

    public void readFile2(String path) throws IOException {
        try (final BufferedReader reader = new BufferedReader(new FileReader(path))) {
            System.out.println(reader.readLine());
        }
    }
}
