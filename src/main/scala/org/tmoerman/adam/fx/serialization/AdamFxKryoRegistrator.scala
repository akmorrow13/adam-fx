package org.tmoerman.adam.fx.serialization

import com.esotericsoftware.kryo.Kryo
import org.bdgenomics.adam.serialization.{ADAMKryoRegistrator, AvroSerializer}
import org.tmoerman.adam.fx.avro._

/**
 * @author Thomas Moerman
 */
class AdamFxKryoRegistrator extends ADAMKryoRegistrator {

  override def registerClasses(kryo: Kryo): Unit = {
    super.registerClasses(kryo)

    kryo.register(classOf[SnpEffAnnotations],    new AvroSerializer[SnpEffAnnotations]())
    kryo.register(classOf[FunctionalAnnotation], new AvroSerializer[FunctionalAnnotation]())
    kryo.register(classOf[EffectPrediction],     new AvroSerializer[EffectPrediction]())
  }

}