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
