package me.branduzzo.checkHacks;

import me.branduzzo.checkHacks.utils.WrappedTask;
import org.bukkit.Location;
import org.bukkit.block.BlockState;

import java.util.Map;
import java.util.UUID;

public class LangCheckData {

    private final UUID targetUUID;
    private final UUID initiatorUUID;
    private final Map<String, String> languages;

    private Location signLocation;
    private BlockState originalState;
    private boolean barrierPlaced;
    private Location barrierLocation;
    private WrappedTask timeoutTask;

    public LangCheckData(UUID targetUUID, UUID initiatorUUID, Map<String, String> languages) {
        this.targetUUID    = targetUUID;
        this.initiatorUUID = initiatorUUID;
        this.languages     = languages;
    }

    public UUID getTargetUUID()                { return targetUUID; }
    public UUID getInitiatorUUID()             { return initiatorUUID; }
    public Map<String, String> getLanguages()  { return languages; }
    public Location getSignLocation()          { return signLocation; }
    public void setSignLocation(Location l)    { this.signLocation = l; }
    public BlockState getOriginalState()       { return originalState; }
    public void setOriginalState(BlockState s) { this.originalState = s; }
    public boolean isBarrierPlaced()           { return barrierPlaced; }
    public void setBarrierPlaced(boolean b)    { this.barrierPlaced = b; }
    public Location getBarrierLocation()       { return barrierLocation; }
    public void setBarrierLocation(Location l) { this.barrierLocation = l; }
    public WrappedTask getTimeoutTask()         { return timeoutTask; }
    public void setTimeoutTask(WrappedTask t)   { this.timeoutTask = t; }
}