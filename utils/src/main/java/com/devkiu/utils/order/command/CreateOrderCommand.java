package com.devkiu.utils.order.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateOrderCommand {
    @TargetAggregateIdentifier
    private String id;
    private String productId;
    private Long quantity;
    private String price;
}
