package com.wildman.capitano.lottery;

import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Capitano on 12.5.2017.
 */

public class LottoArvonta {



    static String generateRow(){
        ArrayList<Integer> rivi3 = new ArrayList<>();
        Set<Integer> rivi2 = new HashSet<>();
        int[] rivi = new int[7];
        StringBuilder stringBuilder = new StringBuilder(232);

        for(int i = 0; i < rivi.length; i++){
            rivi2.add((int)(Math.random() * 40) + 1);
            //rivi[i] = (int)(Math.random() * 40) + 1;
        }

        for(int g : rivi2){
            rivi3.add(rivi2.iterator().next());
        }

        Arrays.sort(rivi);

        for(int f = 0; f < rivi.length; f++){
            stringBuilder.append(Integer.toString(rivi[f])+" ");

        }



        /*for(int i = 0; i <= rivi.length; i++){
            int j = (int)Math.ceil(Math.random() * 40);
            rivistring += Integer.toString(j);
        }*/
        return stringBuilder.toString();
    }
}
