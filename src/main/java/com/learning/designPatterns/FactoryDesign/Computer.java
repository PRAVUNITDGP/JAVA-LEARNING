package com.learning.designPatterns.FactoryDesign;

public abstract class Computer {

    public abstract String getRam();
    public abstract String getHDD();
    public abstract String getCPU();

    @Override
    public String toString(){
        return "Ram = " + this.getRam() + "Hard Disk" + this.getHDD() + "CPU" + this.getCPU();
    }

}
