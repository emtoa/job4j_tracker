package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerFindById() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenAddNewItemThenTrackerFindByName() {
        Tracker tracker = new Tracker();
        Item item = new Item("test2");
        tracker.add(item);
        Item result = tracker.findByName(item.getName());
        assertThat(result.getId(), is(item.getId()));
    }

    @Test
    public void whenAddNewItemThenTrackerFindAll() {
        Tracker tracker = new Tracker();
        Item item0 = new Item("test3");
        tracker.add(item0);
        Item item1 = new Item("test4");
        tracker.add(item1);
        Item[] result = tracker.findAll();

         assertThat(result[0], is(item0));
         assertThat(result[0].getId(), is(item0.getId()));
         assertThat(result[0].getName(), is(item0.getName()));

        assertThat(result[1], is(item1));
        assertThat(result[1].getId(), is(item1.getId()));
        assertThat(result[1].getName(), is(item1.getName()));
        }
}