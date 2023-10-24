package org.example.entities;

import org.example.DTOs.StaffDTOS;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StaffTest {


    @Test
public  void staffCreation(){
    StaffDTOS staffDTOS = new StaffDTOS();
    staffDTOS.setName("Gadibia Dizsartz");
    staffDTOS.setEmail("Diz@gmail.com");
    staffDTOS.setRole("ACCOUNTANT");
    staffDTOS.setSalary(Staff.SALARY_3);
    Staff staff3 = new Staff(staffDTOS);
    Assert.assertEquals("Gadibia Dizsartz", staff3.getName());
    Assert.assertEquals(staffDTOS.getRole(), staff3.getRole().name());
}

}