

/* First created by JCasGen Tue Sep 10 23:33:49 EDT 2013 */
package xiangl2.infosystem.content;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import xiangl2.infosystem.basic.TextAnnotationBase;


/** This class stores the annotation of a sentence in the input file. It contains features which shows the tokens and N-grams in this sentence.
 * Updated by JCasGen Tue Sep 10 23:33:49 EDT 2013
 * XML source: E:/git/hw1_xiangl2/hw1-xiangl2/src/main/resources/hw1-xiangl2-typesystem.xml
 * @generated */
public class Sentence extends TextAnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Sentence.class);
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
  protected Sentence() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Sentence(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Sentence(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Sentence(JCas jcas, int begin, int end) {
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
  //* Feature: tokenArray

  /** getter for tokenArray - gets Array of tokens in this sentence.
   * @generated */
  public FSArray getTokenArray() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_tokenArray == null)
      jcasType.jcas.throwFeatMissing("tokenArray", "xiangl2.infosystem.content.Sentence");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_tokenArray)));}
    
  /** setter for tokenArray - sets Array of tokens in this sentence. 
   * @generated */
  public void setTokenArray(FSArray v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_tokenArray == null)
      jcasType.jcas.throwFeatMissing("tokenArray", "xiangl2.infosystem.content.Sentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_tokenArray, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for tokenArray - gets an indexed value - Array of tokens in this sentence.
   * @generated */
  public Token getTokenArray(int i) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_tokenArray == null)
      jcasType.jcas.throwFeatMissing("tokenArray", "xiangl2.infosystem.content.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_tokenArray), i);
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_tokenArray), i)));}

  /** indexed setter for tokenArray - sets an indexed value - Array of tokens in this sentence.
   * @generated */
  public void setTokenArray(int i, Token v) { 
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_tokenArray == null)
      jcasType.jcas.throwFeatMissing("tokenArray", "xiangl2.infosystem.content.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_tokenArray), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_tokenArray), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: gram1Array

  /** getter for gram1Array - gets Array of 1-grams in this sentence.
   * @generated */
  public FSArray getGram1Array() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_gram1Array == null)
      jcasType.jcas.throwFeatMissing("gram1Array", "xiangl2.infosystem.content.Sentence");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_gram1Array)));}
    
  /** setter for gram1Array - sets Array of 1-grams in this sentence. 
   * @generated */
  public void setGram1Array(FSArray v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_gram1Array == null)
      jcasType.jcas.throwFeatMissing("gram1Array", "xiangl2.infosystem.content.Sentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_gram1Array, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for gram1Array - gets an indexed value - Array of 1-grams in this sentence.
   * @generated */
  public Gram1 getGram1Array(int i) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_gram1Array == null)
      jcasType.jcas.throwFeatMissing("gram1Array", "xiangl2.infosystem.content.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_gram1Array), i);
    return (Gram1)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_gram1Array), i)));}

  /** indexed setter for gram1Array - sets an indexed value - Array of 1-grams in this sentence.
   * @generated */
  public void setGram1Array(int i, Gram1 v) { 
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_gram1Array == null)
      jcasType.jcas.throwFeatMissing("gram1Array", "xiangl2.infosystem.content.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_gram1Array), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_gram1Array), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: gram2Array

  /** getter for gram2Array - gets Array of 2-grams in this sentence.
   * @generated */
  public FSArray getGram2Array() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_gram2Array == null)
      jcasType.jcas.throwFeatMissing("gram2Array", "xiangl2.infosystem.content.Sentence");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_gram2Array)));}
    
  /** setter for gram2Array - sets Array of 2-grams in this sentence. 
   * @generated */
  public void setGram2Array(FSArray v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_gram2Array == null)
      jcasType.jcas.throwFeatMissing("gram2Array", "xiangl2.infosystem.content.Sentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_gram2Array, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for gram2Array - gets an indexed value - Array of 2-grams in this sentence.
   * @generated */
  public Gram2 getGram2Array(int i) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_gram2Array == null)
      jcasType.jcas.throwFeatMissing("gram2Array", "xiangl2.infosystem.content.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_gram2Array), i);
    return (Gram2)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_gram2Array), i)));}

  /** indexed setter for gram2Array - sets an indexed value - Array of 2-grams in this sentence.
   * @generated */
  public void setGram2Array(int i, Gram2 v) { 
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_gram2Array == null)
      jcasType.jcas.throwFeatMissing("gram2Array", "xiangl2.infosystem.content.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_gram2Array), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_gram2Array), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: gram3Array

  /** getter for gram3Array - gets Array of 3-grams in this sentence.
   * @generated */
  public FSArray getGram3Array() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_gram3Array == null)
      jcasType.jcas.throwFeatMissing("gram3Array", "xiangl2.infosystem.content.Sentence");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_gram3Array)));}
    
  /** setter for gram3Array - sets Array of 3-grams in this sentence. 
   * @generated */
  public void setGram3Array(FSArray v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_gram3Array == null)
      jcasType.jcas.throwFeatMissing("gram3Array", "xiangl2.infosystem.content.Sentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_gram3Array, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for gram3Array - gets an indexed value - Array of 3-grams in this sentence.
   * @generated */
  public Gram3 getGram3Array(int i) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_gram3Array == null)
      jcasType.jcas.throwFeatMissing("gram3Array", "xiangl2.infosystem.content.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_gram3Array), i);
    return (Gram3)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_gram3Array), i)));}

  /** indexed setter for gram3Array - sets an indexed value - Array of 3-grams in this sentence.
   * @generated */
  public void setGram3Array(int i, Gram3 v) { 
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_gram3Array == null)
      jcasType.jcas.throwFeatMissing("gram3Array", "xiangl2.infosystem.content.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_gram3Array), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_gram3Array), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    