package com.samadkvirani.mock_interview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlightCostTest {

    FlightCost flightCost = new FlightCost();

    @Test
    public void test () {
        int[][] costs = {{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}};

        int returned = flightCost.twoCitySchedCost(costs);

        assertEquals(1859, returned);
    }

}