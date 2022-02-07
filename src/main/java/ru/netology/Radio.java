package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {

    private int radioStation;
    private int volume;
    private int createNumberRadioStation = 10;
    private int maxRadioStation = radioStationMax();



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
