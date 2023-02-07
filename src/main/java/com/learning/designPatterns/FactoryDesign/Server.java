package com.learning.designPatterns.FactoryDesign;

public class Server extends Computer{

    private String ram;
    private String hdd;
    private String cpu;

    public Server(String ram , String hdd , String cpu){
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }
    @Override
    public String getRam(){
        return this.ram;
    }

    @Override
    public String getCPU() {
        return this.hdd;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }
}
