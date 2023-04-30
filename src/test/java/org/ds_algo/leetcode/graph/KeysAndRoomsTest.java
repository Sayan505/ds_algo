package org.ds_algo.leetcode.graph;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

public class KeysAndRoomsTest {
    KeysAndRooms keysAndRooms = new KeysAndRooms();

    @BeforeEach
    void init() {
        keysAndRooms = new KeysAndRooms();
    }

    // craft input
    int[][] rooms = { { 1, 3 }, { 3, 0, 1 }, { 2 }, { 0 } };

    @Test
    void test() {
        boolean actual = keysAndRooms.canVisitAllRooms(rooms);

        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }
}
