package com.example.homeworknew.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(exclude = "quantity")
public class Socks {
    private Color color;
    private Size size;
    private int cottonPart;
    private  int quantity;
}
