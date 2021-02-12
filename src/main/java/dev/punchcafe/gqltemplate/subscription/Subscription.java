package dev.punchcafe.gqltemplate.subscription;

import dev.punchcafe.gqltemplate.type.Item;
import graphql.kickstart.tools.GraphQLSubscriptionResolver;
import org.reactivestreams.Publisher;
import org.springframework.stereotype.Component;

@Component
public class Subscription implements GraphQLSubscriptionResolver {

    private Publisher<Item> itemPublisher;

    public Subscription(final Publisher<Item> itemPublisher){
        this.itemPublisher = itemPublisher;
    }

    public Publisher<Item> beedlesNewItem(){
        return itemPublisher;
    }
}
