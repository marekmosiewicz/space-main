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
