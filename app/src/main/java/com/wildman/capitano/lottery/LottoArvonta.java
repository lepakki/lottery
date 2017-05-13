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


    static String generateRow(int count) {

        StringBuilder stringBuilder = new StringBuilder(232);

        for (int spartacus = 0; spartacus < count; spartacus++) {

            SortedSet<Integer> rivi = new TreeSet<>();


            while (rivi.size() < 7) {
                rivi.add((int) (Math.random() * 40) + 1);
            }

            //rivi2.toArray();
            //rivi2.toString();

            stringBuilder.append(rivi.toString() + '\n');

        }
        return stringBuilder.toString();
    }
}
