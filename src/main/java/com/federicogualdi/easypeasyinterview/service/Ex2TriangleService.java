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
        var perimeter = 0.0;
        for (int i = 0; i < xyPoints.size(); i++) {
            for (int j = i + 1; j < xyPoints.size(); j++) {
                for (int k = j + 1; k < xyPoints.size(); k++) {
                    var p1 = xyPoints.get(i);
                    var p2 = xyPoints.get(j);
                    var p3 = xyPoints.get(k);
                    var distP1P2 = computeDistance(p1, p2);
                    var distP2P3 = computeDistance(p2, p3);
                    var distP3P1 = computeDistance(p3, p1);
                    perimeter = Math.max(perimeter, distP1P2 + distP2P3 + distP3P1);
                }
            }
        }
        var dto = new TriangleDto();
        dto.perimeter = perimeter;
        return dto;
    }

    private double computeDistance(List<Integer> p1, List<Integer> p2) {
        return Math.hypot((p1.get(0) - p2.get(0)), (p1.get(1) - p2.get(1)));
    }
}
