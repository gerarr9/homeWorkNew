package com.example.homeworknew.services;

import com.example.homeworknew.models.Socks;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@Data
public class SocksService {
    private Socks socks;
    private int cottonMin;
    private int cottonMax;
}
