package org.javaee7.sample;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author arungupta
 */
@XmlRootElement
public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
    
    public String getName() {

        System.out.println("blubb");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}