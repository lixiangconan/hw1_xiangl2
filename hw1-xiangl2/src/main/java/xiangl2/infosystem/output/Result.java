

/* First created by JCasGen Sun Sep 08 22:59:03 EDT 2013 */
package xiangl2.infosystem.output;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import xiangl2.infosystem.basic.TextAnnotationBase;


/** This class stores the answer given by the system and its precision.
 * Updated by JCasGen Sun Sep 08 22:59:03 EDT 2013
 * XML source: E:/git/hw1_xiangl2/hw1-xiangl2/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class Result extends TextAnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Result.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Result() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Result(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Result(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Result(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: answer

  /** getter for answer - gets Answers of the question given by the system.
   * @generated */
  public FSArray getAnswer() {
    if (Result_Type.featOkTst && ((Result_Type)jcasType).casFeat_answer == null)
      jcasType.jcas.throwFeatMissing("answer", "xiangl2.infosystem.output.Result");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Result_Type)jcasType).casFeatCode_answer)));}
    
  /** setter for answer - sets Answers of the question given by the system. 
   * @generated */
  public void setAnswer(FSArray v) {
    if (Result_Type.featOkTst && ((Result_Type)jcasType).casFeat_answer == null)
      jcasType.jcas.throwFeatMissing("answer", "xiangl2.infosystem.output.Result");
    jcasType.ll_cas.ll_setRefValue(addr, ((Result_Type)jcasType).casFeatCode_answer, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for answer - gets an indexed value - Answers of the question given by the system.
   * @generated */
  public AnswerScore getAnswer(int i) {
    if (Result_Type.featOkTst && ((Result_Type)jcasType).casFeat_answer == null)
      jcasType.jcas.throwFeatMissing("answer", "xiangl2.infosystem.output.Result");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Result_Type)jcasType).casFeatCode_answer), i);
    return (AnswerScore)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Result_Type)jcasType).casFeatCode_answer), i)));}

  /** indexed setter for answer - sets an indexed value - Answers of the question given by the system.
   * @generated */
  public void setAnswer(int i, AnswerScore v) { 
    if (Result_Type.featOkTst && ((Result_Type)jcasType).casFeat_answer == null)
      jcasType.jcas.throwFeatMissing("answer", "xiangl2.infosystem.output.Result");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Result_Type)jcasType).casFeatCode_answer), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Result_Type)jcasType).casFeatCode_answer), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: answerNumber

  /** getter for answerNumber - gets Number of answers given by the system.
   * @generated */
  public int getAnswerNumber() {
    if (Result_Type.featOkTst && ((Result_Type)jcasType).casFeat_answerNumber == null)
      jcasType.jcas.throwFeatMissing("answerNumber", "xiangl2.infosystem.output.Result");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Result_Type)jcasType).casFeatCode_answerNumber);}
    
  /** setter for answerNumber - sets Number of answers given by the system. 
   * @generated */
  public void setAnswerNumber(int v) {
    if (Result_Type.featOkTst && ((Result_Type)jcasType).casFeat_answerNumber == null)
      jcasType.jcas.throwFeatMissing("answerNumber", "xiangl2.infosystem.output.Result");
    jcasType.ll_cas.ll_setIntValue(addr, ((Result_Type)jcasType).casFeatCode_answerNumber, v);}    
   
    
  //*--------------*
  //* Feature: correctNumber

  /** getter for correctNumber - gets Number of correct answers given by the system.
   * @generated */
  public int getCorrectNumber() {
    if (Result_Type.featOkTst && ((Result_Type)jcasType).casFeat_correctNumber == null)
      jcasType.jcas.throwFeatMissing("correctNumber", "xiangl2.infosystem.output.Result");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Result_Type)jcasType).casFeatCode_correctNumber);}
    
  /** setter for correctNumber - sets Number of correct answers given by the system. 
   * @generated */
  public void setCorrectNumber(int v) {
    if (Result_Type.featOkTst && ((Result_Type)jcasType).casFeat_correctNumber == null)
      jcasType.jcas.throwFeatMissing("correctNumber", "xiangl2.infosystem.output.Result");
    jcasType.ll_cas.ll_setIntValue(addr, ((Result_Type)jcasType).casFeatCode_correctNumber, v);}    
   
    
  //*--------------*
  //* Feature: precision

  /** getter for precision - gets The precision of the result, which is calculated by fomula correctNumber/answerNumber.
   * @generated */
  public double getPrecision() {
    if (Result_Type.featOkTst && ((Result_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "xiangl2.infosystem.output.Result");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Result_Type)jcasType).casFeatCode_precision);}
    
  /** setter for precision - sets The precision of the result, which is calculated by fomula correctNumber/answerNumber. 
   * @generated */
  public void setPrecision(double v) {
    if (Result_Type.featOkTst && ((Result_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "xiangl2.infosystem.output.Result");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Result_Type)jcasType).casFeatCode_precision, v);}    
  }

    