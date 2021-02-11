package dev.punchcafe.gqltemplate.type;

import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EnemyResolver implements GraphQLResolver<Enemy> {

    public List<Item> drops(final Enemy enemy){
        return List.of(Item.builder().name("Heart").build());
    }
}
