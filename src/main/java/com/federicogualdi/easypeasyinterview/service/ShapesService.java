package com.federicogualdi.easypeasyinterview.service;

import com.federicogualdi.easypeasyinterview.rest.dto.RectangleDto;
import com.federicogualdi.easypeasyinterview.shape.Point;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.*;

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
        List<Point> pointList = new ArrayList<>();
        for (int i = 0; i < xPoints.size(); i++) {
            Point p = new Point(xPoints.get(i), yPoints.get(i));
            pointList.add(p);
        }
        Double distanceAB = pointList.get(0).computeDistance(pointList.get(1));
        Double distanceAC = pointList.get(0).computeDistance(pointList.get(2));
        Double distanceAD = pointList.get(0).computeDistance(pointList.get(3));
        Double max = Math.max(Math.max(distanceAB, distanceAC), distanceAD);
        logger.info("{} {} {}. max {}",distanceAB, distanceAC, distanceAD, max);
        var dto = new RectangleDto();
        Deque<Double> distancesList = new ArrayDeque<>();
        distancesList.addAll(List.of(distanceAB, distanceAC, distanceAD));
        distancesList.remove(max);
        dto.base = distancesList.pop();
        dto.height = distancesList.pop();
        dto.area = dto.base*dto.height;
        dto.perimeter = 2*(dto.base+ dto.height);
        return dto;
    }
}
