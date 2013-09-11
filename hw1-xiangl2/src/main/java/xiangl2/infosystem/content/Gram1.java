

/* First created by JCasGen Tue Sep 10 23:33:49 EDT 2013 */
package xiangl2.infosystem.content;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** This class stores an 1-gram sequence in the input file. It contains a feature which indicates the only token in this sequence.
 * Updated by JCasGen Tue Sep 10 23:33:49 EDT 2013
 * XML source: E:/git/hw1_xiangl2/hw1-xiangl2/src/main/resources/hw1-xiangl2-typesystem.xml
 * @generated */
public class Gram1 extends Ngram {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Gram1.class);
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
  protected Gram1() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Gram1(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Gram1(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Gram1(JCas jcas, int begin, int end) {
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

  /** getter for token1 - gets The token in this 1-gram sequence.
   * @generated */
  public Token getToken1() {
    if (Gram1_Type.featOkTst && ((Gram1_Type)jcasType).casFeat_token1 == null)
      jcasType.jcas.throwFeatMissing("token1", "xiangl2.infosystem.content.Gram1");
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Gram1_Type)jcasType).casFeatCode_token1)));}
    
  /** setter for token1 - sets The token in this 1-gram sequence. 
   * @generated */
  public void setToken1(Token v) {
    if (Gram1_Type.featOkTst && ((Gram1_Type)jcasType).casFeat_token1 == null)
      jcasType.jcas.throwFeatMissing("token1", "xiangl2.infosystem.content.Gram1");
    jcasType.ll_cas.ll_setRefValue(addr, ((Gram1_Type)jcasType).casFeatCode_token1, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    