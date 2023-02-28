package com.federicogualdi.easypeasyinterview.service;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import java.util.List;

@QuarkusTest
public class Ex2TriangleServiceTest {
    @Inject
    Ex2TriangleService triangleService;

    @Test
    public void testTriangleComputation() {
        var points = List.of(List.of(3, 3), List.of(1, 2), List.of(10,15), List.of(30,1));
        var rectangle = triangleService.computeTriangleData(points);
        Assertions.assertAll("It should ensure the correctness of the calculation of the triangle perimeter",
                () -> Assertions.assertEquals(Math.round(rectangle.perimeter), Math.round(69.2417))
        );
    }

    @Test
    public void testRotatedRectangleComputation() {
        var points = List.of(List.of(-3, 3), List.of(1, 2), List.of(-10,15), List.of(30,-1));
        var rectangle = triangleService.computeTriangleData(points);
        Assertions.assertAll("It should ensure the correctness of the calculation of the triangle perimeter with negative points",
                () -> Assertions.assertEquals(Math.round(rectangle.perimeter), Math.round(90.2153))
        );
    }
}
