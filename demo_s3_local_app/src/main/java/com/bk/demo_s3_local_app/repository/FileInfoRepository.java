/*
 * Copyright (c) 2021. Dandelion development
 */

package com.bk.demo_s3_local_app.repository;

import com.bk.demo_s3_local_app.domain.FileInfo;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface FileInfoRepository extends ReactiveCrudRepository<FileInfo, Long> {

  Flux<FileInfo> findByFileName(String name);
}
