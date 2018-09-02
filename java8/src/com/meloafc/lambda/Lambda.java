package com.meloafc.lambda;

import java.util.Arrays;
import java.util.List;

public class Lambda {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3);
        numeros.forEach(numero -> System.out.println(numero));
    }

}
