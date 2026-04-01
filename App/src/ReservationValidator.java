import java.util.*;

public class ReservationValidator {

    public void validate(
            String guestName,
            String roomType,
            RoomInventory inventory
    ) throws InvalidBookingException {

        // Check guest name
        if (guestName == null || guestName.trim().isEmpty()) {
            throw new InvalidBookingException("Guest name cannot be empty.");
        }

        // Normalize input
        roomType = roomType.trim();

        // Valid room types
        List<String> validTypes = Arrays.asList("Single", "Double", "Suite");

        if (!validTypes.contains(roomType)) {
            throw new InvalidBookingException("Invalid room type selected.");
        }

        // Check availability
        Map<String, Integer> availability = inventory.getRoomAvailability();

        if (availability.get(roomType) <= 0) {
            throw new InvalidBookingException("No rooms available for selected type.");
        }
    }
}