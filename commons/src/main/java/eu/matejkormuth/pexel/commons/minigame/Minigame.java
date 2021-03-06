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
// @formatter:on-
package eu.matejkormuth.pexel.commons.minigame;

import eu.matejkormuth.pexel.commons.bans.Bannable;

/**
 * Interface that represents minigame.
 */
public interface Minigame extends Bannable {
    /**
     * Returns display name of minigame.
     * 
     * @return display name
     */
    public String getDisplayName();
    
    /**
     * Returns code safe name of minigame. <b>Must return name that is all lowercase and contains only characters a-z
     * and number 0-9, should not be longer than 20 characters (better keep name on about 12 characters)</b>.
     * 
     * @return code safe name
     */
    public String getName();
    
    /**
     * Returns map prefix for maps compactibile with this minigame. For example game called "TNT Run" could return
     * "tr_", "Annihiliation" could return "anni_".
     * 
     * @return short prefix
     */
    public String getMinigameMapPrefix();
    
    /**
     * Return's name of author of this minigame.
     * 
     * @return author's name
     */
    public String getAuthor();
    
    /**
     * Returs this game description.
     * 
     * @return description of game
     */
    public String getDescription();
    
    /**
     * Returns minigame category.
     * 
     * @return minigame categorry
     */
    public MinigameCategory getCategory();
    
    /**
     * Returns the minigame lobby location.
     * 
     * @return location of minigame's lobby
     */
    // public Location getLobbyLocation();
}
