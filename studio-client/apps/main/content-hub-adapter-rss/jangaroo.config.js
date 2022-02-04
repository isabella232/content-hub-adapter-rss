const { jangarooConfig } = require("@jangaroo/core");

module.exports = jangarooConfig({
  type: "code",
  sencha: {
    name: "com.coremedia.labs.plugins__studio-client.content-hub-adapter-rss",
    namespace: "com.coremedia.labs.plugins.adapters.rss",
    studioPlugins: [
      {
        mainClass: "com.coremedia.labs.plugins.adapters.rss.ContentHubStudioRssPlugin",
        name: "Content Hub RSS",
      },
    ],
  },
});
