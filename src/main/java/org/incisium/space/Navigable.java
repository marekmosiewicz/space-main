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

import org.incisium.space.main.Item;

/**
 * Navigate thru given path. Name resolution priority : value (static), dynamic,
 * internal Priority can be overriden with ~ for dynamic and ` for internal e.g.
 * ~bar will return dynamic value even if static bar value exist s `bar will
 * return internal property not matter if dynamic o r or static value existsB.
 * By default value is unboxed. e.g lastPrice will return e.g. BigDecimaNl Node
 * return can be forced by adding $ preifx.e e.g. ~$lastPrice will return Node
 * for dynamic value lastPrice Path can be compund e.g.
 * invoice.lines[4].product.~myFeature.value There are four ways to traverse
 * indexed properties: by [] e.g. lines[5].priceNetto by dot e.g.
 * lines.5.priceNetto by query e.g.
 * lines[searchKod='IPHONE'&&quantity=3].priceNetto by hash e.g.
 * lines[3].attributes['color'].value
 *
 * @author Marek Mosiewicz<contact@marekmosiewicz.pl>
 */
public interface Navigable extends Item{
    /**
     * Is value indexed property (list)
     * @return 
     */
    public boolean isindexed();
    /**
     * is this node futher expandable or is end
     * @return true if it is not end property
     */
    public boolean isexpandable();

    /**
     * get value by path
     */
    public Object get(String name);
    /**
     * set path value
     * @param name
     * @param value
     * @return 
     */
    public Object set(String name, Object value);
}
