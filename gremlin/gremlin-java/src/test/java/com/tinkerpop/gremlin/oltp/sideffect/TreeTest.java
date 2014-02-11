package com.tinkerpop.gremlin.oltp.sideffect;

import com.tinkerpop.gremlin.structure.Graph;
import com.tinkerpop.gremlin.process.oltp.ComplianceTest;
import com.tinkerpop.tinkergraph.TinkerFactory;
import org.junit.Test;

/**
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 */
public class TreeTest extends com.tinkerpop.gremlin.process.oltp.sideEffect.TreeTest {

    private final Graph g = TinkerFactory.createClassic();

    @Test
    public void testCompliance() {
        ComplianceTest.testCompliance(this.getClass());
    }

    @Test
    public void g_v1_out_out_treeXnameX() {
        //   super.g_v1_out_out_treeXnameX(GremlinJ.of(g).v(1).out().out().tree(v -> ((Vertex) v).getValue("name")));
    }
}