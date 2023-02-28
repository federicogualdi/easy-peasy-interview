package com.federicogualdi.easypeasyinterview.service;

import com.federicogualdi.easypeasyinterview.rest.dto.exercise1.RectangleDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class Ex1ShapesService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Inject
    private DataService dataService;

    public RectangleDto computeRectangleData() {
        return computeRectangleData(dataService.getRectangleXPoints(), dataService.getRectangleYPoints());
    }

    protected RectangleDto computeRectangleData(List<Integer> xPoints, List<Integer> yPoints) {
        logger.debug("xPoints {} | yPoints {}", xPoints, yPoints);
        //#TODO WRITE HERE YOUR CODE
        int sides = xPoints.size();
        // Calcolo del perimetro
        double perimetro = 0.0;
        for (int i = 0; i < sides; i++) {
            int j = (i + 1) % sides;
            double dx = xPoints.get(j) - xPoints.get(i);
            double dy = yPoints.get(j) - yPoints.get(i);
            perimetro += Math.sqrt(dx*dx + dy*dy);
        }

        // Calcolo dell'area
        double area = 0.0;
        for (int i = 0; i < sides; i++) {
            int j = (i + 1) % sides;
            area += xPoints.get(i) * yPoints.get(j) - xPoints.get(j) * yPoints.get(i);
        }
        area /= 2.0;
        var dto = new RectangleDto();
        dto.area = Math.abs(area);
        dto.perimeter = perimetro;
        return dto;
    }
}
