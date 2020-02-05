/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.runtime.policy.api;

import java.util.Set;

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
  Set<PolicyAwareAttribute> sourcePolicyAwareAttributes();
}
