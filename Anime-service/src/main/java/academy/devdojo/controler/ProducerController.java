package academy.devdojo.controler;

import academy.devdojo.domain.Producer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping("v1/producers")
@Slf4j
public class ProducerController {


    @GetMapping
    public List<Producer> listAll(@RequestParam(required = false) String name) {
        var animes = Producer.producers;
        if (name == null) return animes;

        return animes.stream()
                .filter(producer -> producer.getName().equalsIgnoreCase(name))
                .toList();
    }

    @GetMapping("/{id}")
    public Producer findById(@PathVariable Long id) {
        return Producer.producers
                .stream()
                .filter(producer -> producer.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @PostMapping
    public Producer save(@RequestBody(required = false) Producer producer) {
        producer.setId(ThreadLocalRandom.current().nextLong(100_000));
        Producer.getProducers().add(producer);

        return producer;
    }

}
