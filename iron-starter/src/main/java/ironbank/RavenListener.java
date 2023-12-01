package ironbank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class RavenListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    RavenProperties properties;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        properties.getWhere().forEach(
                System.out::println
        );
    }
}
