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

package org.incisium.space.conn;

import org.incisium.space.exec.Command;
import org.incisium.space.exec.Result;

/**
 * Some resource or server which can be connected to
 * 
 * @author Marek Mosiewicz<contact@marekmosiewicz.pl>
 */
public interface Socket {
    public boolean isURLBased();
    public boolean isReadOnly();
    public String canWorkWithMime(String mimeType);
    public boolean isRelational();
    public boolean isTransactional();
    /**
     * is it direct connection or mapped via Home connection
     * @return 
     */
    public boolean isRouteViaHome();
    
    public String getConnectionString();
    public String getConnectionName();
    
    public Mapper getMapper();
    public Transport getTransport();
    
    public Result sendCommand(Command command);
    public Result sendCommand(Command command,boolean inChunks);
}
