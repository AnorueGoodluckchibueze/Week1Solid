package org.example.entities;

import lombok.*;
import org.example.enums.Role;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Staff extends User{
    private Long id;
    private LocalDate employmentDate;
    private Role role;
    private BigDecimal staffSalary;
    public static final BigDecimal SALARY_1 = new BigDecimal(50000);
    public static final BigDecimal SALARY_2 = new BigDecimal(150000);
    public static final BigDecimal SALARY_3 = new BigDecimal(500000);
}
