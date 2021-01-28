package br.com.ggianini;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class SomeResource {

    @Inject
    ExampleBean someProperty;

    public void useBean(){
        someProperty.method();
    }

}
