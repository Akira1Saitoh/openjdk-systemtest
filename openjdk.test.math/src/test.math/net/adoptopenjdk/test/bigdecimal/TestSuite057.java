/*******************************************************************************
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      https://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*******************************************************************************/
package net.adoptopenjdk.test.bigdecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

import org.junit.Assert;
import junit.framework.TestCase;
public class TestSuite057 extends TestCase
{
  MathContext rc_MathContext;
  int rc_int;
  boolean rc_boolean;
  long rc_long;
  BigDecimal rc_BigDecimal;
  float rc_float;
  byte rc_byte;
  short rc_short;
  double rc_double;
  BigDecimal[] rc_BigDecimal_array;
  String rc_String;
  BigInteger rc_BigInteger;
  public void testItem_0000()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal("", new MathContext("precision=0 roundingMode=HALF_UP"));
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0001()
  {
    rc_String = (new BigDecimal("0E+19")).toString();
    Assert.assertEquals("0E+19", rc_String);
  }
  public void testItem_0002()
  {
    rc_BigDecimal = (new BigDecimal("-1")).setScale(0, java.math.RoundingMode.DOWN);
    Assert.assertEquals("-1", rc_BigDecimal.toString());
  }
  public void testItem_0003()
  {
    rc_BigDecimal = (new BigDecimal("-1")).movePointLeft(2147483647);
    Assert.assertEquals("-1E-2147483647", rc_BigDecimal.toString());
  }
  public void testItem_0004()
  {
    rc_BigDecimal = (new BigDecimal("0E+19")).setScale(1);
    Assert.assertEquals("0.0", rc_BigDecimal.toString());
  }
  public void testItem_0005()
  {
    rc_short = (new BigDecimal("32")).shortValueExact();
    Assert.assertEquals(32, rc_short);
  }
  public void testItem_0006()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal("");
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0007()
  {
    rc_BigDecimal = (new BigDecimal("0E+19")).multiply(new BigDecimal("0E+19"));
    Assert.assertEquals("0E+38", rc_BigDecimal.toString());
  }
  public void testItem_0008()
  {
    rc_BigDecimal = (new BigDecimal("32")).movePointRight(1);
    Assert.assertEquals("320", rc_BigDecimal.toString());
  }
  public void testItem_0009()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("32")).divideToIntegralValue(new BigDecimal("0.0"), new MathContext("precision=2147483647 roundingMode=HALF_EVEN"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0010()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("0.0")).divide(new BigDecimal("0E+38"), -2147483648, -2147483648);
    }
    catch (java.lang.IllegalArgumentException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0011()
  {
    boolean caught;
    caught = false;
    try {
      rc_int = (new BigDecimal("-1E-2147483647")).intValueExact();
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0012()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(-9223372036854775808L, new MathContext("precision=1 roundingMode=UNNECESSARY"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0013()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("320")).divide(new BigDecimal("0E+38"), java.math.RoundingMode.HALF_UP);
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0014()
  {
    rc_byte = (new BigDecimal("32")).byteValueExact();
    Assert.assertEquals(32, rc_byte);
  }
  public void testItem_0015()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("0E+38")).pow(-2147483648);
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0016()
  {
    rc_float = (new BigDecimal("32")).floatValue();
    Assert.assertEquals(32.0F, rc_float, 0);
  }
  public void testItem_0017()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("-1E-2147483647")).divide(new BigDecimal("320"), new MathContext("precision=2147483647 roundingMode=HALF_UP"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0018()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("320")).divide(new BigDecimal("0.0"), 0, java.math.RoundingMode.UP);
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0019()
  {
    rc_BigDecimal = (new BigDecimal("0E+38")).pow(1);
    Assert.assertEquals("0E+38", rc_BigDecimal.toString());
  }
  public void testItem_0020()
  {
    rc_int = (new BigDecimal("32")).signum();
    Assert.assertEquals(1, rc_int);
  }
//  public void testItem_0021()
//  {
//    boolean caught;
//    if (!Boolean.getBoolean("notanerror"))
//    {
//    caught = false;
//    try {
//      rc_short = (new BigDecimal("0E+38")).shortValueExact();
//    }
//    catch (java.lang.ArithmeticException e) {
//      caught = true;
//    }
//    Assert.assertEquals("91.94630872483222%", true, caught);
//    }
//  }
  public void testItem_0022()
  {
    boolean caught;
    caught = false;
    try {
      rc_MathContext = new MathContext(-2147483648);
    }
    catch (java.lang.IllegalArgumentException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
//  public void testItem_0023()
//  {
//    boolean caught;
//    caught = false;
//    try {
//      rc_BigDecimal = (new BigDecimal("320")).movePointRight(2147483647);
//    }
//    catch (java.lang.NegativeArraySizeException e) {
//      caught = true;
//    }
//    Assert.assertEquals("91.94630872483222%", true, caught);
//  }
  public void testItem_0024()
  {
    rc_float = (new BigDecimal("320")).floatValue();
    Assert.assertEquals(320.0F, rc_float, 0);
  }
  public void testItem_0025()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("0E+38")).divide(new BigDecimal("0E+38"), 0, java.math.RoundingMode.DOWN);
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0026()
  {
    rc_byte = (new BigDecimal("32")).byteValueExact();
    Assert.assertEquals(32, rc_byte);
  }
//  public void testItem_0027()
//  {
//    boolean caught;
//    if (!Boolean.getBoolean("notanerror"))
//    {
//    caught = false;
//    try {
//      rc_long = (new BigDecimal("0E+38")).longValueExact();
//    }
//    catch (java.lang.ArithmeticException e) {
//      caught = true;
//    }
//    Assert.assertEquals("91.94630872483222%", true, caught);
//    }
//  }
  public void testItem_0028()
  {
    rc_BigDecimal = (new BigDecimal("32")).subtract(new BigDecimal("0E+38"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0029()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("32")).abs(new MathContext("precision=1 roundingMode=UNNECESSARY"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0030()
  {
    rc_int = (new BigDecimal("32")).precision();
    Assert.assertEquals(2, rc_int);
  }
  public void testItem_0031()
  {
    rc_BigDecimal = (new BigDecimal("0E+38")).round(new MathContext("precision=1 roundingMode=DOWN"));
    Assert.assertEquals("0E+38", rc_BigDecimal.toString());
  }
  public void testItem_0032()
  {
    rc_short = (new BigDecimal("32")).shortValueExact();
    Assert.assertEquals(32, rc_short);
  }
  public void testItem_0033()
  {
    rc_String = (new BigDecimal("32")).toString();
    Assert.assertEquals("32", rc_String);
  }
  public void testItem_0034()
  {
    rc_BigDecimal = new BigDecimal(1, new MathContext("precision=1 roundingMode=DOWN"));
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  @SuppressWarnings("unlikely-arg-type")
  public void testItem_0035()
  {
    rc_boolean = (new BigDecimal("0E+38")).equals("<Q<>10B=268GC4X745F023GJ3O;OS5:5UMLU7UUWT0FERD7U=2DK0KAI?Q=QC@2P9?VC7M3GDR;3L@64457S5M4?A5H>1DNDF1;C");
    Assert.assertEquals(false, rc_boolean);
  }
  public void testItem_0036()
  {
    rc_BigDecimal = (new BigDecimal("320")).ulp();
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0037()
  {
    rc_BigDecimal = (new BigDecimal("0E+38")).subtract(new BigDecimal("32"), new MathContext("precision=2147483647 roundingMode=HALF_UP"));
    Assert.assertEquals("-32", rc_BigDecimal.toString());
  }
  public void testItem_0038()
  {
    rc_BigDecimal = (new BigDecimal("32")).add(new BigDecimal("32"), new MathContext("precision=1 roundingMode=DOWN"));
    Assert.assertEquals("6E+1", rc_BigDecimal.toString());
  }
  public void testItem_0039()
  {
    rc_BigDecimal = (new BigDecimal("32")).divide(new BigDecimal("32"));
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0040()
  {
    rc_int = (new BigDecimal("1")).precision();
    Assert.assertEquals(1, rc_int);
  }
  public void testItem_0041()
  {
    rc_String = (new BigDecimal("-32")).toPlainString();
    Assert.assertEquals("-32", rc_String);
  }
  public void testItem_0042()
  {
    boolean caught;
    caught = false;
    try {
      rc_MathContext = new MathContext(-1, java.math.RoundingMode.UNNECESSARY);
    }
    catch (java.lang.IllegalArgumentException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0043()
  {
    rc_BigDecimal = (new BigDecimal("-32")).abs(new MathContext("precision=2147483647 roundingMode=HALF_EVEN"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0044()
  {
    rc_short = (new BigDecimal("32")).shortValueExact();
    Assert.assertEquals(32, rc_short);
  }
  public void testItem_0045()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("-32")).negate(new MathContext("precision=1 roundingMode=UNNECESSARY"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  @SuppressWarnings("unlikely-arg-type")
  public void testItem_0046()
  {
    rc_boolean = (new BigDecimal("32")).equals(":MDA8H>R4DT:1;K64V5L:UDUD:JLYVDJ?6I6MMYBGB8>WFC0M:U31KT=FE43G4>EYMHWEWB:U@:K8A2A7@A0SCI1BXIURPG<O0@8");
    Assert.assertEquals(false, rc_boolean);
  }
  public void testItem_0047()
  {
    rc_int = (new BigDecimal("32")).signum();
    Assert.assertEquals(1, rc_int);
  }
  public void testItem_0048()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'8', '\0', '\234', '8', '\0', '8', '8', '8', '8', '8', '\234', '8', '\0', '\0', '\1', '\1', '\uFFFF', '8', '\uFFFF', '\1', '\0', '\1', '\1', '\1', '\0', '\0', '\0', '\0', '\1', '8', '\uFFFF', '8', '\uFFFF', '\234', '\0', '\1', '8', '\234', '8', '\234', '\1', '8', '\0', '\0', '\1', '\1', '\0', '\uFFFF', '\0', '8', '\1', '\234', '\0', '8', '\uFFFF', '\234', '\234', '8', '\234', '8', '8', '\234', '\0', '\uFFFF', '\234', '\0', '\234', '\234', '\0', '\uFFFF', '\uFFFF', '\0', '\uFFFF', '8', '\uFFFF', '\0', '\0', '\uFFFF', '\234', '\234', '\1', '\uFFFF', '\0', '\234', '\uFFFF', '\0', '\1', '\1', '\uFFFF', '\uFFFF', '\uFFFF', '\234', '\0', '\uFFFF', '\234', '\1', '\uFFFF', '\0', '\uFFFF', '\234'}, new MathContext("precision=2147483647 roundingMode=HALF_UP"));
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0049()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0050()
  {
    rc_int = (new BigDecimal("32")).scale();
    Assert.assertEquals(0, rc_int);
  }
  public void testItem_0051()
  {
    rc_BigInteger = (new BigDecimal("32")).toBigIntegerExact();
    Assert.assertEquals("32", rc_BigInteger.toString());
  }
  public void testItem_0052()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\1', '\1', '8', '\uFFFF', '\1', '8', '\1', '\234', '8', '\1', '\0', '\0', '8', '\0', '\234', '\0', '8', '\uFFFF', '\234', '\1', '8', '\1', '\uFFFF', '\0', '\0', '\1', '8', '8', '8', '\0', '\234', '\0', '\234', '8', '8', '\0', '\0', '\1', '8', '\234', '\0', '\1', '8', '8', '\1', '8', '\1', '\0', '\234', '8', '\uFFFF', '\234', '\0', '8', '\uFFFF', '\0', '\1', '8', '\1', '\0', '\uFFFF', '\0', '\1', '\234', '\1', '\0', '\uFFFF', '\234', '\uFFFF', '\234', '\234', '8', '\234', '\0', '\1', '\0', '8', '\234', '\234', '\234', '\uFFFF', '\1', '8', '\234', '\234', '\1', '\234', '\0', '\uFFFF', '\234', '\1', '\1', '\234', '\uFFFF', '\0', '\0', '\234', '8', '8', '\1'}, -2147483648, 0, new MathContext("precision=2147483647 roundingMode=HALF_EVEN"));
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0053()
  {
    rc_BigDecimal = (new BigDecimal("32")).scaleByPowerOfTen(-1);
    Assert.assertEquals("3.2", rc_BigDecimal.toString());
  }
  public void testItem_0054()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("-32")).scaleByPowerOfTen(-2147483648);
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0055()
  {
    rc_BigDecimal = (new BigDecimal("32")).setScale(0);
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0056()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\1', '\234', '\1', '\uFFFF', '\234', '\0', '\1', '\1', '\uFFFF', '\1', '\0', '\1', '8', '\1', '\1', '\234', '\234', '\uFFFF', '8', '\uFFFF', '\0', '\1', '\234', '\0', '\1', '\234', '\1', '\234', '\234', '8', '\1', '8', '\uFFFF', '\uFFFF', '\uFFFF', '\0', '\1', '\0', '\234', '8', '\uFFFF', '\uFFFF', '\uFFFF', '\1', '\234', '\1', '\234', '\1', '8', '\1', '\uFFFF', '\234', '\uFFFF', '8', '\234', '\234', '\uFFFF', '\uFFFF', '\1', '\234', '8', '\1', '\1', '\1', '\uFFFF', '8', '\0', '\0'}, new MathContext("precision=2147483647 roundingMode=HALF_UP"));
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0057()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal("M2ILT1SVE3FHQG8UUPQBYAKT5WL2<=INK;V:2@HPOH;SLXP>6:EV0LUU6");
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0058()
  {
    rc_BigDecimal_array = (new BigDecimal("32")).divideAndRemainder(new BigDecimal("32"), new MathContext("precision=0 roundingMode=HALF_UP"));
  }
  public void testItem_0059()
  {
    rc_int = (new BigDecimal("32")).signum();
    Assert.assertEquals(1, rc_int);
  }
  public void testItem_0060()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), new MathContext("precision=2147483647 roundingMode=HALF_EVEN"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0061()
  {
    rc_BigDecimal = (new BigDecimal("-32")).stripTrailingZeros();
    Assert.assertEquals("-32", rc_BigDecimal.toString());
  }
  public void testItem_0062()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), -2147483648);
    Assert.assertEquals("3.2E+2147483649", rc_BigDecimal.toString());
  }
  public void testItem_0063()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("32")).pow(2147483647);
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
//  public void testItem_0064()
//  {
//    boolean caught;
//    caught = false;
//    try {
//      rc_BigDecimal = (new BigDecimal("32")).movePointRight(2147483647);
//    }
//    catch (java.lang.NegativeArraySizeException e) {
//      caught = true;
//    }
//    Assert.assertEquals("91.94630872483222%", true, caught);
//  }
  public void testItem_0065()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(4.9E-324, new MathContext("precision=1 roundingMode=UNNECESSARY"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0066()
  {
    rc_String = (new BigDecimal("32")).toString();
    Assert.assertEquals("32", rc_String);
  }
  @SuppressWarnings("unlikely-arg-type")
  public void testItem_0067()
  {
    rc_boolean = (new BigDecimal("32")).equals("Q2H@L27VF5W9B34SG<OF:OE8SK4B8EWA@:UPN:M>X2V@253:BWK;HW:QQ?PIND25O;YO30T=6MT9C8I1>66M6NJ9IPC9IFRW4QM0");
    Assert.assertEquals(false, rc_boolean);
  }
  public void testItem_0068()
  {
    rc_MathContext = new MathContext(0);
    Assert.assertEquals("precision=0 roundingMode=HALF_UP", rc_MathContext.toString());
  }
  public void testItem_0069()
  {
    rc_float = (new BigDecimal("32")).floatValue();
    Assert.assertEquals(32.0F, rc_float, 0);
  }
  public void testItem_0070()
  {
    rc_BigDecimal = (new BigDecimal("32")).subtract(new BigDecimal("32"), new MathContext("precision=1 roundingMode=UNNECESSARY"));
    Assert.assertEquals("0", rc_BigDecimal.toString());
  }
  public void testItem_0071()
  {
    rc_BigDecimal = (new BigDecimal("32")).negate();
    Assert.assertEquals("-32", rc_BigDecimal.toString());
  }
  public void testItem_0072()
  {
    rc_long = (new BigDecimal("32")).longValueExact();
    Assert.assertEquals(32L, rc_long);
  }
//  public void testItem_0073()
//  {
//    boolean caught;
//    rc_int = (new BigDecimal("32")).hashCode();
//    Assert.assertEquals(992, rc_int);
//  }
  public void testItem_0074()
  {
    rc_BigDecimal = (new BigDecimal("32")).stripTrailingZeros();
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0075()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), -2147483648, new MathContext("precision=2147483647 roundingMode=HALF_EVEN"));
    Assert.assertEquals("3.2E+2147483649", rc_BigDecimal.toString());
  }
//  public void testItem_0076()
//  {
//    boolean caught;
//    rc_BigDecimal = (new BigDecimal("32")).multiply(new BigDecimal("320.0E+2147483647"), new MathContext("precision=2147483647 roundingMode=HALF_EVEN"));
//    Assert.assertEquals("1.024E+2147483651", rc_BigDecimal.toString());
//  }
//  public void testItem_0077()
//  {
//    boolean caught;
//    caught = false;
//    try {
//      rc_BigDecimal = (new BigDecimal("32")).subtract(new BigDecimal("10240.0E+2147483647"), new MathContext("precision=0 roundingMode=HALF_UP"));
//    }
//    catch (java.lang.ArithmeticException e) {
//      caught = true;
//    }
//    Assert.assertEquals("91.94630872483222%", true, caught);
//  }
  public void testItem_0078()
  {
    rc_String = (new BigDecimal("32")).toString();
    Assert.assertEquals("32", rc_String);
  }
  public void testItem_0079()
  {
    rc_String = (new BigDecimal("-32")).toPlainString();
    Assert.assertEquals("-32", rc_String);
  }
  public void testItem_0080()
  {
    rc_BigDecimal = new BigDecimal(4.9E-324, new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("4.940656458412465441765687928682213723650598026143247644255856825006755072702087518652998363616359923797965646954457177309266567103559397963987747960107818781263007131903114045278458171678489821036887186360569987307230500063874091535649843873124733972731696151400317153853980741262385655911710266585566867681870395603106249319452715914924553293054565444011274801297099995419319894090804165633245247571478690147267801593552386115501348035264934720193790268107107491703332226844753335720832431936092382893458368060106011506169809753078342277318329247904982524730776375927247874656084778203734469699533647017972677717585125660551199131504891101451037862738167250955837389733598993664809941164205702637090279242767544565229087538682506419718265533447265625E-324", rc_BigDecimal.toString());
  }
//  public void testItem_0081()
//  {
//    boolean caught;
//    if (!Boolean.getBoolean("notanerror"))
//    {
//    caught = false;
//    try {
//      rc_BigDecimal = (new BigDecimal("320.0E+2147483647")).divide(new BigDecimal("4.940656458412465441765687928682213723650598026143247644255856825006755072702087518652998363616359923797965646954457177309266567103559397963987747960107818781263007131903114045278458171678489821036887186360569987307230500063874091535649843873124733972731696151400317153853980741262385655911710266585566867681870395603106249319452715914924553293054565444011274801297099995419319894090804165633245247571478690147267801593552386115501348035264934720193790268107107491703332226844753335720832431936092382893458368060106011506169809753078342277318329247904982524730776375927247874656084778203734469699533647017972677717585125660551199131504891101451037862738167250955837389733598993664809941164205702637090279242767544565229087538682506419718265533447265625E-324"));
//    }
//    catch (java.lang.ArithmeticException e) {
//      caught = true;
//    }
//    Assert.assertEquals("91.94630872483222%", true, caught);
//    }
//  }
  public void testItem_0082()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0083()
  {
    rc_int = (new BigDecimal("32")).signum();
    Assert.assertEquals(1, rc_int);
  }
  public void testItem_0084()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal("");
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
//  public void testItem_0085()
//  {
//    boolean caught;
//    caught = false;
//    try {
//      rc_BigDecimal = (new BigDecimal("32")).subtract(new BigDecimal("320.0E+2147483647"), new MathContext("precision=2147483647 roundingMode=HALF_EVEN"));
//    }
//    catch (java.lang.ArithmeticException e) {
//      caught = true;
//    }
//    Assert.assertEquals("91.94630872483222%", true, caught);
//  }
//  public void testItem_0086()
//  {
//    boolean caught;
//    caught = false;
//    try {
//      rc_BigInteger = (new BigDecimal("320.0E+2147483647")).toBigIntegerExact();
//    }
//    catch (java.lang.ArithmeticException e) {
//      caught = true;
//    }
//    Assert.assertEquals("91.94630872483222%", true, caught);
//  }
  public void testItem_0087()
  {
    rc_long = (new BigDecimal("32")).longValue();
    Assert.assertEquals(32L, rc_long);
  }
  public void testItem_0088()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("32")).movePointRight(-2147483648);
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0089()
  {
    rc_BigDecimal = (new BigDecimal("32")).multiply(new BigDecimal("32"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("1024", rc_BigDecimal.toString());
  }
  public void testItem_0090()
  {
    rc_String = (new BigDecimal("32")).toEngineeringString();
    Assert.assertEquals("32", rc_String);
  }
  public void testItem_0091()
  {
    rc_BigDecimal = new BigDecimal(9223372036854775807L);
    Assert.assertEquals("9223372036854775807", rc_BigDecimal.toString());
  }
  public void testItem_0092()
  {
    rc_BigDecimal = (new BigDecimal("32")).plus();
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0093()
  {
    rc_double = (new BigDecimal("9223372036854775807")).doubleValue();
    Assert.assertEquals(9.223372036854776E18, rc_double, 0);
  }
  public void testItem_0094()
  {
    rc_BigDecimal = (new BigDecimal("9223372036854775807")).plus();
    Assert.assertEquals("9223372036854775807", rc_BigDecimal.toString());
  }
  public void testItem_0095()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("32")).divide(new BigDecimal("320.0E+2147483647"), new MathContext("precision=0 roundingMode=HALF_UP"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0096()
  {
    rc_BigDecimal = (new BigDecimal("32")).multiply(new BigDecimal("32"));
    Assert.assertEquals("1024", rc_BigDecimal.toString());
  }
  public void testItem_0097()
  {
    rc_BigDecimal = (new BigDecimal("9223372036854775807")).scaleByPowerOfTen(2147483647);
    Assert.assertEquals("9.223372036854775807E+2147483665", rc_BigDecimal.toString());
  }
  @SuppressWarnings("unlikely-arg-type")
  public void testItem_0098()
  {
    rc_boolean = (new BigDecimal("320.0E+2147483647")).equals("P<12KQDQVH8Q:O");
    Assert.assertEquals(false, rc_boolean);
  }
  public void testItem_0099()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'8'}, -1, 0, new MathContext("precision=2147483647 roundingMode=HALF_UP"));
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0100()
  {
    rc_BigDecimal = (new BigDecimal("32")).subtract(new BigDecimal("9223372036854775807"), new MathContext("precision=2147483647 roundingMode=HALF_EVEN"));
    Assert.assertEquals("-9223372036854775775", rc_BigDecimal.toString());
  }
  public void testItem_0101()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\1', '\1', '\0', '\0', '\1', '\234', '\0', '\0', '8', '\0', '\234', '8', '\1', '\0', '\0', '\234', '\uFFFF', '\uFFFF', '\0', '8', '\0', '8', '\1', '\1', '8', '\1', '\1', '\0', '8', '\0', '\0', '\uFFFF', '\0', '\uFFFF', '\0', '\234', '\0', '8', '\0', '\0', '\1', '\1', '\1', '\234', '\uFFFF', '8', '\1', '\uFFFF', '\234', '\234', '\uFFFF', '8', '\234', '\uFFFF', '\uFFFF', '8', '\0', '8', '\uFFFF', '\1', '8', '\1', '\0', '\1', '8', '\uFFFF', '8', '8', '\uFFFF', '\1', '\0', '\uFFFF', '\234', '\uFFFF', '\0', '\0', '8', '\234', '\234', '\234', '8', '\0', '\0', '\0', '\0', '8', '\234', '8', '\234', '\1', '8', '8', '8', '\234', '\0', '\0', '\1', '\uFFFF', '\1', '\234'});
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0102()
  {
    rc_short = (new BigDecimal("32")).shortValueExact();
    Assert.assertEquals(32, rc_short);
  }
  public void testItem_0103()
  {
    rc_BigDecimal = (new BigDecimal("9223372036854775807")).divideToIntegralValue(new BigDecimal("-9223372036854775775"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("-1", rc_BigDecimal.toString());
  }
  public void testItem_0104()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0105()
  {
    rc_BigDecimal = (new BigDecimal("32")).negate(new MathContext("precision=2147483647 roundingMode=HALF_EVEN"));
    Assert.assertEquals("-32", rc_BigDecimal.toString());
  }
  public void testItem_0106()
  {
    rc_BigDecimal = (new BigDecimal("-1")).max(new BigDecimal("-1"));
    Assert.assertEquals("-1", rc_BigDecimal.toString());
  }
  public void testItem_0107()
  {
    rc_BigDecimal = (new BigDecimal("-32")).abs();
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0108()
  {
    rc_int = (new BigDecimal("32")).intValueExact();
    Assert.assertEquals(32, rc_int);
  }
  public void testItem_0109()
  {
    rc_BigDecimal = (new BigDecimal("32")).round(new MathContext("precision=2147483647 roundingMode=HALF_UP"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
//  public void testItem_0110()
//  {
//    boolean caught;
//    caught = false;
//    try {
//      rc_BigDecimal = (new BigDecimal("32")).add(new BigDecimal("320.0E+2147483647"));
//    }
//    catch (java.lang.ArithmeticException e) {
//      caught = true;
//    }
//    Assert.assertEquals("91.94630872483222%", true, caught);
//  }
  public void testItem_0111()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), 1);
    Assert.assertEquals("3.2", rc_BigDecimal.toString());
  }
  public void testItem_0112()
  {
    rc_BigDecimal = (new BigDecimal("3.2")).stripTrailingZeros();
    Assert.assertEquals("3.2", rc_BigDecimal.toString());
  }
  public void testItem_0113()
  {
    rc_BigDecimal = (new BigDecimal("32")).scaleByPowerOfTen(1);
    Assert.assertEquals("3.2E+2", rc_BigDecimal.toString());
  }
  public void testItem_0114()
  {
    rc_BigDecimal = (new BigDecimal("32")).add(new BigDecimal("3.2E+2"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("352", rc_BigDecimal.toString());
  }
  public void testItem_0115()
  {
    rc_String = (new BigDecimal("32")).toEngineeringString();
    Assert.assertEquals("32", rc_String);
  }
  public void testItem_0116()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("3.2E+2")).divide(new BigDecimal("32"), -2147483648);
    }
    catch (java.lang.IllegalArgumentException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0117()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), -1);
    Assert.assertEquals("3.2E+2", rc_BigDecimal.toString());
  }
  public void testItem_0118()
  {
    rc_BigDecimal = (new BigDecimal("32")).multiply(new BigDecimal("3.2E+2"), new MathContext("precision=2147483647 roundingMode=HALF_EVEN"));
    Assert.assertEquals("1.024E+4", rc_BigDecimal.toString());
  }
  public void testItem_0119()
  {
    rc_BigDecimal = (new BigDecimal("1.024E+4")).divide(new BigDecimal("3.2E+2"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0120()
  {
    boolean caught;
    caught = false;
    try {
      rc_short = (new BigDecimal("3.2")).shortValueExact();
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0121()
  {
    rc_BigDecimal = (new BigDecimal("32")).divideToIntegralValue(new BigDecimal("1.024E+4"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("0.0", rc_BigDecimal.toString());
  }
  public void testItem_0122()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("0.0")).divide(new BigDecimal("32"), 2147483647, -1);
    }
    catch (java.lang.IllegalArgumentException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0123()
  {
    rc_BigDecimal = (new BigDecimal("32")).min(new BigDecimal("32"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0124()
  {
    rc_long = (new BigDecimal("32")).longValueExact();
    Assert.assertEquals(32L, rc_long);
  }
  public void testItem_0125()
  {
    rc_BigDecimal = (new BigDecimal("32")).max(new BigDecimal("3.2"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0126()
  {
    rc_BigDecimal = (new BigDecimal("32")).divide(new BigDecimal("1.024E+4"), 0);
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0127()
  {
    rc_byte = (new BigDecimal("0.0")).byteValueExact();
    Assert.assertEquals(0, rc_byte);
  }
  public void testItem_0128()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("0.0")).divideToIntegralValue(new BigDecimal("0.0"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0129()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal("MACMUHN4MQ", new MathContext("precision=2147483647 roundingMode=HALF_UP"));
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0130()
  {
    rc_BigDecimal = new BigDecimal(0L, new MathContext("precision=2147483647 roundingMode=HALF_EVEN"));
    Assert.assertEquals("0", rc_BigDecimal.toString());
  }
  public void testItem_0131()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), 0, new MathContext("precision=2147483647 roundingMode=HALF_UP"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0132()
  {
    boolean caught;
    caught = false;
    try {
      rc_long = (new BigDecimal("3.2")).longValueExact();
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0133()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(">LTGMC83HL2=O87Q@4N?:4TOPBUPI4O");
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0134()
  {
    rc_byte = (new BigDecimal("0.0")).byteValueExact();
    Assert.assertEquals(0, rc_byte);
  }
  public void testItem_0135()
  {
    rc_BigDecimal = (new BigDecimal("32")).plus(new MathContext("precision=2147483647 roundingMode=HALF_EVEN"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0136()
  {
    rc_int = (new BigDecimal("0")).precision();
    Assert.assertEquals(1, rc_int);
  }
  public void testItem_0137()
  {
    rc_String = (new BigDecimal("32")).toString();
    Assert.assertEquals("32", rc_String);
  }
  public void testItem_0138()
  {
    rc_int = (new BigDecimal("0")).precision();
    Assert.assertEquals(1, rc_int);
  }
  public void testItem_0139()
  {
    rc_long = (new BigDecimal("0")).longValueExact();
    Assert.assertEquals(0L, rc_long);
  }
  public void testItem_0140()
  {
    rc_BigDecimal = new BigDecimal(1.0);
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0141()
  {
    rc_BigInteger = (new BigDecimal("0")).unscaledValue();
    Assert.assertEquals("0", rc_BigInteger.toString());
  }
  public void testItem_0142()
  {
    rc_BigDecimal = (new BigDecimal("1")).round(new MathContext("precision=1 roundingMode=UNNECESSARY"));
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0143()
  {
    rc_String = (new BigDecimal("0.0")).toPlainString();
    Assert.assertEquals("0.0", rc_String);
  }
  public void testItem_0144()
  {
    rc_BigDecimal_array = (new BigDecimal("0")).divideAndRemainder(new BigDecimal("32"));
  }
  public void testItem_0145()
  {
    rc_long = (new BigDecimal("32")).longValue();
    Assert.assertEquals(32L, rc_long);
  }
  public void testItem_0146()
  {
    rc_BigDecimal = (new BigDecimal("0.0")).add(new BigDecimal("1"));
    Assert.assertEquals("1.0", rc_BigDecimal.toString());
  }
  public void testItem_0147()
  {
    rc_BigDecimal = (new BigDecimal("0.0")).abs();
    Assert.assertEquals("0.0", rc_BigDecimal.toString());
  }
  public void testItem_0148()
  {
    rc_BigDecimal = (new BigDecimal("0")).min(new BigDecimal("0.0"));
    Assert.assertEquals("0", rc_BigDecimal.toString());
  }
  public void testItem_0149()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("1")).pow(1, new MathContext("precision=2147483647 roundingMode=HALF_UP"));
    }
    catch (java.lang.IllegalArgumentException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0150()
  {
    rc_String = (new BigDecimal("1.0")).toPlainString();
    Assert.assertEquals("1.0", rc_String);
  }
  public void testItem_0151()
  {
    rc_MathContext = new MathContext(0);
    Assert.assertEquals("precision=0 roundingMode=HALF_UP", rc_MathContext.toString());
  }
  public void testItem_0152()
  {
    rc_BigDecimal = new BigDecimal(1.0);
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0153()
  {
    rc_BigDecimal = (new BigDecimal("1.0")).multiply(new BigDecimal("1.0"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("1.00", rc_BigDecimal.toString());
  }
  public void testItem_0154()
  {
    boolean caught;
    caught = false;
    try {
      rc_MathContext = new MathContext(-1, java.math.RoundingMode.CEILING);
    }
    catch (java.lang.IllegalArgumentException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0155()
  {
    rc_int = (new BigDecimal("1")).scale();
    Assert.assertEquals(0, rc_int);
  }
  public void testItem_0156()
  {
    rc_BigDecimal = (new BigDecimal("0.0")).negate(new MathContext("precision=1 roundingMode=UNNECESSARY"));
    Assert.assertEquals("0.0", rc_BigDecimal.toString());
  }
  public void testItem_0157()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("1")).divide(new BigDecimal("0.0"), -1, java.math.RoundingMode.DOWN);
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0158()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("1.0")).pow(-1, new MathContext("precision=0 roundingMode=HALF_UP"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0159()
  {
    rc_BigInteger = (new BigDecimal("1.0")).toBigInteger();
    Assert.assertEquals("1", rc_BigInteger.toString());
  }
  public void testItem_0160()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(":<6E>>DDBN:<6DLUMRLSS74FX2E@GSW:GMNI<8G7=B9PVFP3;S8J3@3=EA=S>W??FJKS42B9V0PVY7:Y5CYF<DVEW9;2>X2L1UU4", new MathContext("precision=0 roundingMode=HALF_UP"));
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0161()
  {
    rc_BigDecimal = (new BigDecimal("0.0")).multiply(new BigDecimal("1.0"));
    Assert.assertEquals("0.00", rc_BigDecimal.toString());
  }
  public void testItem_0162()
  {
    rc_BigDecimal = (new BigDecimal("1.00")).negate();
    Assert.assertEquals("-1.00", rc_BigDecimal.toString());
  }
  public void testItem_0163()
  {
    rc_BigDecimal = (new BigDecimal("-1.00")).abs();
    Assert.assertEquals("1.00", rc_BigDecimal.toString());
  }
  public void testItem_0164()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("1")).divide(new BigDecimal("1.00"), -2147483648, java.math.RoundingMode.DOWN);
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0165()
  {
    rc_BigDecimal = (new BigDecimal("1")).movePointLeft(0);
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0166()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("0.0")).divide(new BigDecimal("1.00"), 2147483647);
    }
    catch (java.lang.IllegalArgumentException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0167()
  {
    rc_int = (new BigDecimal("-1.00")).scale();
    Assert.assertEquals(2, rc_int);
  }
  public void testItem_0168()
  {
    rc_int = (new BigDecimal("-1.00")).precision();
    Assert.assertEquals(3, rc_int);
  }
  public void testItem_0169()
  {
    rc_int = (new BigDecimal("0.0")).compareTo(new BigDecimal("0.0"));
    Assert.assertEquals(0, rc_int);
  }
  public void testItem_0170()
  {
    rc_BigDecimal = (new BigDecimal("-1.00")).multiply(new BigDecimal("0.0"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("0.000", rc_BigDecimal.toString());
  }
  public void testItem_0171()
  {
    rc_BigDecimal = (new BigDecimal("0.0")).multiply(new BigDecimal("0.000"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("0.0000", rc_BigDecimal.toString());
  }
  public void testItem_0172()
  {
    rc_BigDecimal = (new BigDecimal("0.000")).multiply(new BigDecimal("0.000"));
    Assert.assertEquals("0.000000", rc_BigDecimal.toString());
  }
  public void testItem_0173()
  {
    rc_long = (new BigDecimal("0.00")).longValue();
    Assert.assertEquals(0L, rc_long);
  }
  public void testItem_0174()
  {
    rc_BigDecimal = (new BigDecimal("0.000000")).add(new BigDecimal("1"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("1.000000", rc_BigDecimal.toString());
  }
  public void testItem_0175()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("0.000000")).pow(-1);
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0176()
  {
    rc_int = (new BigDecimal("0.00")).intValueExact();
    Assert.assertEquals(0, rc_int);
  }
  public void testItem_0177()
  {
    rc_int = (new BigDecimal("1.000000")).signum();
    Assert.assertEquals(1, rc_int);
  }
  public void testItem_0178()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("1.000000")).remainder(new BigDecimal("0.00"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0179()
  {
    rc_BigDecimal = (new BigDecimal("0.000000")).subtract(new BigDecimal("0.000000"));
    Assert.assertEquals("0.000000", rc_BigDecimal.toString());
  }
  public void testItem_0180()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("0.00")).divideToIntegralValue(new BigDecimal("0.000000"), new MathContext("precision=0 roundingMode=HALF_UP"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0181()
  {
    rc_BigDecimal = (new BigDecimal("0.00")).add(new BigDecimal("0.000000"));
    Assert.assertEquals("0.000000", rc_BigDecimal.toString());
  }
  public void testItem_0182()
  {
    rc_int = (new BigDecimal("0.000000")).scale();
    Assert.assertEquals(6, rc_int);
  }
  public void testItem_0183()
  {
    rc_BigDecimal = (new BigDecimal("0.000000")).setScale(1, 0);
    Assert.assertEquals("0.0", rc_BigDecimal.toString());
  }
  public void testItem_0184()
  {
    rc_BigDecimal = (new BigDecimal("0.000000")).negate();
    Assert.assertEquals("0.000000", rc_BigDecimal.toString());
  }
  public void testItem_0185()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("0.0")).divide(new BigDecimal("0.000000"), 2147483647);
    }
    catch (java.lang.IllegalArgumentException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0186()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal_array = (new BigDecimal("0.000000")).divideAndRemainder(new BigDecimal("0.000000"), new MathContext("precision=0 roundingMode=HALF_UP"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0187()
  {
    rc_BigDecimal = new BigDecimal(-1L, new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("-1", rc_BigDecimal.toString());
  }
  public void testItem_0188()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("0.000000")).setScale(2147483647, -2147483648);
    }
    catch (java.lang.IllegalArgumentException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0189()
  {
    rc_BigDecimal = (new BigDecimal("0.0")).setScale(0, 0);
    Assert.assertEquals("0", rc_BigDecimal.toString());
  }
  public void testItem_0190()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("0.000000")).remainder(new BigDecimal("0.000000"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0191()
  {
    rc_String = (new BigDecimal("0.000000")).toEngineeringString();
    Assert.assertEquals("0.000000", rc_String);
  }
  public void testItem_0192()
  {
    rc_BigDecimal = (new BigDecimal("0")).ulp();
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0193()
  {
    rc_BigDecimal = (new BigDecimal("0.000000")).min(new BigDecimal("0.000000"));
    Assert.assertEquals("0.000000", rc_BigDecimal.toString());
  }
  public void testItem_0194()
  {
    rc_BigDecimal = (new BigDecimal("0")).scaleByPowerOfTen(1);
    Assert.assertEquals("0E+1", rc_BigDecimal.toString());
  }
  public void testItem_0195()
  {
    rc_BigDecimal = (new BigDecimal("0.000000")).multiply(new BigDecimal("0.000000"));
    Assert.assertEquals("0E-12", rc_BigDecimal.toString());
  }
  public void testItem_0196()
  {
    rc_BigDecimal = (new BigDecimal("1")).add(new BigDecimal("0.000000"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("1.000000", rc_BigDecimal.toString());
  }
  public void testItem_0197()
  {
    rc_BigDecimal = new BigDecimal(new char[]{'8'});
    Assert.assertEquals("8", rc_BigDecimal.toString());
  }
  public void testItem_0198()
  {
    rc_BigDecimal = new BigDecimal(new char[]{'8', '\1', '\uFFFF', '8', '\1', '\1', '\0', '\234', '\234', '8', '\uFFFF', '\0', '\1', '8', '8', '\234', '\234', '\0', '\234', '8', '\234', '\1', '8', '\0', '8', '\0', '\0', '\uFFFF', '\234', '\234', '\uFFFF', '\uFFFF', '\1', '\1', '\uFFFF', '8', '\0', '8', '\1', '\1', '\1', '8', '\1', '\uFFFF', '8', '\234', '8', '\234', '\uFFFF', '\uFFFF', '\0', '\1', '8', '\1', '8', '\1', '\234', '\uFFFF', '8'}, 0, 1);
    Assert.assertEquals("8", rc_BigDecimal.toString());
  }
  public void testItem_0199()
  {
    rc_BigInteger = (new BigDecimal("0")).toBigInteger();
    Assert.assertEquals("0", rc_BigInteger.toString());
  }
  public void testItem_0200()
  {
    rc_BigDecimal = (new BigDecimal("8")).round(new MathContext("precision=1 roundingMode=UNNECESSARY"));
    Assert.assertEquals("8", rc_BigDecimal.toString());
  }
  public void testItem_0201()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), 2147483647, new MathContext("precision=2147483647 roundingMode=HALF_EVEN"));
    Assert.assertEquals("3.2E-2147483646", rc_BigDecimal.toString());
  }
  public void testItem_0202()
  {
    rc_BigDecimal = new BigDecimal(-1.0, new MathContext("precision=1 roundingMode=UNNECESSARY"));
    Assert.assertEquals("-1", rc_BigDecimal.toString());
  }
  public void testItem_0203()
  {
    rc_BigDecimal = (new BigDecimal("-1")).subtract(new BigDecimal("0"));
    Assert.assertEquals("-1", rc_BigDecimal.toString());
  }
  public void testItem_0204()
  {
    rc_BigDecimal = (new BigDecimal("1.000000")).subtract(new BigDecimal("1.000000"), new MathContext("precision=2147483647 roundingMode=HALF_UP"));
    Assert.assertEquals("0.000000", rc_BigDecimal.toString());
  }
  public void testItem_0205()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\1', '\0', '\234', '\1', '\0', '8', '\234', '\1', '8', '\234', '8', '\uFFFF', '8', '\uFFFF', '\234', '\1', '\1', '\uFFFF', '\1', '8', '8', '\uFFFF', '8', '\1', '\1', '\uFFFF', '\1', '\0', '\1', '\234', '\0', '\0', '8', '\1', '\uFFFF', '\uFFFF', '\uFFFF', '\0', '\1', '\1', '\1', '\234', '8', '\234', '\234', '\234', '\234', '\uFFFF', '8', '\uFFFF', '\234', '\1', '\1', '\uFFFF', '\0', '\234', '\1', '\234', '\0', '\234', '8', '\234', '\1', '\uFFFF', '\0', '\uFFFF', '8', '\0', '\uFFFF', '\234', '\1', '\234', '\1', '\234', '\234', '\uFFFF', '\234', '\0', '\1', '8', '\1', '\uFFFF', '\1', '\234', '\1', '\234', '\uFFFF', '\1', '\uFFFF', '8', '\234', '\234', '\uFFFF', '8', '8', '\1', '\uFFFF', '8', '\234', '\0'}, 1, -2147483648, new MathContext("precision=0 roundingMode=HALF_UP"));
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0206()
  {
    rc_BigDecimal = (new BigDecimal("0.000000")).abs(new MathContext("precision=1 roundingMode=UNNECESSARY"));
    Assert.assertEquals("0.000000", rc_BigDecimal.toString());
  }
  public void testItem_0207()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\uFFFF'}, 2147483647, -2147483648, new MathContext("precision=1 roundingMode=UNNECESSARY"));
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0208()
  {
    rc_BigDecimal = (new BigDecimal("0.000000")).divide(new BigDecimal("-1"), 0, java.math.RoundingMode.CEILING);
    Assert.assertEquals("0", rc_BigDecimal.toString());
  }
  public void testItem_0209()
  {
    rc_BigDecimal = new BigDecimal(-2147483648);
    Assert.assertEquals("-2147483648", rc_BigDecimal.toString());
  }
  public void testItem_0210()
  {
    rc_BigDecimal = (new BigDecimal("0.000000")).divideToIntegralValue(new BigDecimal("-1"));
    Assert.assertEquals("0.000000", rc_BigDecimal.toString());
  }
  public void testItem_0211()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), -1);
    Assert.assertEquals("3.2E+2", rc_BigDecimal.toString());
  }
  public void testItem_0212()
  {
    rc_float = (new BigDecimal("-2147483648")).floatValue();
    Assert.assertEquals(-2.147483648E9F, rc_float, 0);
  }
  public void testItem_0213()
  {
    rc_BigInteger = (new BigDecimal("1.000000")).unscaledValue();
    Assert.assertEquals("1000000", rc_BigInteger.toString());
  }
  public void testItem_0214()
  {
    boolean caught;
    caught = false;
    try {
      rc_MathContext = new MathContext(-2147483648, java.math.RoundingMode.HALF_EVEN);
    }
    catch (java.lang.IllegalArgumentException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0215()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), -1, new MathContext("precision=2147483647 roundingMode=HALF_UP"));
    Assert.assertEquals("3.2E+2", rc_BigDecimal.toString());
  }
  public void testItem_0216()
  {
    rc_BigDecimal = (new BigDecimal("-1")).max(new BigDecimal("-2147483648"));
    Assert.assertEquals("-1", rc_BigDecimal.toString());
  }
  public void testItem_0217()
  {
    rc_BigDecimal = (new BigDecimal("3.2E+2")).divide(new BigDecimal("3.2E+2"), java.math.RoundingMode.HALF_UP);
    Assert.assertEquals("0E+1", rc_BigDecimal.toString());
  }
  public void testItem_0218()
  {
    rc_BigDecimal = (new BigDecimal("3.2E+2")).divideToIntegralValue(new BigDecimal("-1"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("-3.2E+2", rc_BigDecimal.toString());
  }
  public void testItem_0219()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0220()
  {
    rc_BigDecimal = (new BigDecimal("-3.2E+2")).negate(new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("3.2E+2", rc_BigDecimal.toString());
  }
  public void testItem_0221()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(-9223372036854775808L, new MathContext("precision=1 roundingMode=UNNECESSARY"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0222()
  {
    boolean caught;
    caught = false;
    try {
      rc_MathContext = new MathContext("");
    }
    catch (java.lang.IllegalArgumentException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0223()
  {
    rc_BigDecimal = (new BigDecimal("3.2E+2")).subtract(new BigDecimal("-2147483648"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("2147483968", rc_BigDecimal.toString());
  }
  public void testItem_0224()
  {
    rc_BigDecimal = (new BigDecimal("3.2E+2")).setScale(0, 1);
    Assert.assertEquals("320", rc_BigDecimal.toString());
  }
  public void testItem_0225()
  {
    rc_MathContext = new MathContext(0);
    Assert.assertEquals("precision=0 roundingMode=HALF_UP", rc_MathContext.toString());
  }
  public void testItem_0226()
  {
    rc_BigDecimal = (new BigDecimal("3.2E+2")).abs();
    Assert.assertEquals("3.2E+2", rc_BigDecimal.toString());
  }
  public void testItem_0227()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("-1")).divide(new BigDecimal("3.2E+2"), 0, -1);
    }
    catch (java.lang.IllegalArgumentException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
//  public void testItem_0228()
//  {
//    boolean caught;
//    rc_int = (new BigDecimal("-2147483648")).hashCode();
//    Assert.assertEquals(-2147483648, rc_int);
//  }
  public void testItem_0229()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), -2147483648);
    Assert.assertEquals("3.2E+2147483649", rc_BigDecimal.toString());
  }
  public void testItem_0230()
  {
    rc_BigDecimal_array = (new BigDecimal("3.2E+2")).divideAndRemainder(new BigDecimal("3.2E+2"), new MathContext("precision=0 roundingMode=HALF_UP"));
  }
  public void testItem_0231()
  {
    rc_BigDecimal_array = (new BigDecimal("-2147483648")).divideAndRemainder(new BigDecimal("-2147483648"));
  }
  public void testItem_0232()
  {
    rc_BigDecimal = (new BigDecimal("-2147483648")).movePointRight(0);
    Assert.assertEquals("-2147483648", rc_BigDecimal.toString());
  }
  public void testItem_0233()
  {
    rc_BigDecimal = (new BigDecimal("-2147483648")).round(new MathContext("precision=2147483647 roundingMode=HALF_UP"));
    Assert.assertEquals("-2147483648", rc_BigDecimal.toString());
  }
  @SuppressWarnings("unlikely-arg-type")
  public void testItem_0234()
  {
    rc_boolean = (new BigDecimal("-2147483648")).equals("0ESIFI3PS==MBS>N0KBG7OJUFF1I0X9<M050OD>6TH?>E?XOGH8INBXHC=O5@T3=FGDC8AOXQ4OBYS0W<<NE6ITAMK:1M=UT8TN2");
    Assert.assertEquals(false, rc_boolean);
  }
  public void testItem_0235()
  {
    rc_BigDecimal = (new BigDecimal("-2147483648")).ulp();
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0236()
  {
    rc_long = (new BigDecimal("3.2E+2")).longValue();
    Assert.assertEquals(320L, rc_long);
  }
  public void testItem_0237()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("-2147483648")).divide(new BigDecimal("320.0E+2147483647"), 1, -1);
    }
    catch (java.lang.IllegalArgumentException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0238()
  {
    rc_BigDecimal = (new BigDecimal("-2147483648")).plus();
    Assert.assertEquals("-2147483648", rc_BigDecimal.toString());
  }
//  public void testItem_0239()
//  {
//    boolean caught;
//    rc_BigDecimal = (new BigDecimal("320.0E+2147483647")).remainder(new BigDecimal("-2147483648"), new MathContext("precision=0 roundingMode=HALF_UP"));
//    Assert.assertEquals("3.2E+2147483649", rc_BigDecimal.toString());
//  }
  public void testItem_0240()
  {
    rc_BigDecimal = (new BigDecimal("-2147483648")).abs();
    Assert.assertEquals("2147483648", rc_BigDecimal.toString());
  }
  public void testItem_0241()
  {
    rc_BigDecimal = new BigDecimal(-1);
    Assert.assertEquals("-1", rc_BigDecimal.toString());
  }
  public void testItem_0242()
  {
    rc_MathContext = new MathContext(0);
    Assert.assertEquals("precision=0 roundingMode=HALF_UP", rc_MathContext.toString());
  }
  public void testItem_0243()
  {
    rc_BigDecimal = (new BigDecimal("2147483648")).pow(1);
    Assert.assertEquals("2147483648", rc_BigDecimal.toString());
  }
  public void testItem_0244()
  {
    rc_BigDecimal = (new BigDecimal("-1")).max(new BigDecimal("2147483648"));
    Assert.assertEquals("2147483648", rc_BigDecimal.toString());
  }
  public void testItem_0245()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0246()
  {
    rc_BigDecimal = (new BigDecimal("-1")).add(new BigDecimal("-1"), new MathContext("precision=1 roundingMode=UNNECESSARY"));
    Assert.assertEquals("-2", rc_BigDecimal.toString());
  }
  public void testItem_0247()
  {
    rc_byte = (new BigDecimal("32")).byteValueExact();
    Assert.assertEquals(32, rc_byte);
  }
  public void testItem_0248()
  {
    rc_BigDecimal = (new BigDecimal("-2")).multiply(new BigDecimal("32"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("-64", rc_BigDecimal.toString());
  }
  public void testItem_0249()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\uFFFF', '\0', '\0', '\1', '\1', '8', '8', '\uFFFF', '\234', '\0', '\1', '\0', '\uFFFF', '\1', '\1', '\0', '\0', '8', '\234', '8', '\1', '8', '\1', '\1', '\234', '\0', '\0', '8', '\234', '8', '\234', '\0', '\234', '\0', '\1', '\0', '\uFFFF', '\0', '8', '\234', '8', '\1', '\1', '\0', '\234', '\0', '\uFFFF', '\uFFFF', '\uFFFF', '\uFFFF', '8', '\1', '\234', '8', '\234', '\uFFFF', '\0', '\0', '\0', '8', '\0', '\234', '8', '\0', '\234', '\uFFFF', '8', '\1', '8', '8', '\1', '8', '8', '\1', '8', '\uFFFF', '\1', '\1', '\1', '\234', '\0', '8', '\1', '\0', '\1', '8', '\uFFFF', '\234', '\1', '\234', '\0', '8'}, new MathContext("precision=0 roundingMode=HALF_UP"));
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0250()
  {
    rc_BigDecimal = (new BigDecimal("-1")).remainder(new BigDecimal("-1"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("0", rc_BigDecimal.toString());
  }
  public void testItem_0251()
  {
    rc_BigDecimal = (new BigDecimal("0")).setScale(2147483647, java.math.RoundingMode.HALF_UP);
    Assert.assertEquals("0E-2147483647", rc_BigDecimal.toString());
  }
  public void testItem_0252()
  {
    rc_BigDecimal = (new BigDecimal("32")).subtract(new BigDecimal("-2"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("34", rc_BigDecimal.toString());
  }
  public void testItem_0253()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\0', '8', '\1', '\1', '\0', '\uFFFF', '\0', '\234', '\1', '\0', '8', '\1', '\1', '8', '\1', '\0', '\0', '\uFFFF', '\0', '\1', '\234', '\1', '\uFFFF', '\234', '8', '\1', '\1', '\234', '\234', '\1', '\1', '\234', '\1', '\uFFFF', '\uFFFF', '8', '\uFFFF', '\0', '\0', '8', '\234', '8', '8', '\uFFFF', '\0', '8', '\0', '8', '\0', '\234', '\234', '\0', '\1', '\0', '\1', '8', '\234', '\uFFFF', '8', '\1', '\0', '\uFFFF', '\234', '8', '\1', '8', '\234', '\234', '\uFFFF', '8', '\uFFFF', '8', '8', '\234', '\uFFFF', '\1', '\1', '\uFFFF', '\234', '\0', '8', '\234', '\0', '\1', '\234', '\1', '\0', '\1', '8', '\1', '\234', '\234', '\uFFFF', '\uFFFF', '\0', '\0', '8', '\uFFFF', '\234', '\0'}, new MathContext("precision=1 roundingMode=UNNECESSARY"));
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0254()
  {
    rc_BigDecimal_array = (new BigDecimal("0E-2147483647")).divideAndRemainder(new BigDecimal("32"), new MathContext("precision=0 roundingMode=HALF_UP"));
  }
  public void testItem_0255()
  {
    boolean caught;
    caught = false;
    try {
      rc_MathContext = new MathContext("");
    }
    catch (java.lang.IllegalArgumentException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0256()
  {
    boolean caught;
    caught = false;
    try {
      rc_MathContext = new MathContext("");
    }
    catch (java.lang.IllegalArgumentException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0257()
  {
    rc_BigDecimal = (new BigDecimal("32")).setScale(1);
    Assert.assertEquals("32.0", rc_BigDecimal.toString());
  }
  public void testItem_0258()
  {
    rc_String = (new BigDecimal("0E-2147483647")).toEngineeringString();
    Assert.assertEquals("0.0E-2147483646", rc_String);
  }
  public void testItem_0259()
  {
    rc_BigDecimal = (new BigDecimal("0E-2147483647")).abs();
    Assert.assertEquals("0E-2147483647", rc_BigDecimal.toString());
  }
  public void testItem_0260()
  {
    rc_BigDecimal = (new BigDecimal("32")).divide(new BigDecimal("32.0"));
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0261()
  {
    rc_BigDecimal = (new BigDecimal("-1")).divide(new BigDecimal("1"), java.math.RoundingMode.HALF_DOWN);
    Assert.assertEquals("-1", rc_BigDecimal.toString());
  }
  public void testItem_0262()
  {
    rc_BigDecimal = (new BigDecimal("1")).plus();
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0263()
  {
    rc_BigDecimal = (new BigDecimal("1")).setScale(-1, java.math.RoundingMode.DOWN);
    Assert.assertEquals("0E+1", rc_BigDecimal.toString());
  }
  public void testItem_0264()
  {
    rc_double = (new BigDecimal("-2")).doubleValue();
    Assert.assertEquals(-2.0, rc_double, 0);
  }
  public void testItem_0265()
  {
    rc_BigDecimal = (new BigDecimal("32")).negate();
    Assert.assertEquals("-32", rc_BigDecimal.toString());
  }
  public void testItem_0266()
  {
    rc_BigDecimal = (new BigDecimal("32")).divide(new BigDecimal("32"));
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0267()
  {
    rc_BigDecimal = (new BigDecimal("32")).remainder(new BigDecimal("32"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("0", rc_BigDecimal.toString());
  }
  public void testItem_0268()
  {
    rc_float = (new BigDecimal("0")).floatValue();
    Assert.assertEquals(0.0F, rc_float, 0);
  }
  public void testItem_0269()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0270()
  {
    rc_BigDecimal = (new BigDecimal("1")).stripTrailingZeros();
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0271()
  {
    rc_BigDecimal = (new BigDecimal("32")).add(new BigDecimal("0E+1"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0272()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal("M?2AS1B>YTJA5:J0TKRLACPP9:E:M4RB:57J603<9XHBT?RSYCI", new MathContext("precision=0 roundingMode=HALF_UP"));
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0273()
  {
    rc_BigInteger = (new BigDecimal("1")).toBigIntegerExact();
    Assert.assertEquals("1", rc_BigInteger.toString());
  }
  public void testItem_0274()
  {
    rc_int = (new BigDecimal("1")).intValueExact();
    Assert.assertEquals(1, rc_int);
  }
  public void testItem_0275()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), 1, new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("3.2", rc_BigDecimal.toString());
  }
  public void testItem_0276()
  {
    rc_BigDecimal = (new BigDecimal("3.2")).negate();
    Assert.assertEquals("-3.2", rc_BigDecimal.toString());
  }
  public void testItem_0277()
  {
    boolean caught;
    caught = false;
    try {
      rc_short = (new BigDecimal("-3.2")).shortValueExact();
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0278()
  {
    rc_MathContext = new MathContext(2147483647, java.math.RoundingMode.HALF_DOWN);
    Assert.assertEquals("precision=2147483647 roundingMode=HALF_DOWN", rc_MathContext.toString());
  }
  public void testItem_0279()
  {
    rc_BigDecimal = (new BigDecimal("1")).round(new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0280()
  {
    rc_BigDecimal = (new BigDecimal("1")).subtract(new BigDecimal("1"));
    Assert.assertEquals("0", rc_BigDecimal.toString());
  }
  public void testItem_0281()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal("OI>;2MO7B=S@8CEM5CF83WLYKQYM629S>?10Y:C9NVS9R44006G=4?R@B6@P@7V07WGHQHSKX20CN5DSY?69FT??E4MTCLHHTAX<");
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0282()
  {
    rc_BigDecimal = (new BigDecimal("3.2")).multiply(new BigDecimal("1"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("3.2", rc_BigDecimal.toString());
  }
  public void testItem_0283()
  {
    rc_float = (new BigDecimal("1")).floatValue();
    Assert.assertEquals(1.0F, rc_float, 0);
  }
  public void testItem_0284()
  {
    rc_int = (new BigDecimal("3.2")).precision();
    Assert.assertEquals(2, rc_int);
  }
  public void testItem_0285()
  {
    rc_byte = (new BigDecimal("1")).byteValueExact();
    Assert.assertEquals(1, rc_byte);
  }
  public void testItem_0286()
  {
    rc_BigDecimal = (new BigDecimal("-3.2")).max(new BigDecimal("1"));
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0287()
  {
    rc_BigDecimal = (new BigDecimal("0")).setScale(2147483647, 1);
    Assert.assertEquals("0E-2147483647", rc_BigDecimal.toString());
  }
  public void testItem_0288()
  {
    rc_BigDecimal = (new BigDecimal("-3.2")).multiply(new BigDecimal("3.2"));
    Assert.assertEquals("-10.24", rc_BigDecimal.toString());
  }
  public void testItem_0289()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), 2147483647, new MathContext("precision=1 roundingMode=UNNECESSARY"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0290()
  {
    rc_BigDecimal = (new BigDecimal("3.2")).divide(new BigDecimal("1"), java.math.RoundingMode.HALF_EVEN);
    Assert.assertEquals("3.2", rc_BigDecimal.toString());
  }
  public void testItem_0291()
  {
    rc_BigInteger = (new BigDecimal("0")).unscaledValue();
    Assert.assertEquals("0", rc_BigInteger.toString());
  }
  public void testItem_0292()
  {
    rc_BigDecimal = (new BigDecimal("0")).pow(0, new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0293()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("-10.24")).setScale(-2147483648);
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0294()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0295()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("3.2")).pow(-1, new MathContext("precision=0 roundingMode=HALF_UP"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0296()
  {
    rc_BigDecimal_array = (new BigDecimal("-10.24")).divideAndRemainder(new BigDecimal("-10.24"));
  }
  public void testItem_0297()
  {
    rc_BigDecimal = (new BigDecimal("3.2")).multiply(new BigDecimal("1"));
    Assert.assertEquals("3.2", rc_BigDecimal.toString());
  }
  @SuppressWarnings("unlikely-arg-type")
  public void testItem_0298()
  {
    rc_boolean = (new BigDecimal("-10.24")).equals("6WRS<IXP:Q0D;:6:CXB5XJVCSO2NJ<1<>89DBO2U:L<22P?IV375QY=HQYNSP2O6HCMD1NB5R7EV>RSQLQ23<Y7<FWCS120B655Q");
    Assert.assertEquals(false, rc_boolean);
  }
  public void testItem_0299()
  {
    rc_BigDecimal = (new BigDecimal("3.2")).multiply(new BigDecimal("-10.24"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("-32.768", rc_BigDecimal.toString());
  }
  public void testItem_0300()
  {
    rc_int = (new BigDecimal("-32.768")).scale();
    Assert.assertEquals(3, rc_int);
  }
  public void testItem_0301()
  {
    rc_BigDecimal = (new BigDecimal("-10.24")).divideToIntegralValue(new BigDecimal("-32.768"));
    Assert.assertEquals("0E+1", rc_BigDecimal.toString());
  }
  public void testItem_0302()
  {
    rc_int = (new BigDecimal("0E+1")).signum();
    Assert.assertEquals(0, rc_int);
  }
  public void testItem_0303()
  {
    rc_String = (new BigDecimal("0E+1")).toString();
    Assert.assertEquals("0E+1", rc_String);
  }
  public void testItem_0304()
  {
    rc_int = (new BigDecimal("0E+1")).compareTo(new BigDecimal("-10.24"));
    Assert.assertEquals(1, rc_int);
  }
  public void testItem_0305()
  {
    rc_BigDecimal = new BigDecimal(-1, new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("-1", rc_BigDecimal.toString());
  }
  public void testItem_0306()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0307()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\234', '\uFFFF', '\uFFFF', '8', '\234', '\0', '\0', '\234', '\uFFFF', '\uFFFF', '\0', '\0', '\1', '\234', '\0', '\0', '\0', '\uFFFF', '\1', '\uFFFF', '\0', '\234', '\234', '8', '8', '\0', '\uFFFF', '\1', '\uFFFF', '8', '\uFFFF', '8', '\uFFFF', '8', '\1', '\234', '\0', '\234', '\0', '\234', '\234', '\0', '8', '\1', '\234', '8', '\1', '\1', '\0', '\uFFFF', '\0', '\0', '\1', '\uFFFF', '8', '\uFFFF', '\uFFFF', '\1', '\uFFFF', '\uFFFF', '\uFFFF', '\0', '\uFFFF', '8', '\1', '\0', '\234', '8', '\1', '\0', '\1', '8', '\0', '\uFFFF', '\uFFFF', '\234', '\uFFFF', '\1', '\1', '\uFFFF', '8', '\234', '\uFFFF', '\uFFFF', '\234', '\234', '8', '\1', '\uFFFF', '8', '\uFFFF', '8', '\uFFFF', '8', '\1', '8', '\234', '\1', '\0', '8'}, 0, -2147483648);
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0308()
  {
    rc_BigDecimal = (new BigDecimal("32")).negate();
    Assert.assertEquals("-32", rc_BigDecimal.toString());
  }
  public void testItem_0309()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("-32.768")).divide(new BigDecimal("32"), new MathContext("precision=1 roundingMode=UNNECESSARY"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0310()
  {
    rc_BigDecimal = (new BigDecimal("32")).plus();
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0311()
  {
    rc_BigDecimal = (new BigDecimal("-32")).movePointLeft(0);
    Assert.assertEquals("-32", rc_BigDecimal.toString());
  }
  public void testItem_0312()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'8', '\0', '8', '\234', '\0', '\234', '\uFFFF', '\234', '\uFFFF', '8', '\uFFFF', '\0', '\0', '\234', '\uFFFF', '8', '\uFFFF', '\1', '\234', '\uFFFF', '\uFFFF', '\234', '\uFFFF', '\0', '\0', '\1', '\234', '\1', '8', '8', '\uFFFF', '\uFFFF', '8', '\uFFFF', '\1', '\uFFFF', '\234', '8', '\234', '\234', '8', '\1', '8', '\234', '\234', '\0', '\0', '\0', '8', '\uFFFF', '\0', '\0', '8', '\234', '\0', '\uFFFF', '\234', '\uFFFF', '\uFFFF', '\234', '\uFFFF', '8', '\234', '8', '\234', '\0', '8', '\234', '\234', '\uFFFF', '8', '\uFFFF', '\234', '\0', '8', '\0', '\uFFFF', '\1', '\uFFFF', '\234', '\1', '8', '\0', '\0', '\uFFFF', '8', '\0', '\1', '8', '8', '\234', '\234', '\uFFFF'}, new MathContext("precision=0 roundingMode=HALF_UP"));
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0313()
  {
    rc_BigDecimal = new BigDecimal(1135879015891L, new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("1135879015891", rc_BigDecimal.toString());
  }
  public void testItem_0314()
  {
    rc_BigDecimal = new BigDecimal(1135879015891L);
    Assert.assertEquals("1135879015891", rc_BigDecimal.toString());
  }
  public void testItem_0315()
  {
    rc_String = (new BigDecimal("-1")).toString();
    Assert.assertEquals("-1", rc_String);
  }
  public void testItem_0316()
  {
    rc_BigDecimal_array = (new BigDecimal("1135879015891")).divideAndRemainder(new BigDecimal("1135879015891"), new MathContext("precision=0 roundingMode=HALF_UP"));
  }
  public void testItem_0317()
  {
    rc_BigDecimal = (new BigDecimal("1135879015891")).plus();
    Assert.assertEquals("1135879015891", rc_BigDecimal.toString());
  }
  public void testItem_0318()
  {
    rc_BigDecimal = (new BigDecimal("-32.768")).abs();
    Assert.assertEquals("32.768", rc_BigDecimal.toString());
  }
  public void testItem_0319()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'8'}, -2147483648, -2147483648, new MathContext("precision=1 roundingMode=UNNECESSARY"));
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0320()
  {
    rc_BigDecimal = (new BigDecimal("1135879015891")).subtract(new BigDecimal("32"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("1135879015859", rc_BigDecimal.toString());
  }
  public void testItem_0321()
  {
    rc_BigDecimal = (new BigDecimal("32")).pow(1, new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0322()
  {
    rc_String = (new BigDecimal("-1")).toEngineeringString();
    Assert.assertEquals("-1", rc_String);
  }
  public void testItem_0323()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("32")).pow(-2147483648);
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0324()
  {
    rc_BigDecimal_array = (new BigDecimal("32")).divideAndRemainder(new BigDecimal("1135879015859"));
  }
  public void testItem_0325()
  {
    rc_int = (new BigDecimal("32")).compareTo(new BigDecimal("32"));
    Assert.assertEquals(0, rc_int);
  }
  public void testItem_0326()
  {
    rc_int = (new BigDecimal("-1")).intValue();
    Assert.assertEquals(-1, rc_int);
  }
  public void testItem_0327()
  {
    rc_BigDecimal = (new BigDecimal("32")).abs(new MathContext("precision=2147483647 roundingMode=HALF_DOWN"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0328()
  {
    boolean caught;
    caught = false;
    try {
      rc_int = (new BigDecimal("1135879015859")).intValueExact();
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0329()
  {
    rc_int = (new BigDecimal("32")).signum();
    Assert.assertEquals(1, rc_int);
  }
  public void testItem_0330()
  {
    rc_BigDecimal = (new BigDecimal("32")).plus(new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0331()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\1'}, new MathContext("precision=1 roundingMode=UNNECESSARY"));
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0332()
  {
    boolean caught;
    caught = false;
    try {
      rc_int = (new BigDecimal("1135879015891")).intValueExact();
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0333()
  {
    rc_BigDecimal = new BigDecimal(new char[]{'8', '8'});
    Assert.assertEquals("88", rc_BigDecimal.toString());
  }
  public void testItem_0334()
  {
    rc_short = (new BigDecimal("88")).shortValueExact();
    Assert.assertEquals(88, rc_short);
  }
  public void testItem_0335()
  {
    rc_long = (new BigDecimal("1135879015859")).longValueExact();
    Assert.assertEquals(1135879015859L, rc_long);
  }
  public void testItem_0336()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal("WBPAPTGCPQR<D4BTO<=009>>@Q8YE83MKO25@CEBHKVHOEOXIY?FFI=E:21E3OBWN70C=IJL@4:0K7XR4YJBQ", new MathContext("precision=0 roundingMode=HALF_UP"));
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0337()
  {
    rc_int = (new BigDecimal("32")).compareTo(new BigDecimal("32"));
    Assert.assertEquals(0, rc_int);
  }
  public void testItem_0338()
  {
    rc_BigDecimal = (new BigDecimal("1135879015859")).add(new BigDecimal("88"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("1135879015947", rc_BigDecimal.toString());
  }
  public void testItem_0339()
  {
    rc_BigDecimal = (new BigDecimal("32")).abs(new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0340()
  {
    rc_BigDecimal = (new BigDecimal("88")).negate(new MathContext("precision=2147483647 roundingMode=HALF_DOWN"));
    Assert.assertEquals("-88", rc_BigDecimal.toString());
  }
  public void testItem_0341()
  {
    rc_BigInteger = (new BigDecimal("1135879015947")).toBigIntegerExact();
    Assert.assertEquals("1135879015947", rc_BigInteger.toString());
  }
  public void testItem_0342()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\uFFFF', '\234', '8', '\uFFFF', '\234', '\0', '\1', '8', '\0', '\0', '\1', '\uFFFF', '\1', '\1', '\1', '\uFFFF', '\uFFFF', '\uFFFF', '\uFFFF', '8', '\0', '\1', '\0', '\1', '\uFFFF', '8', '\234', '\uFFFF', '\0', '\234', '\0', '\uFFFF', '8', '\uFFFF', '\1', '\234', '\0', '\234', '8', '\234', '\1', '\uFFFF', '\234', '\1', '\234', '\234', '\1', '\1', '\1', '\uFFFF', '\0', '\1', '\234', '\234', '\0', '\234', '\234', '\0', '\0', '\uFFFF', '\0', '\0', '8', '\uFFFF', '\234', '\1', '\1', '\234', '\1', '\uFFFF', '\1', '8', '\0', '\0', '\234', '\1', '\uFFFF', '\1', '8', '8', '\1', '\1', '\1', '\234'}, -2147483648, 0);
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0343()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), -1, new MathContext("precision=2147483647 roundingMode=HALF_DOWN"));
    Assert.assertEquals("3.2E+2", rc_BigDecimal.toString());
  }
  public void testItem_0344()
  {
    rc_int = (new BigDecimal("88")).intValueExact();
    Assert.assertEquals(88, rc_int);
  }
  public void testItem_0345()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), new MathContext("precision=2147483647 roundingMode=HALF_DOWN"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0346()
  {
    rc_BigDecimal_array = (new BigDecimal("1135879015947")).divideAndRemainder(new BigDecimal("32"));
  }
//  public void testItem_0347()
//  {
//    boolean caught;
//    caught = false;
//    try {
//      rc_BigDecimal = new BigDecimal(new char[]{'\uFFFF', '\1', '8', '\234', '\0', '\234', '\1', '\1', '\uFFFF', '\0', '\234', '\0', '\uFFFF', '\234', '\1', '\1', '\uFFFF', '\1', '\234', '\1', '8', '\0', '\0', '\0', '\0', '8', '\0', '\234', '\uFFFF', '\234', '\uFFFF', '\uFFFF', '\uFFFF', '\234', '\uFFFF', '8', '\1', '\234', '\uFFFF', '\0', '\uFFFF', '\0', '\uFFFF', '\0', '\0', '\uFFFF', '\0', '\234', '\234', '\1', '\0', '8', '8', '\0', '\uFFFF', '8', '\uFFFF', '\uFFFF', '\0', '\uFFFF', '\234', '\0', '\1'}, 1, 2147483647);
//    }
//    catch (java.lang.NumberFormatException e) {
//      caught = true;
//    }
//    Assert.assertEquals("91.94630872483222%", true, caught);
//  }
  public void testItem_0348()
  {
    rc_float = (new BigDecimal("-88")).floatValue();
    Assert.assertEquals(-88.0F, rc_float, 0);
  }
  public void testItem_0349()
  {
    rc_String = (new BigDecimal("1135879015947")).toEngineeringString();
    Assert.assertEquals("1135879015947", rc_String);
  }
  public void testItem_0350()
  {
    rc_BigDecimal = new BigDecimal(-1L);
    Assert.assertEquals("-1", rc_BigDecimal.toString());
  }
  public void testItem_0351()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\234'}, -2147483648, -1);
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0352()
  {
    rc_BigDecimal = (new BigDecimal("1135879015947")).remainder(new BigDecimal("32"));
    Assert.assertEquals("11", rc_BigDecimal.toString());
  }
  public void testItem_0353()
  {
    rc_float = (new BigDecimal("1135879015947")).floatValue();
    Assert.assertEquals(1.135878995968E12F, rc_float, 0);
  }
  public void testItem_0354()
  {
    rc_BigDecimal = (new BigDecimal("88")).divide(new BigDecimal("88"));
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0355()
  {
    rc_BigDecimal_array = (new BigDecimal("-88")).divideAndRemainder(new BigDecimal("1"));
  }
  public void testItem_0356()
  {
    rc_BigDecimal_array = (new BigDecimal("-88")).divideAndRemainder(new BigDecimal("-88"));
  }
  public void testItem_0357()
  {
    rc_BigDecimal = (new BigDecimal("32")).stripTrailingZeros();
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0358()
  {
    rc_BigDecimal = (new BigDecimal("-88")).subtract(new BigDecimal("-88"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("0", rc_BigDecimal.toString());
  }
  public void testItem_0359()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("32")).subtract(new BigDecimal("-88"), new MathContext("precision=1 roundingMode=UNNECESSARY"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0360()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0361()
  {
    rc_BigDecimal = new BigDecimal(1);
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0362()
  {
    rc_float = (new BigDecimal("0")).floatValue();
    Assert.assertEquals(0.0F, rc_float, 0);
  }
  public void testItem_0363()
  {
    rc_String = (new BigDecimal("-88")).toPlainString();
    Assert.assertEquals("-88", rc_String);
  }
  public void testItem_0364()
  {
    rc_int = (new BigDecimal("0")).intValue();
    Assert.assertEquals(0, rc_int);
  }
  public void testItem_0365()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0366()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), 1, new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("3.2", rc_BigDecimal.toString());
  }
  public void testItem_0367()
  {
    rc_BigDecimal = (new BigDecimal("3.2")).multiply(new BigDecimal("1"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("3.2", rc_BigDecimal.toString());
  }
  public void testItem_0368()
  {
    rc_BigInteger = (new BigDecimal("1")).toBigIntegerExact();
    Assert.assertEquals("1", rc_BigInteger.toString());
  }
  public void testItem_0369()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\1', '\uFFFF', '8', '\1', '\1', '\0', '\234', '\234', '\uFFFF', '\0', '\1', '\0', '\234', '\234', '\0', '8', '\uFFFF', '\1', '\uFFFF', '\1', '8', '\uFFFF', '\1', '\0', '8', '\234', '\uFFFF', '\0', '\0', '\uFFFF', '\1', '8', '\234', '\uFFFF'}, -1, 1);
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0370()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\234', '\1', '\0', '\234', '\1', '\234', '\uFFFF', '\uFFFF', '\234', '\234', '\1', '\0', '\1', '\0', '\0', '\uFFFF', '\uFFFF', '8', '\234', '8', '\0', '\0', '\1', '\1', '\1', '\0', '\1', '\1', '\uFFFF', '\234', '\234', '\1', '\234', '\1', '8', '\1', '\234', '\uFFFF', '\234', '\0', '\uFFFF', '8', '\uFFFF', '8', '\234', '\234', '\234', '\234', '\uFFFF', '8', '\1', '\234', '\uFFFF', '\0', '8', '\0', '\1', '\234', '8', '\uFFFF', '\1', '\uFFFF', '8', '\1', '\0', '\0', '\234', '\1', '\1', '8', '\0', '\234', '8', '8', '\234', '\234', '\234', '\234', '\1', '\234', '8', '\0', '\uFFFF', '\0', '\1', '\uFFFF', '\234', '\0', '\0', '\234', '\uFFFF', '\0', '\0', '\uFFFF', '8', '\1', '\1', '\234', '\0', '8'}, -1, 0, new MathContext("precision=2147483647 roundingMode=HALF_DOWN"));
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0371()
  {
    rc_BigInteger = (new BigDecimal("1")).toBigInteger();
    Assert.assertEquals("1", rc_BigInteger.toString());
  }
  public void testItem_0372()
  {
    rc_float = (new BigDecimal("3.2")).floatValue();
    Assert.assertEquals(3.200000047683716F, rc_float, 0);
  }
  public void testItem_0373()
  {
    rc_BigDecimal = new BigDecimal(1.0, new MathContext("precision=2147483647 roundingMode=HALF_DOWN"));
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0374()
  {
    rc_double = (new BigDecimal("1")).doubleValue();
    Assert.assertEquals(1.0, rc_double, 0);
  }
  public void testItem_0375()
  {
    rc_BigDecimal = (new BigDecimal("3.2")).add(new BigDecimal("1"));
    Assert.assertEquals("4.2", rc_BigDecimal.toString());
  }
  public void testItem_0376()
  {
    rc_BigDecimal = new BigDecimal(1135879015891L);
    Assert.assertEquals("1135879015891", rc_BigDecimal.toString());
  }
  public void testItem_0377()
  {
    rc_int = (new BigDecimal("3.2")).intValue();
    Assert.assertEquals(3, rc_int);
  }
  public void testItem_0378()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("3.2")).pow(-2147483648);
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0379()
  {
    rc_BigDecimal = new BigDecimal(1.0);
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0380()
  {
    rc_float = (new BigDecimal("1135879015891")).floatValue();
    Assert.assertEquals(1.135878995968E12F, rc_float, 0);
  }
  public void testItem_0381()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\0', '\0', '8', '\1', '8', '\0', '\1', '\234', '\234', '\uFFFF', '8', '\uFFFF', '\234', '\uFFFF', '8', '\uFFFF', '\234', '\1'});
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0382()
  {
    boolean caught;
    caught = false;
    try {
      rc_byte = (new BigDecimal("1135879015891")).byteValueExact();
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0383()
  {
    rc_BigDecimal = (new BigDecimal("4.2")).pow(0, new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0384()
  {
    rc_int = (new BigDecimal("32")).scale();
    Assert.assertEquals(0, rc_int);
  }
//  public void testItem_0385()
//  {
//    boolean caught;
//    rc_int = (new BigDecimal("3.2")).hashCode();
//    Assert.assertEquals(993, rc_int);
//  }
  public void testItem_0386()
  {
    rc_BigDecimal = (new BigDecimal("1")).divideToIntegralValue(new BigDecimal("4.2"));
    Assert.assertEquals("0E+1", rc_BigDecimal.toString());
  }
  public void testItem_0387()
  {
    rc_BigDecimal = (new BigDecimal("3.2")).add(new BigDecimal("1"));
    Assert.assertEquals("4.2", rc_BigDecimal.toString());
  }
  public void testItem_0388()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), new MathContext("precision=1 roundingMode=UNNECESSARY"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
//  public void testItem_0389()
//  {
//    boolean caught;
//    if (!Boolean.getBoolean("notanerror"))
//    {
//    caught = false;
//    try {
//      rc_BigDecimal = (new BigDecimal("3.2")).setScale(-2147483648, java.math.RoundingMode.HALF_UP);
//    }
//    catch (java.lang.ArithmeticException e) {
//      caught = true;
//    }
//    Assert.assertEquals("91.94630872483222%", true, caught);
//    }
//  }
  public void testItem_0390()
  {
    rc_BigDecimal = (new BigDecimal("32")).ulp();
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0391()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'8', '8', '8', '8', '8', '\1', '\1', '\1', '\1', '8', '\0', '\uFFFF', '\uFFFF', '\uFFFF', '8', '8', '8', '8', '\0', '\1', '\1', '\1', '\1', '8', '\0', '\0', '\uFFFF', '8', '\0', '\uFFFF', '8', '8', '\uFFFF', '\uFFFF', '\1', '\234', '8', '\uFFFF', '\234', '\0', '8', '\0', '\uFFFF', '8', '8', '8', '\uFFFF', '\uFFFF'});
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0392()
  {
    boolean caught;
    caught = false;
    try {
      rc_MathContext = new MathContext(-1, java.math.RoundingMode.CEILING);
    }
    catch (java.lang.IllegalArgumentException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0393()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("1")).remainder(new BigDecimal("0E+1"), new MathContext("precision=1 roundingMode=UNNECESSARY"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0394()
  {
    rc_BigDecimal = new BigDecimal(1135879015891L);
    Assert.assertEquals("1135879015891", rc_BigDecimal.toString());
  }
  public void testItem_0395()
  {
    rc_BigDecimal = (new BigDecimal("1135879015891")).movePointRight(1);
    Assert.assertEquals("11358790158910", rc_BigDecimal.toString());
  }
  public void testItem_0396()
  {
    boolean caught;
    caught = false;
    try {
      rc_short = (new BigDecimal("3.2")).shortValueExact();
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0397()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\1', '\1', '\234', '\1', '8', '8', '\uFFFF', '\0', '\234', '\uFFFF', '\0', '8', '\1', '\uFFFF', '\0', '\1', '\0', '\234', '\1', '\uFFFF', '\uFFFF', '\uFFFF', '\0', '\0', '8', '8', '\234', '\0', '\0', '\0', '\uFFFF', '8', '\234', '8', '8', '\uFFFF', '\uFFFF', '\1', '\0', '\1', '\uFFFF', '8', '\0', '\1', '\0', '8', '\0', '\0', '\uFFFF', '\234', '8', '\0', '\0', '\1', '\uFFFF', '\0', '8', '\0', '\uFFFF', '8', '8', '\0', '\234', '\0', '\uFFFF', '\1', '\234', '8', '8', '\0', '\1', '\uFFFF', '\0', '\1', '\1', '\1', '\234', '8', '8', '8'}, 2147483647, -2147483648);
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0398()
  {
    rc_BigInteger = (new BigDecimal("11358790158910")).toBigIntegerExact();
    Assert.assertEquals("11358790158910", rc_BigInteger.toString());
  }
  public void testItem_0399()
  {
    rc_BigDecimal = new BigDecimal(-9223372036854775808L);
    Assert.assertEquals("-9223372036854775808", rc_BigDecimal.toString());
  }
  public void testItem_0400()
  {
    rc_BigDecimal = (new BigDecimal("1135879015891")).remainder(new BigDecimal("-9223372036854775808"));
    Assert.assertEquals("1135879015891", rc_BigDecimal.toString());
  }
  public void testItem_0401()
  {
    rc_byte = (new BigDecimal("1")).byteValueExact();
    Assert.assertEquals(1, rc_byte);
  }
  public void testItem_0402()
  {
    rc_BigDecimal = (new BigDecimal("11358790158910")).remainder(new BigDecimal("1"));
    Assert.assertEquals("0", rc_BigDecimal.toString());
  }
  public void testItem_0403()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("0")).remainder(new BigDecimal("0"), new MathContext("precision=0 roundingMode=HALF_UP"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0404()
  {
    rc_long = (new BigDecimal("1135879015891")).longValueExact();
    Assert.assertEquals(1135879015891L, rc_long);
  }
  public void testItem_0405()
  {
    rc_BigInteger = (new BigDecimal("1135879015891")).toBigIntegerExact();
    Assert.assertEquals("1135879015891", rc_BigInteger.toString());
  }
  public void testItem_0406()
  {
    rc_BigDecimal = (new BigDecimal("3.2")).add(new BigDecimal("1"));
    Assert.assertEquals("4.2", rc_BigDecimal.toString());
  }
  public void testItem_0407()
  {
    rc_BigDecimal = (new BigDecimal("4.2")).subtract(new BigDecimal("3.2"));
    Assert.assertEquals("1.0", rc_BigDecimal.toString());
  }
  public void testItem_0408()
  {
    rc_BigDecimal = (new BigDecimal("11358790158910")).add(new BigDecimal("4.2"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("11358790158914.2", rc_BigDecimal.toString());
  }
  public void testItem_0409()
  {
    rc_BigDecimal = (new BigDecimal("11358790158914.2")).remainder(new BigDecimal("1135879015891"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("4.2", rc_BigDecimal.toString());
  }
  public void testItem_0410()
  {
    rc_BigDecimal = (new BigDecimal("1")).add(new BigDecimal("1"), new MathContext("precision=2147483647 roundingMode=HALF_DOWN"));
    Assert.assertEquals("2", rc_BigDecimal.toString());
  }
  public void testItem_0411()
  {
    boolean caught;
    caught = false;
    try {
      rc_int = (new BigDecimal("1135879015891")).intValueExact();
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0412()
  {
    rc_int = (new BigDecimal("11358790158910")).intValue();
    Assert.assertEquals(-1398339010, rc_int);
  }
  public void testItem_0413()
  {
    rc_BigDecimal = (new BigDecimal("2")).min(new BigDecimal("1"));
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0414()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("11358790158910")).subtract(new BigDecimal("2"), new MathContext("precision=1 roundingMode=UNNECESSARY"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0415()
  {
    rc_BigDecimal = (new BigDecimal("2")).divide(new BigDecimal("1.0"), java.math.RoundingMode.UNNECESSARY);
    Assert.assertEquals("2", rc_BigDecimal.toString());
  }
  public void testItem_0416()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0417()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal("");
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0418()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), new MathContext("precision=1 roundingMode=UNNECESSARY"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
//  public void testItem_0419()
//  {
//    boolean caught;
//    if (!Boolean.getBoolean("notanerror"))
//    {
//    caught = false;
//    try {
//      rc_BigDecimal = (new BigDecimal("1135879015891")).setScale(-2147483648, 0);
//    }
//    catch (java.lang.ArithmeticException e) {
//      caught = true;
//    }
//    Assert.assertEquals("91.94630872483222%", true, caught);
//    }
//  }
  public void testItem_0420()
  {
    rc_BigDecimal = (new BigDecimal("2")).add(new BigDecimal("1"));
    Assert.assertEquals("3", rc_BigDecimal.toString());
  }
  public void testItem_0421()
  {
    rc_BigDecimal = (new BigDecimal("2")).negate();
    Assert.assertEquals("-2", rc_BigDecimal.toString());
  }
  public void testItem_0422()
  {
    rc_int = (new BigDecimal("-2")).intValueExact();
    Assert.assertEquals(-2, rc_int);
  }
  public void testItem_0423()
  {
    rc_BigDecimal = (new BigDecimal("2")).movePointRight(1);
    Assert.assertEquals("20", rc_BigDecimal.toString());
  }
  public void testItem_0424()
  {
    rc_BigDecimal = new BigDecimal(0);
    Assert.assertEquals("0", rc_BigDecimal.toString());
  }
  public void testItem_0425()
  {
    rc_BigDecimal = (new BigDecimal("2")).divide(new BigDecimal("-2"), java.math.RoundingMode.UNNECESSARY);
    Assert.assertEquals("-1", rc_BigDecimal.toString());
  }
  public void testItem_0426()
  {
    rc_BigDecimal = (new BigDecimal("1.0")).divide(new BigDecimal("2"), 0);
    Assert.assertEquals("0.5", rc_BigDecimal.toString());
  }
  public void testItem_0427()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("-1")).pow(2147483647);
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0428()
  {
    rc_BigDecimal = (new BigDecimal("-1")).min(new BigDecimal("3"));
    Assert.assertEquals("-1", rc_BigDecimal.toString());
  }
  public void testItem_0429()
  {
    rc_BigDecimal_array = (new BigDecimal("2")).divideAndRemainder(new BigDecimal("-1"), new MathContext("precision=1 roundingMode=UNNECESSARY"));
  }
  public void testItem_0430()
  {
    rc_float = (new BigDecimal("2")).floatValue();
    Assert.assertEquals(2.0F, rc_float, 0);
  }
  public void testItem_0431()
  {
    rc_BigDecimal = (new BigDecimal("0")).multiply(new BigDecimal("0"));
    Assert.assertEquals("0", rc_BigDecimal.toString());
  }
  public void testItem_0432()
  {
    rc_int = (new BigDecimal("0.5")).intValue();
    Assert.assertEquals(0, rc_int);
  }
  public void testItem_0433()
  {
    rc_int = (new BigDecimal("2")).scale();
    Assert.assertEquals(0, rc_int);
  }
  public void testItem_0434()
  {
    rc_short = (new BigDecimal("3")).shortValueExact();
    Assert.assertEquals(3, rc_short);
  }
  public void testItem_0435()
  {
    rc_BigDecimal = new BigDecimal(0, new MathContext("precision=1 roundingMode=UNNECESSARY"));
    Assert.assertEquals("0", rc_BigDecimal.toString());
  }
  public void testItem_0436()
  {
    rc_BigDecimal = (new BigDecimal("3")).multiply(new BigDecimal("2"));
    Assert.assertEquals("6", rc_BigDecimal.toString());
  }
  public void testItem_0437()
  {
    rc_String = (new BigDecimal("6")).toString();
    Assert.assertEquals("6", rc_String);
  }
  public void testItem_0438()
  {
    rc_BigDecimal = (new BigDecimal("0.5")).max(new BigDecimal("6"));
    Assert.assertEquals("6", rc_BigDecimal.toString());
  }
  public void testItem_0439()
  {
    rc_BigDecimal = (new BigDecimal("6")).min(new BigDecimal("0"));
    Assert.assertEquals("0", rc_BigDecimal.toString());
  }
  public void testItem_0440()
  {
    rc_BigInteger = (new BigDecimal("0.5")).toBigInteger();
    Assert.assertEquals("0", rc_BigInteger.toString());
  }
  public void testItem_0441()
  {
    rc_BigDecimal = (new BigDecimal("0")).multiply(new BigDecimal("0.5"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("0.0", rc_BigDecimal.toString());
  }
  public void testItem_0442()
  {
    rc_MathContext = new MathContext(1);
    Assert.assertEquals("precision=1 roundingMode=HALF_UP", rc_MathContext.toString());
  }
  public void testItem_0443()
  {
    rc_BigInteger = (new BigDecimal("6")).toBigIntegerExact();
    Assert.assertEquals("6", rc_BigInteger.toString());
  }
  public void testItem_0444()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\234', '\234', '\1', '\0', '\234', '\1', '\uFFFF', '8', '\0', '\uFFFF', '\0', '8', '8', '\234', '\234', '\234', '\234', '\234', '\0', '\234', '\1', '8', '8', '8', '\234', '\uFFFF', '\234', '\uFFFF', '8', '\234', '\uFFFF', '8', '\234', '\uFFFF', '\1', '\0', '\234', '\0', '8', '\0', '\0', '\0', '\uFFFF', '\0', '\1', '\uFFFF', '\uFFFF', '8', '\uFFFF', '\0', '8', '\1', '\1', '8', '\1', '\1', '\1', '\1', '\234', '8', '\uFFFF', '8', '\1', '\0', '\0', '\1', '\1', '\0', '\1', '\0', '\uFFFF', '\0', '8', '\234', '8', '\234', '\uFFFF', '\uFFFF', '8', '\234', '8', '8', '\uFFFF', '\0', '\234', '\234', '\uFFFF', '\234', '\uFFFF', '8', '\0', '\234', '\234', '\0', '\uFFFF', '\1', '\1', '\uFFFF', '\uFFFF', '\uFFFF'}, -1, 0, new MathContext("precision=0 roundingMode=HALF_UP"));
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0445()
  {
    rc_BigDecimal = (new BigDecimal("0.5")).negate(new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("-0.5", rc_BigDecimal.toString());
  }
  public void testItem_0446()
  {
    rc_BigDecimal = (new BigDecimal("0")).add(new BigDecimal("-0.5"));
    Assert.assertEquals("-0.5", rc_BigDecimal.toString());
  }
  public void testItem_0447()
  {
    rc_long = (new BigDecimal("0")).longValue();
    Assert.assertEquals(0L, rc_long);
  }
  public void testItem_0448()
  {
    rc_BigDecimal = new BigDecimal(-1L, new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("-1", rc_BigDecimal.toString());
  }
  public void testItem_0449()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), 2147483647);
    Assert.assertEquals("3.2E-2147483646", rc_BigDecimal.toString());
  }
  public void testItem_0450()
  {
    rc_BigDecimal = (new BigDecimal("3.2E-2147483646")).pow(1);
    Assert.assertEquals("3.2E-2147483646", rc_BigDecimal.toString());
  }
  public void testItem_0451()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("-0.5")).divide(new BigDecimal("0.0"), new MathContext("precision=0 roundingMode=HALF_UP"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
//  public void testItem_0452()
//  {
//    boolean caught;
//    caught = false;
//    try {
//      rc_BigDecimal = (new BigDecimal("-0.5")).setScale(2147483647, java.math.RoundingMode.DOWN);
//    }
//    catch (java.lang.OutOfMemoryError e) {
//      caught = true;
//    }
//    Assert.assertEquals("91.94630872483222%", true, caught);
//  }
  public void testItem_0453()
  {
    rc_int = (new BigDecimal("6")).intValueExact();
    Assert.assertEquals(6, rc_int);
  }
  public void testItem_0454()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("-0.5")).pow(1, new MathContext("precision=2147483647 roundingMode=HALF_DOWN"));
    }
    catch (java.lang.IllegalArgumentException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0455()
  {
    rc_float = (new BigDecimal("3.2E-2147483646")).floatValue();
    Assert.assertEquals(0.0F, rc_float, 0);
  }
  public void testItem_0456()
  {
    rc_MathContext = new MathContext(0, java.math.RoundingMode.DOWN);
    Assert.assertEquals("precision=0 roundingMode=DOWN", rc_MathContext.toString());
  }
//  public void testItem_0457()
//  {
//    boolean caught;
//    caught = false;
//    try {
//      rc_BigInteger = (new BigDecimal("3.2E-2147483646")).toBigIntegerExact();
//    }
//    catch (java.lang.NegativeArraySizeException e) {
//      caught = true;
//    }
//    Assert.assertEquals("91.94630872483222%", true, caught);
//  }
//  public void testItem_0458()
//  {
//    boolean caught;
//    if (!Boolean.getBoolean("notanerror"))
//    {
//    caught = false;
//    try {
//      rc_BigDecimal = (new BigDecimal("3.2E-2147483646")).divide(new BigDecimal("-0.5"), 1);
//    }
//    catch (java.lang.ArithmeticException e) {
//      caught = true;
//    }
//    Assert.assertEquals("91.94630872483222%", true, caught);
//    }
//  }
  public void testItem_0459()
  {
    rc_MathContext = new MathContext(0, java.math.RoundingMode.UP);
    Assert.assertEquals("precision=0 roundingMode=UP", rc_MathContext.toString());
  }
  public void testItem_0460()
  {
    rc_BigInteger = (new BigDecimal("0.0")).unscaledValue();
    Assert.assertEquals("0", rc_BigInteger.toString());
  }
  public void testItem_0461()
  {
    rc_BigDecimal = (new BigDecimal("0.0")).subtract(new BigDecimal("6"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("-6.0", rc_BigDecimal.toString());
  }
  public void testItem_0462()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\uFFFF'}, new MathContext("precision=0 roundingMode=DOWN"));
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0463()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0464()
  {
    rc_BigDecimal = (new BigDecimal("0.0")).divideToIntegralValue(new BigDecimal("6"));
    Assert.assertEquals("0.0", rc_BigDecimal.toString());
  }
  public void testItem_0465()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\1'}, new MathContext("precision=0 roundingMode=DOWN"));
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0466()
  {
    rc_BigDecimal = (new BigDecimal("-0.5")).divide(new BigDecimal("32"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("-0.015625", rc_BigDecimal.toString());
  }
  public void testItem_0467()
  {
    rc_BigDecimal = (new BigDecimal("32")).divide(new BigDecimal("32"), -1, 0);
    Assert.assertEquals("1E+1", rc_BigDecimal.toString());
  }
  public void testItem_0468()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("-0.015625")).divide(new BigDecimal("0.0"), java.math.RoundingMode.UP);
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0469()
  {
    rc_BigDecimal = (new BigDecimal("0.0")).setScale(0);
    Assert.assertEquals("0", rc_BigDecimal.toString());
  }
  public void testItem_0470()
  {
    rc_BigDecimal = (new BigDecimal("32")).add(new BigDecimal("1E+1"), new MathContext("precision=0 roundingMode=DOWN"));
    Assert.assertEquals("42", rc_BigDecimal.toString());
  }
  public void testItem_0471()
  {
    rc_BigDecimal = (new BigDecimal("42")).max(new BigDecimal("-0.015625"));
    Assert.assertEquals("42", rc_BigDecimal.toString());
  }
  public void testItem_0472()
  {
    rc_BigDecimal = (new BigDecimal("32")).negate(new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("-32", rc_BigDecimal.toString());
  }
  public void testItem_0473()
  {
    rc_int = (new BigDecimal("0")).scale();
    Assert.assertEquals(0, rc_int);
  }
//  public void testItem_0474()
//  {
//    boolean caught;
//    if (!Boolean.getBoolean("notanerror"))
//    {
//    caught = false;
//    try {
//      rc_BigDecimal = (new BigDecimal("-32")).setScale(-2147483648, java.math.RoundingMode.HALF_UP);
//    }
//    catch (java.lang.ArithmeticException e) {
//      caught = true;
//    }
//    Assert.assertEquals("91.94630872483222%", true, caught);
//    }
//  }
  public void testItem_0475()
  {
    rc_int = (new BigDecimal("42")).precision();
    Assert.assertEquals(2, rc_int);
  }
  public void testItem_0476()
  {
    rc_MathContext = new MathContext(1, java.math.RoundingMode.UNNECESSARY);
    Assert.assertEquals("precision=1 roundingMode=UNNECESSARY", rc_MathContext.toString());
  }
  public void testItem_0477()
  {
    rc_long = (new BigDecimal("0.0")).longValueExact();
    Assert.assertEquals(0L, rc_long);
  }
  public void testItem_0478()
  {
    rc_BigInteger = (new BigDecimal("42")).toBigIntegerExact();
    Assert.assertEquals("42", rc_BigInteger.toString());
  }
  public void testItem_0479()
  {
    boolean caught;
    caught = false;
    try {
      rc_int = (new BigDecimal("-0.015625")).intValueExact();
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0480()
  {
    rc_BigDecimal = (new BigDecimal("0")).setScale(2147483647, java.math.RoundingMode.CEILING);
    Assert.assertEquals("0E-2147483647", rc_BigDecimal.toString());
  }
//  public void testItem_0481()
//  {
//    boolean caught;
//    caught = false;
//    try {
//      rc_BigDecimal = (new BigDecimal("42")).subtract(new BigDecimal("0E-2147483647"), new MathContext("precision=0 roundingMode=HALF_UP"));
//    }
//    catch (java.lang.NegativeArraySizeException e) {
//      caught = true;
//    }
//    Assert.assertEquals("91.94630872483222%", true, caught);
//  }
  public void testItem_0482()
  {
    rc_String = (new BigDecimal("0.0")).toString();
    Assert.assertEquals("0.0", rc_String);
  }
  public void testItem_0483()
  {
    rc_BigDecimal = (new BigDecimal("0")).round(new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("0", rc_BigDecimal.toString());
  }
  public void testItem_0484()
  {
    rc_BigDecimal = (new BigDecimal("0E-2147483647")).abs(new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("0E-2147483647", rc_BigDecimal.toString());
  }
  public void testItem_0485()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("-32")).divideToIntegralValue(new BigDecimal("0.0"), new MathContext("precision=0 roundingMode=HALF_UP"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0486()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("0")).remainder(new BigDecimal("0E-2147483647"), new MathContext("precision=0 roundingMode=HALF_UP"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
//  public void testItem_0487()
//  {
//    boolean caught;
//    rc_int = (new BigDecimal("0")).hashCode();
//    Assert.assertEquals(0, rc_int);
//  }
  public void testItem_0488()
  {
    rc_BigDecimal = (new BigDecimal("0E-2147483647")).plus(new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("0E-2147483647", rc_BigDecimal.toString());
  }
  public void testItem_0489()
  {
    rc_double = (new BigDecimal("42")).doubleValue();
    Assert.assertEquals(42.0, rc_double, 0);
  }
  public void testItem_0490()
  {
    rc_BigDecimal = (new BigDecimal("42")).stripTrailingZeros();
    Assert.assertEquals("42", rc_BigDecimal.toString());
  }
  public void testItem_0491()
  {
    rc_BigDecimal = (new BigDecimal("0.0")).add(new BigDecimal("42"));
    Assert.assertEquals("42.0", rc_BigDecimal.toString());
  }
  public void testItem_0492()
  {
    rc_BigDecimal = (new BigDecimal("42.0")).divide(new BigDecimal("42"), java.math.RoundingMode.HALF_DOWN);
    Assert.assertEquals("1.0", rc_BigDecimal.toString());
  }
  public void testItem_0493()
  {
    rc_BigDecimal = (new BigDecimal("42")).divide(new BigDecimal("42"));
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0494()
  {
    rc_BigDecimal_array = (new BigDecimal("0E-2147483647")).divideAndRemainder(new BigDecimal("42.0"));
  }
  public void testItem_0495()
  {
    rc_BigDecimal = new BigDecimal(0);
    Assert.assertEquals("0", rc_BigDecimal.toString());
  }
  public void testItem_0496()
  {
    boolean caught;
    caught = false;
    try {
      rc_MathContext = new MathContext("M;P@6=2K1A:=1S=FM>FE=Y3WJ1?64?1EIOKWQ=TVBUBC@=NI8TURFMBC2OWD3VHFNIV6E:V4N;?N7<K?XQI=XJMS;JP0PWWR8SF7");
    }
    catch (java.lang.IllegalArgumentException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0497()
  {
    rc_BigDecimal = (new BigDecimal("0E-2147483647")).abs();
    Assert.assertEquals("0E-2147483647", rc_BigDecimal.toString());
  }
  public void testItem_0498()
  {
    rc_int = (new BigDecimal("42.0")).intValueExact();
    Assert.assertEquals(42, rc_int);
  }
  public void testItem_0499()
  {
    rc_int = (new BigDecimal("42.0")).precision();
    Assert.assertEquals(3, rc_int);
  }
  public void testItem_0500()
  {
    rc_BigDecimal = (new BigDecimal("42")).plus();
    Assert.assertEquals("42", rc_BigDecimal.toString());
  }
  public void testItem_0501()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal_array = (new BigDecimal("42")).divideAndRemainder(new BigDecimal("0"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0502()
  {
    rc_String = (new BigDecimal("42")).toString();
    Assert.assertEquals("42", rc_String);
  }
  public void testItem_0503()
  {
    rc_int = (new BigDecimal("0E-2147483647")).intValue();
    Assert.assertEquals(0, rc_int);
  }
  public void testItem_0504()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("0E-2147483647")).pow(-1, new MathContext("precision=0 roundingMode=HALF_UP"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0505()
  {
    rc_BigDecimal = (new BigDecimal("42")).negate();
    Assert.assertEquals("-42", rc_BigDecimal.toString());
  }
//  public void testItem_0506()
//  {
//    boolean caught;
//    caught = false;
//    try {
//      rc_BigDecimal = (new BigDecimal("42")).subtract(new BigDecimal("0E-2147483647"));
//    }
//    catch (java.lang.NegativeArraySizeException e) {
//      caught = true;
//    }
//    Assert.assertEquals("91.94630872483222%", true, caught);
//  }
  public void testItem_0507()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("0E-2147483647")).setScale(1, -1);
    }
    catch (java.lang.IllegalArgumentException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0508()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal("MWW5RB36D53RDK>77PDT5BKIP8>CX@KH<78B51FHB4K;K0XYBXHS@VP74X7PJ<DF?924?E0AVT9C63=5DJGFE", new MathContext("precision=1 roundingMode=HALF_UP"));
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0509()
  {
    rc_int = (new BigDecimal("1")).compareTo(new BigDecimal("1"));
    Assert.assertEquals(0, rc_int);
  }
  public void testItem_0510()
  {
    rc_BigDecimal = (new BigDecimal("1")).divideToIntegralValue(new BigDecimal("-42"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("0", rc_BigDecimal.toString());
  }
  public void testItem_0511()
  {
    rc_BigInteger = (new BigDecimal("0E-2147483647")).toBigInteger();
    Assert.assertEquals("0", rc_BigInteger.toString());
  }
  public void testItem_0512()
  {
    rc_BigDecimal = (new BigDecimal("0")).divideToIntegralValue(new BigDecimal("-42"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("0", rc_BigDecimal.toString());
  }
  public void testItem_0513()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), new MathContext("precision=1 roundingMode=UNNECESSARY"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0514()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("0E-2147483647")).divide(new BigDecimal("0E-2147483647"), new MathContext("precision=0 roundingMode=HALF_UP"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0515()
  {
    rc_BigDecimal = (new BigDecimal("-42")).round(new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("-42", rc_BigDecimal.toString());
  }
  public void testItem_0516()
  {
    rc_BigInteger = (new BigDecimal("-42")).toBigIntegerExact();
    Assert.assertEquals("-42", rc_BigInteger.toString());
  }
  public void testItem_0517()
  {
    rc_BigDecimal = new BigDecimal(9223372036854775807L, new MathContext("precision=1 roundingMode=HALF_UP"));
    Assert.assertEquals("9E+18", rc_BigDecimal.toString());
  }
  public void testItem_0518()
  {
    rc_int = (new BigDecimal("0")).scale();
    Assert.assertEquals(0, rc_int);
  }
  public void testItem_0519()
  {
    rc_BigDecimal = (new BigDecimal("9E+18")).stripTrailingZeros();
    Assert.assertEquals("9E+18", rc_BigDecimal.toString());
  }
//  public void testItem_0520()
//  {
//    boolean caught;
//    caught = false;
//    try {
//      rc_BigDecimal = (new BigDecimal("-42")).setScale(2147483647, java.math.RoundingMode.HALF_EVEN);
//    }
//    catch (java.lang.NegativeArraySizeException e) {
//      caught = true;
//    }
//    Assert.assertEquals("91.94630872483222%", true, caught);
//  }
  public void testItem_0521()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("-42")).setScale(-1);
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  @SuppressWarnings("unlikely-arg-type")
  public void testItem_0522()
  {
    rc_boolean = (new BigDecimal("-42")).equals("4L=IJCV<7911OT@VBN:KTI0>171?UFVUT@?2Q=1Y?N<>XWAYXYS7O>@MKD:DY5FA?YNX<C5EIO=QS1BCYAM<E79P8V6@O@2GCAVK");
    Assert.assertEquals(false, rc_boolean);
  }
  public void testItem_0523()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0524()
  {
    rc_BigDecimal = (new BigDecimal("9E+18")).stripTrailingZeros();
    Assert.assertEquals("9E+18", rc_BigDecimal.toString());
  }
  public void testItem_0525()
  {
    rc_BigDecimal = (new BigDecimal("0")).pow(1);
    Assert.assertEquals("0", rc_BigDecimal.toString());
  }
  @SuppressWarnings("unlikely-arg-type")
  public void testItem_0526()
  {
    rc_boolean = (new BigDecimal("0")).equals(";KST<T5=A97D=L7<>F?8LI");
    Assert.assertEquals(false, rc_boolean);
  }
  public void testItem_0527()
  {
    rc_BigDecimal = new BigDecimal(2147483647, new MathContext("precision=1 roundingMode=HALF_UP"));
    Assert.assertEquals("2E+9", rc_BigDecimal.toString());
  }
  public void testItem_0528()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\0', '\uFFFF', '8', '8', '\0'});
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0529()
  {
    rc_MathContext = new MathContext(2147483647);
    Assert.assertEquals("precision=2147483647 roundingMode=HALF_UP", rc_MathContext.toString());
  }
  public void testItem_0530()
  {
    rc_BigInteger = (new BigDecimal("32")).toBigInteger();
    Assert.assertEquals("32", rc_BigInteger.toString());
  }
  public void testItem_0531()
  {
    rc_String = (new BigDecimal("0")).toEngineeringString();
    Assert.assertEquals("0", rc_String);
  }
  public void testItem_0532()
  {
    rc_BigDecimal = (new BigDecimal("0")).add(new BigDecimal("0"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("0", rc_BigDecimal.toString());
  }
  public void testItem_0533()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("32")).divide(new BigDecimal("2E+9"), 2147483647, 2147483647);
    }
    catch (java.lang.IllegalArgumentException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0534()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal_array = (new BigDecimal("0")).divideAndRemainder(new BigDecimal("0"), new MathContext("precision=1 roundingMode=UNNECESSARY"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0535()
  {
    rc_BigDecimal = new BigDecimal(1.7976931348623157E308);
    Assert.assertEquals("179769313486231570814527423731704356798070567525844996598917476803157260780028538760589558632766878171540458953514382464234321326889464182768467546703537516986049910576551282076245490090389328944075868508455133942304583236903222948165808559332123348274797826204144723168738177180919299881250404026184124858368", rc_BigDecimal.toString());
  }
  public void testItem_0536()
  {
    rc_BigDecimal = (new BigDecimal("2E+9")).divide(new BigDecimal("179769313486231570814527423731704356798070567525844996598917476803157260780028538760589558632766878171540458953514382464234321326889464182768467546703537516986049910576551282076245490090389328944075868508455133942304583236903222948165808559332123348274797826204144723168738177180919299881250404026184124858368"), java.math.RoundingMode.UP);
    Assert.assertEquals("1E+9", rc_BigDecimal.toString());
  }
  public void testItem_0537()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("0")).pow(-1, new MathContext("precision=0 roundingMode=HALF_UP"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0538()
  {
    rc_BigInteger = (new BigDecimal("32")).unscaledValue();
    Assert.assertEquals("32", rc_BigInteger.toString());
  }
  public void testItem_0539()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\234'}, 0, -2147483648);
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0540()
  {
    rc_BigInteger = (new BigDecimal("2E+9")).toBigIntegerExact();
    Assert.assertEquals("2000000000", rc_BigInteger.toString());
  }
  public void testItem_0541()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("1E+9")).pow(2147483647);
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0542()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\1', '\0', '8', '8', '8', '\0', '\uFFFF', '\234', '\uFFFF', '\1', '\234', '\0', '8', '\0', '\234', '\0', '\234', '\234', '\uFFFF', '\uFFFF', '\uFFFF', '\234', '8', '\0', '\0', '\1', '8', '\234', '8', '8', '\0', '\0', '\0', '\0', '8', '\1', '8', '\234', '\234', '\0', '\234', '\234', '\234', '\uFFFF', '\uFFFF', '8', '\0', '8', '\0', '8', '\234', '\1', '\234', '8', '\1', '\0', '\1', '\234', '8', '\uFFFF', '\uFFFF', '\uFFFF', '\1', '8', '8', '\234', '\1', '\uFFFF', '8', '\234', '\234', '\uFFFF', '\1', '\1', '\234', '\234', '\1', '\234', '\uFFFF', '\uFFFF', '\234', '\0', '\0', '8', '\234', '8', '8', '\uFFFF', '\uFFFF', '8', '8', '\1', '8', '\0', '8', '\234', '\1', '\234', '\234', '\uFFFF'}, -2147483648, 2147483647);
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0543()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("9E+18")).pow(2147483647);
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0544()
  {
    rc_MathContext = new MathContext(0);
    Assert.assertEquals("precision=0 roundingMode=HALF_UP", rc_MathContext.toString());
  }
  public void testItem_0545()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("32")).setScale(-2147483648);
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0546()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), 0, new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0547()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), 0, new MathContext("precision=1 roundingMode=HALF_UP"));
    Assert.assertEquals("3E+1", rc_BigDecimal.toString());
  }
  public void testItem_0548()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0549()
  {
    rc_String = (new BigDecimal("1E+9")).toPlainString();
    Assert.assertEquals("1000000000", rc_String);
  }
  public void testItem_0550()
  {
    rc_BigDecimal = (new BigDecimal("2E+9")).round(new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("2E+9", rc_BigDecimal.toString());
  }
  public void testItem_0551()
  {
    rc_int = (new BigDecimal("3E+1")).intValue();
    Assert.assertEquals(30, rc_int);
  }
  public void testItem_0552()
  {
    rc_BigDecimal = new BigDecimal(1L);
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
//  public void testItem_0553()
//  {
//    boolean caught;
//    rc_int = (new BigDecimal("2E+9")).hashCode();
//    Assert.assertEquals(53, rc_int);
//  }
  public void testItem_0554()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), 2147483647, new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("3.2E-2147483646", rc_BigDecimal.toString());
  }
  public void testItem_0555()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0556()
  {
    rc_int = (new BigDecimal("1E+9")).compareTo(new BigDecimal("32"));
    Assert.assertEquals(1, rc_int);
  }
  public void testItem_0557()
  {
    rc_BigDecimal = (new BigDecimal("1E+9")).divideToIntegralValue(new BigDecimal("32"));
    Assert.assertEquals("3.125E+7", rc_BigDecimal.toString());
  }
  public void testItem_0558()
  {
    rc_BigDecimal = (new BigDecimal("3E+1")).subtract(new BigDecimal("1E+9"), new MathContext("precision=1 roundingMode=HALF_UP"));
    Assert.assertEquals("-1E+9", rc_BigDecimal.toString());
  }
  public void testItem_0559()
  {
    rc_BigDecimal = (new BigDecimal("3E+1")).add(new BigDecimal("1E+9"));
    Assert.assertEquals("1.00000003E+9", rc_BigDecimal.toString());
  }
  public void testItem_0560()
  {
    rc_BigDecimal = new BigDecimal(9223372036854775807L);
    Assert.assertEquals("9223372036854775807", rc_BigDecimal.toString());
  }
  public void testItem_0561()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), -1);
    Assert.assertEquals("3.2E+2", rc_BigDecimal.toString());
  }
  public void testItem_0562()
  {
    rc_BigDecimal = (new BigDecimal("3.2E+2")).add(new BigDecimal("3.2E+2"));
    Assert.assertEquals("6.4E+2", rc_BigDecimal.toString());
  }
  public void testItem_0563()
  {
    rc_BigDecimal = (new BigDecimal("3.2E+2")).divide(new BigDecimal("3E+1"), java.math.RoundingMode.DOWN);
    Assert.assertEquals("1E+1", rc_BigDecimal.toString());
  }
  public void testItem_0564()
  {
    rc_long = (new BigDecimal("9223372036854775807")).longValue();
    Assert.assertEquals(9223372036854775807L, rc_long);
  }
  public void testItem_0565()
  {
    rc_int = (new BigDecimal("3E+1")).intValue();
    Assert.assertEquals(30, rc_int);
  }
  public void testItem_0566()
  {
    rc_BigDecimal_array = (new BigDecimal("3.2E+2")).divideAndRemainder(new BigDecimal("3E+1"));
  }
  public void testItem_0567()
  {
    rc_long = (new BigDecimal("1.00000003E+9")).longValueExact();
    Assert.assertEquals(1000000030L, rc_long);
  }
  public void testItem_0568()
  {
    rc_BigDecimal = (new BigDecimal("1.00000003E+9")).scaleByPowerOfTen(-1);
    Assert.assertEquals("100000003", rc_BigDecimal.toString());
  }
  public void testItem_0569()
  {
    rc_BigDecimal = new BigDecimal(-1.0);
    Assert.assertEquals("-1", rc_BigDecimal.toString());
  }
  public void testItem_0570()
  {
    rc_BigDecimal = new BigDecimal(1.0);
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0571()
  {
    boolean caught;
    caught = false;
    try {
      rc_short = (new BigDecimal("1.00000003E+9")).shortValueExact();
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0572()
  {
    rc_BigDecimal = (new BigDecimal("-1")).remainder(new BigDecimal("-1"), new MathContext("precision=1 roundingMode=HALF_UP"));
    Assert.assertEquals("0", rc_BigDecimal.toString());
  }
  public void testItem_0573()
  {
    rc_BigDecimal = (new BigDecimal("1E+1")).add(new BigDecimal("1.00000003E+9"));
    Assert.assertEquals("1.00000004E+9", rc_BigDecimal.toString());
  }
//  public void testItem_0574()
//  {
//    boolean caught;
//    rc_int = (new BigDecimal("100000003")).hashCode();
//    Assert.assertEquals(-1194967203, rc_int);
//  }
  public void testItem_0575()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("1E+1")).remainder(new BigDecimal("0"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0576()
  {
    rc_BigDecimal = (new BigDecimal("1.00000004E+9")).plus();
    Assert.assertEquals("1.00000004E+9", rc_BigDecimal.toString());
  }
  public void testItem_0577()
  {
    rc_String = (new BigDecimal("0")).toPlainString();
    Assert.assertEquals("0", rc_String);
  }
  public void testItem_0578()
  {
    rc_BigDecimal = (new BigDecimal("1.00000004E+9")).subtract(new BigDecimal("1.00000004E+9"));
    Assert.assertEquals("0E+1", rc_BigDecimal.toString());
  }
  public void testItem_0579()
  {
    rc_BigDecimal = (new BigDecimal("-1")).round(new MathContext("precision=1 roundingMode=UNNECESSARY"));
    Assert.assertEquals("-1", rc_BigDecimal.toString());
  }
  public void testItem_0580()
  {
    rc_BigDecimal = (new BigDecimal("0")).multiply(new BigDecimal("1.00000004E+9"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("0E+1", rc_BigDecimal.toString());
  }
  @SuppressWarnings("unlikely-arg-type")
  public void testItem_0581()
  {
    rc_boolean = (new BigDecimal("1E+1")).equals("");
    Assert.assertEquals(false, rc_boolean);
  }
  public void testItem_0582()
  {
    rc_BigDecimal = (new BigDecimal("0E+1")).round(new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("0E+1", rc_BigDecimal.toString());
  }
  public void testItem_0583()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("0")).divideToIntegralValue(new BigDecimal("0"), new MathContext("precision=0 roundingMode=HALF_UP"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0584()
  {
    rc_int = (new BigDecimal("-1")).scale();
    Assert.assertEquals(0, rc_int);
  }
  public void testItem_0585()
  {
    rc_float = (new BigDecimal("0")).floatValue();
    Assert.assertEquals(0.0F, rc_float, 0);
  }
  public void testItem_0586()
  {
    rc_BigDecimal = (new BigDecimal("1E+1")).remainder(new BigDecimal("1.00000004E+9"), new MathContext("precision=1 roundingMode=HALF_UP"));
    Assert.assertEquals("1E+1", rc_BigDecimal.toString());
  }
  public void testItem_0587()
  {
    rc_int = (new BigDecimal("1.00000004E+9")).intValue();
    Assert.assertEquals(1000000040, rc_int);
  }
  public void testItem_0588()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0589()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("0")).divide(new BigDecimal("0E+1"), new MathContext("precision=0 roundingMode=HALF_UP"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0590()
  {
    rc_BigDecimal = (new BigDecimal("1.00000004E+9")).max(new BigDecimal("0"));
    Assert.assertEquals("1.00000004E+9", rc_BigDecimal.toString());
  }
  public void testItem_0591()
  {
    rc_BigDecimal = new BigDecimal(0.0, new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("0", rc_BigDecimal.toString());
  }
  public void testItem_0592()
  {
    rc_BigDecimal = (new BigDecimal("0E+1")).movePointRight(2147483647);
    Assert.assertEquals("0", rc_BigDecimal.toString());
  }
  public void testItem_0593()
  {
    rc_BigDecimal = (new BigDecimal("0E+1")).divide(new BigDecimal("1.00000004E+9"), 1);
    Assert.assertEquals("0E+1", rc_BigDecimal.toString());
  }
  public void testItem_0594()
  {
    rc_BigDecimal = (new BigDecimal("-1")).subtract(new BigDecimal("0"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("-1", rc_BigDecimal.toString());
  }
  public void testItem_0595()
  {
    rc_BigDecimal = new BigDecimal(-2147483648);
    Assert.assertEquals("-2147483648", rc_BigDecimal.toString());
  }
  public void testItem_0596()
  {
    rc_BigDecimal = (new BigDecimal("-2147483648")).multiply(new BigDecimal("0E+1"));
    Assert.assertEquals("0E+1", rc_BigDecimal.toString());
  }
  public void testItem_0597()
  {
    rc_String = (new BigDecimal("0")).toPlainString();
    Assert.assertEquals("0", rc_String);
  }
  public void testItem_0598()
  {
    rc_BigDecimal = (new BigDecimal("-2147483648")).subtract(new BigDecimal("-2147483648"));
    Assert.assertEquals("0", rc_BigDecimal.toString());
  }
  public void testItem_0599()
  {
    rc_String = (new BigDecimal("0E+1")).toEngineeringString();
    Assert.assertEquals("0.00E+3", rc_String);
  }
  public void testItem_0600()
  {
    rc_long = (new BigDecimal("0E+1")).longValue();
    Assert.assertEquals(0L, rc_long);
  }
  public void testItem_0601()
  {
    rc_BigDecimal = (new BigDecimal("0E+1")).multiply(new BigDecimal("0"));
    Assert.assertEquals("0E+1", rc_BigDecimal.toString());
  }
  public void testItem_0602()
  {
    rc_String = (new BigDecimal("0E+1")).toPlainString();
    Assert.assertEquals("0", rc_String);
  }
  public void testItem_0603()
  {
    rc_BigDecimal = new BigDecimal(0L, new MathContext("precision=1 roundingMode=HALF_UP"));
    Assert.assertEquals("0", rc_BigDecimal.toString());
  }
  public void testItem_0604()
  {
    rc_BigDecimal = (new BigDecimal("-2147483648")).plus();
    Assert.assertEquals("-2147483648", rc_BigDecimal.toString());
  }
  public void testItem_0605()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\0'}, 2147483647, 1, new MathContext("precision=0 roundingMode=HALF_UP"));
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0606()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\uFFFF'}, new MathContext("precision=0 roundingMode=HALF_UP"));
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0607()
  {
    rc_BigDecimal = (new BigDecimal("0")).ulp();
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0608()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("0")).pow(2147483647, new MathContext("precision=0 roundingMode=HALF_UP"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0609()
  {
    rc_BigDecimal = (new BigDecimal("0")).movePointRight(-1);
    Assert.assertEquals("0.0", rc_BigDecimal.toString());
  }
  public void testItem_0610()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("0")).divideToIntegralValue(new BigDecimal("0E+1"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0611()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), 2147483647);
    Assert.assertEquals("3.2E-2147483646", rc_BigDecimal.toString());
  }
  public void testItem_0612()
  {
    rc_BigDecimal = (new BigDecimal("0")).max(new BigDecimal("1"));
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0613()
  {
    rc_BigDecimal = new BigDecimal(2147483647);
    Assert.assertEquals("2147483647", rc_BigDecimal.toString());
  }
  public void testItem_0614()
  {
    rc_BigDecimal = (new BigDecimal("1")).abs();
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0615()
  {
    rc_BigDecimal = new BigDecimal(4.9E-324);
    Assert.assertEquals("4.940656458412465441765687928682213723650598026143247644255856825006755072702087518652998363616359923797965646954457177309266567103559397963987747960107818781263007131903114045278458171678489821036887186360569987307230500063874091535649843873124733972731696151400317153853980741262385655911710266585566867681870395603106249319452715914924553293054565444011274801297099995419319894090804165633245247571478690147267801593552386115501348035264934720193790268107107491703332226844753335720832431936092382893458368060106011506169809753078342277318329247904982524730776375927247874656084778203734469699533647017972677717585125660551199131504891101451037862738167250955837389733598993664809941164205702637090279242767544565229087538682506419718265533447265625E-324", rc_BigDecimal.toString());
  }
  public void testItem_0616()
  {
    rc_long = (new BigDecimal("1")).longValue();
    Assert.assertEquals(1L, rc_long);
  }
  public void testItem_0617()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("0.0")).remainder(new BigDecimal("0.0"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0618()
  {
    rc_int = (new BigDecimal("2147483647")).compareTo(new BigDecimal("4.940656458412465441765687928682213723650598026143247644255856825006755072702087518652998363616359923797965646954457177309266567103559397963987747960107818781263007131903114045278458171678489821036887186360569987307230500063874091535649843873124733972731696151400317153853980741262385655911710266585566867681870395603106249319452715914924553293054565444011274801297099995419319894090804165633245247571478690147267801593552386115501348035264934720193790268107107491703332226844753335720832431936092382893458368060106011506169809753078342277318329247904982524730776375927247874656084778203734469699533647017972677717585125660551199131504891101451037862738167250955837389733598993664809941164205702637090279242767544565229087538682506419718265533447265625E-324"));
    Assert.assertEquals(1, rc_int);
  }
  public void testItem_0619()
  {
    rc_byte = (new BigDecimal("0.0")).byteValueExact();
    Assert.assertEquals(0, rc_byte);
  }
  public void testItem_0620()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), -2147483648);
    Assert.assertEquals("3.2E+2147483649", rc_BigDecimal.toString());
  }
  public void testItem_0621()
  {
    rc_BigDecimal = (new BigDecimal("4.940656458412465441765687928682213723650598026143247644255856825006755072702087518652998363616359923797965646954457177309266567103559397963987747960107818781263007131903114045278458171678489821036887186360569987307230500063874091535649843873124733972731696151400317153853980741262385655911710266585566867681870395603106249319452715914924553293054565444011274801297099995419319894090804165633245247571478690147267801593552386115501348035264934720193790268107107491703332226844753335720832431936092382893458368060106011506169809753078342277318329247904982524730776375927247874656084778203734469699533647017972677717585125660551199131504891101451037862738167250955837389733598993664809941164205702637090279242767544565229087538682506419718265533447265625E-324")).add(new BigDecimal("4.940656458412465441765687928682213723650598026143247644255856825006755072702087518652998363616359923797965646954457177309266567103559397963987747960107818781263007131903114045278458171678489821036887186360569987307230500063874091535649843873124733972731696151400317153853980741262385655911710266585566867681870395603106249319452715914924553293054565444011274801297099995419319894090804165633245247571478690147267801593552386115501348035264934720193790268107107491703332226844753335720832431936092382893458368060106011506169809753078342277318329247904982524730776375927247874656084778203734469699533647017972677717585125660551199131504891101451037862738167250955837389733598993664809941164205702637090279242767544565229087538682506419718265533447265625E-324"), new MathContext("precision=1 roundingMode=HALF_UP"));
    Assert.assertEquals("1E-323", rc_BigDecimal.toString());
  }
  public void testItem_0622()
  {
    rc_BigInteger = (new BigDecimal("4.940656458412465441765687928682213723650598026143247644255856825006755072702087518652998363616359923797965646954457177309266567103559397963987747960107818781263007131903114045278458171678489821036887186360569987307230500063874091535649843873124733972731696151400317153853980741262385655911710266585566867681870395603106249319452715914924553293054565444011274801297099995419319894090804165633245247571478690147267801593552386115501348035264934720193790268107107491703332226844753335720832431936092382893458368060106011506169809753078342277318329247904982524730776375927247874656084778203734469699533647017972677717585125660551199131504891101451037862738167250955837389733598993664809941164205702637090279242767544565229087538682506419718265533447265625E-324")).toBigInteger();
    Assert.assertEquals("0", rc_BigInteger.toString());
  }
  public void testItem_0623()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), 2147483647);
    Assert.assertEquals("3.2E-2147483646", rc_BigDecimal.toString());
  }
  public void testItem_0624()
  {
    rc_BigInteger = (new BigDecimal("0.0")).toBigInteger();
    Assert.assertEquals("0", rc_BigInteger.toString());
  }
  public void testItem_0625()
  {
    rc_BigDecimal = (new BigDecimal("3.2E-2147483646")).remainder(new BigDecimal("3.2E-2147483646"), new MathContext("precision=1 roundingMode=UNNECESSARY"));
    Assert.assertEquals("0E-2147483647", rc_BigDecimal.toString());
  }
  public void testItem_0626()
  {
    rc_int = (new BigDecimal("0.0")).compareTo(new BigDecimal("320.0E+2147483647"));
    Assert.assertEquals(-1, rc_int);
  }
  public void testItem_0627()
  {
    rc_int = (new BigDecimal("4.940656458412465441765687928682213723650598026143247644255856825006755072702087518652998363616359923797965646954457177309266567103559397963987747960107818781263007131903114045278458171678489821036887186360569987307230500063874091535649843873124733972731696151400317153853980741262385655911710266585566867681870395603106249319452715914924553293054565444011274801297099995419319894090804165633245247571478690147267801593552386115501348035264934720193790268107107491703332226844753335720832431936092382893458368060106011506169809753078342277318329247904982524730776375927247874656084778203734469699533647017972677717585125660551199131504891101451037862738167250955837389733598993664809941164205702637090279242767544565229087538682506419718265533447265625E-324")).signum();
    Assert.assertEquals(1, rc_int);
  }
  public void testItem_0628()
  {
    boolean caught;
    caught = false;
    try {
      rc_MathContext = new MathContext(-2147483648, java.math.RoundingMode.HALF_DOWN);
    }
    catch (java.lang.IllegalArgumentException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0629()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\1'});
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0630()
  {
    rc_BigDecimal = (new BigDecimal("3.2E-2147483646")).max(new BigDecimal("3.2E-2147483646"));
    Assert.assertEquals("3.2E-2147483646", rc_BigDecimal.toString());
  }
  public void testItem_0631()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\1'}, 0, 2147483647, new MathContext("precision=0 roundingMode=HALF_UP"));
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0632()
  {
    rc_BigDecimal_array = (new BigDecimal("0.0")).divideAndRemainder(new BigDecimal("1E-323"));
  }
  public void testItem_0633()
  {
    rc_BigDecimal = (new BigDecimal("0.0")).max(new BigDecimal("0.0"));
    Assert.assertEquals("0.0", rc_BigDecimal.toString());
  }
  public void testItem_0634()
  {
    rc_MathContext = new MathContext(1, java.math.RoundingMode.DOWN);
    Assert.assertEquals("precision=1 roundingMode=DOWN", rc_MathContext.toString());
  }
  public void testItem_0635()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), 1, new MathContext("precision=1 roundingMode=HALF_UP"));
    Assert.assertEquals("3", rc_BigDecimal.toString());
  }
  public void testItem_0636()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\uFFFF', '\234', '\0', '\234', '\1', '\0', '\1', '\1', '8', '\uFFFF', '\uFFFF', '\uFFFF', '\234', '\uFFFF', '\234', '\uFFFF', '\0', '\1', '\234', '\234', '8', '\uFFFF', '\234', '8', '\0', '8', '8', '8', '\234', '\1', '8', '\uFFFF', '\234', '8', '\uFFFF', '\1', '\uFFFF', '\234', '\234', '8', '\1', '8', '\0', '\0', '\234', '\234', '8', '\1', '\uFFFF', '8', '\uFFFF', '\0', '8', '\234', '\uFFFF', '\234', '\234', '8', '8', '\0', '\0', '\0', '8', '\1', '8', '\1', '\234', '\234', '8', '\1', '\uFFFF', '\0', '\0', '\234', '\1', '8', '\0', '\uFFFF', '\uFFFF', '\uFFFF', '\234', '\uFFFF', '\0', '\1', '\uFFFF', '8', '8', '\0', '\234', '\234', '\uFFFF', '\0', '\0', '\uFFFF', '8', '\0', '8', '8', '\1', '\1'}, new MathContext("precision=1 roundingMode=DOWN"));
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0637()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("3")).divide(new BigDecimal("0.0"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0638()
  {
    rc_BigDecimal = new BigDecimal(0.0);
    Assert.assertEquals("0", rc_BigDecimal.toString());
  }
  public void testItem_0639()
  {
    rc_BigInteger = (new BigDecimal("3")).toBigInteger();
    Assert.assertEquals("3", rc_BigInteger.toString());
  }
  public void testItem_0640()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0641()
  {
    rc_BigDecimal = (new BigDecimal("3")).subtract(new BigDecimal("1E-323"));
    Assert.assertEquals("2.99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999", rc_BigDecimal.toString());
  }
  public void testItem_0642()
  {
    boolean caught;
    caught = false;
    try {
      rc_MathContext = new MathContext("FAMK:P<5UA09:2AY03UQJQ@IVE:UFN=V3Y5WWX:9@5RJP6US;EEIL;<QHQP1E<:0?FV29M9H>;QYG:CPPVEY??FEBJ?K0EAF1ODQ");
    }
    catch (java.lang.IllegalArgumentException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0643()
  {
    rc_int = (new BigDecimal("1E-323")).intValue();
    Assert.assertEquals(0, rc_int);
  }
  public void testItem_0644()
  {
    rc_String = (new BigDecimal("2.99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999")).toString();
    Assert.assertEquals("2.99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999", rc_String);
  }
  public void testItem_0645()
  {
    rc_BigDecimal = (new BigDecimal("2.99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999")).plus();
    Assert.assertEquals("2.99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999", rc_BigDecimal.toString());
  }
  public void testItem_0646()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("3.2E-2147483646")).add(new BigDecimal("3.2E-2147483646"), new MathContext("precision=1 roundingMode=UNNECESSARY"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0647()
  {
    rc_BigDecimal = new BigDecimal(1L, new MathContext("precision=1 roundingMode=HALF_UP"));
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0648()
  {
    rc_BigDecimal = (new BigDecimal("2.99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999")).divide(new BigDecimal("1"), 1, java.math.RoundingMode.HALF_DOWN);
    Assert.assertEquals("3.0", rc_BigDecimal.toString());
  }
  public void testItem_0649()
  {
    rc_BigDecimal = (new BigDecimal("2.99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999")).multiply(new BigDecimal("32"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("95.99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999968", rc_BigDecimal.toString());
  }
  public void testItem_0650()
  {
    rc_int = (new BigDecimal("2.99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999")).precision();
    Assert.assertEquals(324, rc_int);
  }
  public void testItem_0651()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), -1);
    Assert.assertEquals("3.2E+2", rc_BigDecimal.toString());
  }
  public void testItem_0652()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal("", new MathContext("precision=1 roundingMode=HALF_UP"));
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0653()
  {
    rc_BigDecimal = new BigDecimal(9223372036854775807L, new MathContext("precision=1 roundingMode=HALF_UP"));
    Assert.assertEquals("9E+18", rc_BigDecimal.toString());
  }
  public void testItem_0654()
  {
    rc_BigDecimal = (new BigDecimal("3")).remainder(new BigDecimal("9E+18"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("3", rc_BigDecimal.toString());
  }
//  public void testItem_0655()
//  {
//    boolean caught;
//    rc_int = (new BigDecimal("3")).hashCode();
//    Assert.assertEquals(93, rc_int);
//  }
  public void testItem_0656()
  {
    rc_int = (new BigDecimal("3.2E+2")).precision();
    Assert.assertEquals(2, rc_int);
  }
  public void testItem_0657()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("1")).divide(new BigDecimal("9E+18"), java.math.RoundingMode.UNNECESSARY);
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0658()
  {
    rc_BigDecimal = new BigDecimal(1L);
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0659()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal("3E4CO:A;64HN0<W5T;BQ7NE=?@D50O5B83JTJUF8MXHYO4202NO>DRH;S9KM>:YSC39SL;KL81HFBENM;S624TGQ45?>:;IW:645");
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0660()
  {
    rc_BigDecimal = new BigDecimal(9223372036854775807L);
    Assert.assertEquals("9223372036854775807", rc_BigDecimal.toString());
  }
  public void testItem_0661()
  {
    rc_BigDecimal = (new BigDecimal("1")).movePointLeft(2147483647);
    Assert.assertEquals("1E-2147483647", rc_BigDecimal.toString());
  }
  public void testItem_0662()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\uFFFF'}, new MathContext("precision=0 roundingMode=HALF_UP"));
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0663()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\0', '\234', '\234', '8', '\234', '\uFFFF', '\0', '8', '8', '\uFFFF', '8', '\1', '8', '\1', '\1', '\234', '\0', '\1', '8', '\0', '\234', '\0', '\uFFFF', '\0', '8', '\234', '8', '\1', '\0', '\uFFFF', '\234', '\1', '\234', '8', '\0', '8', '\234', '\1', '8', '\0', '\0', '\1', '\0', '\234', '8', '\0', '\1', '\uFFFF', '\1', '\1', '\uFFFF', '\uFFFF', '\1', '\1', '\1', '8', '8', '8', '\0', '\234', '\uFFFF', '\uFFFF', '\0', '\0', '\0', '8', '\0', '\1', '8', '\uFFFF', '\uFFFF', '\0', '\1', '\234', '\1', '8', '8', '\0', '\uFFFF', '\0', '\1', '\uFFFF', '\uFFFF', '\234', '\uFFFF', '\uFFFF', '\uFFFF', '8', '8', '\234', '\0', '\1', '\uFFFF', '\uFFFF', '\1', '8', '\uFFFF', '\uFFFF', '\234', '\234'});
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0664()
  {
    rc_int = (new BigDecimal("3")).compareTo(new BigDecimal("3.2E-2147483646"));
    Assert.assertEquals(1, rc_int);
  }
  public void testItem_0665()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("3")).divide(new BigDecimal("3.2E-2147483646"), new MathContext("precision=1 roundingMode=UNNECESSARY"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0666()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0667()
  {
    rc_BigDecimal = (new BigDecimal("32")).movePointRight(-1);
    Assert.assertEquals("3.2", rc_BigDecimal.toString());
  }
  public void testItem_0668()
  {
    rc_BigDecimal = (new BigDecimal("3.2")).negate(new MathContext("precision=1 roundingMode=DOWN"));
    Assert.assertEquals("-3", rc_BigDecimal.toString());
  }
//  public void testItem_0669()
//  {
//    boolean caught;
//    caught = false;
//    try {
//      rc_BigDecimal = (new BigDecimal("1E-2147483647")).add(new BigDecimal("3.2"));
//    }
//    catch (java.lang.OutOfMemoryError e) {
//      caught = true;
//    }
//    Assert.assertEquals("91.94630872483222%", true, caught);
//  }
  public void testItem_0670()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal("LUKTUE13Q?J;L9FGL:X5F@@YW2TO2@HXI;SO=0O");
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0671()
  {
    rc_BigDecimal = (new BigDecimal("3.2")).add(new BigDecimal("1E-2147483647"), new MathContext("precision=1 roundingMode=DOWN"));
    Assert.assertEquals("3", rc_BigDecimal.toString());
  }
  public void testItem_0672()
  {
    rc_BigDecimal = (new BigDecimal("9223372036854775807")).subtract(new BigDecimal("1E-2147483647"), new MathContext("precision=1 roundingMode=HALF_UP"));
    Assert.assertEquals("9E+18", rc_BigDecimal.toString());
  }
  public void testItem_0673()
  {
    rc_BigDecimal = new BigDecimal(1L);
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0674()
  {
    rc_BigDecimal = (new BigDecimal("3.2E-2147483646")).divide(new BigDecimal("9E+18"), java.math.RoundingMode.HALF_UP);
    Assert.assertEquals("0E-2147483647", rc_BigDecimal.toString());
  }
  public void testItem_0675()
  {
    rc_BigInteger = (new BigDecimal("0E-2147483647")).toBigIntegerExact();
    Assert.assertEquals("0", rc_BigInteger.toString());
  }
  public void testItem_0676()
  {
    rc_BigDecimal = (new BigDecimal("1E-2147483647")).min(new BigDecimal("3.2E-2147483646"));
    Assert.assertEquals("1E-2147483647", rc_BigDecimal.toString());
  }
  public void testItem_0677()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("3.2E-2147483646")).pow(2147483647, new MathContext("precision=1 roundingMode=HALF_UP"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0678()
  {
    rc_BigInteger = (new BigDecimal("9223372036854775807")).toBigInteger();
    Assert.assertEquals("9223372036854775807", rc_BigInteger.toString());
  }
  public void testItem_0679()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal_array = (new BigDecimal("9E+18")).divideAndRemainder(new BigDecimal("1E-2147483647"), new MathContext("precision=1 roundingMode=UNNECESSARY"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0680()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\0', '\0', '\1', '\234', '\234', '8'});
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0681()
  {
    rc_BigDecimal = (new BigDecimal("3.2E-2147483646")).abs(new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("3.2E-2147483646", rc_BigDecimal.toString());
  }
  public void testItem_0682()
  {
    rc_BigDecimal = (new BigDecimal("1E-2147483647")).pow(1);
    Assert.assertEquals("1E-2147483647", rc_BigDecimal.toString());
  }
//  public void testItem_0683()
//  {
//    boolean caught;
//    caught = false;
//    try {
//      rc_BigInteger = (new BigDecimal("3.2E-2147483646")).toBigIntegerExact();
//    }
//    catch (java.lang.NegativeArraySizeException e) {
//      caught = true;
//    }
//    Assert.assertEquals("91.94630872483222%", true, caught);
//  }
  public void testItem_0684()
  {
    rc_BigDecimal = new BigDecimal(-2147483648, new MathContext("precision=1 roundingMode=HALF_UP"));
    Assert.assertEquals("-2E+9", rc_BigDecimal.toString());
  }
  public void testItem_0685()
  {
    rc_BigDecimal = new BigDecimal(-1, new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("-1", rc_BigDecimal.toString());
  }
  public void testItem_0686()
  {
    rc_BigInteger = (new BigDecimal("-2E+9")).toBigIntegerExact();
    Assert.assertEquals("-2000000000", rc_BigInteger.toString());
  }
  public void testItem_0687()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("3.2E-2147483646")).multiply(new BigDecimal("3.2E-2147483646"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0688()
  {
    rc_int = (new BigDecimal("1E-2147483647")).scale();
    Assert.assertEquals(2147483647, rc_int);
  }
  public void testItem_0689()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("0E-2147483647")).divide(new BigDecimal("0E-2147483647"), java.math.RoundingMode.DOWN);
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0690()
  {
    rc_BigDecimal = (new BigDecimal("3.2E-2147483646")).abs(new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("3.2E-2147483646", rc_BigDecimal.toString());
  }
  public void testItem_0691()
  {
    rc_int = (new BigDecimal("3.2E-2147483646")).compareTo(new BigDecimal("1E-2147483647"));
    Assert.assertEquals(1, rc_int);
  }
//  public void testItem_0692()
//  {
//    boolean caught;
//    caught = false;
//    try {
//      rc_BigDecimal = (new BigDecimal("-2E+9")).divide(new BigDecimal("3.2E-2147483646"), 0, 1);
//    }
//    catch (java.lang.ArithmeticException e) {
//      caught = true;
//    }
//    Assert.assertEquals("91.94630872483222%", true, caught);
//  }
  public void testItem_0693()
  {
    rc_BigDecimal = (new BigDecimal("9E+18")).subtract(new BigDecimal("-2E+9"));
    Assert.assertEquals("9.000000002E+18", rc_BigDecimal.toString());
  }
  public void testItem_0694()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("3.2E-2147483646")).subtract(new BigDecimal("-2E+9"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0695()
  {
    rc_String = (new BigDecimal("0E-2147483647")).toEngineeringString();
    Assert.assertEquals("0.0E-2147483646", rc_String);
  }
  public void testItem_0696()
  {
    rc_BigDecimal = (new BigDecimal("3.2E-2147483646")).plus(new MathContext("precision=1 roundingMode=DOWN"));
    Assert.assertEquals("3E-2147483646", rc_BigDecimal.toString());
  }
  public void testItem_0697()
  {
    boolean caught;
    caught = false;
    try {
      rc_byte = (new BigDecimal("1E-2147483647")).byteValueExact();
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0698()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("3.2E-2147483646")).divide(new BigDecimal("3.2E-2147483646"), -1, -2147483648);
    }
    catch (java.lang.IllegalArgumentException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0699()
  {
    rc_BigDecimal = new BigDecimal(-1);
    Assert.assertEquals("-1", rc_BigDecimal.toString());
  }
  public void testItem_0700()
  {
    rc_BigDecimal = (new BigDecimal("-2E+9")).divide(new BigDecimal("-2E+9"));
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0701()
  {
    rc_MathContext = new MathContext(1, java.math.RoundingMode.HALF_EVEN);
    Assert.assertEquals("precision=1 roundingMode=HALF_EVEN", rc_MathContext.toString());
  }
  public void testItem_0702()
  {
    rc_BigDecimal = (new BigDecimal("-2E+9")).stripTrailingZeros();
    Assert.assertEquals("-2E+9", rc_BigDecimal.toString());
  }
//  public void testItem_0703()
//  {
//    boolean caught;
//    caught = false;
//    try {
//      rc_BigDecimal = (new BigDecimal("-2E+9")).setScale(-2147483648);
//    }
//    catch (java.lang.OutOfMemoryError e) {
//      caught = true;
//    }
//    Assert.assertEquals("91.94630872483222%", true, caught);
//  }
  public void testItem_0704()
  {
    rc_BigDecimal = (new BigDecimal("3.2E-2147483646")).add(new BigDecimal("3.2E-2147483646"));
    Assert.assertEquals("6.4E-2147483646", rc_BigDecimal.toString());
  }
  public void testItem_0705()
  {
    rc_float = (new BigDecimal("-1")).floatValue();
    Assert.assertEquals(-1.0F, rc_float, 0);
  }
  public void testItem_0706()
  {
    rc_BigDecimal = new BigDecimal(-9223372036854775808L, new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("-9223372036854775808", rc_BigDecimal.toString());
  }
  public void testItem_0707()
  {
    rc_BigDecimal = (new BigDecimal("-1")).plus();
    Assert.assertEquals("-1", rc_BigDecimal.toString());
  }
  public void testItem_0708()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("3.2E-2147483646")).divide(new BigDecimal("3.2E-2147483646"), 1, -1);
    }
    catch (java.lang.IllegalArgumentException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
//  public void testItem_0709()
//  {
//    boolean caught;
//    caught = false;
//    try {
//      rc_BigDecimal = (new BigDecimal("3.2E-2147483646")).add(new BigDecimal("-1"), new MathContext("precision=0 roundingMode=HALF_UP"));
//    }
//    catch (java.lang.NegativeArraySizeException e) {
//      caught = true;
//    }
//    Assert.assertEquals("91.94630872483222%", true, caught);
//  }
  public void testItem_0710()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'8', '\0', '\1', '\1', '\1', '\234', '\uFFFF', '\uFFFF', '8', '8', '\234', '\234', '8', '\0', '\234', '\234', '\uFFFF', '\234', '8', '\1', '8', '\1', '\uFFFF', '\234', '\0', '\1', '8', '\1', '\234', '\uFFFF', '8', '\uFFFF', '\234', '\1', '\234', '\uFFFF', '\234', '\uFFFF', '\uFFFF', '8', '\uFFFF', '\0', '\234', '\uFFFF', '\1', '\0', '\234', '\0', '\234', '\1', '\0', '\uFFFF', '\1', '8', '\234', '\234', '\0', '\0', '\0', '\uFFFF', '\1', '8', '\0', '\uFFFF', '\uFFFF', '\234', '8', '\0', '\234', '\1', '\1', '\234', '8', '\0', '\uFFFF', '\234', '\uFFFF', '8', '\234', '\0', '8', '8', '\uFFFF', '\234', '\uFFFF', '\uFFFF', '\234', '\1', '\1', '8', '8', '\0', '\234', '8', '\234', '\0', '\1', '\0', '\1', '\uFFFF'});
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0711()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("-2E+9")).setScale(2147483647, java.math.RoundingMode.CEILING);
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0712()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\0', '\uFFFF', '\1', '\234', '\0', '\234', '\1', '\234', '\0', '\uFFFF', '\uFFFF', '\234', '8', '\1', '\uFFFF', '8', '\0', '\1', '\234', '\0', '\1', '\0', '\234', '\uFFFF', '\1', '\0', '\uFFFF', '\1', '8', '\234', '\uFFFF', '\uFFFF', '\1', '\234', '\0', '\uFFFF', '\0', '\uFFFF', '\1', '8', '\1', '\uFFFF', '\uFFFF', '8', '\uFFFF', '\234', '\234', '\uFFFF', '\0', '\1', '\uFFFF', '\1', '\uFFFF', '\uFFFF', '\234', '\234', '\234', '\234', '\234', '8', '\uFFFF', '\0', '\uFFFF', '\234', '8', '\1', '\234', '\234', '\1', '8', '\1', '\1', '\0', '\uFFFF', '8', '\234', '8', '8', '\0', '8', '\0', '\uFFFF', '\0', '\234', '\uFFFF', '8', '\uFFFF', '\1', '\1', '\234', '\234', '\234', '8', '\uFFFF', '\234', '\1', '\uFFFF', '\0', '\234', '\uFFFF'}, 0, -1);
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0713()
  {
    rc_BigDecimal = new BigDecimal(0, new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("0", rc_BigDecimal.toString());
  }
  public void testItem_0714()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), 2147483647);
    Assert.assertEquals("3.2E-2147483646", rc_BigDecimal.toString());
  }
  public void testItem_0715()
  {
    rc_BigDecimal = (new BigDecimal("3.2E-2147483646")).divideToIntegralValue(new BigDecimal("-2E+9"));
    Assert.assertEquals("0E-2147483647", rc_BigDecimal.toString());
  }
  public void testItem_0716()
  {
    rc_MathContext = new MathContext(0, java.math.RoundingMode.CEILING);
    Assert.assertEquals("precision=0 roundingMode=CEILING", rc_MathContext.toString());
  }
  public void testItem_0717()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("0E-2147483647")).setScale(1, 2147483647);
    }
    catch (java.lang.IllegalArgumentException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
//  public void testItem_0718()
//  {
//    boolean caught;
//    rc_int = (new BigDecimal("-2E+9")).hashCode();
//    Assert.assertEquals(-71, rc_int);
//  }
  public void testItem_0719()
  {
    rc_BigDecimal = new BigDecimal(-9223372036854775808L);
    Assert.assertEquals("-9223372036854775808", rc_BigDecimal.toString());
  }
//  public void testItem_0720()
//  {
//    boolean caught;
//    if (!Boolean.getBoolean("notanerror"))
//    {
//    caught = false;
//    try {
//      rc_long = (new BigDecimal("3.2E-2147483646")).longValue();
//    }
//    catch (java.lang.NegativeArraySizeException e) {
//      caught = true;
//    }
//    Assert.assertEquals("91.94630872483222%", true, caught);
//    }
//  }
  public void testItem_0721()
  {
    rc_int = (new BigDecimal("0E-2147483647")).intValue();
    Assert.assertEquals(0, rc_int);
  }
  public void testItem_0722()
  {
    rc_BigDecimal = (new BigDecimal("-9223372036854775808")).subtract(new BigDecimal("-2E+9"));
    Assert.assertEquals("-9223372034854775808", rc_BigDecimal.toString());
  }
  public void testItem_0723()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\1', '\1', '\uFFFF', '8', '8', '8', '\1', '8', '\1', '\234', '8', '\1', '\1', '8', '8', '\0', '\uFFFF', '\0', '\1', '8', '\0', '\1', '\uFFFF', '\1', '\234', '\1', '\1', '\1', '8', '\1', '\0', '\234', '\0', '\1', '\1', '\234', '8', '8', '\uFFFF', '\234', '\uFFFF', '\0', '\1', '\234', '\0', '\234', '\1', '\uFFFF', '\234', '8', '\uFFFF', '\0', '\234', '\0', '\1', '\234', '\0', '\234', '\234', '\0', '\1', '\0', '\0', '8', '\234', '\uFFFF', '\uFFFF', '8', '\uFFFF', '8', '8', '\0', '\234', '8', '\uFFFF', '\1'}, 0, -2147483648, new MathContext("precision=1 roundingMode=HALF_EVEN"));
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0724()
  {
    rc_BigDecimal = (new BigDecimal("1E-2147483647")).min(new BigDecimal("-9223372034854775808"));
    Assert.assertEquals("-9223372034854775808", rc_BigDecimal.toString());
  }
  public void testItem_0725()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal_array = (new BigDecimal("-9223372034854775808")).divideAndRemainder(new BigDecimal("0E-2147483647"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0726()
  {
    boolean caught;
    caught = false;
    try {
      rc_MathContext = new MathContext(-2147483648, java.math.RoundingMode.FLOOR);
    }
    catch (java.lang.IllegalArgumentException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0727()
  {
    rc_BigDecimal = (new BigDecimal("-2E+9")).plus();
    Assert.assertEquals("-2E+9", rc_BigDecimal.toString());
  }
  public void testItem_0728()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\234'});
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0729()
  {
    rc_BigDecimal = (new BigDecimal("0E-2147483647")).plus(new MathContext("precision=1 roundingMode=HALF_UP"));
    Assert.assertEquals("0E-2147483647", rc_BigDecimal.toString());
  }
  public void testItem_0730()
  {
    rc_BigDecimal = (new BigDecimal("-9223372034854775808")).multiply(new BigDecimal("3.2E-2147483646"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("-2.95147905115352825856E-2147483627", rc_BigDecimal.toString());
  }
  public void testItem_0731()
  {
    boolean caught;
    caught = false;
    try {
      rc_long = (new BigDecimal("1E-2147483647")).longValueExact();
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0732()
  {
    rc_long = (new BigDecimal("-2E+9")).longValue();
    Assert.assertEquals(-2000000000L, rc_long);
  }
  public void testItem_0733()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), new MathContext("precision=1 roundingMode=HALF_EVEN"));
    Assert.assertEquals("3E+1", rc_BigDecimal.toString());
  }
  public void testItem_0734()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), new MathContext("precision=1 roundingMode=UNNECESSARY"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0735()
  {
    rc_int = (new BigDecimal("3.2E-2147483646")).compareTo(new BigDecimal("-2E+9"));
    Assert.assertEquals(1, rc_int);
  }
  public void testItem_0736()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\uFFFF', '\234', '8', '8', '\0', '\uFFFF', '8', '\0', '\0', '\234', '\1', '\234', '8', '\0', '\uFFFF', '\234', '\uFFFF', '\1', '\0', '\1', '8', '\1', '\1', '8', '\1', '8', '\234', '8', '\uFFFF', '8', '\1', '8', '\234', '8', '\234', '\234', '\uFFFF', '\uFFFF', '\uFFFF', '8', '\0', '\uFFFF', '\0', '\uFFFF', '\0', '\uFFFF', '8', '8', '8', '\0', '\uFFFF', '\0', '\0', '\0', '\0', '\234', '\1', '\234', '\uFFFF', '\1', '8', '\uFFFF', '\1', '\uFFFF', '\0', '\234', '8', '\1', '\uFFFF', '\uFFFF', '\1', '\234', '\234', '8', '\1', '\1', '\234', '\uFFFF', '8', '\uFFFF', '\0', '8', '8', '\1', '\0', '\234', '\1', '\1', '\234', '\1', '\234', '\0', '8', '8', '8', '\0', '\1', '\uFFFF', '\1', '\0'}, 1, 0, new MathContext("precision=0 roundingMode=CEILING"));
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0737()
  {
    boolean caught;
    caught = false;
    try {
      rc_byte = (new BigDecimal("-2.95147905115352825856E-2147483627")).byteValueExact();
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0738()
  {
    rc_BigDecimal = (new BigDecimal("-2E+9")).round(new MathContext("precision=1 roundingMode=HALF_UP"));
    Assert.assertEquals("-2E+9", rc_BigDecimal.toString());
  }
  public void testItem_0739()
  {
    rc_BigDecimal = (new BigDecimal("-9223372034854775808")).plus();
    Assert.assertEquals("-9223372034854775808", rc_BigDecimal.toString());
  }
  public void testItem_0740()
  {
    rc_BigDecimal = (new BigDecimal("3.2E-2147483646")).remainder(new BigDecimal("-2.95147905115352825856E-2147483627"), new MathContext("precision=1 roundingMode=HALF_UP"));
    Assert.assertEquals("3.2E-2147483646", rc_BigDecimal.toString());
  }
  public void testItem_0741()
  {
    rc_MathContext = new MathContext(1, java.math.RoundingMode.DOWN);
    Assert.assertEquals("precision=1 roundingMode=DOWN", rc_MathContext.toString());
  }
  public void testItem_0742()
  {
    rc_BigDecimal = (new BigDecimal("-9223372034854775808")).stripTrailingZeros();
    Assert.assertEquals("-9223372034854775808", rc_BigDecimal.toString());
  }
  public void testItem_0743()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("3.2E-2147483646")).multiply(new BigDecimal("-2.95147905115352825856E-2147483627"), new MathContext("precision=0 roundingMode=HALF_UP"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0744()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), 1, new MathContext("precision=0 roundingMode=CEILING"));
    Assert.assertEquals("3.2", rc_BigDecimal.toString());
  }
  public void testItem_0745()
  {
    rc_BigDecimal = (new BigDecimal("3.2")).min(new BigDecimal("-2E+9"));
    Assert.assertEquals("-2E+9", rc_BigDecimal.toString());
  }
//  public void testItem_0746()
//  {
//    boolean caught;
//    caught = false;
//    try {
//      rc_BigDecimal = (new BigDecimal("3.2")).subtract(new BigDecimal("3.2E-2147483646"));
//    }
//    catch (java.lang.OutOfMemoryError e) {
//      caught = true;
//    }
//    Assert.assertEquals("91.94630872483222%", true, caught);
//  }
  public void testItem_0747()
  {
    rc_BigDecimal = (new BigDecimal("-2E+9")).multiply(new BigDecimal("3.2"));
    Assert.assertEquals("-6.4E+9", rc_BigDecimal.toString());
  }
//  public void testItem_0748()
//  {
//    boolean caught;
//    if (!Boolean.getBoolean("notanerror"))
//    {
//    caught = false;
//    try {
//      rc_BigDecimal = (new BigDecimal("3.2E-2147483646")).remainder(new BigDecimal("3.2E-2147483646"));
//    }
//    catch (java.lang.ArithmeticException e) {
//      caught = true;
//    }
//    Assert.assertEquals("91.94630872483222%", true, caught);
//    }
//  }
  public void testItem_0749()
  {
    rc_BigDecimal = (new BigDecimal("3.2E-2147483646")).abs();
    Assert.assertEquals("3.2E-2147483646", rc_BigDecimal.toString());
  }
//  public void testItem_0750()
//  {
//    boolean caught;
//    rc_int = (new BigDecimal("-6.4E+9")).hashCode();
//    Assert.assertEquals(-1992, rc_int);
//  }
  public void testItem_0751()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\uFFFF', '\0', '8', '\1', '\uFFFF', '\234', '\0', '8', '\1', '\uFFFF', '8', '\uFFFF', '\uFFFF', '\uFFFF', '\234', '8', '\uFFFF', '\234', '\uFFFF', '\234', '\234', '\uFFFF', '\uFFFF', '\0', '\234', '8', '\1', '\234', '\uFFFF', '\1', '\uFFFF', '\1', '\1', '\0', '\uFFFF', '\0', '8', '\234', '\1', '\0', '\1', '\234', '\0', '\0', '8', '\uFFFF', '\1', '8', '\234', '\1', '\1', '8', '\uFFFF', '\0', '\234', '\uFFFF', '\0', '\234', '\234', '\0'}, 2147483647, 1);
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0752()
  {
    rc_BigDecimal = (new BigDecimal("-2.95147905115352825856E-2147483627")).min(new BigDecimal("-6.4E+9"));
    Assert.assertEquals("-6.4E+9", rc_BigDecimal.toString());
  }
  public void testItem_0753()
  {
    rc_BigDecimal = (new BigDecimal("-6.4E+9")).scaleByPowerOfTen(1);
    Assert.assertEquals("-6.4E+10", rc_BigDecimal.toString());
  }
  public void testItem_0754()
  {
    rc_String = (new BigDecimal("-2.95147905115352825856E-2147483627")).toEngineeringString();
    Assert.assertEquals("-29.5147905115352825856E-2147483628", rc_String);
  }
  public void testItem_0755()
  {
    rc_float = (new BigDecimal("-6.4E+10")).floatValue();
    Assert.assertEquals(-6.4E10F, rc_float, 0);
  }
  public void testItem_0756()
  {
    rc_BigDecimal = (new BigDecimal("3.2E-2147483646")).round(new MathContext("precision=1 roundingMode=HALF_UP"));
    Assert.assertEquals("3E-2147483646", rc_BigDecimal.toString());
  }
  public void testItem_0757()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("-2.95147905115352825856E-2147483627")).divide(new BigDecimal("-6.4E+10"), 2147483647);
    }
    catch (java.lang.IllegalArgumentException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0758()
  {
    rc_BigDecimal = (new BigDecimal("-2.95147905115352825856E-2147483627")).multiply(new BigDecimal("-6.4E+10"));
    Assert.assertEquals("1.8889465927382580854784E-2147483616", rc_BigDecimal.toString());
  }
  public void testItem_0759()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("1.8889465927382580854784E-2147483616")).movePointLeft(2147483647);
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
//  public void testItem_0760()
//  {
//    boolean caught;
//    rc_int = (new BigDecimal("3E-2147483646")).hashCode();
//    Assert.assertEquals(-2147483557, rc_int);
//  }
//  public void testItem_0761()
//  {
//    boolean caught;
//    if (!Boolean.getBoolean("notanerror"))
//    {
//    caught = false;
//    try {
//      rc_BigDecimal = (new BigDecimal("3E-2147483646")).divide(new BigDecimal("3.2E-2147483646"));
//    }
//    catch (java.lang.ArithmeticException e) {
//      caught = true;
//    }
//    Assert.assertEquals("91.94630872483222%", true, caught);
//    }
//  }
  public void testItem_0762()
  {
    rc_BigDecimal_array = (new BigDecimal("1.8889465927382580854784E-2147483616")).divideAndRemainder(new BigDecimal("-2E+9"), new MathContext("precision=0 roundingMode=CEILING"));
  }
  public void testItem_0763()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("-2.95147905115352825856E-2147483627")).divide(new BigDecimal("-2.95147905115352825856E-2147483627"), java.math.RoundingMode.FLOOR);
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0764()
  {
    rc_double = (new BigDecimal("-2.95147905115352825856E-2147483627")).doubleValue();
    Assert.assertEquals(-0.0, rc_double, 0);
  }
  public void testItem_0765()
  {
    rc_BigDecimal = new BigDecimal(1, new MathContext("precision=1 roundingMode=HALF_UP"));
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0766()
  {
    rc_BigDecimal = (new BigDecimal("3.2E-2147483646")).pow(1);
    Assert.assertEquals("3.2E-2147483646", rc_BigDecimal.toString());
  }
  public void testItem_0767()
  {
    rc_BigDecimal = (new BigDecimal("-2E+9")).plus();
    Assert.assertEquals("-2E+9", rc_BigDecimal.toString());
  }
  public void testItem_0768()
  {
    rc_int = (new BigDecimal("1.8889465927382580854784E-2147483616")).scale();
    Assert.assertEquals(2147483638, rc_int);
  }
  public void testItem_0769()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\0'}, 1, 0, new MathContext("precision=1 roundingMode=HALF_EVEN"));
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0770()
  {
    rc_BigDecimal = (new BigDecimal("3.2E-2147483646")).pow(-1, new MathContext("precision=1 roundingMode=HALF_UP"));
    Assert.assertEquals("3E+2147483645", rc_BigDecimal.toString());
  }
  public void testItem_0771()
  {
    rc_BigDecimal = (new BigDecimal("-2E+9")).round(new MathContext("precision=1 roundingMode=HALF_UP"));
    Assert.assertEquals("-2E+9", rc_BigDecimal.toString());
  }
  public void testItem_0772()
  {
    rc_BigDecimal = (new BigDecimal("3.2E-2147483646")).plus();
    Assert.assertEquals("3.2E-2147483646", rc_BigDecimal.toString());
  }
  public void testItem_0773()
  {
    boolean caught;
    caught = false;
    try {
      rc_MathContext = new MathContext("");
    }
    catch (java.lang.IllegalArgumentException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0774()
  {
    rc_BigDecimal = (new BigDecimal("3.2E-2147483646")).multiply(new BigDecimal("-2E+9"));
    Assert.assertEquals("-6.4E-2147483637", rc_BigDecimal.toString());
  }
//  public void testItem_0775()
//  {
//    boolean caught;
//    caught = false;
//    try {
//      rc_long = (new BigDecimal("3E+2147483645")).longValue();
//    }
//    catch (java.lang.OutOfMemoryError e) {
//      caught = true;
//    }
//    Assert.assertEquals("91.94630872483222%", true, caught);
//  }
  public void testItem_0776()
  {
    boolean caught;
    caught = false;
    try {
      rc_long = (new BigDecimal("3E+2147483645")).longValueExact();
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0777()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("-2.95147905115352825856E-2147483627")).divide(new BigDecimal("-6.4E-2147483637"), java.math.RoundingMode.CEILING);
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0778()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("3E+2147483645")).divide(new BigDecimal("-2E+9"), -1);
    }
    catch (java.lang.IllegalArgumentException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0779()
  {
    rc_MathContext = new MathContext(0);
    Assert.assertEquals("precision=0 roundingMode=HALF_UP", rc_MathContext.toString());
  }
  public void testItem_0780()
  {
    rc_BigDecimal = (new BigDecimal("-2.95147905115352825856E-2147483627")).remainder(new BigDecimal("3E+2147483645"), new MathContext("precision=1 roundingMode=HALF_EVEN"));
    Assert.assertEquals("-2.95147905115352825856E-2147483627", rc_BigDecimal.toString());
  }
  public void testItem_0781()
  {
    rc_BigDecimal = (new BigDecimal("-2.95147905115352825856E-2147483627")).max(new BigDecimal("-2.95147905115352825856E-2147483627"));
    Assert.assertEquals("-2.95147905115352825856E-2147483627", rc_BigDecimal.toString());
  }
//  public void testItem_0782()
//  {
//    boolean caught;
//    if (!Boolean.getBoolean("notanerror"))
//    {
//    caught = false;
//    try {
//      rc_BigDecimal = (new BigDecimal("-2.95147905115352825856E-2147483627")).setScale(0);
//    }
//    catch (java.lang.NegativeArraySizeException e) {
//      caught = true;
//    }
//    Assert.assertEquals("91.94630872483222%", true, caught);
//    }
//  }
  public void testItem_0783()
  {
    rc_BigDecimal = (new BigDecimal("1.8889465927382580854784E-2147483616")).abs();
    Assert.assertEquals("1.8889465927382580854784E-2147483616", rc_BigDecimal.toString());
  }
  public void testItem_0784()
  {
    rc_BigDecimal = (new BigDecimal("-2.95147905115352825856E-2147483627")).min(new BigDecimal("3E+2147483645"));
    Assert.assertEquals("-2.95147905115352825856E-2147483627", rc_BigDecimal.toString());
  }
  public void testItem_0785()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("3E+2147483645")).divide(new BigDecimal("-2.95147905115352825856E-2147483627"), -2147483648, 2147483647);
    }
    catch (java.lang.IllegalArgumentException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0786()
  {
    rc_BigInteger = (new BigDecimal("1.8889465927382580854784E-2147483616")).unscaledValue();
    Assert.assertEquals("18889465927382580854784", rc_BigInteger.toString());
  }
  public void testItem_0787()
  {
    rc_int = (new BigDecimal("1.8889465927382580854784E-2147483616")).scale();
    Assert.assertEquals(2147483638, rc_int);
  }
  public void testItem_0788()
  {
    rc_BigDecimal = (new BigDecimal("1.8889465927382580854784E-2147483616")).min(new BigDecimal("1.8889465927382580854784E-2147483616"));
    Assert.assertEquals("1.8889465927382580854784E-2147483616", rc_BigDecimal.toString());
  }
  public void testItem_0789()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal("HJQ4N5@JOSRB:D=05YRH<E6RYIC?6M2U3@CIFV416?<YB6B6JQ7YQA<CFNOT8V02@1KIU>KEJROJBXF=1I1@ENHQRAN:X8A9NVUH", new MathContext("precision=0 roundingMode=CEILING"));
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0790()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("1.8889465927382580854784E-2147483616")).multiply(new BigDecimal("1.8889465927382580854784E-2147483616"), new MathContext("precision=0 roundingMode=HALF_UP"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0791()
  {
    rc_float = (new BigDecimal("-2.95147905115352825856E-2147483627")).floatValue();
    Assert.assertEquals(-0.0F, rc_float, 0);
  }
  public void testItem_0792()
  {
    rc_BigDecimal = (new BigDecimal("-2.95147905115352825856E-2147483627")).movePointLeft(-2147483648);
    Assert.assertEquals("-2951479051153528258560", rc_BigDecimal.toString());
  }
  public void testItem_0793()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal("");
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0794()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), new MathContext("precision=0 roundingMode=CEILING"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0795()
  {
    rc_BigDecimal = new BigDecimal(-9223372036854775808L);
    Assert.assertEquals("-9223372036854775808", rc_BigDecimal.toString());
  }
  public void testItem_0796()
  {
    rc_BigDecimal = (new BigDecimal("-2951479051153528258560")).divide(new BigDecimal("-2E+9"));
    Assert.assertEquals("1475739525576.764129280", rc_BigDecimal.toString());
  }
  public void testItem_0797()
  {
    rc_BigDecimal = (new BigDecimal("-2.95147905115352825856E-2147483627")).plus(new MathContext("precision=0 roundingMode=CEILING"));
    Assert.assertEquals("-2.95147905115352825856E-2147483627", rc_BigDecimal.toString());
  }
  public void testItem_0798()
  {
    rc_BigDecimal = new BigDecimal(1135879015891L);
    Assert.assertEquals("1135879015891", rc_BigDecimal.toString());
  }
  public void testItem_0799()
  {
    boolean caught;
    caught = false;
    try {
      rc_byte = (new BigDecimal("1475739525576.764129280")).byteValueExact();
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0800()
  {
    rc_int = (new BigDecimal("-2951479051153528258560")).precision();
    Assert.assertEquals(22, rc_int);
  }
  public void testItem_0801()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("-2.95147905115352825856E-2147483627")).divide(new BigDecimal("1135879015891"), new MathContext("precision=0 roundingMode=HALF_UP"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0802()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\234', '8', '\1', '\234', '\0', '\1', '\1', '\234', '8', '8', '\0', '\234', '\1', '\uFFFF', '\0', '\uFFFF', '\uFFFF', '\1', '\0', '\0', '\1', '\0', '\uFFFF', '\234', '\uFFFF', '\0', '\234', '\0', '\uFFFF', '\234', '8', '\0', '\0', '8', '\uFFFF', '8', '\1', '8'}, new MathContext("precision=0 roundingMode=CEILING"));
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0803()
  {
    rc_BigDecimal = (new BigDecimal("-2951479051153528258560")).pow(1, new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("-2951479051153528258560", rc_BigDecimal.toString());
  }
  public void testItem_0804()
  {
    rc_BigDecimal = new BigDecimal(0, new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("0", rc_BigDecimal.toString());
  }
  public void testItem_0805()
  {
    rc_double = (new BigDecimal("1475739525576.764129280")).doubleValue();
    Assert.assertEquals(1.4757395255767642E12, rc_double, 0);
  }
  public void testItem_0806()
  {
    rc_BigDecimal = (new BigDecimal("-2951479051153528258560")).plus();
    Assert.assertEquals("-2951479051153528258560", rc_BigDecimal.toString());
  }
  public void testItem_0807()
  {
    rc_BigInteger = (new BigDecimal("-9223372036854775808")).unscaledValue();
    Assert.assertEquals("-9223372036854775808", rc_BigInteger.toString());
  }
  public void testItem_0808()
  {
    rc_BigDecimal = (new BigDecimal("-2951479051153528258560")).pow(0);
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0809()
  {
    rc_BigDecimal = (new BigDecimal("-2951479051153528258560")).divideToIntegralValue(new BigDecimal("-2951479051153528258560"));
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0810()
  {
    rc_BigDecimal = (new BigDecimal("1")).negate(new MathContext("precision=1 roundingMode=DOWN"));
    Assert.assertEquals("-1", rc_BigDecimal.toString());
  }
  public void testItem_0811()
  {
    rc_int = (new BigDecimal("-2951479051153528258560")).precision();
    Assert.assertEquals(22, rc_int);
  }
  public void testItem_0812()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("-9223372036854775808")).divide(new BigDecimal("1"), -1);
    }
    catch (java.lang.IllegalArgumentException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0813()
  {
    rc_BigDecimal = new BigDecimal(1.7976931348623157E308, new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("179769313486231570814527423731704356798070567525844996598917476803157260780028538760589558632766878171540458953514382464234321326889464182768467546703537516986049910576551282076245490090389328944075868508455133942304583236903222948165808559332123348274797826204144723168738177180919299881250404026184124858368", rc_BigDecimal.toString());
  }
  public void testItem_0814()
  {
    rc_BigDecimal = (new BigDecimal("1475739525576.764129280")).min(new BigDecimal("-2951479051153528258560"));
    Assert.assertEquals("-2951479051153528258560", rc_BigDecimal.toString());
  }
  public void testItem_0815()
  {
    boolean caught;
    caught = false;
    try {
      rc_MathContext = new MathContext("");
    }
    catch (java.lang.IllegalArgumentException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0816()
  {
    rc_float = (new BigDecimal("1")).floatValue();
    Assert.assertEquals(1.0F, rc_float, 0);
  }
  public void testItem_0817()
  {
    rc_BigDecimal = (new BigDecimal("-9223372036854775808")).max(new BigDecimal("1"));
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0818()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("179769313486231570814527423731704356798070567525844996598917476803157260780028538760589558632766878171540458953514382464234321326889464182768467546703537516986049910576551282076245490090389328944075868508455133942304583236903222948165808559332123348274797826204144723168738177180919299881250404026184124858368")).scaleByPowerOfTen(-2147483648);
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0819()
  {
    rc_BigDecimal = new BigDecimal(1.7976931348623157E308, new MathContext("precision=1 roundingMode=HALF_EVEN"));
    Assert.assertEquals("2E+308", rc_BigDecimal.toString());
  }
  public void testItem_0820()
  {
    rc_BigDecimal = new BigDecimal(-1.0, new MathContext("precision=1 roundingMode=HALF_EVEN"));
    Assert.assertEquals("-1", rc_BigDecimal.toString());
  }
  public void testItem_0821()
  {
    rc_BigDecimal = (new BigDecimal("-9223372036854775808")).max(new BigDecimal("-2951479051153528258560"));
    Assert.assertEquals("-9223372036854775808", rc_BigDecimal.toString());
  }
  public void testItem_0822()
  {
    rc_BigDecimal = (new BigDecimal("1")).multiply(new BigDecimal("1"), new MathContext("precision=0 roundingMode=CEILING"));
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0823()
  {
    rc_BigDecimal = (new BigDecimal("1")).pow(1);
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0824()
  {
    rc_int = (new BigDecimal("1")).precision();
    Assert.assertEquals(1, rc_int);
  }
  public void testItem_0825()
  {
    rc_BigInteger = (new BigDecimal("-2951479051153528258560")).unscaledValue();
    Assert.assertEquals("-2951479051153528258560", rc_BigInteger.toString());
  }
  public void testItem_0826()
  {
    rc_BigDecimal = (new BigDecimal("-9223372036854775808")).stripTrailingZeros();
    Assert.assertEquals("-9223372036854775808", rc_BigDecimal.toString());
  }
  public void testItem_0827()
  {
    rc_BigDecimal = (new BigDecimal("1")).subtract(new BigDecimal("-9223372036854775808"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("9223372036854775809", rc_BigDecimal.toString());
  }
  public void testItem_0828()
  {
    rc_BigDecimal = (new BigDecimal("-9223372036854775808")).multiply(new BigDecimal("1"));
    Assert.assertEquals("-9223372036854775808", rc_BigDecimal.toString());
  }
  public void testItem_0829()
  {
    rc_BigDecimal = (new BigDecimal("1")).divide(new BigDecimal("-9223372036854775808"), new MathContext("precision=0 roundingMode=CEILING"));
    Assert.assertEquals("-1.08420217248550443400745280086994171142578125E-19", rc_BigDecimal.toString());
  }
//  public void testItem_0830()
//  {
//    boolean caught;
//    rc_int = (new BigDecimal("1")).hashCode();
//    Assert.assertEquals(31, rc_int);
//  }
  public void testItem_0831()
  {
    rc_BigDecimal = (new BigDecimal("-9223372036854775808")).plus(new MathContext("precision=1 roundingMode=HALF_EVEN"));
    Assert.assertEquals("-9E+18", rc_BigDecimal.toString());
  }
  public void testItem_0832()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal("A9?=AO;V2@X4T0;NB?59R6NQ175C28GCG3THMIH9I4W86OBMWD:I>>4G0IB4BCTH1IT5GIHH71QC8WX9XB;5T=L17OH3XQHET<C<");
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0833()
  {
    rc_BigInteger = (new BigDecimal("-9E+18")).toBigIntegerExact();
    Assert.assertEquals("-9000000000000000000", rc_BigInteger.toString());
  }
  public void testItem_0834()
  {
    rc_String = (new BigDecimal("-9223372036854775808")).toPlainString();
    Assert.assertEquals("-9223372036854775808", rc_String);
  }
  public void testItem_0835()
  {
    rc_BigDecimal = (new BigDecimal("-9223372036854775808")).remainder(new BigDecimal("-9E+18"), new MathContext("precision=1 roundingMode=HALF_EVEN"));
    Assert.assertEquals("-223372036854775808", rc_BigDecimal.toString());
  }
  public void testItem_0836()
  {
    rc_BigDecimal = (new BigDecimal("-223372036854775808")).pow(1);
    Assert.assertEquals("-223372036854775808", rc_BigDecimal.toString());
  }
  public void testItem_0837()
  {
    rc_BigDecimal = (new BigDecimal("-223372036854775808")).min(new BigDecimal("-223372036854775808"));
    Assert.assertEquals("-223372036854775808", rc_BigDecimal.toString());
  }
  public void testItem_0838()
  {
    rc_BigDecimal = (new BigDecimal("-9223372036854775808")).subtract(new BigDecimal("-9223372036854775808"));
    Assert.assertEquals("0", rc_BigDecimal.toString());
  }
  public void testItem_0839()
  {
    rc_BigDecimal = (new BigDecimal("-9E+18")).movePointRight(0);
    if (JavaSpecVersionChecker.isJDK13OrNewer()) {
    	Assert.assertEquals("-9E+18", rc_BigDecimal.toString());
    } else {
    	Assert.assertEquals("-9000000000000000000", rc_BigDecimal.toString());
    }
  }
  public void testItem_0840()
  {
    boolean caught;
    caught = false;
    try {
      rc_short = (new BigDecimal("-9E+18")).shortValueExact();
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0841()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0842()
  {
    boolean caught;
    caught = false;
    try {
      rc_MathContext = new MathContext(-2147483648);
    }
    catch (java.lang.IllegalArgumentException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0843()
  {
    rc_BigDecimal = new BigDecimal(1);
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0844()
  {
    rc_double = (new BigDecimal("32")).doubleValue();
    Assert.assertEquals(32.0, rc_double, 0);
  }
  public void testItem_0845()
  {
    rc_short = (new BigDecimal("1")).shortValueExact();
    Assert.assertEquals(1, rc_short);
  }
  public void testItem_0846()
  {
    boolean caught;
    caught = false;
    try {
      rc_MathContext = new MathContext(-1, java.math.RoundingMode.UP);
    }
    catch (java.lang.IllegalArgumentException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0847()
  {
    rc_BigDecimal = (new BigDecimal("32")).divideToIntegralValue(new BigDecimal("1"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0848()
  {
    rc_long = (new BigDecimal("32")).longValueExact();
    Assert.assertEquals(32L, rc_long);
  }
  public void testItem_0849()
  {
    rc_BigDecimal = new BigDecimal(1L);
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0850()
  {
    rc_int = (new BigDecimal("32")).intValueExact();
    Assert.assertEquals(32, rc_int);
  }
  public void testItem_0851()
  {
    rc_BigDecimal = new BigDecimal(-1L, new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("-1", rc_BigDecimal.toString());
  }
  public void testItem_0852()
  {
    rc_int = (new BigDecimal("32")).intValue();
    Assert.assertEquals(32, rc_int);
  }
  public void testItem_0853()
  {
    rc_BigDecimal = (new BigDecimal("1")).ulp();
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0854()
  {
    rc_float = (new BigDecimal("32")).floatValue();
    Assert.assertEquals(32.0F, rc_float, 0);
  }
  public void testItem_0855()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), -1);
    Assert.assertEquals("3.2E+2", rc_BigDecimal.toString());
  }
  public void testItem_0856()
  {
    rc_BigDecimal = (new BigDecimal("1")).divide(new BigDecimal("32"), java.math.RoundingMode.HALF_EVEN);
    Assert.assertEquals("0", rc_BigDecimal.toString());
  }
  public void testItem_0857()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'8'}, 1, -2147483648, new MathContext("precision=1 roundingMode=DOWN"));
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0858()
  {
    rc_BigDecimal = (new BigDecimal("1")).plus();
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
//  public void testItem_0859()
//  {
//    boolean caught;
//    rc_int = (new BigDecimal("1")).hashCode();
//    Assert.assertEquals(31, rc_int);
//  }
  public void testItem_0860()
  {
    rc_BigDecimal = (new BigDecimal("1")).add(new BigDecimal("3.2E+2"));
    Assert.assertEquals("321", rc_BigDecimal.toString());
  }
  public void testItem_0861()
  {
    boolean caught;
    caught = false;
    try {
      rc_MathContext = new MathContext(-1);
    }
    catch (java.lang.IllegalArgumentException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
//  public void testItem_0862()
//  {
//    boolean caught;
//    rc_int = (new BigDecimal("321")).hashCode();
//    Assert.assertEquals(9951, rc_int);
//  }
  @SuppressWarnings("unlikely-arg-type")
  public void testItem_0863()
  {
    rc_boolean = (new BigDecimal("0")).equals("6IFU<B9OVVSK999IQ4BQ0U;B5?OH6<GC<R:NTV<0GWKHS>PI7U0:WAIDBBQIFBOBG<EU8W2KFUG6KP>P:XSCSGEIDXD@LQ4CLWXI");
    Assert.assertEquals(false, rc_boolean);
  }
  public void testItem_0864()
  {
    rc_BigDecimal_array = (new BigDecimal("3.2E+2")).divideAndRemainder(new BigDecimal("1"));
  }
  public void testItem_0865()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\1', '\1', '\0', '\234'}, new MathContext("precision=1 roundingMode=HALF_EVEN"));
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0866()
  {
    rc_BigDecimal = (new BigDecimal("3.2E+2")).scaleByPowerOfTen(2147483647);
    Assert.assertEquals("3.2E+2147483649", rc_BigDecimal.toString());
  }
  public void testItem_0867()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), -1);
    Assert.assertEquals("3.2E+2", rc_BigDecimal.toString());
  }
  public void testItem_0868()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal("V:0H=<GEHAVD2NHKVM3M<18::S8VPK0U;VFO9XA;GHO6N@U7P:<TNXM;TXBTUNJY3S2L@J9K;BBOOISU0F;?8JEOEDYPT4@NUC6Q");
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0869()
  {
    rc_BigDecimal = (new BigDecimal("3.2E+2")).abs();
    Assert.assertEquals("3.2E+2", rc_BigDecimal.toString());
  }
  public void testItem_0870()
  {
    rc_double = (new BigDecimal("3.2E+2")).doubleValue();
    Assert.assertEquals(320.0, rc_double, 0);
  }
//  public void testItem_0871()
//  {
//    boolean caught;
//    if (!Boolean.getBoolean("notanerror"))
//    {
//    rc_BigDecimal = (new BigDecimal("320.0E+2147483647")).max(new BigDecimal("1"));
//    Assert.assertEquals("1", rc_BigDecimal.toString());
//    }
//  }
  @SuppressWarnings("unlikely-arg-type")
  public void testItem_0872()
  {
    rc_boolean = (new BigDecimal("320.0E+2147483647")).equals("HRAM;OT>8K0VYUOUE5LINHM@TGEC=O<K");
    Assert.assertEquals(false, rc_boolean);
  }
  public void testItem_0873()
  {
    rc_int = (new BigDecimal("1")).scale();
    Assert.assertEquals(0, rc_int);
  }
  public void testItem_0874()
  {
    rc_long = (new BigDecimal("3.2E+2")).longValueExact();
    Assert.assertEquals(320L, rc_long);
  }
//  public void testItem_0875()
//  {
//    boolean caught;
//    rc_BigDecimal = (new BigDecimal("320.0E+2147483647")).divideToIntegralValue(new BigDecimal("3.2E+2"));
//    Assert.assertEquals("0E+2147483647", rc_BigDecimal.toString());
//  }
//  public void testItem_0876()
//  {
//    boolean caught;
//    rc_BigInteger = (new BigDecimal("320.0E+2147483647")).unscaledValue();
//    Assert.assertEquals("32", rc_BigInteger.toString());
//  }
//  public void testItem_0877()
//  {
//    boolean caught;
//    rc_BigDecimal = (new BigDecimal("320.0E+2147483647")).round(new MathContext("precision=0 roundingMode=HALF_UP"));
//    Assert.assertEquals("3.2E+2147483649", rc_BigDecimal.toString());
//  }
  public void testItem_0878()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0879()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), new MathContext("precision=0 roundingMode=CEILING"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
//  public void testItem_0880()
//  {
//    boolean caught;
//    caught = false;
//    try {
//      rc_BigDecimal = (new BigDecimal("3.2E+2")).multiply(new BigDecimal("320.0E+2147483647"), new MathContext("precision=1 roundingMode=HALF_EVEN"));
//    }
//    catch (java.lang.ArithmeticException e) {
//      caught = true;
//    }
//    Assert.assertEquals("91.94630872483222%", true, caught);
//  }
  public void testItem_0881()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0882()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("32")).pow(2147483647);
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0883()
  {
    rc_BigDecimal = new BigDecimal(2147483647, new MathContext("precision=0 roundingMode=CEILING"));
    Assert.assertEquals("2147483647", rc_BigDecimal.toString());
  }
  public void testItem_0884()
  {
    rc_MathContext = new MathContext(1);
    Assert.assertEquals("precision=1 roundingMode=HALF_UP", rc_MathContext.toString());
  }
//  public void testItem_0885()
//  {
//    boolean caught;
//    if (!Boolean.getBoolean("notanerror"))
//    {
//    caught = false;
//    try {
//      rc_BigDecimal_array = (new BigDecimal("32")).divideAndRemainder(new BigDecimal("320.0E+2147483647"));
//    }
//    catch (java.lang.ArithmeticException e) {
//      caught = true;
//    }
//    Assert.assertEquals("91.94630872483222%", true, caught);
//    }
//  }
  public void testItem_0886()
  {
    rc_BigDecimal = (new BigDecimal("2147483647")).add(new BigDecimal("2147483647"));
    Assert.assertEquals("4294967294", rc_BigDecimal.toString());
  }
//  public void testItem_0887()
//  {
//    boolean caught;
//    caught = false;
//    try {
//      rc_BigDecimal = (new BigDecimal("32")).subtract(new BigDecimal("320.0E+2147483647"));
//    }
//    catch (java.lang.ArithmeticException e) {
//      caught = true;
//    }
//    Assert.assertEquals("91.94630872483222%", true, caught);
//  }
  public void testItem_0888()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\1', '\0', '\1', '\uFFFF', '8', '\234', '8', '\1', '\1', '\1', '\uFFFF', '\uFFFF', '\234', '\1', '\1', '\234', '\234', '\uFFFF', '\0', '\234', '\1', '\234', '8', '\234', '\uFFFF', '8', '\1', '\0', '\234', '\uFFFF', '\1', '\0', '\1', '\1', '8', '\uFFFF', '8', '\234', '\0', '\1', '\234', '\234', '\uFFFF', '\0', '\0', '\0', '\1', '\uFFFF', '\234', '\uFFFF', '\234', '\1', '\234', '\1', '\0', '\0', '\uFFFF', '\1', '\uFFFF', '\uFFFF', '\0', '\234', '\uFFFF', '\1', '8', '\234', '\0'}, -2147483648, 1, new MathContext("precision=1 roundingMode=HALF_EVEN"));
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0889()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0890()
  {
    rc_BigDecimal = (new BigDecimal("4294967294")).multiply(new BigDecimal("4294967294"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("18446744056529682436", rc_BigDecimal.toString());
  }
  public void testItem_0891()
  {
    rc_BigDecimal = (new BigDecimal("32")).subtract(new BigDecimal("4294967294"), new MathContext("precision=1 roundingMode=HALF_EVEN"));
    Assert.assertEquals("-4E+9", rc_BigDecimal.toString());
  }
  public void testItem_0892()
  {
    rc_BigDecimal = new BigDecimal(-9223372036854775808L);
    Assert.assertEquals("-9223372036854775808", rc_BigDecimal.toString());
  }
  public void testItem_0893()
  {
    rc_BigDecimal = new BigDecimal(0L, new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("0", rc_BigDecimal.toString());
  }
  public void testItem_0894()
  {
    rc_BigDecimal = (new BigDecimal("18446744056529682436")).negate(new MathContext("precision=0 roundingMode=CEILING"));
    Assert.assertEquals("-18446744056529682436", rc_BigDecimal.toString());
  }
  public void testItem_0895()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0896()
  {
    rc_BigDecimal = (new BigDecimal("-18446744056529682436")).ulp();
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0897()
  {
    boolean caught;
    caught = false;
    try {
      rc_MathContext = new MathContext("F5493SX8R3LLL=MJUE62M36D<0IJNX=8GJ1;2XCU=KAOI6FH89?0AKWK4<<O3BJQ7KIQ796Q8WEFEJR5GCOS3NENA@RL>S6RRCK7");
    }
    catch (java.lang.IllegalArgumentException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0898()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal_array = (new BigDecimal("1")).divideAndRemainder(new BigDecimal("0"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0899()
  {
    rc_int = (new BigDecimal("0")).signum();
    Assert.assertEquals(0, rc_int);
  }
  public void testItem_0900()
  {
    rc_BigDecimal = (new BigDecimal("-18446744056529682436")).setScale(1, java.math.RoundingMode.HALF_DOWN);
    Assert.assertEquals("-18446744056529682436.0", rc_BigDecimal.toString());
  }
  public void testItem_0901()
  {
    rc_String = (new BigDecimal("1")).toEngineeringString();
    Assert.assertEquals("1", rc_String);
  }
  public void testItem_0902()
  {
    rc_BigDecimal = (new BigDecimal("-9223372036854775808")).ulp();
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0903()
  {
    rc_BigDecimal = (new BigDecimal("-9223372036854775808")).subtract(new BigDecimal("-18446744056529682436"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("9223372019674906628", rc_BigDecimal.toString());
  }
  public void testItem_0904()
  {
    rc_long = (new BigDecimal("32")).longValue();
    Assert.assertEquals(32L, rc_long);
  }
  public void testItem_0905()
  {
    boolean caught;
    caught = false;
    try {
      rc_short = (new BigDecimal("-18446744056529682436")).shortValueExact();
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0906()
  {
    rc_int = (new BigDecimal("32")).intValue();
    Assert.assertEquals(32, rc_int);
  }
  public void testItem_0907()
  {
    rc_float = (new BigDecimal("-18446744056529682436.0")).floatValue();
    Assert.assertEquals(-1.8446744073709552E19F, rc_float, 0);
  }
  public void testItem_0908()
  {
    rc_BigDecimal = (new BigDecimal("-18446744056529682436")).movePointLeft(1);
    Assert.assertEquals("-1844674405652968243.6", rc_BigDecimal.toString());
  }
  public void testItem_0909()
  {
    rc_BigDecimal = new BigDecimal(-1L, new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("-1", rc_BigDecimal.toString());
  }
  public void testItem_0910()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), 2147483647, new MathContext("precision=0 roundingMode=CEILING"));
    Assert.assertEquals("3.2E-2147483646", rc_BigDecimal.toString());
  }
  public void testItem_0911()
  {
    rc_BigDecimal = (new BigDecimal("-18446744056529682436")).divide(new BigDecimal("-1"), 1);
    Assert.assertEquals("18446744056529682436", rc_BigDecimal.toString());
  }
  public void testItem_0912()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal("CP2H7FP?:K<AYC:8?D6FDO1;IYL8PU<XMI4H@WRU2BECYIN<;1PF;JUY");
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0913()
  {
    rc_BigDecimal = (new BigDecimal("-18446744056529682436")).stripTrailingZeros();
    Assert.assertEquals("-18446744056529682436", rc_BigDecimal.toString());
  }
  public void testItem_0914()
  {
    rc_BigDecimal = (new BigDecimal("32")).pow(0);
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0915()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\234', '\1', '8', '\234', '\uFFFF', '\234', '\1', '\234', '8', '\234', '\uFFFF', '\1', '\234', '\234', '8', '8', '\uFFFF', '\uFFFF', '\0', '\1', '\234', '\0', '8', '\1', '8', '8', '\uFFFF', '8', '\uFFFF', '8', '8', '\uFFFF', '\1', '\234', '\0', '\234', '\uFFFF', '\0', '\0', '\0', '\0', '\1', '\1', '\1', '\1', '\234', '\234', '8', '\1', '\0', '8', '\1', '\1', '\1', '8', '\uFFFF', '\1', '\234', '\234', '\234', '\234', '\234', '8', '\234', '\1', '\1', '8', '\0', '\0', '\0', '8', '\234', '\0', '\uFFFF', '\234', '\1', '\1', '\234', '\uFFFF', '\234', '\uFFFF', '\1', '8', '\uFFFF', '\234', '8', '8', '\0', '\234', '\0', '8', '\234', '\0', '\234', '\uFFFF', '\uFFFF', '\234', '\0', '\0', '\uFFFF'}, new MathContext("precision=1 roundingMode=HALF_EVEN"));
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0916()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\234'}, 2147483647, 2147483647, new MathContext("precision=1 roundingMode=HALF_UP"));
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0917()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("32")).scaleByPowerOfTen(-2147483648);
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0918()
  {
    rc_BigDecimal = (new BigDecimal("1")).remainder(new BigDecimal("1"), new MathContext("precision=1 roundingMode=HALF_UP"));
    Assert.assertEquals("0", rc_BigDecimal.toString());
  }
  public void testItem_0919()
  {
    rc_BigDecimal = (new BigDecimal("-18446744056529682436")).max(new BigDecimal("3.2E-2147483646"));
    Assert.assertEquals("3.2E-2147483646", rc_BigDecimal.toString());
  }
  public void testItem_0920()
  {
    boolean caught;
    caught = false;
    try {
      rc_long = (new BigDecimal("3.2E-2147483646")).longValueExact();
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0921()
  {
    rc_BigDecimal = new BigDecimal(-9223372036854775808L, new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("-9223372036854775808", rc_BigDecimal.toString());
  }
  public void testItem_0922()
  {
    rc_int = (new BigDecimal("-9223372036854775808")).compareTo(new BigDecimal("-18446744056529682436"));
    Assert.assertEquals(1, rc_int);
  }
  public void testItem_0923()
  {
    rc_BigDecimal_array = (new BigDecimal("-18446744056529682436")).divideAndRemainder(new BigDecimal("-18446744056529682436"), new MathContext("precision=1 roundingMode=HALF_EVEN"));
  }
  public void testItem_0924()
  {
    rc_BigDecimal = new BigDecimal(0L, new MathContext("precision=1 roundingMode=HALF_UP"));
    Assert.assertEquals("0", rc_BigDecimal.toString());
  }
  public void testItem_0925()
  {
    rc_BigDecimal = new BigDecimal(-2147483648, new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("-2147483648", rc_BigDecimal.toString());
  }
  public void testItem_0926()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("18446744056529682436")).divide(new BigDecimal("0"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0927()
  {
    rc_MathContext = new MathContext(0, java.math.RoundingMode.UNNECESSARY);
    Assert.assertEquals("precision=0 roundingMode=UNNECESSARY", rc_MathContext.toString());
  }
  public void testItem_0928()
  {
    rc_BigInteger = (new BigDecimal("-9223372036854775808")).toBigIntegerExact();
    Assert.assertEquals("-9223372036854775808", rc_BigInteger.toString());
  }
  public void testItem_0929()
  {
    rc_int = (new BigDecimal("0")).intValue();
    Assert.assertEquals(0, rc_int);
  }
  public void testItem_0930()
  {
    rc_BigDecimal_array = (new BigDecimal("1")).divideAndRemainder(new BigDecimal("-18446744056529682436"), new MathContext("precision=0 roundingMode=HALF_UP"));
  }
  public void testItem_0931()
  {
    rc_BigDecimal = (new BigDecimal("-18446744056529682436")).divide(new BigDecimal("18446744056529682436"), java.math.RoundingMode.HALF_DOWN);
    Assert.assertEquals("-1", rc_BigDecimal.toString());
  }
  public void testItem_0932()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\uFFFF', '\0', '\1', '8', '\0', '8', '\uFFFF', '\0', '\234', '\0', '8', '\234', '\uFFFF', '8', '\uFFFF', '\uFFFF', '\234', '\1', '\0', '\uFFFF', '\234', '\1', '\234', '\234', '\uFFFF', '\0', '\234', '\1', '\uFFFF', '\uFFFF', '8', '\uFFFF', '\1', '8', '\uFFFF', '\0', '8', '8', '\1', '8', '\1', '\234', '\uFFFF', '8', '\uFFFF', '\1', '\1', '8', '\0', '\1'}, -1, -2147483648);
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0933()
  {
    rc_BigDecimal = (new BigDecimal("-9223372036854775808")).movePointRight(-1);
    Assert.assertEquals("-922337203685477580.8", rc_BigDecimal.toString());
  }
  public void testItem_0934()
  {
    rc_BigDecimal_array = (new BigDecimal("0")).divideAndRemainder(new BigDecimal("18446744056529682436"), new MathContext("precision=1 roundingMode=HALF_UP"));
  }
  public void testItem_0935()
  {
    rc_String = (new BigDecimal("1")).toPlainString();
    Assert.assertEquals("1", rc_String);
  }
  public void testItem_0936()
  {
    rc_BigDecimal = (new BigDecimal("-9223372036854775808")).ulp();
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0937()
  {
    rc_BigInteger = (new BigDecimal("1")).toBigIntegerExact();
    Assert.assertEquals("1", rc_BigInteger.toString());
  }
  public void testItem_0938()
  {
    boolean caught;
    caught = false;
    try {
      rc_MathContext = new MathContext(-1);
    }
    catch (java.lang.IllegalArgumentException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0939()
  {
    rc_int = (new BigDecimal("1")).precision();
    Assert.assertEquals(1, rc_int);
  }
  public void testItem_0940()
  {
    rc_long = (new BigDecimal("0")).longValueExact();
    Assert.assertEquals(0L, rc_long);
  }
  public void testItem_0941()
  {
    rc_long = (new BigDecimal("1")).longValueExact();
    Assert.assertEquals(1L, rc_long);
  }
  public void testItem_0942()
  {
    rc_BigDecimal = (new BigDecimal("-9223372036854775808")).subtract(new BigDecimal("1"));
    Assert.assertEquals("-9223372036854775809", rc_BigDecimal.toString());
  }
  public void testItem_0943()
  {
    rc_BigDecimal = (new BigDecimal("1")).divide(new BigDecimal("-9223372036854775809"), new MathContext("precision=1 roundingMode=HALF_UP"));
    Assert.assertEquals("-1E-19", rc_BigDecimal.toString());
  }
  public void testItem_0944()
  {
    rc_BigDecimal = (new BigDecimal("-1E-19")).round(new MathContext("precision=0 roundingMode=UNNECESSARY"));
    Assert.assertEquals("-1E-19", rc_BigDecimal.toString());
  }
  public void testItem_0945()
  {
    rc_BigDecimal = (new BigDecimal("18446744056529682436")).plus();
    Assert.assertEquals("18446744056529682436", rc_BigDecimal.toString());
  }
  public void testItem_0946()
  {
    rc_BigDecimal = (new BigDecimal("18446744056529682436")).ulp();
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0947()
  {
    rc_BigDecimal = (new BigDecimal("18446744056529682436")).plus(new MathContext("precision=1 roundingMode=HALF_EVEN"));
    Assert.assertEquals("2E+19", rc_BigDecimal.toString());
  }
  public void testItem_0948()
  {
    boolean caught;
    caught = false;
    try {
      rc_MathContext = new MathContext("5WR=46TJK0;10GD@BBN;<:9SMVSVNLD5IKNNU9L>4X0FVJ8GCJDJ?YL0:<TL89EYEGOLE<9BMXPN=LHEGIH=:GBDTTCH2AW4A?3T");
    }
    catch (java.lang.IllegalArgumentException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0949()
  {
    rc_BigDecimal = (new BigDecimal("1")).stripTrailingZeros();
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0950()
  {
    rc_BigDecimal = (new BigDecimal("1")).divide(new BigDecimal("2E+19"), 0);
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0951()
  {
    rc_String = (new BigDecimal("1")).toPlainString();
    Assert.assertEquals("1", rc_String);
  }
  public void testItem_0952()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal("ULYJ5V2:9EDVLYM3M>O3@6;UX4OGN?37@2R>XJMGPSFK4C=4GMYG8CVE;U8Q2><I;H<W02;O>DJLCC;SLR1XDP?1>BM6QY7");
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0953()
  {
    rc_BigDecimal = (new BigDecimal("-9223372036854775809")).min(new BigDecimal("1"));
    Assert.assertEquals("-9223372036854775809", rc_BigDecimal.toString());
  }
  public void testItem_0954()
  {
    rc_BigDecimal = (new BigDecimal("1")).setScale(-1, java.math.RoundingMode.HALF_UP);
    Assert.assertEquals("0E+1", rc_BigDecimal.toString());
  }
  public void testItem_0955()
  {
    rc_BigDecimal = (new BigDecimal("1")).scaleByPowerOfTen(-1);
    Assert.assertEquals("0.1", rc_BigDecimal.toString());
  }
  public void testItem_0956()
  {
    rc_BigDecimal = (new BigDecimal("1")).negate(new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("-1", rc_BigDecimal.toString());
  }
  public void testItem_0957()
  {
    rc_int = (new BigDecimal("1")).intValue();
    Assert.assertEquals(1, rc_int);
  }
  public void testItem_0958()
  {
    rc_BigDecimal = (new BigDecimal("0.1")).divide(new BigDecimal("0.1"), java.math.RoundingMode.CEILING);
    Assert.assertEquals("1.0", rc_BigDecimal.toString());
  }
  public void testItem_0959()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal(new char[]{'\1', '\234', '\1', '8', '\234', '\0', '\1', '\uFFFF', '\1', '\1', '\uFFFF', '\1', '\1', '\uFFFF', '8', '\uFFFF', '8', '8', '\234', '\0', '8', '8', '\0', '\0', '\0', '\1', '\1', '\uFFFF', '8', '\234', '\uFFFF', '\uFFFF', '8', '\0', '\234', '8', '\234', '\0', '\1', '\uFFFF', '\0', '\234'}, 0, -2147483648);
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0960()
  {
    rc_int = (new BigDecimal("-1")).signum();
    Assert.assertEquals(-1, rc_int);
  }
  public void testItem_0961()
  {
    rc_String = (new BigDecimal("0.1")).toEngineeringString();
    Assert.assertEquals("0.1", rc_String);
  }
  public void testItem_0962()
  {
    rc_BigDecimal = (new BigDecimal("1")).add(new BigDecimal("-1"));
    Assert.assertEquals("0", rc_BigDecimal.toString());
  }
  public void testItem_0963()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigInteger = (new BigDecimal("0.1")).toBigIntegerExact();
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0964()
  {
    rc_BigInteger = (new BigDecimal("-1")).toBigIntegerExact();
    Assert.assertEquals("-1", rc_BigInteger.toString());
  }
//  public void testItem_0965()
//  {
//    boolean caught;
//    if (!Boolean.getBoolean("notanerror"))
//    {
//    caught = false;
//    try {
//      rc_BigDecimal = (new BigDecimal("-1")).setScale(-2147483648, java.math.RoundingMode.FLOOR);
//    }
//    catch (java.lang.ArithmeticException e) {
//      caught = true;
//    }
//    Assert.assertEquals("91.94630872483222%", true, caught);
//    }
//  }
  public void testItem_0966()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal("");
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0967()
  {
    rc_BigDecimal = (new BigDecimal("0E+1")).ulp();
    Assert.assertEquals("1E+1", rc_BigDecimal.toString());
  }
  @SuppressWarnings("unlikely-arg-type")
  public void testItem_0968()
  {
    rc_boolean = (new BigDecimal("-1")).equals(":N3GJ5@MACC381@GCB>Q:W6FR8NH0GP73OI2AD1F=6N;3W4K<;>5?78A63Q72IYTD0D>HTLEL4FA9Y3QS5OUKTFT38J4P>8JSHI?");
    Assert.assertEquals(false, rc_boolean);
  }
  public void testItem_0969()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = new BigDecimal("EO", new MathContext("precision=0 roundingMode=UNNECESSARY"));
    }
    catch (java.lang.NumberFormatException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0970()
  {
    rc_BigDecimal = new BigDecimal(9223372036854775807L, new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("9223372036854775807", rc_BigDecimal.toString());
  }
  public void testItem_0971()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("0E+1")).divide(new BigDecimal("1"), -1);
    }
    catch (java.lang.IllegalArgumentException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0972()
  {
    rc_BigDecimal = (new BigDecimal("1")).abs();
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0973()
  {
    rc_BigDecimal = (new BigDecimal("0.1")).subtract(new BigDecimal("0.1"));
    Assert.assertEquals("0.0", rc_BigDecimal.toString());
  }
  public void testItem_0974()
  {
    rc_BigDecimal = (new BigDecimal("9223372036854775807")).stripTrailingZeros();
    Assert.assertEquals("9223372036854775807", rc_BigDecimal.toString());
  }
  public void testItem_0975()
  {
    rc_BigDecimal = new BigDecimal(0, new MathContext("precision=1 roundingMode=HALF_UP"));
    Assert.assertEquals("0", rc_BigDecimal.toString());
  }
  public void testItem_0976()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0977()
  {
    rc_BigDecimal = (new BigDecimal("1E+1")).scaleByPowerOfTen(2147483647);
    Assert.assertEquals("1E+2147483648", rc_BigDecimal.toString());
  }
  public void testItem_0978()
  {
    rc_int = (new BigDecimal("0E+1")).precision();
    Assert.assertEquals(1, rc_int);
  }
//  public void testItem_0979()
//  {
//    boolean caught;
//    caught = false;
//    try {
//      rc_BigDecimal = (new BigDecimal("1E+2147483647")).add(new BigDecimal("32"));
//    }
//    catch (java.lang.ArithmeticException e) {
//      caught = true;
//    }
//    Assert.assertEquals("91.94630872483222%", true, caught);
//  }
  public void testItem_0980()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("32")).pow(2147483647, new MathContext("precision=0 roundingMode=UNNECESSARY"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0981()
  {
    rc_BigDecimal = (new BigDecimal("0E+1")).max(new BigDecimal("1E+1"));
    Assert.assertEquals("1E+1", rc_BigDecimal.toString());
  }
  public void testItem_0982()
  {
    rc_BigDecimal = (new BigDecimal("1E+2147483647")).divide(new BigDecimal("1E+2147483647"));
    Assert.assertEquals("1", rc_BigDecimal.toString());
  }
  public void testItem_0983()
  {
    rc_BigDecimal = (new BigDecimal("0E+1")).divide(new BigDecimal("32"), java.math.RoundingMode.HALF_UP);
    Assert.assertEquals("0E+1", rc_BigDecimal.toString());
  }
  public void testItem_0984()
  {
    rc_BigDecimal = (new BigDecimal("0E+1")).negate(new MathContext("precision=0 roundingMode=HALF_UP"));
    Assert.assertEquals("0E+1", rc_BigDecimal.toString());
  }
  public void testItem_0985()
  {
    rc_double = (new BigDecimal("1E+2147483647")).doubleValue();
    Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, rc_double, 0);
  }
  public void testItem_0986()
  {
    rc_BigDecimal = (new BigDecimal("0E+1")).divide(new BigDecimal("1"), 1, java.math.RoundingMode.HALF_DOWN);
    Assert.assertEquals("0.0", rc_BigDecimal.toString());
  }
  public void testItem_0987()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal_array = (new BigDecimal("0E+1")).divideAndRemainder(new BigDecimal("0E+1"), new MathContext("precision=0 roundingMode=HALF_UP"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  @SuppressWarnings("unlikely-arg-type")
  public void testItem_0988()
  {
    rc_boolean = (new BigDecimal("1E+2147483647")).equals("6A@@P04<HMCYUDIU@4S");
    Assert.assertEquals(false, rc_boolean);
  }
  public void testItem_0989()
  {
    rc_int = (new BigDecimal("0.0")).compareTo(new BigDecimal("1"));
    Assert.assertEquals(-1, rc_int);
  }
  public void testItem_0990()
  {
    rc_String = (new BigDecimal("0.0")).toEngineeringString();
    Assert.assertEquals("0.0", rc_String);
  }
  public void testItem_0991()
  {
    rc_BigDecimal = (new BigDecimal("0E+1")).subtract(new BigDecimal("0.0"));
    Assert.assertEquals("0.0", rc_BigDecimal.toString());
  }
  public void testItem_0992()
  {
    boolean caught;
    caught = false;
    try {
      rc_BigDecimal = (new BigDecimal("1")).divide(new BigDecimal("0.0"), new MathContext("precision=0 roundingMode=HALF_UP"));
    }
    catch (java.lang.ArithmeticException e) {
      caught = true;
    }
    Assert.assertEquals("91.94630872483222%", true, caught);
  }
  public void testItem_0993()
  {
    rc_int = (new BigDecimal("0.0")).compareTo(new BigDecimal("1"));
    Assert.assertEquals(-1, rc_int);
  }
  public void testItem_0994()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"));
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
  public void testItem_0995()
  {
    rc_BigDecimal = new BigDecimal(new java.math.BigInteger("32"), 1, new MathContext("precision=1 roundingMode=HALF_EVEN"));
    Assert.assertEquals("3", rc_BigDecimal.toString());
  }
  public void testItem_0996()
  {
    rc_BigDecimal = (new BigDecimal("0.0")).divide(new BigDecimal("32"), 1);
    Assert.assertEquals("0.0", rc_BigDecimal.toString());
  }
  public void testItem_0997()
  {
    rc_String = (new BigDecimal("1")).toPlainString();
    Assert.assertEquals("1", rc_String);
  }
//  public void testItem_0998()
//  {
//    boolean caught;
//    rc_BigDecimal = (new BigDecimal("1E+2147483647")).scaleByPowerOfTen(-1);
//    Assert.assertEquals("1E+2147483647", rc_BigDecimal.toString());
//  }
  public void testItem_0999()
  {
    rc_BigDecimal = (new BigDecimal("32")).stripTrailingZeros();
    Assert.assertEquals("32", rc_BigDecimal.toString());
  }
}
