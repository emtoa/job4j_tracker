package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.IsNull.nullValue;

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
        Item item1 = new Item("test2");
        tracker.add(item1);
        Item[] result = tracker.findByName(item.getName());
        assertThat(result[0].getId(), is(item.getId()));
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

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }

    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        tracker.delete(id);
        assertThat(tracker.findById(id), is(nullValue()));
    }

}