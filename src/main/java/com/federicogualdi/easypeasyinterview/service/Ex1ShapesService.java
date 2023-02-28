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
        var dto = new RectangleDto();
        return dto;
    }
}
