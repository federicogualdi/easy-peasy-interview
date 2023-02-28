package com.federicogualdi.easypeasyinterview.rest.dto.exercise2;

public class TriangleDto {
    public Double perimeter;

    @Override
    public String toString() {
        return String.format("Triangle: perimeter=%s.", perimeter);
    }
}
