package io.ray.serve.dag;

import java.util.Map;

public class ClassNode extends DAGNode {

  private String cls;

  public ClassNode(
      String cls,
      Object[] clsArgs,
      Map<String, Object> clsOptions,
      Map<String, Object> otherArgsToResolve) {
    super(clsArgs, clsOptions, otherArgsToResolve);
    this.cls = cls;
  }

  public String getCls() {
    return cls;
  }
}
