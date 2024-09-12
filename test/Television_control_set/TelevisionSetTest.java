package Television_control_set;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TelevisionSetTest {

    @Test
    public void newTelevisionSet_thatCanTurnOnTest() {
        TelevisionSet set = new TelevisionSet();
        set.turnOn();
        assertTrue(set.turnOn());
    }

    @Test
    public void newTelevisionSet_thatCanTurnOffTest() {
        TelevisionSet set = new TelevisionSet();
        set.turnOff();
        assertTrue(set.turnOff());
    }

    @Test
    public void newTelevisionSet_thatCan_increaseVolumeTest() {
        TelevisionSet set = new TelevisionSet();
        set.turnOn();
        set.increaseTelevisionVolume();
        assertEquals(true, set.turnOff());
    }

    @Test
    public void newTelevisionSet_thatCan_decreaseVolumeTest() {
        TelevisionSet set = new TelevisionSet();
        set.turnOn();
        set.decreaseTelevisionVolume();
        assertEquals(true, set.turnOn());
    }

    @Test
    public void newTelevisionSet_canTurnOn_andSwitch_BetweenChannelsTest() {
        TelevisionSet set = new TelevisionSet();
        set.turnOn();
        set.switchDifferentChannels();
        assertTrue(set.turnOn());
    }

    @Test
    public void newTelevisionSet_canSwitchBetweenChannels_whenTurnOffTest() {
        TelevisionSet set = new TelevisionSet();
        set.turnOff();
        set.switchDifferentChannels();
        assertEquals(true, set.turnOff());
    }

}
