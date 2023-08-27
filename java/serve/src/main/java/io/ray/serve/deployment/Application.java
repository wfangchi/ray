package io.ray.serve.deployment;

import io.ray.serve.dag.DAGNode;
import io.ray.serve.dag.DAGNodeBase;

public class Application implements DAGNodeBase {
  private DAGNode internalDagNode;

  private Application(DAGNode internalDagNode) {
    this.internalDagNode = internalDagNode;
  }

  public DAGNode getInternalDagNode() {
    return internalDagNode;
  }

  public static Application fromInternalDagNode(DAGNode dagNode) {
    return new Application(dagNode);
  }
}
