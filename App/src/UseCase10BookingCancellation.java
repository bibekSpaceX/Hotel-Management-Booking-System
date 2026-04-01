public class UseCase10BookingCancellation {

    public static void main(String[] args) {

        System.out.println("Booking Cancellation");

        RoomInventory inventory = new RoomInventory();
        CancellationService cancelService = new CancellationService();

        // Simulate confirmed booking
        String reservationId = "Single-1";
        cancelService.registerBooking(reservationId, "Single");

        // Cancel booking
        cancelService.cancelBooking(reservationId, inventory);

        // Show rollback history
        cancelService.showRollBackHistory();

        // Print updated inventory
        System.out.println("\nUpdated Single Room Availability: " +
                inventory.getRoomAvailability().get("Single"));
    }
}