/*
 * Copyright 2023 Salesforce, Inc. All rights reserved.
 */
package org.mule.runtime.policy.api;

/**
 * Implementations represent a collection of attributes required from the policy pointcut parameters class.
 *
 * @since 1.3
 */
public interface PolicyAwareAttributes {

  /**
   * Indicates if a particular attributes is required
   *
   * @param attribute
   * @return true if the attribute is required
   */
  boolean requires(Attribute attribute);

  /**
   * Generates a new {@link PolicyAwareAttributes} instance by merging the current object with {target}
   *
   * @param target instance to merge
   * @return merge result
   */
  PolicyAwareAttributes merge(PolicyAwareAttributes target);

  /**
   * Implementations are {@code enums}, with each value representing an attribute from the policy pointcut parameters class.
   *
   */
  interface Attribute {
  }
}
