package com.federicogualdi.easypeasyinterview.service;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class DataService {
    private static List<Integer> xPoints = new ArrayList<>(List.of(2, 2, 5, 5));
    private static List<Integer> yPoints = new ArrayList<>(List.of(1, 5, 5, 1));

    private static List<List<Integer>> xyPoints = List.of(List.of(1,2), List.of(5,8), List.of(0,9), List.of(15,2), List.of(3,4));

    public List<Integer> getRectangleXPoints() {
        return xPoints;
    }

    public List<Integer> getRectangleYPoints() {
        return yPoints;
    }

    public List<List<Integer>> getXYPoints() {
        return xyPoints;
    }
}
