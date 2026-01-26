package academy.devdojo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@AllArgsConstructor
@Getter
@Setter
@Builder

public class Producer {
    private Long id;
//    @JsonProperty("full_name")
    private String name;
    public static List<Producer> producers = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Producer producer = (Producer) o;
        return Objects.equals(id, producer.id) && Objects.equals(name, producer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    static {
        var mappa = Producer.builder().id(1L).name("mappa").build();
        var kyotoAnimation = Producer.builder().id(2L).name("Kyoto animation").build();
        var madhouse = Producer.builder().id(3L).name("Madhouse").build();
        producers.addAll(List.of(mappa, kyotoAnimation, madhouse));
    }

    public static List<Producer> getProducers() {
        return producers;
    }
}
