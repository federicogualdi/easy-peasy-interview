package com.federicogualdi.easypeasyinterview.service.mock;

import com.federicogualdi.easypeasyinterview.service.DataService;
import io.quarkus.test.Mock;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@Mock
@ApplicationScoped
public class DataServiceMock extends DataService {
    @Override
    public List<Integer> getRectangleXPoints() {
        return List.of(3, 3, 4, 4);
    }

    @Override
    public List<Integer> getRectangleYPoints() {
        return List.of(2, 5, 5, 2);
    }
}
