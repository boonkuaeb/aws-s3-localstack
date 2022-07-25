/*
 * Copyright (c) 2021. Dandelion development
 */

package com.bk.demo_s3_local_app.exception;

public class UnableToUploadFileException extends RuntimeException {

  public UnableToUploadFileException(String fileName) {
    super("Unable to upload file with name: " + fileName);
  }
}
