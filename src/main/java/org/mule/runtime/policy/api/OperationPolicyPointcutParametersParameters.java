/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.runtime.policy.api;

import org.mule.api.annotation.NoExtend;
import org.mule.runtime.api.component.Component;

import java.util.Map;

/**
 * Defines parameters necessary for creating operation {@link PolicyPointcutParameters}
 *
 * @since 4.1
 */
@NoExtend
public class OperationPolicyPointcutParametersParameters {

  private final Component operation;
  private final Map<String, Object> operationParameters;
  private final PolicyPointcutParameters sourceParameters;

  public OperationPolicyPointcutParametersParameters(Component operation, Map<String, Object> operationParameters) {
    this(operation, operationParameters, null);
  }

  public OperationPolicyPointcutParametersParameters(Component operation, Map<String, Object> operationParameters,
                                                     PolicyPointcutParameters sourceParameters) {
    this.operation = operation;
    this.operationParameters = operationParameters;
    this.sourceParameters = sourceParameters;
  }

  public Component getOperation() {
    return operation;
  }

  public Map<String, Object> getOperationParameters() {
    return operationParameters;
  }

  public PolicyPointcutParameters getSourceParameters() {
    return sourceParameters;
  }
}
