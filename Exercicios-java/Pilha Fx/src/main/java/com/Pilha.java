package com;

import java.util.ArrayList;
import java.util.Collections;

public class Pilha<E> {
    private final int S;
    private int T;
    private final E[] elementos;

    public Pilha (int tam) {
        if (tam>0) {
            S = tam;
        }else{
            S = 10;
        }
        T =-1;
        elementos = (E[]) new Object[S];
    }
    public Pilha() {this(10);}

    public void push (E el) {
        if (T == S -1) {
            throw new ExcecaoPilhaCheia();
        }
        elementos[++T] = el;
    }

    public E pop() {
        if (T ==-1) {
            throw new ExcecaoPilhaVazia();
        }
        return elementos[T--];
    }

    public String printE() {
        ArrayList list = new ArrayList();
        String x = "";
        for(int i=0; i< T +1; i++){
            list.add(elementos[i]);
        }
        Collections.reverse(list);
        for(int i=0;i<list.size();i++){
            x += list.get(i) + "\n";
        }
        return x;
    }
}


