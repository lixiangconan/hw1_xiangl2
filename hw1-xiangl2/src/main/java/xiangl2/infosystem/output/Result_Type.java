
/* First created by JCasGen Wed Sep 11 20:37:41 EDT 2013 */
package xiangl2.infosystem.output;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import xiangl2.infosystem.basic.TextAnnotationBase_Type;

/** This type is used to store the answers given by the system and a precision which measures the performance of the system.
 * Updated by JCasGen Wed Sep 11 20:37:41 EDT 2013
 * @generated */
public class Result_Type extends TextAnnotationBase_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Result_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Result_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Result(addr, Result_Type.this);
  			   Result_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Result(addr, Result_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Result.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("xiangl2.infosystem.output.Result");
 
  /** @generated */
  final Feature casFeat_answer;
  /** @generated */
  final int     casFeatCode_answer;
  /** @generated */ 
  public int getAnswer(int addr) {
        if (featOkTst && casFeat_answer == null)
      jcas.throwFeatMissing("answer", "xiangl2.infosystem.output.Result");
    return ll_cas.ll_getRefValue(addr, casFeatCode_answer);
  }
  /** @generated */    
  public void setAnswer(int addr, int v) {
        if (featOkTst && casFeat_answer == null)
      jcas.throwFeatMissing("answer", "xiangl2.infosystem.output.Result");
    ll_cas.ll_setRefValue(addr, casFeatCode_answer, v);}
    
   /** @generated */
  public int getAnswer(int addr, int i) {
        if (featOkTst && casFeat_answer == null)
      jcas.throwFeatMissing("answer", "xiangl2.infosystem.output.Result");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answer), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_answer), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answer), i);
  }
   
  /** @generated */ 
  public void setAnswer(int addr, int i, int v) {
        if (featOkTst && casFeat_answer == null)
      jcas.throwFeatMissing("answer", "xiangl2.infosystem.output.Result");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answer), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_answer), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answer), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_answerNumber;
  /** @generated */
  final int     casFeatCode_answerNumber;
  /** @generated */ 
  public int getAnswerNumber(int addr) {
        if (featOkTst && casFeat_answerNumber == null)
      jcas.throwFeatMissing("answerNumber", "xiangl2.infosystem.output.Result");
    return ll_cas.ll_getIntValue(addr, casFeatCode_answerNumber);
  }
  /** @generated */    
  public void setAnswerNumber(int addr, int v) {
        if (featOkTst && casFeat_answerNumber == null)
      jcas.throwFeatMissing("answerNumber", "xiangl2.infosystem.output.Result");
    ll_cas.ll_setIntValue(addr, casFeatCode_answerNumber, v);}
    
  
 
  /** @generated */
  final Feature casFeat_correctNumber;
  /** @generated */
  final int     casFeatCode_correctNumber;
  /** @generated */ 
  public int getCorrectNumber(int addr) {
        if (featOkTst && casFeat_correctNumber == null)
      jcas.throwFeatMissing("correctNumber", "xiangl2.infosystem.output.Result");
    return ll_cas.ll_getIntValue(addr, casFeatCode_correctNumber);
  }
  /** @generated */    
  public void setCorrectNumber(int addr, int v) {
        if (featOkTst && casFeat_correctNumber == null)
      jcas.throwFeatMissing("correctNumber", "xiangl2.infosystem.output.Result");
    ll_cas.ll_setIntValue(addr, casFeatCode_correctNumber, v);}
    
  
 
  /** @generated */
  final Feature casFeat_precision;
  /** @generated */
  final int     casFeatCode_precision;
  /** @generated */ 
  public double getPrecision(int addr) {
        if (featOkTst && casFeat_precision == null)
      jcas.throwFeatMissing("precision", "xiangl2.infosystem.output.Result");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_precision);
  }
  /** @generated */    
  public void setPrecision(int addr, double v) {
        if (featOkTst && casFeat_precision == null)
      jcas.throwFeatMissing("precision", "xiangl2.infosystem.output.Result");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_precision, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Result_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_answer = jcas.getRequiredFeatureDE(casType, "answer", "uima.cas.FSArray", featOkTst);
    casFeatCode_answer  = (null == casFeat_answer) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_answer).getCode();

 
    casFeat_answerNumber = jcas.getRequiredFeatureDE(casType, "answerNumber", "uima.cas.Integer", featOkTst);
    casFeatCode_answerNumber  = (null == casFeat_answerNumber) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_answerNumber).getCode();

 
    casFeat_correctNumber = jcas.getRequiredFeatureDE(casType, "correctNumber", "uima.cas.Integer", featOkTst);
    casFeatCode_correctNumber  = (null == casFeat_correctNumber) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_correctNumber).getCode();

 
    casFeat_precision = jcas.getRequiredFeatureDE(casType, "precision", "uima.cas.Double", featOkTst);
    casFeatCode_precision  = (null == casFeat_precision) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_precision).getCode();

  }
}



    