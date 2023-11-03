package Fichiers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReader3 {
    public static void main(String[] args) throws IOException {
        File f = new File("/Users/laurakn/IdeaProjects/projetLecFichier/src/Fichiers/monFichier.txt");
        try {
            FileInputStream in = new FileInputStream(f);
            char[] letters = new char[5];

            int i = 0;
            int c = in.read();

            while (c != -1 && i < 5) {
                letters[i] = (char) c;
                c = in.read();
                i++;
            }

            in.close();

            for (int j = 4; j >= 0; j--) {
                System.out.println(letters[j]);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

