

/* First created by JCasGen Wed Sep 11 20:37:41 EDT 2013 */
package xiangl2.infosystem.input;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import xiangl2.infosystem.basic.TextAnnotationBase;
import xiangl2.infosystem.content.Sentence;


/** This type is used to store the annotation of the question in the input file. It contains a feature content which annotates the question sentence.
 * Updated by JCasGen Wed Sep 11 20:37:41 EDT 2013
 * XML source: E:/git/hw1_xiangl2/hw1-xiangl2/src/main/resources/hw1-xiangl2-typesystem.xml
 * @generated */
public class Question extends TextAnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Question.class);
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
  protected Question() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Question(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Question(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Question(JCas jcas, int begin, int end) {
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
  //* Feature: content

  /** getter for content - gets the content of this question.
   * @generated */
  public Sentence getContent() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "xiangl2.infosystem.input.Question");
    return (Sentence)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_content)));}
    
  /** setter for content - sets the content of this question. 
   * @generated */
  public void setContent(Sentence v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "xiangl2.infosystem.input.Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_content, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    