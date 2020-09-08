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
