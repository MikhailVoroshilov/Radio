package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();
    Radio radioStations = new Radio(20,50,12,19);

    @Test
    void shouldRadioStationMax() {
        radio.setCreateNumberRadioStation(10);
        radio.radioStationMax();

        int expected = 9;
        int actual = radio.getRadioStation();

        assertEquals(expected, actual);

        radioStations.radioStationMax();
        assertEquals(11,radioStations.getRadioStation());
    }

    @Test
    void shouldRadioStationMin() {
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
    void shouldNextRadioStationMax() {
        radio.setRadioStation(9);
        radio.nextRadioStation();

        int expected = 0;
        int actual = radio.getRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevRadioStation() {
        radio.setRadioStation(1);
        radio.prevRadioStation();

        int expected = 0;
        int actual = radio.getRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevRadioStationMin() {
        radio.setRadioStation(0);
        radio.prevRadioStation();


        int expected = 9;
        int actual = radio.getRadioStation();

        assertEquals(expected, actual);
    }


    @Test
    void shouldLouder() {
        radio.setVolume(100);
        radio.louder();

        int expected = 100;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldLouderMin() {
        radio.setVolume(0);
        radio.louder();

        int expected = 1;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldQuiet() {
        radio.setVolume(10);
        radio.quiet();

        int expected = 9;

        assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldQuietReturn() {
        radio.setVolume(0);
        radio.quiet();

        int expected = 0;

        assertEquals(expected, radio.getVolume());
    }

}