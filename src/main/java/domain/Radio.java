package domain;
public class Radio {
    private int radioStation;
    private int currentVolume;

    public void setRadioStation(int newRadioStation) {
        if (newRadioStation < 0){
            newRadioStation = 9;

        }
        if (newRadioStation > 9){
            newRadioStation = 0;
        }
        radioStation = newRadioStation;
    }

    public void nextRadioStation() {
        if (radioStation < 9){
            radioStation = radioStation + 1;
        }
    }

    public void prevRadioStation() {
        if (radioStation > 0){
            radioStation = radioStation - 1;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0){
            newCurrentVolume = 0;
        }
        if (newCurrentVolume > 100){
            newCurrentVolume = 100;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume(){
        if (currentVolume < 100){
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume(){
        if (currentVolume > 0){
            currentVolume = currentVolume - 1;
        }
    }

    public int getRadioStation() {
        return radioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}
