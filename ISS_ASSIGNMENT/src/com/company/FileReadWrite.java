package com.company;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.io.*;
import java.util.Arrays;

public class FileReadWrite {
    public static void main(String[] args) {

        String inputFilePath = "C://Users//Hp//IdeaProjects//ISS_ASSIGNMENT//src//com//company//input.txt";
        String outputFilePath = "C://Users//Hp//IdeaProjects//ISS_ASSIGNMENT//src//com//company//output.txt";

        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        String filePath = "C://Users//Hp//IdeaProjects//ISS_ASSIGNMENT//src//com//company//input1.txt";
        List<String> lines = Arrays.asList("Hello, World!", "This is a demo test to write.");

        try {

            List<String> readLines = Files.readAllLines(Paths.get(filePath));
            for (String line : readLines) {
                System.out.println(line);
            }


            Files.write(Paths.get(filePath), lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
