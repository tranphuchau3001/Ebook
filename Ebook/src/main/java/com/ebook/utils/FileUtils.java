package com.ebook.utils;

import java.io.File;

public class FileUtils {

    public static final String PDF_DIRECTORY = "pdf_files";
    public static final String IMAGE_DIRECTORY = "image_files";

    public static void main(String[] args) {
        createDirectory(PDF_DIRECTORY);
        createDirectory(IMAGE_DIRECTORY);

    }

    public static void createDirectory(String directoryName) {
        File directory = new File(directoryName);
        if (!directory.exists()) {
            directory.mkdir();
            System.out.println("Created directory: " + directoryName);
        }
    }

    public static File createFile(String directory, String fileName) {
        File file = new File(directory + File.separator + fileName);
        try {
            if (file.createNewFile()) {
                System.out.println("Created file: " + fileName);
            } else {
                System.out.println("File already exists: " + fileName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return file;
    }

    public static boolean deleteFile(String filePath) {
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("Deleted file: " + filePath);
                return true;
            } else {
                System.out.println("Failed to delete file: " + filePath);
                return false;
            }
        } else {
            System.out.println("File does not exist: " + filePath);
            return false;
        }
    }
}

