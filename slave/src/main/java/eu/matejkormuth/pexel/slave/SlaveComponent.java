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

import eu.matejkormuth.pexel.commons.AbstractComponent;
import eu.matejkormuth.pexel.commons.configuration.Configuration;

/**
 * Interface that represents component in MasterServer.
 */
public abstract class SlaveComponent extends AbstractComponent {
    PexelSlave slave;
    
    /**
     * Returns current {@link PexelMaster} instance.
     */
    public PexelSlave getSlave() {
        return this.slave;
    }
    
    @Override
    public void onEnable() {
    };
    
    @Override
    public void onDisable() {
    };
    
    protected void __initConfig(final Configuration parentConfiguration) {
        this._initConfig(parentConfiguration);
    }
}
