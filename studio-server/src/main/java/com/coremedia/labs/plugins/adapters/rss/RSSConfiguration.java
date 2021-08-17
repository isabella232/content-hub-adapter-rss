package com.coremedia.labs.plugins.adapters.rss;

import com.coremedia.contenthub.api.ContentHubAdapterFactory;
import com.coremedia.labs.plugins.adapters.rss.imageurlextractor.FeedImageExtractor;
import com.coremedia.labs.plugins.adapters.rss.imageurlextractor.FeedImageExtractorConfiguration;
import edu.umd.cs.findbugs.annotations.NonNull;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration(proxyBeanMethods = false)
@Import(FeedImageExtractorConfiguration.class)
public class RSSConfiguration {
  @Bean
  public ContentHubAdapterFactory rssContentHubAdapterFactory(RSSContentHubTransformer rssContentHubTransformer,
                                                              FeedImageExtractor feedImageExtractor) {
    return new RSSContentHubAdapterFactory(rssContentHubTransformer, feedImageExtractor);
  }

  @Bean
  RSSContentHubTransformer rssContentHubTransformer(@NonNull FeedImageExtractor feedImageExtractor) {
    return new RSSContentHubTransformer(feedImageExtractor);
  }
}
