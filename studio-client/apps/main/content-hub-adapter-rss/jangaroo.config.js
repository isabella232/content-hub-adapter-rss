/** @type { import('@jangaroo/core').IJangarooConfig } */
module.exports = {
  type: "code",
  extName: "com.coremedia.labs.plugins__studio-client.content-hub-adapter-rss",
  extNamespace: "com.coremedia.labs.plugins.adapters.rss",
  sencha: {
    studioPlugins: [
      {
        mainClass: "com.coremedia.labs.plugins.adapters.rss.ContentHubStudioRssPlugin",
        name: "Content Hub",
      },
    ],
  },
};
