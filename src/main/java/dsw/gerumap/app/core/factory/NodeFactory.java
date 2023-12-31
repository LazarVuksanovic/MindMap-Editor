package dsw.gerumap.app.core.factory;

import dsw.gerumap.app.repository.composite.MapNode;

public abstract class NodeFactory {

    public abstract MapNode createNode(MapNode parent);
}
