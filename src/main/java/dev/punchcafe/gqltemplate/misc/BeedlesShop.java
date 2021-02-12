package dev.punchcafe.gqltemplate.misc;

import dev.punchcafe.gqltemplate.type.Item;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BeedlesShop {

    private final PublisherImp publisherImp;

    @Scheduled(fixedDelay = 5000)
    public void newItem(){
        this.publisherImp.publish();
    }

    public BeedlesShop(){
        this.publisherImp = new PublisherImp();
    }

    @Bean
    public Publisher<Item> beedlesShopPublisher(){
        return this.publisherImp;
    }

    private static class PublisherImp implements Publisher<Item>{

        private static List<String> ITEM_NAMES = List.of("Piece of Heart", "Bottle", "Arrows", "Bombs");

        private int count = 0;

        private List<Subscriber<? super Item>> subscribers = new ArrayList<>();

        @Override
        public void subscribe(Subscriber<? super Item> s) {
            subscribers.add(s);
        }

        public void publish(){
            count++;
            count = count % ITEM_NAMES.size();
            subscribers.forEach(suber -> suber.onNext(Item.builder().name(ITEM_NAMES.get(count)).build()));
        }
    }
}
