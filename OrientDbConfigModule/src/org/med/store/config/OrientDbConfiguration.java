/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.med.store.config;

import java.util.Properties;
import org.med.api.store.StoreConfiguration;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataNode;
import org.openide.util.lookup.ServiceProvider;

/**
 *
 * @author Valery
 */
@ServiceProvider(service=org.med.api.store.StoreConfiguration.class)
public class OrientDbConfiguration implements StoreConfiguration{

    @Override
    public DataNode getDataNode() {
        return null;
    }

    @Override
    public Properties getProperties() {
        //FileObject fo = FileUtil.;
        //this.getClass().getClassLoader().getResourceAsStream(null).
        return null;
    }
    
}
