package com.company;

public class Spotkanie {


    String nazwa;

    int dzienMiesiaca;
    DniTygodnia day;

    public Spotkanie(String nazwa, int dzienMiesiaca, DniTygodnia day, Miesiac month) {
        this.nazwa = nazwa;
        this.dzienMiesiaca = dzienMiesiaca;
        this.day = day;
        this.month = month;
    }

    @Override
    public String toString() {
        return "Spotkanie{" +
                "nazwa ='" + nazwa + '\'' +
                ", dzienMiesiaca=" + dzienMiesiaca +
                ", day=" + day +
                ", month=" + month +
                '}';
    }

    Miesiac month;



    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getDzienMiesiaca() {
        return dzienMiesiaca;
    }

    public void setDzienMiesiaca(int dzienMiesiaca) {
        this.dzienMiesiaca = dzienMiesiaca;
    }

}

