/*   Copyright (C) 2013-2014 Computer Sciences Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. */

/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package ezbake.warehouse;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

/**
 * Type of data to return from a get call.
 */
public enum GetDataType implements org.apache.thrift.TEnum {
  RAW(0),
  PARSED(1),
  VIEW(2);

  private final int value;

  private GetDataType(int value) {
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
  public static GetDataType findByValue(int value) { 
    switch (value) {
      case 0:
        return RAW;
      case 1:
        return PARSED;
      case 2:
        return VIEW;
      default:
        return null;
    }
  }
}
