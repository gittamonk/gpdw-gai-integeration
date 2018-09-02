package com.gittamonk.gpdw.utils.configuration

import scala.collection.JavaConversions._
import com.typesafe.config.{ConfigValue,ConfigObject}

 object ConfigHelper extends Config {


def convertConfigToMap[T] (xs:ConfigObject) :Map[String, T ] = xs.map { case (key,value) => (key,value.unwrapped().asInstanceOf[T])}.toMap









}
