/**
 * ==========================================================
 * MAIN CLASS - UseCase4RoomSearch
 * ==========================================================
 *
 * Demonstrates room search without modifying inventory
 *
 * @version 4.0
 */
public class UseCase4RoomSearch {

    public static void main(String[] args) {

        // Room objects
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        // Centralized inventory
        RoomInventory inventory = new RoomInventory();

        // Search service
        RoomSearchService searchService = new RoomSearchService();

        // Perform search (read-only)
        searchService.searchAvailableRooms(
                inventory,
                singleRoom,
                doubleRoom,
                suiteRoom
        );
    }
}