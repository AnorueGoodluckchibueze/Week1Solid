package org.example.entities;

import lombok.*;
import org.example.enums.RoomType;
import org.example.enums.RoomTypePayment;

import java.math.BigDecimal;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Guest extends User{
    private Integer roomNumber;
    private RoomType roomType;
    private RoomTypePayment payment;

    public BigDecimal getPayments() {
        //convert enum string to bigdecimal and return bigdecimal
        //Read about Regex expression
        return BigDecimal.valueOf(Long.parseLong(payment.name().replaceAll("L|S|ST|P|_", "")));
    }
}
