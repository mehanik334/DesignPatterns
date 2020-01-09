package ua.epam.javacore.abstractFactory;

import ua.epam.javacore.abstractFactory.Builder;

public class BuilderHouse implements Builder {

    public void build() {
        System.out.println("Builder is building house");
    }
}
