package ironbank.annotation;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Conditional({OnProductionCondition.class})
public @interface ConditionalOnProduction {
}
