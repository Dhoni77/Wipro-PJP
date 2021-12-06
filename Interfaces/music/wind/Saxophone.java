package com.AbstractionPackagesExceptionHandling.Interfaces.music.wind;

import com.AbstractionPackagesExceptionHandling.Interfaces.Playable;

public class Saxophone implements Playable {

    @Override
    public void play() {
        System.out.println("Saxophone is playing");
    }
}
