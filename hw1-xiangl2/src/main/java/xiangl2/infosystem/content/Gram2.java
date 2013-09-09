

/* First created by JCasGen Sun Sep 08 22:59:02 EDT 2013 */
package xiangl2.infosystem.content;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** This class stores an 2-gram sequence in the input file. It contains features which indicate the two tokens in this sequence.
 * Updated by JCasGen Sun Sep 08 22:59:02 EDT 2013
 * XML source: E:/git/hw1_xiangl2/hw1-xiangl2/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class Gram2 extends Ngram {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Gram2.class);
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
  protected Gram2() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Gram2(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Gram2(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Gram2(JCas jcas, int begin, int end) {
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

  /** getter for token1 - gets The first token in this 2-gram sequence.
   * @generated */
  public Token getToken1() {
    if (Gram2_Type.featOkTst && ((Gram2_Type)jcasType).casFeat_token1 == null)
      jcasType.jcas.throwFeatMissing("token1", "xiangl2.infosystem.content.Gram2");
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Gram2_Type)jcasType).casFeatCode_token1)));}
    
  /** setter for token1 - sets The first token in this 2-gram sequence. 
   * @generated */
  public void setToken1(Token v) {
    if (Gram2_Type.featOkTst && ((Gram2_Type)jcasType).casFeat_token1 == null)
      jcasType.jcas.throwFeatMissing("token1", "xiangl2.infosystem.content.Gram2");
    jcasType.ll_cas.ll_setRefValue(addr, ((Gram2_Type)jcasType).casFeatCode_token1, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: token2

  /** getter for token2 - gets The second token in this 2-gram sequence.
   * @generated */
  public Token getToken2() {
    if (Gram2_Type.featOkTst && ((Gram2_Type)jcasType).casFeat_token2 == null)
      jcasType.jcas.throwFeatMissing("token2", "xiangl2.infosystem.content.Gram2");
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Gram2_Type)jcasType).casFeatCode_token2)));}
    
  /** setter for token2 - sets The second token in this 2-gram sequence. 
   * @generated */
  public void setToken2(Token v) {
    if (Gram2_Type.featOkTst && ((Gram2_Type)jcasType).casFeat_token2 == null)
      jcasType.jcas.throwFeatMissing("token2", "xiangl2.infosystem.content.Gram2");
    jcasType.ll_cas.ll_setRefValue(addr, ((Gram2_Type)jcasType).casFeatCode_token2, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    