/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.med.api.store;

import java.util.Properties;
import org.openide.loaders.DataNode;

/**
 *
 * @author Valery
 */
public interface StoreConfiguration {
    DataNode getDataNode();
    Properties getProperties();
}
