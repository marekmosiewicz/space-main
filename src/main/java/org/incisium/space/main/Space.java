/**
 * This file is part of Incisium Project (http://incisium.org)
 * 
 * Copyright (C) 2020 Marek Andrzej Mosiewicz
 * 
 * This file is licensed under CAST License
 *
 * Text of license can be found in root directory
 * of this project
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
