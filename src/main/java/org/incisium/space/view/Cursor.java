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

package org.incisium.space.view;

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
    
    public Page getNextPage();
    public Page getPrevPage();
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
