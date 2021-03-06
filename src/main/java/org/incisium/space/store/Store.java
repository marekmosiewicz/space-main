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

package org.incisium.space.store;

import java.util.List;
import org.incisium.space.exec.Batch;
import org.incisium.space.conn.Socket;
import org.incisium.space.exec.Command;
import org.incisium.space.exec.Resolver;
import org.incisium.space.exec.Result;
import org.incisium.space.exec.Selector;
import org.incisium.space.main.Item;
import org.incisium.space.main.Space;
import org.incisium.space.trans.Transaction;

/**
 * Abstraction of any database, filesystem or command socket
 * @author Marek Mosiewicz<contact@marekmosiewicz.pl>
 */
public interface Store {
    public Socket getSocket();
   /**
     * Ensures node to be received from server
     * @return true if node was not already fetched
     */
    public List<Item> retreive(Selector selector);
    public List<Item> retreive(List<Selector> selectors);
    public List<Item> retreive(Transaction trx,List<Selector> selectors);

    /**
     * Ensures node to be received from server
     * @return true if node was not already fetched
     */
    public void persist(List<Item> items);
    public void persist(Transaction trx,List<Item> items);

    /**
     * Save by specific Saveable
     * @param trx can be null if not transactional
     * @param itemSave 
     */
    public void persist(Transaction trx,PersistCommand itemSave);

    public void delete(Transaction trx,Item deleteItem);

    public void delete(Transaction trx,DeleteCommand deleteCommand);


    public PersistCommand findPersistCommand(Item item,Object[] params);
    public RetreiveCommand findRetreiveCommand(Selector item,Object[] params);

    public void setDefaultPersistCommand(PersistCommand command);
    public void setDefaultRetreiveCommand(RetreiveCommand command);
    public void setDefaultDeleteCommand(DeleteCommand command);
 
    public void setPersistCommandResolver(Resolver resolver);
    public void setRetreiveCommandResolver(Resolver resolver);
    public void setDeleteCommandResolver(Resolver resolver);
 
    
    public Result execute(Command command);
    public Result execute(Transaction trx,Command command);

    public Result executeLocally(Command command);
    public Result executeLocally(Transaction trx,Command command);    
}
