package com.hrznstudio.emojiful.api;

public class EmojiFromAVOAPI extends Emoji {

    public String url;

    @Override
    public String getUrl() {
        return url;
    }


    @Override
    public String toString() {
        return "EmojiFromAVOAPI{" +
                "url='" + url + '\'' +
                ", name='" + name + '\'' +
                ", strings=" + strings +
                ", texts=" + texts +
                ", location='" + location + '\'' +
                ", version=" + version +
                ", sort=" + sort +
                ", worldBased=" + worldBased +
                ", deleteOldTexture=" + deleteOldTexture +
                ", img=" + img +
                ", frames=" + frames +
                ", finishedLoading=" + finishedLoading +
                ", loadedTextures=" + loadedTextures +
                '}';
    }
}
