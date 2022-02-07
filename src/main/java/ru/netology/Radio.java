package ru.netology;


public class Radio {

    private int radioStation;
    private int volume;
    private int createNumberRadioStation = 10;
    private int maxRadioStation = radioStationMax();

    public void setCreateNumberRadioStation(int createNumberRadioStation) {
        this.createNumberRadioStation = createNumberRadioStation;
    }

    public Radio() {
    }

    public Radio(int createNumberRadioStation) {
        this.createNumberRadioStation = createNumberRadioStation;
    }

    public int getRadioStation() {
        return radioStation;
    }

    public int radioStationMax() {
        return this.radioStation = this.createNumberRadioStation - 1;
    }

    public int radioStationMin() {
        return this.radioStation = 0;
    }

    public void nextRadioStation() {
        if (this.radioStation == this.maxRadioStation) {
            this.radioStation = 0;
        } else {
            this.radioStation++;
        }
    }

    public void prevRadioStation() {
        if (this.radioStation == 0) {
            this.radioStation = this.maxRadioStation;
        } else {
            this.radioStation--;
        }
    }

    public void setRadioStation(int radioStation) {
        if (radioStation < 0 || radioStation > this.maxRadioStation) {
            return;
        }
        this.radioStation = radioStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0 || volume > 100) {
            return;
        }
        this.volume = volume;
    }

    public void louder() {
        if (this.volume < 100) {
            volume++;
        }
    }

    public void quiet() {
        if (this.volume <= 0) {
            return;
        } else {
            volume--;
        }
    }

}
