package cz.engeto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Main {

    public static void main(String[] args) throws IOException {
        File source = new File("C:/windows-version.txt");
        File dest = new File("C:/tmp/windows-version-copy.txt");

        if (!dest.exists()) {
            dest.getParentFile().mkdirs();
            dest.createNewFile();
        }

        JSONObject

        try (FileReader fileReader = new FileReader(source);
             Writer fileWriter = new BufferedWriter(new FileWriter(dest));
        ) {

            int b;
            while ((b = fileReader.read()) != -1) {
                fileWriter.write(b);
            }
        }

    }


}
