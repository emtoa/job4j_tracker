package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {

    @Test
    public void whenCompatorByNameAsc() {
        Comparator<Job> cmpNameAsc = new JobAscByName();
        int rsl = cmpNameAsc.compare(
                new Job("aaaa", 9),
                new Job("bbbb", 4)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameDesc() {
        Comparator<Job> cmpNameDesc = new JobDescByName();
        int rsl = cmpNameDesc.compare(
                new Job("bbbb", 4),
                new Job("aaaa", 9)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByPriorityAsc() {
        Comparator<Job> cmpPriorityAsc = new JobAscByPriority();
        int rsl = cmpPriorityAsc.compare(
                new Job("bbbb", 4),
                new Job("aaaa", 9)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByPriorityDesc() {
        Comparator<Job> cmpPriorityDesc = new JobDescByPriority();
        int rsl = cmpPriorityDesc.compare(
                new Job("aaaa", 9),
                new Job("bbbb", 4)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameAscAndProrityAsc() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("aaaa", 4),
                new Job("aaaa", 9)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameAscAndProrityDesc() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("aaaa", 9),
                new Job("aaaa", 4)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameDescAndProrityAsc() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("aaaa", 4),
                new Job("aaaa", 9)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameDescAndProrityDesc() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("aaaa", 9),
                new Job("aaaa", 4)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }
}