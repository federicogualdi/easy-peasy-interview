package com.federicogualdi.easypeasyinterview.service;

import com.federicogualdi.easypeasyinterview.rest.dto.exercise2.TriangleDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class Ex2TriangleService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Inject
    private DataService dataService;

    public TriangleDto computeTriangleData() {
        return computeTriangleData(dataService.getXYPoints());
    }

    protected TriangleDto computeTriangleData(List<List<Integer>> xyPoints) {
        logger.debug("xyPoints {}", xyPoints);
        //#TODO WRITE HERE YOUR CODE
        var dto = new TriangleDto();
        return dto;
    }
}
