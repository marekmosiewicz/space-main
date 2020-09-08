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

import org.incisium.space.exec.Selector;
import org.incisium.space.store.Store;

/**
 * Very base abstraction of things which can be
 * hold by Space
 * Item is something can be managed at client side
 * Selector is more universal and can be executed
 * without realization
 * @author Marek Mosiewicz<contact@marekmosiewicz.pl>
 */
public interface Item extends Selector{
    /**
     * Each item (including subitems) should produce
     * unique ident to make it possible for Space 
     * to detect that this item already exists in Space
     * @return 
     */
    public Object ident();
    public Store fromstore();
}
