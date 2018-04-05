/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.runtime.policy.api;

import static java.util.Optional.ofNullable;

import org.mule.runtime.api.component.Component;

import java.util.Optional;

/**
 * This class defines a set of parameters related to the execution of a component. In particular to the execution of a source or
 * an operation.
 * 
 * These parameters will later by used during policy lookup to match it against a configured pointcut.
 * 
 * @since 4.0
 */
public class PolicyPointcutParameters {

  private final Component component;

  private PolicyPointcutParameters sourceParameters;

  /**
   * Creates a new {@link PolicyPointcutParameters}
   *
   * @param component the component where the policy is being applied.
   */
  public PolicyPointcutParameters(Component component) {
    this.component = component;
  }

  /**
   * @return the component location where the source / operation is defined.
   */
  public final Component getComponent() {
    return component;
  }

  /**
   * When resolving operation pointcuts, sometimes it is necessary to correlate them with the source pointcuts, specially when
   * a policy defines both source and operation. This allow to set the parameters used to resolve source pointcuts.
   *
   * @param sourceParameters the parameters used to resolve source pointcuts
   */
  public void addOriginalParameters(PolicyPointcutParameters sourceParameters) {
    this.sourceParameters = sourceParameters;
  }

  /**
   * @return the parameters used to resolve source pointcuts
   */
  public Optional<PolicyPointcutParameters> getSourceParameters() {
    return ofNullable(sourceParameters);
  }
}
