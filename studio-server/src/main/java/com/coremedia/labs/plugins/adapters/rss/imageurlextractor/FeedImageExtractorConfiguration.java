package com.coremedia.labs.plugins.adapters.rss.imageurlextractor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class FeedImageExtractorConfiguration {

  @Bean
  FeedImageExtractor feedImageExtractor() {
    return new FeedImageExtractorImpl();
  }
}
