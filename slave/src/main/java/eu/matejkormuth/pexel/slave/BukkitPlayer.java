// @formatter:off
/*
 * Pexel Project - Minecraft minigame server platform. 
 * Copyright (C) 2014 Matej Kormuth <http://www.matejkormuth.eu>
 * 
 * This file is part of Pexel.
 * 
 * Pexel is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 * 
 * Pexel is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with this program. If not, see
 * <http://www.gnu.org/licenses/>.
 *
 */
// @formatter:on
package eu.matejkormuth.pexel.slave;

import java.util.UUID;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.inventory.Inventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import eu.matejkormuth.pexel.commons.MetadataStore;
import eu.matejkormuth.pexel.commons.Player;
import eu.matejkormuth.pexel.commons.data.Profile;

/**
 * Bukkit compactibile implementation of player.
 */
public class BukkitPlayer extends Player {
    org.bukkit.entity.Player internal;
    
    public BukkitPlayer(final org.bukkit.entity.Player player) {
        this.internal = player;
    }
    
    @Override
    public Profile getProfile() {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public void teleport(final Location loc) {
        this.internal.teleport(loc);
    }
    
    @Override
    public MetadataStore getMetadata() {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public UUID getUUID() {
        return this.internal.getUniqueId();
    }
    
    @Override
    public void kick(final String reason) {
        this.internal.kickPlayer(reason);
    }
    
    @Override
    public String getDisplayName() {
        return this.internal.getDisplayName();
    }
    
    @Override
    public String getName() {
        return this.internal.getName();
    }
    
    @Override
    public int getEntityId() {
        return this.internal.getEntityId();
    }
    
    @Override
    public double getHealth() {
        return this.internal.getHealth();
    }
    
    @Override
    public Location getLocation() {
        return this.internal.getLocation();
    }
    
    @Override
    public void sendMessage(final String msg) {
        this.internal.sendMessage(msg);
    }
    
    @Override
    public void playSound(final Location location, final Sound sound,
            final float volume, final float pitch) {
        this.internal.playSound(location, sound, volume, pitch);
    }
    
    @Override
    public Inventory getInventory() {
        return this.internal.getInventory();
    }
    
    @Override
    public void setGameMode(final GameMode mode) {
        this.internal.setGameMode(mode);
    }
    
    @Override
    public void addPotionEffect(final PotionEffect potionEffect) {
        this.internal.addPotionEffect(potionEffect);
    }
    
    @Override
    public void setAllowFlight(final boolean b) {
        this.internal.setAllowFlight(b);
    }
    
    @Override
    public void setFlying(final boolean b) {
        this.internal.setFlying(b);
    }
    
    @Override
    public void removePotionEffect(final PotionEffectType nightVision) {
        this.internal.removePotionEffect(nightVision);
    }
    
    @Override
    public void setFoodLevel(final int i) {
        this.internal.setFoodLevel(i);
    }
    
    @Override
    public boolean isOnline() {
        return this.internal.isOnline();
    }
    
    @Override
    public void openInventory(final Inventory inventory) {
        this.internal.openInventory(inventory);
    }
    
    @Override
    public void performCommand(final String command) {
        this.internal.performCommand(command);
    }
    
    @Override
    public boolean isOp() {
        return this.internal.isOp();
    }
}