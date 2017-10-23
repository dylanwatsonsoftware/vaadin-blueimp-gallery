package com.github.lotsabackscatter.blueimp.gallery;

import com.google.gson.Gson;

import javax.annotation.Nonnull;

/**
 * An image that is to be displayed in the Gallery
 */
public class Picture {

    private static final Gson gson = new Gson();
    public final String title;
    public final String type;
    public final String href;
    public final String thumbnail;

    private Picture(String title, String type, String href, String thumbnail) {
        this.title = title;
        this.type = type;
        this.href = href;
        this.thumbnail = thumbnail;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return gson.toJson(this);
    }

    public static class Builder {
        private String title = "";
        private String type = "image/jpeg";
        private String href;
        private String thumbnail;

        public Builder title(@Nonnull String title) {
            this.title = title;
            return this;
        }

        /**
         * @param type "video/mp4" or "image/jpeg"
         * @return the builder
         */
        public Builder type(@Nonnull String type) {
            this.type = type;
            return this;
        }

        public Builder href(String href) {
            this.href = href;
            return this;
        }

        public Builder thumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }

        public Picture build() {
            return new Picture(title, type, href, thumbnail);
        }
    }
}
