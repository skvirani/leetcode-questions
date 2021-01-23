package com.samadkvirani.mock_interview;

import java.util.ArrayList;
import java.util.HashMap;

public class FlightCost {
    public int twoCitySchedCost(int[][] costs) {
        int total = 0;
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        HashMap<Integer, Integer> loser = new HashMap<>();


        for (int i = 0; i < costs.length; i++) {
            if (Math.min(costs[i][0], costs[i][1]) == costs[i][0]) {
                a.add(costs[i][0]);
            } else {
                b.add(costs[i][1]);
            }
            loser.put(i, -costs[i][0] + costs[i][1]);
        }

        if (a.size() == b.size()) {
            for (int i = 0; i < a.size(); i++) {
                total += a.get(i) + b.get(i);
            }
        } else if(a.size() < b.size()) {
            while (a.size() != costs.length/2) {
//                if (loser.
            }
        } else if (a.size() > b.size()) {
            while (b.size() != costs.length/2) {

            }
        }


        return total;

    }
}