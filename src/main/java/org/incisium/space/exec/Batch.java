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

package org.incisium.space.exec;

import java.util.List;

/**
 * Executes series of Commands
 * @author Marek Mosiewicz<contact@marekmosiewicz.pl>
 */
public interface Batch extends Command{
    public List<Command> getPayload();
    public void setCommands(List<Command> toExecute);
    public void addCommands(List<Command> toExecute);
    public void addCommand(Command toExecute);
}
