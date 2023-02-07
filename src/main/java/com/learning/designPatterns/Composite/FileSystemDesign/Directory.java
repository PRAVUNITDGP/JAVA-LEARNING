package com.learning.designPatterns.Composite.FileSystemDesign;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    String directoryName ;
    List<FileSystem> fileSystemList;
    public Directory(String name){
        this.directoryName = name;
        fileSystemList = new ArrayList<>();
    }
    public void add(FileSystem fileSystemObj){
        fileSystemList.add(fileSystemObj);
    }
    @Override
    public void ls(){
        System.out.println("Directory Name " + directoryName);
        for(FileSystem obj : fileSystemList){
            obj.ls();
        }
    }
}
