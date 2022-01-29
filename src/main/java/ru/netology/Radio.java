package ru.netology;

import java.util.Scanner;

public class Radio {
    private int radioStation;
    private int volume;

    public int getRadioStation() {
        return radioStation;
    }

    public void radioStationMax() {
        this.radioStation = 9;
    }

    public void radioStationMin() {
        this.radioStation = 0;
    }

    public void nextRadioStation() {
        if (this.radioStation == 9) {
            this.radioStation = 0;
        } else {
            this.radioStation++;
        }
    }

    public void prevRadioStation() {
        if (this.radioStation == 0) {
            this.radioStation = 9;
        } else {
            this.radioStation--;
        }
    }

    public void setRadioStation(int radioStation) {
        if (radioStation < 0 || radioStation > 9) {
            return;
        }
        this.radioStation = radioStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0 || volume > 10) {
            return;
        }
        this.volume = volume;
    }

    public void louder() {
        if (this.volume < 10) {
            volume++;
        }
    }

    public void quiet() {
        if (this.volume == 0) {
            return;
        } else {
            volume--;
        }
    }

}
