/*
 * Copyright 2023 Salesforce, Inc. All rights reserved.
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
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
