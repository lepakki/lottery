package com.wildman.capitano.lottery;

import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by Capitano on 12.5.2017.
 */

public class LottoArvonta {

    static String generateRow(int selection, int count) {

        StringBuilder stringBuilder = new StringBuilder(232);

        switch (selection) {
            case 1:
                //Lotto 7 (1-40)
                for (int spartacus = 0; spartacus < count; spartacus++) {
                    SortedSet<Integer> rivi = new TreeSet<>();
                    while (rivi.size() < 7) {
                        rivi.add((int) (Math.random() * 40) + 1);
                    }
                    stringBuilder.append(rivi.toString() + '\n');
                }
                return stringBuilder.toString();
            case 2:
                //Eurojackpot 5 + 2 (1-50;1-10)
                for (int spartacus = 0; spartacus < count; spartacus++) {
                    SortedSet<Integer> rivi = new TreeSet<>();
                    SortedSet<Integer> star = new TreeSet<>();
                    while (rivi.size() < 5) {
                        rivi.add((int) (Math.random() * 50) + 1);
                    }
                    while (star.size() < 2) {
                        star.add((int) (Math.random() * 10) + 1);
                    }
                    stringBuilder.append(rivi.toString() + " : " + star.toString() + '\n');
                }
                return stringBuilder.toString();
            case 3:
                //Viking Lotto 6 (1-48)
                for (int spartacus = 0; spartacus < count; spartacus++) {
                    SortedSet<Integer> rivi = new TreeSet<>();
                    while (rivi.size() < 6) {
                        rivi.add((int) (Math.random() * 48) + 1);
                    }
                    stringBuilder.append(rivi.toString() + '\n');
                }
                return stringBuilder.toString();
            default:
                break;
        }
        return "";
    }
}