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

import org.incisium.space.exec.Batch;
import org.incisium.space.exec.Command;
import org.incisium.space.conn.Socket;
import org.incisium.space.exec.Selector;

/**
 * Base server connection
 * 
 * @author Marek Mosiewicz<contact@marekmosiewicz.pl>
 */
public interface SpaceHome {
    public boolean canReach(Socket endpoint);
    public void execute(Space space,Selector payload);
    public void execute(Space space,Command command);
    public void execute(Space space,Batch payload);
}
