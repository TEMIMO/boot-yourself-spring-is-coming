package ironbank.annotation;

import org.springframework.boot.autoconfigure.condition.AllNestedConditions;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class OnRavelConditional extends AllNestedConditions {
    public OnRavelConditional() {
        super(ConfigurationPhase.REGISTER_BEAN);
    }

    @ConditionalOnProperty("raven.where")
    public static class R {

    }

    @ConditionalOnProperty(value = "raven.on", havingValue = "true")
    public static class C {

    }
}
