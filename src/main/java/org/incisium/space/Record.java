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
