package com.novemser.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Project: SpringMVCDemo
 * Package: com.novemser.soundsystem
 * Author:  Novemser
 * 2016/11/25
 */
@Component
public class SgtPeppers implements CompactDisc {

    public void play() {
        System.out.println("play:" + getClass().getName());
    }
}
