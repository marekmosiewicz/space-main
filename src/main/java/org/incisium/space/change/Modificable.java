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


package org.incisium.space.change;

import org.incisium.space.Node;
import org.incisium.space.main.Item;

/**
 *
 * @author Marek Mosiewicz<contact@marekmosiewicz.pl>
 */
public interface Modificable extends Item{
    public void append(String path,Object value);
    public void delete(String path);
    public void insertAt(int index,Object value);
    public void insert(String path,Object value);
}
