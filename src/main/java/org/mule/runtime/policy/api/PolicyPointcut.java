/*
 * Copyright 2023 Salesforce, Inc. All rights reserved.
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.runtime.policy.api;

/**
 * Provides a way to select which policies must be applied based on a given request.
 *
 * @since 1.3
 */
public interface PolicyPointcut {

  /**
   * Determines whether or not a policy must be applied on a given request
   *
   * @param parameters parameters used to evaluate the pointcut created using the current request. Non null.
   * @return true if the policy must be applied, false otherwise.
   */
  boolean matches(PolicyPointcutParameters parameters);
}
