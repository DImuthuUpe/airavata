/**
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.model.experiment;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum ExperimentSearchFields implements org.apache.thrift.TEnum {
  EXPERIMENT_NAME(0),
  EXPERIMENT_DESC(1),
  APPLICATION_ID(2),
  FROM_DATE(3),
  TO_DATE(4),
  STATUS(5),
  PROJECT_ID(6);

  private final int value;

  private ExperimentSearchFields(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ExperimentSearchFields findByValue(int value) { 
    switch (value) {
      case 0:
        return EXPERIMENT_NAME;
      case 1:
        return EXPERIMENT_DESC;
      case 2:
        return APPLICATION_ID;
      case 3:
        return FROM_DATE;
      case 4:
        return TO_DATE;
      case 5:
        return STATUS;
      case 6:
        return PROJECT_ID;
      default:
        return null;
    }
  }
}
