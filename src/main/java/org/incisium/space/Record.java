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

package org.incisium.space;

import java.util.Map;

/**
 *
 * @author Marek Mosiewicz<contact@marekmosiewicz.pl>
 */
public interface Record extends Map<String, Object>,Node{
 

    public Node node(String name);
    public Node node(String name,Object value);
    public Node node(Integer index,Object value);
    public Node node(Integer index);
    
    
    public Object value(String name);
    public Object value(String name,Object value);
    public Object value(Integer index,Object value);
    public Object value(Integer index);
    public int valueindex(String valueName);
    /**
     * 
     * @return true if record is fully loaded 
     */
    public boolean isarmed();

    /**
     * Receives value of internal property by name.
     * 
     * Internal properties are properties which manage internal
     * state of object and are cosidered private
     * @param name
     * @return 
     */
    public Object internal(String name);
    public Object internal(String name,Object value);
    public Object internal(Integer index,Object value);
    public Object internal(Integer index);

    public Object dynamic(String name);
    public Object dynamic(String name,Object value);

    
}
