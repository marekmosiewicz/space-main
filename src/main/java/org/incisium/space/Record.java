/*
 * This file is part of Incisium Project (http://incisium.org)
 * 
 * Copyright (C) 2020 Jotel Mosiewiczowie Sp.J.
 *
 * You have three main licensing options to fit your needs best 
 *   GNU Lesser General Public License v2.1 or later (SPDX: LGPL-2.1-or-later) , 
 *   GNU General Public License v3.0 or later (SPDX: GPL-3.0-or-later),
 *   Apache License 2.0 (SPDX: Apache-2.0)
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
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
