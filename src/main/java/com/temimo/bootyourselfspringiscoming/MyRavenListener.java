package com.temimo.bootyourselfspringiscoming;

import ironbank.RavenListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

// Убрать @Component для срабатывания OnRavelConditional
@Component
public class MyRavenListener extends RavenListener {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("My event...");
    }
}
