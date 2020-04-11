/*
 * This file is part of Incisium Project (http://incisium.org)
 * 
 * Copyright (C) 2020 Jotel Mosiewiczowie Sp.J.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * If GPL license is not appropriate for your organizatioon,
 * you can obtain commercial license from http://jotel.com.pl
 */

package org.incisium.space.main;

import org.incisium.space.exec.Batch;
import org.incisium.space.store.Store;
import org.incisium.space.view.Shrinkable;

/**
 * Basic area where opjects are put.
 * @author Marek Mosiewicz<contact@marekmosiewicz.pl>
 */
public interface Space extends Shrinkable{
    
    
    public void setDefaultStore(Store store);
    public Store getDefaultStore();
    
    public SpaceHome getSpaceHome();
    /**
     * Synchronize with datasource
     */
    public void synchronize();
    /**
     * Synchronize with datasource
     */
    public void synchronize(Batch someThings);    

    public void attach(Loadable items);
    /**
     * Persist and close
     */
    public void close();
    /**
     * Just release resources.
     * Do not save anything.
     * Depending on implementation it can rollback
     * currently persisted changes
     */
    public void drop();
}
