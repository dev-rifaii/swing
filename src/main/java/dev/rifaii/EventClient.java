package dev.rifaii;

import java.util.List;

public class EventClient {

    public List<EventType> getEventTypes() {
        return List.of(
            new EventType("TEST", "Type"),
            new EventType("ANOTHER", "Another")
        );
    }
}
