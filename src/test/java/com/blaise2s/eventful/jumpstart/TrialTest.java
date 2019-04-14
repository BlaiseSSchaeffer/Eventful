package com.blaise2s.eventful.jumpstart;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TrialTest {

    private static final String TRIAL_NAME = "Testing 123";
    private static final Trial TRIAL;

    static {
        TRIAL = new Trial(TRIAL_NAME);
    }

    @Test
    public void testGetters() {
        assertEquals(TRIAL_NAME, TRIAL.getTrialName());
    }
}
