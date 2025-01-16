package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetMaxRadioStation() {
        Radio rad = new Radio();
        rad.maxNumberRadioStation();
        int expected = 9;
        int actual = rad.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void shouldSetMinRadioStation() {
        Radio rad = new Radio();
        rad.minNumberRadioStation();
        int expected = 0;
        int actual = rad.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void shouldNotSetRadioStationAboveMax() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStation(10);

        int expected = 0;
        int actual = rad.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void shouldNotSetRadioStationBelowMin() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStation(-1);

        int expected = 9;
        int actual = rad.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theNumberOfTheCurrentRadioStationHasIncreased_1() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStation(8);
        rad.valueRadioStationUp();

        int expected = 9;
        int actual = rad.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void theNumberOfTheCurrentRadioStationHasIncreased_2() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStation(8);
        rad.valueRadioStationUp();

        int expected = 9;
        int actual = rad.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void theNumberOfTheCurrentRadioStationHasIncreased_3() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStation(1);
        rad.valueRadioStationDown();

        int expected = 0;
        int actual = rad.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void theNumberOfTheCurrentRadioStationHasDecreased_1() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStation(0);
        rad.valueRadioStationDown();
        int expected = 9;
        int actual = rad.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void theNumberOfTheCurrentRadioStationHasDecreased_2() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStation(9);
        rad.valueRadioStationDown();
        int expected = 8;
        int actual = rad.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void theNumberOfTheCurrentRadioStationHasDecreased_3() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStation(1);
        rad.valueRadioStationDown();
        int expected = 0;
        int actual = rad.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theMaxVolumeShouldBeSet() {
        Radio rad = new Radio();
        rad.maxSoundVolumeRadio();
        int expected = 100;
        int actual = rad.getSoundVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void theMinVolumeShouldBeSet() {
        Radio rad = new Radio();
        rad.minSoundVolumeRadio();
        int expected = 0;
        int actual = rad.getSoundVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        Radio rad = new Radio();
        rad.setSoundVolumeRadio(-1);
        int expected = 0;
        int actual = rad.getSoundVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void theSoundVolumeHasIncreased_1() {
        Radio rad = new Radio();
        rad.setSoundVolumeRadio(99);
        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getSoundVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void theSoundVolumeHasIncreased_2() {
        Radio rad = new Radio();
        rad.setSoundVolumeRadio(0);
        rad.increaseVolume();

        int expected = 1;
        int actual = rad.getSoundVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void theSoundVolumeHasIncreased_3() {
        Radio rad = new Radio();
        rad.setSoundVolumeRadio(100);
        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getSoundVolumeRadio();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void theVolumeOfTheSoundHasDecreased_1() {
        Radio rad = new Radio();

        rad.setSoundVolumeRadio(1);
        rad.downVolume();

        int expected = 0;
        int actual = rad.getSoundVolumeRadio();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void theVolumeOfTheSoundHasDecreased_2() {
        Radio rad = new Radio();

        rad.setSoundVolumeRadio(100);
        rad.downVolume();

        int expected = 99;
        int actual = rad.getSoundVolumeRadio();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void theVolumeOfTheSoundHasDecreased_3() {
        Radio rad = new Radio();

        rad.setSoundVolumeRadio(0);
        rad.downVolume();
        int expected = 0;
        int actual = rad.getSoundVolumeRadio();

        Assertions.assertEquals(expected,actual);
    }
}
