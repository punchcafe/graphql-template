package dev.punchcafe.gqltemplate.config;

import graphql.kickstart.tools.SchemaParser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SchemaConfiguration {

    //@Bean
    SchemaParser schemaParser(){
        return SchemaParser.newParser().file("graphql/query.graphqls").build();
    }
}
