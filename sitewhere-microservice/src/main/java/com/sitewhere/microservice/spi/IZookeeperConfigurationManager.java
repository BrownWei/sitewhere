package com.sitewhere.microservice.spi;

import org.apache.curator.framework.CuratorFramework;

import com.sitewhere.spi.server.lifecycle.ILifecycleComponent;

/**
 * Manages Zookeeper configuration for microservices.
 * 
 * @author Derek
 */
public interface IZookeeperConfigurationManager extends ILifecycleComponent {

    /**
     * Get connected {@link CuratorFramework} instance.
     * 
     * @return
     */
    public CuratorFramework getCurator();
}