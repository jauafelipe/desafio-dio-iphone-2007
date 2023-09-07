package Iphone;

import AppsMusicais.Deezer;
import AppsMusicais.Spotify;
import Navegador.NavegadorSafari;

public class SmartphoneIphone implements IphoneMedia {
    public static void main(String[] args) {
        SmartphoneIphone smartphoneIphone = new SmartphoneIphone();
        smartphoneIphone.ligarAparelho();
        System.out.println(smartphoneIphone.abrirApp() + " Deezer");
        Deezer deezer = new Deezer();
        deezer.addMusics("musica 1 deezer", "msc1", 1);
        deezer.addMusics("musica 2 deezer", "msc2", 2);
        deezer.addMusics("musica 3 deezer", "msc3", 3);
        Spotify spotify = new Spotify();
        System.out.println(smartphoneIphone.abrirApp() + " Spotify");

        spotify.addMusics("name1", "name msc1", 1);
        spotify.addMusics("name2", "name msc2", 2);
        spotify.addMusics("name3", "name msc4", 3);
        NavegadorSafari navegadorSafari = new NavegadorSafari();
        navegadorSafari.setUrl("youtube");
        System.out.println(navegadorSafari.getUrl());









        deezer.allMusicas();
        spotify.allMusicas();


    }
    @Override
    public String ligarAparelho() {
    return "aparelho ligado";
    }

    @Override
    public String abrirApp() {
        return "abrindo app";
    }
}
