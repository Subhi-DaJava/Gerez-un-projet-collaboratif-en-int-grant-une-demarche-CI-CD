package com.openclassrooms.bobapp.service;

import com.openclassrooms.bobapp.data.JsonReader;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class JokeServiceTest {

    @Test
    void getRandomJoke() {
        // Arrange
        JokeService jokeService = new JokeService(JsonReader.getInstance());
        // Act
        String joke = jokeService.getRandomJoke().getJoke();
        // Assert
        assertNotNull(joke);
    }
}