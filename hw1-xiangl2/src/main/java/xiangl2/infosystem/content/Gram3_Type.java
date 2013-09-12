
/* First created by JCasGen Wed Sep 11 20:37:41 EDT 2013 */
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

/** This type is used to store an 3-gram sequence in the input file. It contains features which indicate the three tokens in this sequence.
 * Updated by JCasGen Wed Sep 11 20:37:41 EDT 2013
 * @generated */
public class Gram3_Type extends Ngram_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Gram3_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Gram3_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Gram3(addr, Gram3_Type.this);
  			   Gram3_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Gram3(addr, Gram3_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Gram3.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("xiangl2.infosystem.content.Gram3");
 
  /** @generated */
  final Feature casFeat_token1;
  /** @generated */
  final int     casFeatCode_token1;
  /** @generated */ 
  public int getToken1(int addr) {
        if (featOkTst && casFeat_token1 == null)
      jcas.throwFeatMissing("token1", "xiangl2.infosystem.content.Gram3");
    return ll_cas.ll_getRefValue(addr, casFeatCode_token1);
  }
  /** @generated */    
  public void setToken1(int addr, int v) {
        if (featOkTst && casFeat_token1 == null)
      jcas.throwFeatMissing("token1", "xiangl2.infosystem.content.Gram3");
    ll_cas.ll_setRefValue(addr, casFeatCode_token1, v);}
    
  
 
  /** @generated */
  final Feature casFeat_token2;
  /** @generated */
  final int     casFeatCode_token2;
  /** @generated */ 
  public int getToken2(int addr) {
        if (featOkTst && casFeat_token2 == null)
      jcas.throwFeatMissing("token2", "xiangl2.infosystem.content.Gram3");
    return ll_cas.ll_getRefValue(addr, casFeatCode_token2);
  }
  /** @generated */    
  public void setToken2(int addr, int v) {
        if (featOkTst && casFeat_token2 == null)
      jcas.throwFeatMissing("token2", "xiangl2.infosystem.content.Gram3");
    ll_cas.ll_setRefValue(addr, casFeatCode_token2, v);}
    
  
 
  /** @generated */
  final Feature casFeat_token3;
  /** @generated */
  final int     casFeatCode_token3;
  /** @generated */ 
  public int getToken3(int addr) {
        if (featOkTst && casFeat_token3 == null)
      jcas.throwFeatMissing("token3", "xiangl2.infosystem.content.Gram3");
    return ll_cas.ll_getRefValue(addr, casFeatCode_token3);
  }
  /** @generated */    
  public void setToken3(int addr, int v) {
        if (featOkTst && casFeat_token3 == null)
      jcas.throwFeatMissing("token3", "xiangl2.infosystem.content.Gram3");
    ll_cas.ll_setRefValue(addr, casFeatCode_token3, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Gram3_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_token1 = jcas.getRequiredFeatureDE(casType, "token1", "xiangl2.infosystem.content.Token", featOkTst);
    casFeatCode_token1  = (null == casFeat_token1) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_token1).getCode();

 
    casFeat_token2 = jcas.getRequiredFeatureDE(casType, "token2", "xiangl2.infosystem.content.Token", featOkTst);
    casFeatCode_token2  = (null == casFeat_token2) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_token2).getCode();

 
    casFeat_token3 = jcas.getRequiredFeatureDE(casType, "token3", "xiangl2.infosystem.content.Token", featOkTst);
    casFeatCode_token3  = (null == casFeat_token3) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_token3).getCode();

  }
}



    