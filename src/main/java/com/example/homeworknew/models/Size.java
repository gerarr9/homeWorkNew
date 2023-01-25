package com.example.homeworknew.models;

public enum Size {
    SIZE_35(35),SIZE_36(36),SIZE_37(37);

   private final int size;

    Size(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
