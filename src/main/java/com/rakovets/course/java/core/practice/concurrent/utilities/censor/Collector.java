package com.rakovets.course.java.core.practice.concurrent.utilities.censor;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Collector implements Runnable {
    private final String directoryForSearch;
    private final String searchWord;
    private final String filepathForMergeFile;

    public Collector(String filepath, String searchWord, String destination) {
        this.directoryForSearch = filepath;
        this.searchWord = searchWord;
        this.filepathForMergeFile = destination;
    }

    @Override
    public void run () {
        File directory = new File(directoryForSearch);
        if (directory.isDirectory()) {
            File[] directoryFiles = directory.listFiles();
            List<File> chosenFiles = new ArrayList<>();
            List<String> chosenData = new ArrayList<>();

            if (directoryFiles != null) {
                for (File file : directoryFiles) {
                    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                        String string;
                        while ((string = reader.readLine()) != null) {
                            if (string.contains(searchWord)) {
                                chosenFiles.add(file);
                                break;
                            }
                        }
                    } catch (Exception ex) {
                        try {
                            throw new CensorException("Collector: Some files in this directory contains no text");
                        } catch (CensorException exception) {
                            System.out.println(exception.getMessage());
                        }
                    }
                }
            }
            System.out.println("Files were found - " + chosenFiles.size());

            if (!chosenFiles.isEmpty()) {
                for (File file : chosenFiles) {
                    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                        String string;
                        while ((string = reader.readLine()) != null) {
                            chosenData.add(string);
                        }
                        chosenData.add("");
                    } catch (Exception ex) {
                        try {
                            throw new CensorException("Collector: Mistakes of reading have occurred");
                        } catch (CensorException exception) {
                            System.out.println(exception.getMessage());
                        }
                    }
                }
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(filepathForMergeFile))) {
                for(String data : chosenData) {
                    bw.write(data + "\n");
                }
                bw.flush();
            } catch (IOException ex) {
                try {
                    throw new CensorException("Collector: Mistakes of writing have occurred");
                } catch (CensorException exception) {
                    System.out.println(exception.getMessage());
                }
            }
            System.out.println("Data was collected in File: " + filepathForMergeFile);
        } else {
            try {
                throw new CensorException("Collector: Invalid directory address");
            } catch (CensorException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}
