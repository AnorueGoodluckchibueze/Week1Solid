package org.example;

import org.example.entities.Guest;
import org.example.entities.Staff;
import org.example.enums.Role;
import org.example.enums.RoomType;
import org.example.enums.RoomTypePayment;
import org.example.serviceImpl.StaffServiceImpl;

import java.math.BigDecimal;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Guest guest = Guest.builder()
                .payment(RoomTypePayment.L_20000)
                .roomType(RoomType.LOCAL)
                .roomNumber(12)
                .build();
        Guest guest1 = Guest.builder()
                .payment(RoomTypePayment.L_20000)
                .roomType(RoomType.LOCAL)
                .roomNumber(14)
                .build();
        Staff staff = Staff.builder()
                .role(Role.SUPERVISOR).build();

        StaffServiceImpl staffService = new StaffServiceImpl();
        staffService.checkIn(guest, staff);
        staffService.checkIn(guest1, staff);
        System.out.println(staffService.viewAllGuest());
        System.out.println(staffService.checkOut(guest1));
        System.out.println(staffService.viewAllGuest());
            }
}