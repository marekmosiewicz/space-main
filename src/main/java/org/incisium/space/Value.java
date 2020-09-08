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


package org.incisium.space;

/**
 * Value is node which is managed.
 * When creating class you can inherit from
 * this clas to have instant access to all goodies
 * of node.
 * 
 * Another option is to use your type or standard
 * type (e.g. Integer or String) and Space will
 * try to proxy it when possible and necessery
 * 
 * @author Marek Mosiewicz<contact@marekmosiewicz.pl>
 */
public interface Value extends Node{

}
