package org.codeoverflow.chatoverflow.api

import java.util.Optional

import org.codeoverflow.chatoverflow.api.io.Serializable
import org.codeoverflow.chatoverflow.api.io.parameter.Parameter
import org.codeoverflow.chatoverflow.api.plugin.configuration.Requirement

import _root_.scala.jdk.CollectionConverters._
import _root_.scala.jdk.OptionConverters._

package object scala {
  // Params/Requirements -> Value
  implicit def param2Value[T](p: Parameter[T]): T = p.get()
  implicit def requirement2Value[T <: Serializable](req: Requirement[T]): T = req.get()

  // Scala Collections <-> Java Collections
  implicit def listJava2Scala[T](l: java.util.List[T]): List[T] = l.asScala.toList
  implicit def listScala2Java[T](l: List[T]): java.util.List[T] = l.asJava

  implicit def mapJava2Scala[K, V](map: java.util.Map[K, V]): Map[K, V] = map.asScala.toMap
  implicit def mapScala2Java[K, V](map: Map[K, V]): java.util.Map[K, V] = map.asJava

  implicit def optionJava2Scala[T](opt: Optional[T]): Option[T] = opt.toScala
  implicit def optionScala2Java[T](opt: Option[T]): Optional[T] = opt.toJava
}
