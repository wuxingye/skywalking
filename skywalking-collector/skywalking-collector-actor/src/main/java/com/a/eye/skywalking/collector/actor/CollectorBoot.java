package com.a.eye.skywalking.collector.actor;

import akka.actor.ActorSystem;

/**
 * @author pengys5
 */
public class CollectorBoot {
    public static void main(String[] args) {
        ActorSystem system = ActorSystem.create("ClusterSystem", config);
    }
}