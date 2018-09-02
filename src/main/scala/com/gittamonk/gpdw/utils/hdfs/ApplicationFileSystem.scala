package com.gittamonk.gpdw.utils.hdfs

import org.apache.hadoop.conf.Configuration
import org.apache.hadoop.fs.{FileSystem, Path}

object ApplicationFileSystem {

  private def fileSystem: FileSystem = {
    val x = new Configuration()

    FileSystem.get(x)
  }

  def deleteFileIfExists(filePath:String) = {
    val fs = fileSystem
    val path = new Path(filePath)

    if (fs.exists(path))  {
      fs.delete(path,true)
    }
  }

  def exists(path:String):Boolean = fileSystem.exists(new Path(path))

  def listFile

}
