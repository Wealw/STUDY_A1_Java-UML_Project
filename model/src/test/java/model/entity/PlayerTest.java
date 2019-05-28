package model.entity;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    
    Player     player;
    Entity[][] map;
    @Before
    public void setUp() throws Exception {
        map = new Entity[2][2];
        player = Player.getInstance(0, 0, map);
        player.map[0][0] = player;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void moveUpTest() {
        int    expectedY = 1;
        Player expectedP = player;
        player.moveUp();
        assertEquals(expectedY, player.y);
        assertEquals(expectedP, player.map[player.x][player.y]);
    }

    @Test
    public void moveDownTest() {
        int expectedY = -1;
        player.moveDown();
        assertEquals(expectedY, player.y);
    }

    @Test
    public void moveLeftTest() {
        int expectedX = -1;
        player.moveLeft();
        assertEquals(expectedX, player.x);
    }

    @Test
    public void moveRightTest() {
        int expectedX = 1;
        player.moveRight();
        assertEquals(expectedX, player.x);
    }

    @Test
    public void getSprite() {
        char expectedSprite = 'p';
        assertEquals(expectedSprite, player.getSprite());
    }

}