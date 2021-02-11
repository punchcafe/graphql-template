package dev.punchcafe.gqltemplate.query;

import dev.punchcafe.gqltemplate.type.Enemy;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class QueryResolver implements GraphQLQueryResolver {

    Optional<Enemy> allEnemies(){
        return Optional.ofNullable(Enemy.builder().name("Moblin").build());
    }

}
