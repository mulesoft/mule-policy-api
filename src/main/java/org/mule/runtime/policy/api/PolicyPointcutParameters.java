/*
 * Copyright 2023 Salesforce, Inc. All rights reserved.
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.runtime.policy.api;

import static java.util.Optional.ofNullable;

import org.mule.runtime.api.component.Component;

import java.util.Objects;
import java.util.Optional;

/**
 * This class defines a set of parameters related to the execution of a component. In particular to the execution of a source or
 * an operation.
 * <p>
 * These parameters will later by used during policy lookup to match it against a configured pointcut.
 *
 * @since 4.0
 */
public class PolicyPointcutParameters {

  private final Component component;

  private final PolicyPointcutParameters sourceParameters;

  /**
   * Creates a new {@link PolicyPointcutParameters}
   *
   * @param component the component where the policy is being applied.
   */
  public PolicyPointcutParameters(Component component) {
    this(component, null);
  }

  /**
   * Creates a new {@link PolicyPointcutParameters}
   *
   * @param component        the component where the policy is being applied.
   * @param sourceParameters parameters used to match pointcuts of source policies
   */
  public PolicyPointcutParameters(Component component, PolicyPointcutParameters sourceParameters) {
    this.component = component;
    this.sourceParameters = sourceParameters;
  }

  /**
   * @return the component location where the source / operation is defined.
   */
  public final Component getComponent() {
    return component;
  }

  /**
   * When resolving operation pointcuts, sometimes it is necessary to correlate them with the source pointcuts, specially when a
   * policy defines both source and operation.
   *
   * @return the parameters used to resolve source pointcuts
   */
  public Optional<PolicyPointcutParameters> getSourceParameters() {
    return ofNullable(sourceParameters);
  }

  @Override
  public String toString() {
    return "PolicyPointcutParameters{component:" + component.getLocation().getLocation() + "; sourceParameters:"
        + sourceParameters + "}";
  }

  @Override
  public int hashCode() {
    return Objects.hash(component, sourceParameters);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    PolicyPointcutParameters other = (PolicyPointcutParameters) obj;
    return Objects.equals(component, other.component) && Objects.equals(sourceParameters, other.sourceParameters);
  }

}
