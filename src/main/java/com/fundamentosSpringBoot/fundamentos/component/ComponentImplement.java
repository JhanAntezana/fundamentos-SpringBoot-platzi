package com.fundamentosSpringBoot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImplement implements ComponentDependency{
    @Override
    public void saludar(String nombre) {
        System.out.println("Hola, "+nombre+" ¿Como estas?");
    }
}
