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


package org.incisium.space.exec;

/**
 * Command can be executed locally or remotely
 * @author Marek Mosiewicz<contact@marekmosiewicz.pl>
 */
public interface Command {
    public void setCommand(String commandToExecute);
    public String getCommand();

    public void setTarget(Selector target);
    public Selector getTarget();
    
    public void setParam(String name,Object value);
    public Object getParam(String name);
    
    public boolean isRemoteAvailable();
    public boolean isLocallyAvailable();

    public void isRemote(boolean executeRemotely);
    public boolean setRemote();
    
    public Result getResult();
    public boolean isResultAvailable();


    public boolean isAsyncAvailable();    
    public boolean isAsync();
    public boolean setAsync(boolean shouldBeAsync);
    
    
}
