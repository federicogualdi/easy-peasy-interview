package com.federicogualdi.easypeasyinterview.rest.dto.exercise1;

public class RectangleDto {
    public Double base;
    public Double height;
    public Double perimeter;
    public Double area;

    @Override
    public String toString() {
        return String.format("Rectangle: base=%s height=%s, perimeter=%s, area=%s.", base, height, perimeter, area);
    }
}
