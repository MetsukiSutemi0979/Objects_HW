package domain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    void createRadioWithDefaultConstructor() {
        Radio radio = new Radio();
        Assertions.assertEquals(10, radio.getStationCount());
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void createRadioWithCustomStationCount() {
        Radio radio = new Radio(15);
        assertEquals(15, radio.getStationCount());
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void setValidCurrentStation() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(15);
        assertEquals(15, radio.getCurrentStation());
    }

    @Test
    void setInvalidCurrentStation() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(25);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void nextFromMaxStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(9);
        radio.next();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void prevFromMinStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(0);
        radio.prev();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void increaseVolumeAtMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void decreaseVolumeAtMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

}

