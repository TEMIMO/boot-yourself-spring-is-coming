package ironbank;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties("raven")
public class RavenProperties {
    List<String> where;

    public List<String> getWhere() {
        return where;
    }

    public void setWhere(List<String> where) {
        this.where = where;
    }
}
