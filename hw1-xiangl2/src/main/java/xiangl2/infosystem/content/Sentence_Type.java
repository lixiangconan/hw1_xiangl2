
/* First created by JCasGen Sun Sep 08 22:59:03 EDT 2013 */
package xiangl2.infosystem.content;

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

/** This class stores the annotation of a sentence in the input file. It contains features which shows the tokens and N-grams in this sentence.
 * Updated by JCasGen Sun Sep 08 22:59:03 EDT 2013
 * @generated */
public class Sentence_Type extends TextAnnotationBase_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Sentence_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Sentence_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Sentence(addr, Sentence_Type.this);
  			   Sentence_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Sentence(addr, Sentence_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Sentence.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("xiangl2.infosystem.content.Sentence");
 
  /** @generated */
  final Feature casFeat_tokenArray;
  /** @generated */
  final int     casFeatCode_tokenArray;
  /** @generated */ 
  public int getTokenArray(int addr) {
        if (featOkTst && casFeat_tokenArray == null)
      jcas.throwFeatMissing("tokenArray", "xiangl2.infosystem.content.Sentence");
    return ll_cas.ll_getRefValue(addr, casFeatCode_tokenArray);
  }
  /** @generated */    
  public void setTokenArray(int addr, int v) {
        if (featOkTst && casFeat_tokenArray == null)
      jcas.throwFeatMissing("tokenArray", "xiangl2.infosystem.content.Sentence");
    ll_cas.ll_setRefValue(addr, casFeatCode_tokenArray, v);}
    
   /** @generated */
  public int getTokenArray(int addr, int i) {
        if (featOkTst && casFeat_tokenArray == null)
      jcas.throwFeatMissing("tokenArray", "xiangl2.infosystem.content.Sentence");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokenArray), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_tokenArray), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokenArray), i);
  }
   
  /** @generated */ 
  public void setTokenArray(int addr, int i, int v) {
        if (featOkTst && casFeat_tokenArray == null)
      jcas.throwFeatMissing("tokenArray", "xiangl2.infosystem.content.Sentence");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokenArray), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_tokenArray), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokenArray), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_gram1Array;
  /** @generated */
  final int     casFeatCode_gram1Array;
  /** @generated */ 
  public int getGram1Array(int addr) {
        if (featOkTst && casFeat_gram1Array == null)
      jcas.throwFeatMissing("gram1Array", "xiangl2.infosystem.content.Sentence");
    return ll_cas.ll_getRefValue(addr, casFeatCode_gram1Array);
  }
  /** @generated */    
  public void setGram1Array(int addr, int v) {
        if (featOkTst && casFeat_gram1Array == null)
      jcas.throwFeatMissing("gram1Array", "xiangl2.infosystem.content.Sentence");
    ll_cas.ll_setRefValue(addr, casFeatCode_gram1Array, v);}
    
   /** @generated */
  public int getGram1Array(int addr, int i) {
        if (featOkTst && casFeat_gram1Array == null)
      jcas.throwFeatMissing("gram1Array", "xiangl2.infosystem.content.Sentence");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_gram1Array), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_gram1Array), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_gram1Array), i);
  }
   
  /** @generated */ 
  public void setGram1Array(int addr, int i, int v) {
        if (featOkTst && casFeat_gram1Array == null)
      jcas.throwFeatMissing("gram1Array", "xiangl2.infosystem.content.Sentence");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_gram1Array), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_gram1Array), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_gram1Array), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_gram2Array;
  /** @generated */
  final int     casFeatCode_gram2Array;
  /** @generated */ 
  public int getGram2Array(int addr) {
        if (featOkTst && casFeat_gram2Array == null)
      jcas.throwFeatMissing("gram2Array", "xiangl2.infosystem.content.Sentence");
    return ll_cas.ll_getRefValue(addr, casFeatCode_gram2Array);
  }
  /** @generated */    
  public void setGram2Array(int addr, int v) {
        if (featOkTst && casFeat_gram2Array == null)
      jcas.throwFeatMissing("gram2Array", "xiangl2.infosystem.content.Sentence");
    ll_cas.ll_setRefValue(addr, casFeatCode_gram2Array, v);}
    
   /** @generated */
  public int getGram2Array(int addr, int i) {
        if (featOkTst && casFeat_gram2Array == null)
      jcas.throwFeatMissing("gram2Array", "xiangl2.infosystem.content.Sentence");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_gram2Array), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_gram2Array), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_gram2Array), i);
  }
   
  /** @generated */ 
  public void setGram2Array(int addr, int i, int v) {
        if (featOkTst && casFeat_gram2Array == null)
      jcas.throwFeatMissing("gram2Array", "xiangl2.infosystem.content.Sentence");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_gram2Array), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_gram2Array), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_gram2Array), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_gram3Array;
  /** @generated */
  final int     casFeatCode_gram3Array;
  /** @generated */ 
  public int getGram3Array(int addr) {
        if (featOkTst && casFeat_gram3Array == null)
      jcas.throwFeatMissing("gram3Array", "xiangl2.infosystem.content.Sentence");
    return ll_cas.ll_getRefValue(addr, casFeatCode_gram3Array);
  }
  /** @generated */    
  public void setGram3Array(int addr, int v) {
        if (featOkTst && casFeat_gram3Array == null)
      jcas.throwFeatMissing("gram3Array", "xiangl2.infosystem.content.Sentence");
    ll_cas.ll_setRefValue(addr, casFeatCode_gram3Array, v);}
    
   /** @generated */
  public int getGram3Array(int addr, int i) {
        if (featOkTst && casFeat_gram3Array == null)
      jcas.throwFeatMissing("gram3Array", "xiangl2.infosystem.content.Sentence");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_gram3Array), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_gram3Array), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_gram3Array), i);
  }
   
  /** @generated */ 
  public void setGram3Array(int addr, int i, int v) {
        if (featOkTst && casFeat_gram3Array == null)
      jcas.throwFeatMissing("gram3Array", "xiangl2.infosystem.content.Sentence");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_gram3Array), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_gram3Array), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_gram3Array), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Sentence_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_tokenArray = jcas.getRequiredFeatureDE(casType, "tokenArray", "uima.cas.FSArray", featOkTst);
    casFeatCode_tokenArray  = (null == casFeat_tokenArray) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tokenArray).getCode();

 
    casFeat_gram1Array = jcas.getRequiredFeatureDE(casType, "gram1Array", "uima.cas.FSArray", featOkTst);
    casFeatCode_gram1Array  = (null == casFeat_gram1Array) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_gram1Array).getCode();

 
    casFeat_gram2Array = jcas.getRequiredFeatureDE(casType, "gram2Array", "uima.cas.FSArray", featOkTst);
    casFeatCode_gram2Array  = (null == casFeat_gram2Array) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_gram2Array).getCode();

 
    casFeat_gram3Array = jcas.getRequiredFeatureDE(casType, "gram3Array", "uima.cas.FSArray", featOkTst);
    casFeatCode_gram3Array  = (null == casFeat_gram3Array) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_gram3Array).getCode();

  }
}



    