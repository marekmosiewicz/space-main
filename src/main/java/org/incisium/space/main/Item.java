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

package org.incisium.space.main;

import org.incisium.space.exec.Selector;
import org.incisium.space.store.Store;

/**
 * Very base abstraction of things which can be
 * hold by Space
 * Item is something can be managed at client side
 * Selector is more universal and can be executed
 * without realization
 * @author Marek Mosiewicz<contact@marekmosiewicz.pl>
 */
public interface Item extends Selector{
    /**
     * Each item (including subitems) should produce
     * unique ident to make it possible for Space 
     * to detect that this item already exists in Space
     * @return 
     */
    public Object ident();
    public Store fromstore();
}
