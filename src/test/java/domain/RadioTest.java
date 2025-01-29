package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSetValidRadioStation() {
        Radio radio = new Radio();
        radio.setRadioStation(5);
        assertEquals(5, radio.getRadioStation());
    }

    @Test
    void shouldSetMaxRadioStationWhenBelowZero() {
        Radio radio = new Radio();
        radio.setRadioStation(-1);
        assertEquals(9, radio.getRadioStation());
    }

    @Test
    void shouldSetMinRadioStationWhenAboveNine() {
        Radio radio = new Radio();
        radio.setRadioStation(10);
        assertEquals(0, radio.getRadioStation());
    }

    @Test
    void shouldIncreaseStationWhenNotMax() {
        Radio radio = new Radio();
        radio.setRadioStation(8);
        radio.nextRadioStation();
        assertEquals(9, radio.getRadioStation());
    }

    @Test
    void shouldNotIncreaseStationAtMax() {
        Radio radio = new Radio();
        radio.setRadioStation(9);
        radio.nextRadioStation();
        assertEquals(9, radio.getRadioStation());
    }

    @Test
    void shouldDecreaseStationWhenNotMin() {
        Radio radio = new Radio();
        radio.setRadioStation(1);
        radio.prevRadioStation();
        assertEquals(0, radio.getRadioStation());
    }

    @Test
    void shouldNotDecreaseStationAtMin() {
        Radio radio = new Radio();
        radio.setRadioStation(0);
        radio.prevRadioStation();
        assertEquals(0, radio.getRadioStation());
    }

    // ================= Тесты для громкости =================

    @Test
    void shouldSetValidVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    void shouldSetMinVolumeWhenBelowZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-10);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldSetMaxVolumeWhenAboveHundred() {
        Radio radio = new Radio();
        radio.setCurrentVolume(150);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolumeWhenNotMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldNotIncreaseVolumeAtMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolumeWhenNotMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldNotDecreaseVolumeAtMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}



