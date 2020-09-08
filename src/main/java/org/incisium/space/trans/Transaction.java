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
