package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SphynxTest {


    @Test
    void mew() {
        assertEquals("mew Sphynx", new Sphynx("Sphynx").mew());
    }

    static Stream<Arguments> mewProviderArguments() {
        return Stream.of(
                Arguments.of(30.0, new Person(50.0))
        );
    }

    @ParameterizedTest
    @MethodSource("mewProviderArguments")
    void mew(double expectedDouble, Person person) {
        Sphynx sphynx = new Sphynx("Sphynx");
        sphynx.mew(person);
        Assertions.assertEquals(expectedDouble, Person.getHappiness());
    }

    @Test
    void purr() {
        assertEquals("purr Sphynx", new Sphynx("Sphynx").purr());
    }

    static Stream<Arguments> purrProviderArguments() {
        return Stream.of(
                Arguments.of(70.0, new Person(50.0))
        );
    }

    @ParameterizedTest
    @MethodSource("purrProviderArguments")
    void purr(double expectedDouble, Person person) {
        Sphynx sphynx = new Sphynx("Sphynx");
        sphynx.purr(person);
        Assertions.assertEquals(expectedDouble, Person.getHappiness());
    }
}
