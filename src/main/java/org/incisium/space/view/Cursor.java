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

package org.incisium.space.view;

import org.incisium.space.Navigable;
import org.incisium.space.main.Root;
import org.incisium.space.main.Space;
import org.incisium.space.main.Item;

/**
 * Cursor is way to navigate Item tree via pages
 * in given sort way
 * @author Marek Mosiewicz<contact@marekmosiewicz.pl>
 */
public interface Cursor {
    public void setPageLength(int length);
    public int getPageLength();
    
    public int getPosition();
    public int setPosition(int position);
    
    public Item getBase();
    
    public Root getRoot();
    public Space getSpace();
    
    public Orderable getOrder();
    
    public Navigable getNextPage();
    public Navigable getPrevPage();
    public int getPageNumber();
    public Page setPageNumber(int pageNumber);
    public boolean isNextPageFetched();    
    
    
    public Item getNextItem();
    public Item getPrevItem();
    
    public int getNextFetchedIndex();
    public void setAutoFetch(boolean autoFetchEnabled);
    public boolean getAutoFetch();

    
    public boolean isNextItemFetched();

}
