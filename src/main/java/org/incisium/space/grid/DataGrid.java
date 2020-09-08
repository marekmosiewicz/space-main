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

package org.incisium.space.grid;

import org.incisium.space.Navigable;
import org.incisium.space.main.Item;
import org.incisium.space.view.Pageable;

/**
 * Data structure optimized for flat access
 * Light version of RecrodList
 * 
 * @author Marek Mosiewicz<contact@marekmosiewicz.pl>
 */
public interface DataGrid extends Item,Navigable,Pageable{

}
