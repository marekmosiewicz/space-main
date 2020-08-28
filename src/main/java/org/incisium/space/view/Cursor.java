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
