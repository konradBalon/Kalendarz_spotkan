package com.company;

import java.util.ArrayList;
import java.util.List;

public class Harmonogram {


    List<Spotkanie> harmonograms = new ArrayList<>();


    void ustawSpotkanie(Spotkanie spotkanie) {
        harmonograms.add(spotkanie);
    }

    void ustawSpotkanie(String nazwa, int dzienMiesiaca, Miesiac miesiac,
                        DniTygodnia dzienTygodnia) {

        harmonograms.add(new Spotkanie("meeting", 31, DniTygodnia.SAT, Miesiac.AUG));

    }

    void wyswietlWszystkieSpotkania() {
        System.out.println(harmonograms);

    }


    }


