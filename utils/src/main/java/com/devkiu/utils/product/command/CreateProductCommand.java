package com.devkiu.utils.product.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateProductCommand {
    @TargetAggregateIdentifier
    private String id;
    private String name;
    private Double price;
    private String description;
    private Long stock;
}
