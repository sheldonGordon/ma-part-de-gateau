package fr.chatelain.mapartdegateau;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "fr.chatelain.mapartdegateau.repositories")
public class PersistenceJPAConfig {
}
