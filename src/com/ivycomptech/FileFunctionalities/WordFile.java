package com.ivycomptech.FileFunctionalities;

public class WordFile extends ImageFile implements NewFile{
    void produceReport() {
        System.out.println("Report is produced");
    }
    public void send() {
        System.out.println("Send the file");
    }
}
