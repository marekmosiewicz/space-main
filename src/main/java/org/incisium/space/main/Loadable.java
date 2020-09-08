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

package org.incisium.space.main;

import org.incisium.space.conn.Socket;
import org.incisium.space.exec.Command;
import org.incisium.space.exec.Selector;
import org.incisium.space.store.Store;

/**
 * Item or items which can be loaded from server
 * 
 * @author Marek Mosiewicz<contact@marekmosiewicz.pl>
 */
public interface Loadable extends Selector{
    public Command loadcommand();
}
