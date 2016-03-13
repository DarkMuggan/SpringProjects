package configuration;

import dogs.Alsation;
import dogs.IDog;
import dogs.Pitbull;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@Scope()
public class AppConfig {

    @Bean(name="dog")
    public IDog getService(){
        return new Alsation();
    }

}