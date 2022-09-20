package com.ivycomptech.FileFunctionalities;

public abstract class ImageFile {
    public void openFile()
    {
        System.out.println("Open the file");
    }
    public void closeFile()
    {
        System.out.println("Close the file");
    }
    abstract void produceReport();
}
