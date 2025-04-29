package knight.brian.springcoredemo.config;

import knight.brian.springcoredemo.common.Coach;
import knight.brian.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean()
//    @Bean("aquatic") // custom bean ID
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
