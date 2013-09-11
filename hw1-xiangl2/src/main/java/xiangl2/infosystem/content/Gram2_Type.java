
/* First created by JCasGen Tue Sep 10 23:33:49 EDT 2013 */
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

/** This class stores an 2-gram sequence in the input file. It contains features which indicate the two tokens in this sequence.
 * Updated by JCasGen Tue Sep 10 23:33:49 EDT 2013
 * @generated */
public class Gram2_Type extends Ngram_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Gram2_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Gram2_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Gram2(addr, Gram2_Type.this);
  			   Gram2_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Gram2(addr, Gram2_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Gram2.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("xiangl2.infosystem.content.Gram2");
 
  /** @generated */
  final Feature casFeat_token1;
  /** @generated */
  final int     casFeatCode_token1;
  /** @generated */ 
  public int getToken1(int addr) {
        if (featOkTst && casFeat_token1 == null)
      jcas.throwFeatMissing("token1", "xiangl2.infosystem.content.Gram2");
    return ll_cas.ll_getRefValue(addr, casFeatCode_token1);
  }
  /** @generated */    
  public void setToken1(int addr, int v) {
        if (featOkTst && casFeat_token1 == null)
      jcas.throwFeatMissing("token1", "xiangl2.infosystem.content.Gram2");
    ll_cas.ll_setRefValue(addr, casFeatCode_token1, v);}
    
  
 
  /** @generated */
  final Feature casFeat_token2;
  /** @generated */
  final int     casFeatCode_token2;
  /** @generated */ 
  public int getToken2(int addr) {
        if (featOkTst && casFeat_token2 == null)
      jcas.throwFeatMissing("token2", "xiangl2.infosystem.content.Gram2");
    return ll_cas.ll_getRefValue(addr, casFeatCode_token2);
  }
  /** @generated */    
  public void setToken2(int addr, int v) {
        if (featOkTst && casFeat_token2 == null)
      jcas.throwFeatMissing("token2", "xiangl2.infosystem.content.Gram2");
    ll_cas.ll_setRefValue(addr, casFeatCode_token2, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Gram2_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_token1 = jcas.getRequiredFeatureDE(casType, "token1", "xiangl2.infosystem.content.Token", featOkTst);
    casFeatCode_token1  = (null == casFeat_token1) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_token1).getCode();

 
    casFeat_token2 = jcas.getRequiredFeatureDE(casType, "token2", "xiangl2.infosystem.content.Token", featOkTst);
    casFeatCode_token2  = (null == casFeat_token2) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_token2).getCode();

  }
}



    