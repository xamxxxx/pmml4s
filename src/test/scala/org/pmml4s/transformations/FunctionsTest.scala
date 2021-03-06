/*
 * Copyright (c) 2017-2019 AutoDeploy AI
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.pmml4s.transformations

import org.scalactic.TolerantNumerics
import org.scalatest.FunSuite

/**
 * Test cases of built-in functions.
 */
class FunctionsTest extends FunSuite {
  implicit val doubleEquality = TolerantNumerics.tolerantDoubleEquality(0.000001)

  test("modulo") {
    assert(Modulo.eval(11, 3) === 2.0)
    assert(Modulo.eval(-17.2, 0.5) === 0.3)
    assert(Modulo.eval(9, -7) === -5.0)
    assert(Modulo.eval(-4, -9) === -4.0)

    val f = BuiltInFunctions.getFunction("x-sin")
    f.get
  }
}
