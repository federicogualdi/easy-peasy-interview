package com.federicogualdi.easypeasyinterview.service;

import com.federicogualdi.easypeasyinterview.rest.dto.RectangleDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class ShapesService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Inject
    DataService dataService;

    public RectangleDto computeRectangleData() {
        logger.debug("xPoints {} | yPoints {}", dataService.getRectangleXPoints(), dataService.getRectangleYPoints());
        // WRITE HERE YOUR CODE
        var dto = new RectangleDto();
        return dto;
    }
}
