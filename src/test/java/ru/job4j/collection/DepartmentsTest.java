package ru.job4j.collection;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class DepartmentsTest {
    @Test
    public void whenMissed() {
        List<String> input = Arrays.asList("k1/sk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenNonChange3level() {
        List<String> input = Arrays.asList("k1/sk1/ssk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1", "k1/sk1/ssk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenNonChange() {
        List<String> input = Arrays.asList("k1", "k1/sk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenOrderAsc() {
        List<String> input = Arrays.asList("a6/ask6/assk6", "k6/sk6/ssk6", "k2/sk2/ssk2");
        List<String> result = Departments.fillGaps(input);
        Departments.sortAsc(result);

        assertThat(result.toString(), is(String.format("[a6, a6/ask6, a6/ask6/assk6,"
                                        + " k2, k2/sk2, k2/sk2/ssk2,"
                                        + " k6, k6/sk6, k6/sk6/ssk6]")));
    }

    @Test
    public void whenOrderDesc() {
        List<String> input = Arrays.asList("a6/ask6/assk6", "k6/sk6/ssk6", "a1", "z1", "k2/sk2/ssk2");
        List<String> result = Departments.fillGaps(input);
        Departments.sortDesc(result);

        assertThat(result.toString(), is(String.format("[z1, k6, k6/sk6, k6/sk6/ssk6,"
                + " k2, k2/sk2, k2/sk2/ssk2,"
                + " a6, a6/ask6, a6/ask6/assk6, a1]")));
    }
}