package org.example.serviceImpl;

import org.example.DTOs.StaffDTOS;
import org.example.entities.Staff;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StaffServiceImplTest {
    private StaffServiceImpl staffService = new StaffServiceImpl();

    @Test
    public void addStaff(){
        StaffDTOS staffDTOS = new StaffDTOS();
        staffDTOS.setName("Gadibia Dizsartz");
        staffDTOS.setEmail("Diz@gmail.com");
        staffDTOS.setRole("ACCOUNTANT");
        staffDTOS.setSalary(Staff.SALARY_3);
        Staff staff3 = new Staff(staffDTOS);
        Assert.assertEquals(staff3, staffService.addStaff(staff3));
    }

}