/*
 * Copyright 2023 Salesforce, Inc. All rights reserved.
 */
package org.mule.runtime.policy.api;

/**
 * Interface for classes that implement {@link PolicyPointcut}.
 * <p>
 * Implementations may define what attributes from the policy pointcut parameters class it uses. That way, if a certain parameter
 * is not declared as used, it will not be used in the pointcut parameters.
 *
 * @since 4.3
 */
public interface AttributeAwarePointcut extends PolicyPointcut {

  /**
   * This method must return a constant value.
   *
   * @return The attributes that are required by the implementation.
   *
   * @since 4.3
   */
  PolicyAwareAttributes sourcePolicyAwareAttributes();
}
