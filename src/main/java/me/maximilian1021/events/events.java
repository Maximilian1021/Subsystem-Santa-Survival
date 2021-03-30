package me.maximilian1021.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;

public class events implements Listener {

    @EventHandler
    public void PlayerInteract(PlayerInteractEvent e){
        Player p = e.getPlayer();
        if(!e.getPlayer().hasPermission("AntiBuild.break")){
            e.setCancelled(true);
            p.sendMessage("§cError §7| §bDu bist nicht Verifiziert. Bitte melde dich beim Staffteam (Discord)");
        } else {
            e.setCancelled(false);
        }
    }

    @EventHandler
    public void BlockBreak(BlockBreakEvent e){
        Player p = e.getPlayer();

        if(!e.getPlayer().hasPermission("AntiBuild.break")){
            e.setCancelled(true);
            p.sendMessage("§cError §7| §bDu bist nicht Verifiziert. Bitte melde dich beim Staffteam (Discord)");

        } else {
            e.setCancelled(false);
        }
    }

    @EventHandler
    public void BlockPlace(BlockPlaceEvent e){
        Player p = e.getPlayer();

        if(!e.getPlayer().hasPermission("AntiBuild.break")){
            e.setCancelled(true);
            p.sendMessage("§cError §7| §bDu bist nicht Verifiziert. Bitte melde dich beim Staffteam (Discord)");

        } else {
            e.setCancelled(false);
        }
    }

    @EventHandler
    public void onDrop(PlayerPickupItemEvent e){
        Player p = e.getPlayer();

        if(!e.getPlayer().hasPermission("AntiBuild.break")){
            e.setCancelled(true);
            p.sendMessage("§cError §7| §bDu bist nicht Verifiziert. Bitte melde dich beim Staffteam (Discord)");

        } else {
            e.setCancelled(false);
        }

    }


}
