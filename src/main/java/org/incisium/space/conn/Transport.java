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

/**
 * Transport is abstraction over wire
 * @author Marek Mosiewicz<contact@marekmosiewicz.pl>
 */
public interface Transport {
    public String getTypeName();
    public void sendBytes(byte[] chunk);
    public byte[] receiveBytes();
    public int availableBytes();
}
