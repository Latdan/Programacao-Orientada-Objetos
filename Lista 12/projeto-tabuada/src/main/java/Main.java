package main.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String dirPath = "c:/teste";
        String filePath = dirPath + "/tabuada.txt";

        File dir = new File(dirPath);
        if (!dir.exists()) {
            if (dir.mkdirs()) {
                System.out.println("Diretório criado: " + dirPath);
            } else {
                System.out.println("Falha ao criar diretório: " + dirPath);
                return;
            }
        } else {
            System.out.println("Diretório já existe: " + dirPath);
        }

        try (FileWriter writer = new FileWriter(filePath)) {
            for (int i = 1; i <= 10; i++) {
                writer.write("2 x " + i + " = " + (2 * i) + "\n");
            }
            System.out.println("Arquivo criado e escrito: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 0;
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                if (lineNumber == 8) {
                    JOptionPane.showMessageDialog(null, line, "Valor da linha 8", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}