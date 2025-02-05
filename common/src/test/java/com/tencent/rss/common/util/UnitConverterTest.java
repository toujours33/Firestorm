/*
 * Tencent is pleased to support the open source community by making
 * Firestorm-Spark remote shuffle server available.
 *
 * Copyright (C) 2021 THL A29 Limited, a Tencent company.  All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the
 * License at
 *
 * https://opensource.org/licenses/Apache-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.tencent.rss.common.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnitConverterTest {

  long PB = (long)ByteUnit.PiB.toBytes(1L);
  long TB = (long)ByteUnit.TiB.toBytes(1L);
  long GB = (long)ByteUnit.GiB.toBytes(1L);
  long MB = (long)ByteUnit.MiB.toBytes(1L);
  long KB = (long)ByteUnit.KiB.toBytes(1L);

  @Test
  public void testByteString() {

    assertEquals(10 * PB, UnitConverter.byteStringAs("10PB", ByteUnit.BYTE));
    assertEquals(10 * PB, UnitConverter.byteStringAs("10pb", ByteUnit.BYTE));
    assertEquals(10 * PB, UnitConverter.byteStringAs("10pB", ByteUnit.BYTE));
    assertEquals(10 * PB, UnitConverter.byteStringAs("10p", ByteUnit.BYTE));
    assertEquals(10 * PB, UnitConverter.byteStringAs("10P", ByteUnit.BYTE));

    assertEquals(10 * TB, UnitConverter.byteStringAs("10TB", ByteUnit.BYTE));
    assertEquals(10 * TB, UnitConverter.byteStringAs("10tb", ByteUnit.BYTE));
    assertEquals(10 * TB, UnitConverter.byteStringAs("10tB", ByteUnit.BYTE));
    assertEquals(10 * TB, UnitConverter.byteStringAs("10T", ByteUnit.BYTE));
    assertEquals(10 * TB, UnitConverter.byteStringAs("10t", ByteUnit.BYTE));

    assertEquals(10 * GB, UnitConverter.byteStringAs("10GB", ByteUnit.BYTE));
    assertEquals(10 * GB, UnitConverter.byteStringAs("10gb", ByteUnit.BYTE));
    assertEquals(10 * GB, UnitConverter.byteStringAs("10gB", ByteUnit.BYTE));

    assertEquals(10 * MB, UnitConverter.byteStringAs("10MB", ByteUnit.BYTE));
    assertEquals(10 * MB, UnitConverter.byteStringAs("10mb", ByteUnit.BYTE));
    assertEquals(10 * MB, UnitConverter.byteStringAs("10mB", ByteUnit.BYTE));
    assertEquals(10 * MB, UnitConverter.byteStringAs("10M", ByteUnit.BYTE));
    assertEquals(10 * MB, UnitConverter.byteStringAs("10m", ByteUnit.BYTE));

    assertEquals(10 * KB, UnitConverter.byteStringAs("10KB", ByteUnit.BYTE));
    assertEquals(10 * KB, UnitConverter.byteStringAs("10kb", ByteUnit.BYTE));
    assertEquals(10 * KB, UnitConverter.byteStringAs("10Kb", ByteUnit.BYTE));
    assertEquals(10 * KB, UnitConverter.byteStringAs("10K", ByteUnit.BYTE));
    assertEquals(10 * KB, UnitConverter.byteStringAs("10k", ByteUnit.BYTE));

    assertEquals(1111, UnitConverter.byteStringAs("1111", ByteUnit.BYTE));
  }
}
