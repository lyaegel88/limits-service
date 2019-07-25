package com.lukes.microservices.limitsservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by lyaegel on 07/25/2019
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LimitsConfiguration {
    private int maximum;
    private int minimum;

}
