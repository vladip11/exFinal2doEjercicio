/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com470.p4app.service;

import com.com470.p4app.model.MinimoMaximo;
import java.util.Arrays;
import java.util.List;
import org.hamcrest.Matchers;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author VladimirP11
 */
@RunWith(Parameterized.class)
public class BuscarMinimoMaximoTest {

    private static final List<Integer> l1 = Arrays.asList(5,8,2);
    private static final List<Integer> r1 = Arrays.asList(2,8);

    private static final List<Integer> l2 = Arrays.asList(6,8,9,5,1,6,2);
    private static final List<Integer> r2 = Arrays.asList(1, 9);


    public BuscarMinimoMaximoTest() {
    }

    @Parameterized.Parameters
    public static List<Object> datos() {
        //devolvera una lista
        return Arrays.asList(new Object[][]{
            {l1, r1}, {l2, r2}
        });
    }
    
    @Parameterized.Parameter(0)
    public List<Integer> lista;
    @Parameterized.Parameter(1)
    public List<Integer> respuesta;

    BuscarMinimoMaximo mn = new BuscarMinimoMaximo();

    @Test
    public void testBuscaPalindromo() {
        //    Realizamos el test al metodo buscarminimoMaximo

        MinimoMaximo r = mn.buscaMinimoMaximo(lista);
        MinimoMaximo e = new MinimoMaximo(respuesta.get(0), respuesta.get(1));

        assertThat(r.toString(), Matchers.equalTo(e.toString()));

 }
}
