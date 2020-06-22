package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenAllItem() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        /* Добавим в tracker новую заявку */
        Item item = tracker.add(new Item("Find all item"));
        String expected = "Find all item";
        /* Входные данные должны содержать ID добавленной заявки item.getId() */
        Input in = new StubInput(
                new String[] {"0",  "1"}
        );
        UserAction[] actions = {
                new AllAction(output),
                new ExitAction()
        };

        new StartUI(output).init(in, tracker, actions);
        assertThat(output.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. === Show all ticket ====" + System.lineSeparator()+
                        "1. === Exit Program ====" + System.lineSeparator()+
                        "All ticket:" + System.lineSeparator()+
                        item.getId()+" | Find all item"+ System.lineSeparator()+
                        "Menu." + System.lineSeparator() +
                        "0. === Show all ticket ====" + System.lineSeparator()+
                        "1. === Exit Program ====" + System.lineSeparator()
        ));

    }

    @Test
    public void whenFindByNameItem() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        /* Добавим в tracker новую заявку */
        Item item = tracker.add(new Item("Find by Name item"));
        String expected = "Find by Name item";
        /* Входные данные должны содержать ID добавленной заявки item.getId() */
        Input in = new StubInput(
                new String[] {"0", item.getName(), "1"}
        );
        UserAction[] actions = {
                new FindByNameAction(output),
                new ExitAction()
        };
        new StartUI(output).init(in, tracker, actions);

        assertThat(output.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. === Find by Name ticket ====" + System.lineSeparator()+
                        "1. === Exit Program ====" + System.lineSeparator()+
                        item.getId()+" | Find by Name item"+ System.lineSeparator()+
                        "Menu." + System.lineSeparator() +
                        "0. === Find by Name ticket ====" + System.lineSeparator()+
                        "1. === Exit Program ====" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindByIdItem() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        /* Добавим в tracker новую заявку */
        Item item = tracker.add(new Item("Find by ID item"));
        String expected = "Find by ID item";
        /* Входные данные должны содержать ID добавленной заявки item.getId() */
        Input in = new StubInput(
                new String[] {"0", item.getId(), "1"}
        );
        UserAction[] actions = {
                new FindByIdAction(output),
                new ExitAction()
        };
        new StartUI(output).init(in, tracker, actions);

        assertThat(output.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. === Find by ID ticket ====" + System.lineSeparator()+
                        "1. === Exit Program ====" + System.lineSeparator()+
                        "Ticket:"+item.getId()+" | Find by ID item"+ System.lineSeparator()+
                        "Menu." + System.lineSeparator() +
                        "0. === Find by ID ticket ====" + System.lineSeparator()+
                        "1. === Exit Program ====" + System.lineSeparator()
        ));
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. === Exit Program ====" + System.lineSeparator()
        ));
    }
}