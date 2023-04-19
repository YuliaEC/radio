public class Radio {
    private int numberOfRadio = 10; //количество радиостанций
    private int currentStation = 0; //станция 0..9
    private int minStation = 0; //минимальная станция
    private int maxStation = 9; //максимальная станция
    private int volume = 0; // громкость 0..100
    private int maxVolume = 100; //максимальная громкость
    private int minVolume = 0; //минимальная громкость

    public Radio() {

    }

    public Radio(int numberOfRadio) {
        this.numberOfRadio = numberOfRadio;
        maxStation = numberOfRadio - 1;
    }

    public int getMaxStation() {
        return maxStation;
    } // для тестов

    public int getCurrentStation() {
        return currentStation;
    }

    public int getNumberOfRadio() {
        return numberOfRadio;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void next() {
        if (currentStation == maxStation) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation == minStation) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }

    // ===================================Volume===================================
    public int getCurrentVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        }
        volume = newVolume;
    }

    public void increaseVolume() {
        if (volume < maxVolume) {
            volume = volume + 1;
        }
    }

    public void decreaseVolume() {
        if (volume > minVolume) {
            volume = volume - 1;
        }
    }
}
