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

import org.incisium.space.main.Loadable;
import org.incisium.space.type.NodeDesc;
import org.incisium.space.main.Root;
import org.incisium.space.type.Kind;
import org.incisium.space.type.Type;

/**
 *
 * @author Marek Mosiewicz<contact@marekmosiewicz.pl>
 */
public interface Node extends Navigable,Loadable{
    public boolean hasdesc();

    public NodeDesc getdesc();
    
    public Type getype();
    /**
     * Kind of node, eg Entity
     * 
     * Gives generic kind of node as string
     * @return 
     */
    public Kind[] getkinds();
    public boolean iskind(String kindName);
    
    public Node parentnode();
    public Node rootnode();

    public Root getroot();
    public boolean isroot();
    
    public boolean isinit();
  
    public boolean isdirty();
    
    public Object oldvalue();
    public Object currvalue();
    
    public boolean isvalid();
    public boolean isrequired();
    public Object[] getvalidators();
    public Object[] getnotifications();

}
