package domain;
public class Radio {
    private int currentStation;
    private int currentVolume;
    private int stationCount;
    private int maxStation;

    public Radio() {
        this(10);
    }

    public Radio(int stationCount) {

        this.stationCount = stationCount;
        this.maxStation = stationCount - 1;
        this.currentStation = 0;
        this.currentVolume = 50;
    }

    public void next() {
        currentStation = (currentStation == maxStation) ? 0 : currentStation + 1;
    }

    public void prev() {
        currentStation = (currentStation == 0) ? maxStation : currentStation - 1;
    }

    public void setCurrentStation(int station) {
        if (station >= 0 && station <= maxStation) {
            currentStation = station;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getStationCount() {
        return stationCount;
    }
}
