package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
Spotkanie spotkanie = new Spotkanie("takie tam",23,DniTygodnia.MON,Miesiac.JUL);

Harmonogram harmonogram = new Harmonogram();
harmonogram.ustawSpotkanie(spotkanie);
harmonogram.ustawSpotkanie("meeting", 23,Miesiac.AUG, DniTygodnia.SAT);
harmonogram.wyswietlWszystkieSpotkania();


    }
}