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
 * Async command handle
 * @author Marek Mosiewicz<contact@marekmosiewicz.pl>
 */
public interface Handle extends Result{
    public Float getPercentDone();
    public boolean isDone();
    public void abort();
    public Float getSentBytesCount();
    public Float getReceiveidBytesCount();
    
}
