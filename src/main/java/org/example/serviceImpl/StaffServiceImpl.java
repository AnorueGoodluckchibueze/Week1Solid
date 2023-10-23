package org.example.serviceImpl;

import org.example.entities.Guest;
import org.example.entities.Staff;
import org.example.enums.Role;
import org.example.service.StaffService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StaffServiceImpl implements StaffService {
    public static List<Guest> allCheckedInGuests = new ArrayList<>();
    public static HashMap<Role, List<Staff>> allStaffs =  new HashMap<>();
    @Override
    public Guest checkIn(Guest guest, Staff staff) {
        if (staff.getRole().equals(Role.SECRETARY)
                ||staff.getRole().equals(Role.MANAGER)
                ||staff.getRole().equals(Role.RECEPTIONIST)
                ||staff.getRole().equals(Role.SUPERVISOR)){
         allCheckedInGuests.add(guest);
         return guest;
        }
        return null;
    }

    @Override
    public List<Guest> viewAllGuest() {
        return allCheckedInGuests;
    }

    @Override
    public Guest checkOut(Guest guest) {
        return allCheckedInGuests.remove(allCheckedInGuests.indexOf(guest));
    }
}
