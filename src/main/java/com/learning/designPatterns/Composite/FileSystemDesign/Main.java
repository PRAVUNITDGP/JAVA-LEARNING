package com.learning.designPatterns.Composite.FileSystemDesign;

public class Main {
    public static void main(String[] args) {
        Directory movie = new Directory("MovieList");
        FileSystem avatar = new File("avatar");
        movie.add(avatar);
        Directory boringMovie = new Directory("BoringMovie");
        File pk = new File("PK");
        boringMovie.add(pk);
        movie.add(boringMovie);
        movie.ls();
    }
}
