package com.gittamonk.gpdw.utils.configuration

import com.typesafe.config.ConfigFactory
import scala.reflect.runtime.universe.runtimeMirror

trait Config {

  //Info reflection will save reading long namespace configuration
  //(for eg BaseConf, reads 'com.gittamonk.gpdw.gai.configuration.BaseConf' from reference.conf by using just short key

  private  lazy val configPath = runtimeMirror(getClass.getClassLoader).classSymbol(this.getClass).fullName
  protected lazy val config = ConfigFactory.load().getConfig(configPath)

  }

