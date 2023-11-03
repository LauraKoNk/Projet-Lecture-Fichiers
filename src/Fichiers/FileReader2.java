package Fichiers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReader2 {
    public static void main(String[] args) throws IOException {
        File f = new File("/Users/laurakn/IdeaProjects/projetLecFichier/src/Fichiers/autreFichier.txt");
        try {
            FileInputStream in = new FileInputStream(f);
            StringBuilder reversedText = new StringBuilder();

            int i = in.read();

            while (i != -1) {
                reversedText.insert(0, (char) i);
                i = in.read();
            }

            in.close();

            System.out.println(reversedText.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
