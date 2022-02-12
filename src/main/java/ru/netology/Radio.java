package ru.netology;


public class Radio {

    private int radioStation;
    private int volume;
    private int createNumberRadioStation = 10;


    public Radio() {
    }

    public Radio(int createNumberRadioStation) {
        this.createNumberRadioStation = createNumberRadioStation;
    }

    public void setCreateNumberRadioStation(int createNumberRadioStation) {
        this.createNumberRadioStation = createNumberRadioStation;
    }

    public int radioStationMax() {
        return this.radioStation = this.createNumberRadioStation - 1;
    }

    public int radioStationMin() {
        return this.radioStation = 0;
    }

    public int getRadioStation() {
        return radioStation;
    }

    public void nextRadioStation() {
        if (this.radioStation < (createNumberRadioStation - 1)) {
            setRadioStation(radioStation + 1);
        } else {
            radioStationMin();
        }
    }

    public void prevRadioStation() {
        if (this.radioStation <= 0) {
            this.radioStation = radioStationMax();
        } else {
            this.radioStation--;
        }
    }

    public void setRadioStation(int radioStation) {
        if (radioStation < 0 || radioStation > radioStationMax()) {
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