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

package org.incisium.space.type;

import org.incisium.space.type.Type;

/**
 *
 * @author Marek Mosiewicz<contact@marekmosiewicz.pl>
 */
public interface NodeDesc {
    public Type getType();
    public Path getPath();
    
    public boolean isRequired();
    public Object[] getValidators();
    
    public Object[] getRules();
    
    public Object[] getNotifications();
    
}
