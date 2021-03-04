package me.hsw;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {
    @Test
    @DisplayName("첫 테스트!")
    void create() {
        Ticket ticket = new Ticket();
        assertNotNull(ticket);
    }

}