package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ItemSorterTest {

    @Test
    public void sortByAsc() {

        List<Item> items = Arrays.asList(
                new Item("aaaaa"),
                new Item("ddddd"),
                new Item("bbbbb"),
                new Item("ccccc")
        );

        List<Item> expected = Arrays.asList(
                new Item("aaaaa"),
                new Item("bbbbb"),
                new Item("ccccc"),
                new Item("ddddd")
        );

       Collections.sort(items, new SortByNameItemAsc());

        assertThat(items.toString(), is(expected.toString()));
    }

    @Test
    public void sortByDesc() {

        List<Item> items = Arrays.asList(
                new Item("aaaaa"),
                new Item("ddddd"),
                new Item("bbbbb"),
                new Item("ccccc")
        );

        List<Item> expected = Arrays.asList(
                new Item("ddddd"),
                new Item("ccccc"),
                new Item("bbbbb"),
                new Item("aaaaa")

        );

        Collections.sort(items, new SortByNameItemDesc());

        assertThat(items.toString(), is(expected.toString()));
    }
}