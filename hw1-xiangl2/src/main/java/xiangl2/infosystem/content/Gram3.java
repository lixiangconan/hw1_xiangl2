

/* First created by JCasGen Wed Sep 11 20:37:41 EDT 2013 */
package xiangl2.infosystem.content;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** This type is used to store an 3-gram sequence in the input file. It contains features which indicate the three tokens in this sequence.
 * Updated by JCasGen Wed Sep 11 20:37:41 EDT 2013
 * XML source: E:/git/hw1_xiangl2/hw1-xiangl2/src/main/resources/hw1-xiangl2-typesystem.xml
 * @generated */
public class Gram3 extends Ngram {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Gram3.class);
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
  protected Gram3() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Gram3(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Gram3(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Gram3(JCas jcas, int begin, int end) {
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
  //* Feature: token1

  /** getter for token1 - gets the first token in this 3-gram sequence.
   * @generated */
  public Token getToken1() {
    if (Gram3_Type.featOkTst && ((Gram3_Type)jcasType).casFeat_token1 == null)
      jcasType.jcas.throwFeatMissing("token1", "xiangl2.infosystem.content.Gram3");
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Gram3_Type)jcasType).casFeatCode_token1)));}
    
  /** setter for token1 - sets the first token in this 3-gram sequence. 
   * @generated */
  public void setToken1(Token v) {
    if (Gram3_Type.featOkTst && ((Gram3_Type)jcasType).casFeat_token1 == null)
      jcasType.jcas.throwFeatMissing("token1", "xiangl2.infosystem.content.Gram3");
    jcasType.ll_cas.ll_setRefValue(addr, ((Gram3_Type)jcasType).casFeatCode_token1, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: token2

  /** getter for token2 - gets the second token in this 3-gram sequence.
   * @generated */
  public Token getToken2() {
    if (Gram3_Type.featOkTst && ((Gram3_Type)jcasType).casFeat_token2 == null)
      jcasType.jcas.throwFeatMissing("token2", "xiangl2.infosystem.content.Gram3");
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Gram3_Type)jcasType).casFeatCode_token2)));}
    
  /** setter for token2 - sets the second token in this 3-gram sequence. 
   * @generated */
  public void setToken2(Token v) {
    if (Gram3_Type.featOkTst && ((Gram3_Type)jcasType).casFeat_token2 == null)
      jcasType.jcas.throwFeatMissing("token2", "xiangl2.infosystem.content.Gram3");
    jcasType.ll_cas.ll_setRefValue(addr, ((Gram3_Type)jcasType).casFeatCode_token2, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: token3

  /** getter for token3 - gets the third token in this 3-gram sequence.
   * @generated */
  public Token getToken3() {
    if (Gram3_Type.featOkTst && ((Gram3_Type)jcasType).casFeat_token3 == null)
      jcasType.jcas.throwFeatMissing("token3", "xiangl2.infosystem.content.Gram3");
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Gram3_Type)jcasType).casFeatCode_token3)));}
    
  /** setter for token3 - sets the third token in this 3-gram sequence. 
   * @generated */
  public void setToken3(Token v) {
    if (Gram3_Type.featOkTst && ((Gram3_Type)jcasType).casFeat_token3 == null)
      jcasType.jcas.throwFeatMissing("token3", "xiangl2.infosystem.content.Gram3");
    jcasType.ll_cas.ll_setRefValue(addr, ((Gram3_Type)jcasType).casFeatCode_token3, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    