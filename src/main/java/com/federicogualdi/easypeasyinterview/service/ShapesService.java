package com.federicogualdi.easypeasyinterview.service;

import com.federicogualdi.easypeasyinterview.rest.dto.RectangleDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class ShapesService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Inject
    private DataService dataService;

    public RectangleDto computeRectangleData() {
        return computeRectangleData(dataService.getRectangleXPoints(), dataService.getRectangleYPoints());
    }

    protected RectangleDto computeRectangleData(List<Integer> xPoints, List<Integer> yPoints) {
        logger.debug("xPoints {} | yPoints {}", xPoints, yPoints);
        // WRITE HERE YOUR CODE
        var dto = new RectangleDto();

        Integer BC = xPoints.get(2) - xPoints.get(1);
//        Integer AB = yPoints.get(1) - yPoints.get(0);
        Double AB = Math.sqrt(Math.pow(xPoints.get(1) - xPoints.get(0), 2) + Math.pow(yPoints.get(1) - yPoints.get(0), 2));


        dto.base = AB;
        dto.height = new Double(BC);
        dto.perimeter = dto.base * 2 + dto.height * 2;
        dto.area = dto.base * dto.height;

        return dto;
    }
}
