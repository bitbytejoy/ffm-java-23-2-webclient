package de.neuefische.ffmjava232webclient;

import java.util.List;

public record RickAndMortyCharacter(
        int id,
        String name,
        RickAndMortyOrigin origin,
        List<String> episode
) {
}
