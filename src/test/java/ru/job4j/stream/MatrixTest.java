package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.stream.Matrix.matrixToList;

public class MatrixTest {
    @Test
    public void whenMatrixToList() {
        Integer[][] matrix = new Integer[2][2];

        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[1][0] = 3;
        matrix[1][1] = 4;

        List<Integer> expect = List.of(1, 2, 3, 4);

        assertThat(matrixToList(matrix), is(expect));

    }
}