
/*
Hotel Reservation System

- Create a `HotelReservation` class with `roomNumber` (Integer)
 as the key and `guestName`(String) as the value.
- Add reservations using `put()`. For example, room number 101 with a guest name "John Doe".
        - Implement methods to:
        - Retrieve a guest’s name using `get()`.
        - Remove a reservation with `remove()`.
        - Check availability of a room using `containsKey()`.
        - Use `keySet()` to list all reserved room numbers.
        - Use `entrySet()` to list all reservations (room numbers with guest names).
*/

import java.util.HashMap;
import java.util.Map;

class HotelReservation{
    Integer roomNumber;
    String guestName;

    public HotelReservation(Integer roomNumber, String guestName) {
        this.roomNumber = roomNumber;
        this.guestName = guestName;
    }
public String toString(){
        return "Ro0mNumber: "+ roomNumber + "Guest Nmae: " +guestName ;
}
}


public class HotelReservationSystem{
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        HotelReservation hr = new HotelReservation(1,"ravi");
        HotelReservation hr1 = new HotelReservation(2,"timsina");
        hashMap.put(hr.roomNumber, hr.guestName) ;
        hashMap.put(hr1.roomNumber, hr1.guestName) ;
        // Accessing Guest name by get method
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.get(2));

    // Checking availability using containsKey method
        if (hashMap.containsKey(1)){
            System.out.println("Room 1 is reserved.");
        }else {
            System.out.println("Room 1 is available.");
        }
        // list of reserved room by iterating
for (int i : hashMap.keySet()){
    System.out.println("Reserved Room: " + i);
}

// list of roomNumber and guest name
        for (Map.Entry<Integer, String>i : hashMap.entrySet()){
        System.out.println(i);
        }

        // Removing Guest details with remove method
        hashMap.remove(1);
        System.out.println("After removing room 1: " + hashMap);

    }

}
