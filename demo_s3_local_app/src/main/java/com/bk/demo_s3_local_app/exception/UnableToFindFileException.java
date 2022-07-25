/*
 * Copyright (c) 2021. Dandelion development
 */

package com.bk.demo_s3_local_app.exception;

public class UnableToFindFileException extends RuntimeException {

  public UnableToFindFileException(String fileName) {
    super("Unable to find file with name: " + fileName);
  }
}
