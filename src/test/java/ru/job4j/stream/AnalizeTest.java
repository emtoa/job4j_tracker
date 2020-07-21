package ru.job4j.stream;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AnalizeTest {
        @Test
        public void whenLinearFunctionThenLinearResults() {
            List<User> first = List.of(
                    new User(1, "One"),
                    new User(2, "Two"),
                    new User(3, "Three")
            );

            List<User> second = List.of(
                    new User(1, "One"),
                    new User(3, "Three"),
                    new User(0, "Zero")
            );

            Info inf = Analize.diff(first, second);

            assertThat(inf.added, is(1));
            assertThat(inf.changed, is(0));
            assertThat(inf.deleted, is(1));

        }
}