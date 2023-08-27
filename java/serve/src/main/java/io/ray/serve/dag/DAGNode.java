package io.ray.serve.dag;

import java.util.HashMap;
import java.util.Map;

public abstract class DAGNode implements DAGNodeBase {

  private Object[] boundArgs;

  private Map<String, Object> boundOptions;

  private Map<String, Object> boundOtherArgsToResolve;

  DAGNode(Object[] args, Map<String, Object> options, Map<String, Object> otherArgsToResolve) {
    this.boundArgs = args != null ? args : new Object[0];
    this.boundOptions = options != null ? options : new HashMap<>();
    this.boundOtherArgsToResolve =
        otherArgsToResolve != null ? otherArgsToResolve : new HashMap<>();
  }

  public Object[] getBoundArgs() {
    return boundArgs;
  }

  public void setBoundArgs(Object[] boundArgs) {
    this.boundArgs = boundArgs;
  }

  public Map<String, Object> getBoundOptions() {
    return boundOptions;
  }

  public void setBoundOptions(Map<String, Object> boundOptions) {
    this.boundOptions = boundOptions;
  }

  public Map<String, Object> getBoundOtherArgsToResolve() {
    return boundOtherArgsToResolve;
  }

  public void setBoundOtherArgsToResolve(Map<String, Object> boundOtherArgsToResolve) {
    this.boundOtherArgsToResolve = boundOtherArgsToResolve;
  }
}
