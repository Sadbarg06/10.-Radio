package ru.netology.service;

public class Radio {
    public int numberCurrentRadioStation;

    private int soundVolumeRadio;

    public int getNumberCurrentRadioStation() {
        return numberCurrentRadioStation;
    }

    public void setNumberCurrentRadioStation(int newNumberCurrentRadioStation) {
        if (newNumberCurrentRadioStation < 0) {
            newNumberCurrentRadioStation = 9;
        }
        if (newNumberCurrentRadioStation > 9) {
            newNumberCurrentRadioStation = 0;
        }
        numberCurrentRadioStation = newNumberCurrentRadioStation;
    }

    public int getSoundVolumeRadio() {
        return soundVolumeRadio;
    }

    public void setSoundVolumeRadio(int newSoundVolumeRadio) {
        if (newSoundVolumeRadio > 100) {
            newSoundVolumeRadio = 100;
        }
        if (newSoundVolumeRadio < 0) {
            newSoundVolumeRadio = 0;
        }
        soundVolumeRadio = newSoundVolumeRadio;
    }

    public void maxNumberRadioStation() {
        numberCurrentRadioStation = 9;
    }

    public void minNumberRadioStation() {
        numberCurrentRadioStation = 0;
    }

    public void valueRadioStationUp() {
        int stationIncrease = numberCurrentRadioStation + 1;
        setNumberCurrentRadioStation(stationIncrease);
    }

    public void valueRadioStationDown() {
        int stationReduction = numberCurrentRadioStation - 1;
        setNumberCurrentRadioStation(stationReduction);
    }

    public void maxSoundVolumeRadio() {
        soundVolumeRadio = 100;
    }

    public void minSoundVolumeRadio() {
        soundVolumeRadio = 0;
    }

    public void increaseVolume() {
        if (soundVolumeRadio < 100) {
            soundVolumeRadio = soundVolumeRadio + 1;
        }
    }

    public void downVolume() {
        if (soundVolumeRadio > 0) {
            soundVolumeRadio = soundVolumeRadio - 1;
        }
    }
}

