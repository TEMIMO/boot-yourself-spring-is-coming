package ironbank;

import ironbank.annotation.ConditionalOnProduction;
import ironbank.annotation.ConditionalOnRaven;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(RavenProperties.class)
public class IronConfiguration {

    @Bean
    @ConditionalOnProduction
    //@ConditionalOnProperty("raven.where")
    @ConditionalOnRaven
    @ConditionalOnMissingBean
    public RavenListener ravenListener() {
        return new RavenListener();
    }
}
