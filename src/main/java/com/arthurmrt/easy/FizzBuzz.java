package com.arthurmrt.easy;

import java.util.ArrayList;
import java.util.List;

//412. Fizz Buzz
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>(n);

        for(int i = 1; i <= n; i++){
            StringBuilder str = new StringBuilder();

            if((i % 3) == 0) { str.append("Fizz"); }
            if((i % 5) == 0) { str.append("Buzz"); }

            if(str.length() == 0) { str.append(i); }

            list.add(str.toString());
        }
        return list;
    }
}
