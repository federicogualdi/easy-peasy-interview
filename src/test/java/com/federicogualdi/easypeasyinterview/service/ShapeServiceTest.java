package com.federicogualdi.easypeasyinterview.service;

import com.federicogualdi.easypeasyinterview.rest.dto.RectangleDto;
import com.federicogualdi.easypeasyinterview.service.ShapesService;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@QuarkusTest
public class ShapeServiceTest {
    @Inject ShapesService shapesService;

    @Test
    public void testRectangleComputation(){
        var rectangle = shapesService.computeRectangleData();
        Assertions.assertAll("It should ensure the correctness of the calculation of the rectangle data",
                ()->Assertions.assertEquals(rectangle.perimeter, 8),
                ()->Assertions.assertEquals(rectangle.area, 3)
        );
    }
}
