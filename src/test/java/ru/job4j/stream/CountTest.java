package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CountTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = Count.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenSquareFunctionThenSquareResults() {
        List<Double> result = Count.diapason(1, 5, x -> Math.pow(x, 2));
        List<Double> expected = Arrays.asList(1D, 4D, 9D, 16D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunctionThenExponentialResults() {
        List<Double> result = Count.diapason(1, 5, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(2D, 4D, 8D, 16D);
        assertThat(result, is(expected));
    }
    }