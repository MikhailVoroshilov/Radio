package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    void shouldRadioStationMax() {
        radio.setRadioStation(5);
        radio.radioStationMax();

        int expected = 9;
        int actual = radio.getRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldRadioStationMin() {
        radio.setRadioStation(5);
        radio.radioStationMin();

        int expected = 0;
        int actual = radio.getRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldNextRadioStation() {
        radio.setRadioStation(4);
        radio.nextRadioStation();


        int expected = 5;
        int actual = radio.getRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevRadioStation() {
        radio.setRadioStation(0);
        radio.prevRadioStation();


        int expected = 9;
        int actual = radio.getRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetRadioStation() {
        radio.setRadioStation(9);

        int expected = 9;
        int actual = radio.getRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldValue() {
        radio.setVolume(11);

        int expected = 0;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldLouder() {
        radio.setVolume(10);
        radio.louder();

        int expected = 10;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldQuiet() {
        radio.setVolume(1);
        radio.quiet();

        int expected = 0;

        assertEquals(expected, radio.getVolume());
    }
}