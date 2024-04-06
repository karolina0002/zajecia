package jp2024gr1zaj4;

public class Samochod {

    String nazwa;
    int dlugosc; //mm
    int szerokosc; //mm
    int predkoscJazdy; //km/h

    public Samochod() {
    }

    public Samochod(String nazwa, int dlugosc, int szerokosc, int predkoscJazdy) {
        this.nazwa = nazwa;
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
        this.predkoscJazdy = predkoscJazdy;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    public int getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(int szerokosc) {
        this.szerokosc = szerokosc;
    }

    public int getPredkoscJazdy() {
        return predkoscJazdy;
    }

    public void setPredkoscJazdy(int predkoscJazdy) {
        this.predkoscJazdy = predkoscJazdy;
    }

    @Override
    public String toString() {
        return "[" + nazwa + "," + dlugosc + "," + szerokosc + "," + predkoscJazdy + "]";
    }

}
