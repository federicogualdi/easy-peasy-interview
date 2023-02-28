package com.federicogualdi.easypeasyinterview.service;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import java.util.List;

@QuarkusTest
public class Ex1ShapeServiceTest {
    @Inject
    Ex1ShapesService shapesService;

    @Test
    public void testRectangleComputation() {
        var rectangle = shapesService.computeRectangleData(List.of(3, 3, 4, 4), List.of(2, 5, 5, 2));
        Assertions.assertAll("It should ensure the correctness of the calculation of the rectangle data",
                () -> Assertions.assertEquals(rectangle.perimeter, 8),
                () -> Assertions.assertEquals(rectangle.area, 3)
        );
    }

    @Test
    public void testRotatedRectangleComputation() {
        var rectangle = shapesService.computeRectangleData(List.of(1, 4, 3, 0), List.of(0, 3, 4, 1));
        Assertions.assertAll("It should ensure the correctness of the calculation of the rectangle data",
                () -> Assertions.assertEquals(Math.round(rectangle.perimeter), Math.round(11.31370849898476)),
                () -> Assertions.assertEquals(rectangle.area, 6.0)
        );
    }
}
