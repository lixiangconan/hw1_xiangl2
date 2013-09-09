

/* First created by JCasGen Sun Sep 08 22:59:02 EDT 2013 */
package xiangl2.infosystem.basic;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Base type for text annotation. It contains a feature source which shows where this annotation was orriginally made by, and a feature confidence which indicates how confidence it was.
 * Updated by JCasGen Sun Sep 08 22:59:02 EDT 2013
 * XML source: E:/git/hw1_xiangl2/hw1-xiangl2/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class TextAnnotationBase extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TextAnnotationBase.class);
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
  protected TextAnnotationBase() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public TextAnnotationBase(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public TextAnnotationBase(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public TextAnnotationBase(JCas jcas, int begin, int end) {
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
  //* Feature: source

  /** getter for source - gets Name of the annotator which orriginally made this annotation.
   * @generated */
  public String getSource() {
    if (TextAnnotationBase_Type.featOkTst && ((TextAnnotationBase_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "xiangl2.infosystem.basic.TextAnnotationBase");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TextAnnotationBase_Type)jcasType).casFeatCode_source);}
    
  /** setter for source - sets Name of the annotator which orriginally made this annotation. 
   * @generated */
  public void setSource(String v) {
    if (TextAnnotationBase_Type.featOkTst && ((TextAnnotationBase_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "xiangl2.infosystem.basic.TextAnnotationBase");
    jcasType.ll_cas.ll_setStringValue(addr, ((TextAnnotationBase_Type)jcasType).casFeatCode_source, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets Confidence of this annotation.
   * @generated */
  public double getConfidence() {
    if (TextAnnotationBase_Type.featOkTst && ((TextAnnotationBase_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "xiangl2.infosystem.basic.TextAnnotationBase");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((TextAnnotationBase_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets Confidence of this annotation. 
   * @generated */
  public void setConfidence(double v) {
    if (TextAnnotationBase_Type.featOkTst && ((TextAnnotationBase_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "xiangl2.infosystem.basic.TextAnnotationBase");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((TextAnnotationBase_Type)jcasType).casFeatCode_confidence, v);}    
  }

    