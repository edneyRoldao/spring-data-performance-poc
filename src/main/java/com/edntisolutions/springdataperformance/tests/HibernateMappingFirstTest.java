package com.edntisolutions.springdataperformance.tests;

import com.edntisolutions.springdataperformance.model.Item;
import com.edntisolutions.springdataperformance.model.Order;
import com.edntisolutions.springdataperformance.repository.ItemRepository;
import com.edntisolutions.springdataperformance.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

import static com.edntisolutions.springdataperformance.enums.OrderStatus.REQUESTED;
import static java.time.LocalDateTime.now;

@Slf4j
@Component
@RequiredArgsConstructor
public class HibernateMappingFirstTest implements CommandLineRunner {

    private final ItemRepository itemRepository;
    private final OrderRepository orderRepository;

    private void saveOrderAndItemsAtOnceTest() {
        log.info("starting process: HibernateMappingFirstTest.saveOrderAndItemsAtOnceTest");
        Order order = Order.builder().orderStatus(REQUESTED).amount(1000).createdAt(now()).build();
        Item it1 = Item.builder().price(10).productId(1L).quantity(1).order(order).build();
        Item it2 = Item.builder().price(100).productId(2L).quantity(1).order(order).build();
        Item it3 = Item.builder().price(1000).productId(3L).quantity(2).order(order).build();
        order.setItems(Arrays.asList(it1, it2, it3));
        orderRepository.save(order);
        log.info("SUCCESS");
    }

    @Override
    public void run(String... args) {
//        saveOrderAndItemsAtOnceTest();

//        var result = orderRepository.findAll();
        var result = itemRepository.findAll();

        System.out.println(result);
    }

}
