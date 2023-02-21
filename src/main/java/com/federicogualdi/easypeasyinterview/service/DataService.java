package com.federicogualdi.easypeasyinterview.service;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class DataService {
    private static List<Integer> xPoints = new ArrayList<>(List.of(2, 2, 5, 5));
    private static List<Integer> yPoints = new ArrayList<>(List.of(1, 5, 5, 1));

    public List<Integer> getRectangleXPoints() {
        return xPoints;
    }

    public List<Integer> getRectangleYPoints() {
        return yPoints;
    }
}
