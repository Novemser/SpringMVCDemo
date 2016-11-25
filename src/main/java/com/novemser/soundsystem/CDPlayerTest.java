package com.novemser.soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Project: SpringMVCDemo
 * Package: com.novemser.soundsystem
 * Author:  Novemser
 * 2016/11/26
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Autowired
    private CompactDisc compactDisc;

    @Test
    public void cdShouldNotBeNull() {
        if (compactDisc == null)
            System.out.println("NO!");
        else
            System.out.println("YES!");
    }
}
