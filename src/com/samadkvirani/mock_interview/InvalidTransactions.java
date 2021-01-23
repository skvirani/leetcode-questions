package com.samadkvirani.mock_interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InvalidTransactions {
    public List<String> invalidTransactions(String[] transactions) {
        //[name, time, amount, city]
        ArrayList<String> invalidTrans = new ArrayList<>();
        List<HashMap<String, String>> trans = new ArrayList<>();
        for (String t : transactions) {
            String[] tran = t.split(",");
            trans.add((HashMap<String, String>) new HashMap<>().put("name", tran[0]));
            trans.add((HashMap<String, String>) new HashMap<>().put("time", tran[1]));
            trans.add((HashMap<String, String>) new HashMap<>().put("amount", tran[2]));
            trans.add((HashMap<String, String>) new HashMap<>().put("city", tran[3]));


        }

        for (int i = 0; i < transactions.length; i++) {

            String[] tran = transactions[i].split(",");
            if (Integer.parseInt(tran[2]) > 1000) {
                StringBuilder stringBuilder = new StringBuilder();
                for (String t : tran) {
                    stringBuilder.append(t);
                }
                invalidTrans.add(stringBuilder.toString());
            } else if (Integer.parseInt(tran[1]) >= 60) {

            }
        }
        return null;
    }
}
