

/* First created by JCasGen Tue Sep 10 23:33:49 EDT 2013 */
package xiangl2.infosystem.content;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** This class defines basic features and methods for an N-gram sequance annotation. It contains a feature tokenNumber which shows number of tokens in this sequence.
 * Updated by JCasGen Tue Sep 10 23:33:49 EDT 2013
 * XML source: E:/git/hw1_xiangl2/hw1-xiangl2/src/main/resources/hw1-xiangl2-typesystem.xml
 * @generated */
public class Ngram extends Token {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Ngram.class);
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
  protected Ngram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Ngram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Ngram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Ngram(JCas jcas, int begin, int end) {
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
  //* Feature: tokenNumber

  /** getter for tokenNumber - gets Number of tokens in this N-gram sequence.
   * @generated */
  public int getTokenNumber() {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_tokenNumber == null)
      jcasType.jcas.throwFeatMissing("tokenNumber", "xiangl2.infosystem.content.Ngram");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Ngram_Type)jcasType).casFeatCode_tokenNumber);}
    
  /** setter for tokenNumber - sets Number of tokens in this N-gram sequence. 
   * @generated */
  public void setTokenNumber(int v) {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_tokenNumber == null)
      jcasType.jcas.throwFeatMissing("tokenNumber", "xiangl2.infosystem.content.Ngram");
    jcasType.ll_cas.ll_setIntValue(addr, ((Ngram_Type)jcasType).casFeatCode_tokenNumber, v);}    
  }

    