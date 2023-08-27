package io.ray.serve.dag;

import io.ray.serve.deployment.Deployment;
import java.util.ArrayList;
import java.util.List;

public class Graph {

  public static List<Deployment> build(DAGNode rootNode, String name) {
    // TODO mock
    return extractDeployments(rootNode);
  }

  public static List<Deployment> extractDeployments(DAGNode rootNode) {
    List<Deployment> deployments = new ArrayList<>();
    deployments.add((Deployment) rootNode.getBoundOtherArgsToResolve().get("deployment_schema"));
    return deployments;
  }
}
