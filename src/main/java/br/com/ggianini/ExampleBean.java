package br.com.ggianini;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped

public class ExampleBean {

    private String property;

    public void method() {
        System.out.println("Hello World");
    }

}