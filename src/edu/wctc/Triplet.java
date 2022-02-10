package edu.wctc;
public class Triplet<T> {
    private T first, second, third;
    public Triplet(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
    public T GET1() {
        return first;
    }
    public void SET1(T first) {
        this.first = first;
    }
    public T GET2() {
        return second;
    }
    public void SET2(T second) {
        this.second = second;
    }
    public T GET3() {
        return third;
    }
    public void SET3(T third) {
        this.third = third;
    }
    @Override
    public String toString() {
        return String.format("FIRST: %s, SECOND: %s, THIRD: %s",first, second, third);
    }
}
