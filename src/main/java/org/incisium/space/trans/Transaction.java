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


package org.incisium.space.trans;

import java.util.List;
import org.incisium.space.conn.Socket;

/**
 * Transaction abstraction
 * @author Marek Mosiewicz<contact@marekmosiewicz.pl>
 */
public interface Transaction {
    public void begin();
    public void commit();
    public void rollback();
    public boolean isHaveSavePoints();
    public void savePoint();
    public void commitSave();
    public void rollbackSave();
    
    public List<Socket> getSockets();
    public List<TranscationParty> getParties();
}
