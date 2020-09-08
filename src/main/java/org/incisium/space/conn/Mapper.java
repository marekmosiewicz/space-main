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
 * Mapper maps objects to bytes and reverse
 * @author Marek Mosiewicz<contact@marekmosiewicz.pl>
 */
public interface Mapper {
    public Object toObject(byte[] chunk);
    public byte[] toChunk(Object what);
    public Object getCurrentState();
    public void setCurrentState(Object state);
}
