package com.gittamonk.gpdw.utils.log

import org.apache.log4j.LogManager
trait Logging {

  @transient protected val logger = LogManager.getLogger(getClass.getName)


}
