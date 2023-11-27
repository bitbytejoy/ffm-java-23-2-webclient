package de.neuefische.ffmjava232webclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Objects;

@RestController
@RequestMapping("/rick-and-morty")
public class RickAndMortyController {
    @GetMapping("/character")
    public RickAndMortyCharacter getCharacter() {
        RickAndMortyCharacter character = Objects.requireNonNull(
                WebClient.create()
                        .get()
                        .uri("https://rickandmortyapi.com/api/character/2")
                        .retrieve()
                        .toEntity(RickAndMortyCharacter.class)
                        .block()
            ).getBody();

        return character;
    }
}
