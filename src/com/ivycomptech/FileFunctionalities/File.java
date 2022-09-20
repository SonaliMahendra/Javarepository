package com.ivycomptech.FileFunctionalities;

public class File {
    public static void main(String[] args) {

        WordFile wordFile=new WordFile();
        wordFile.closeFile();
        wordFile.openFile();
        wordFile.produceReport();
        wordFile.send();
    }
}
