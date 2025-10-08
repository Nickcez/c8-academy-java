package com.bptn.course._Test;

public class Presentation {
    private String name;

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Presentation n = new Presentation();
        n.name = "Nick";

        System.out.println(n.name);
    }
}
