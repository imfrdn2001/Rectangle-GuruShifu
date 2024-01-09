package com.thoughtworks.rectangle;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

import static org.hamcrest.Matchers.is;


import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    void shouldReturnAreaWhenLengthAndBreadthIsGiven() {
        Rectangle rectangle = new Rectangle(3,9);
        double actual = rectangle.area();
        assertThat(actual, is(closeTo(27,0.1)));
       
    }

    @Test
    void shouldReturnPerimeterWhenLengthAndBreadthIsGiven() {
        Rectangle rectangle = new Rectangle(3,9);
        double actual = rectangle.perimeter();
        assertThat(actual, is(closeTo(24,0.1)));
    }


    
}