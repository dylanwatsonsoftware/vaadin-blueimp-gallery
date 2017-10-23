package com.github.lotsabackscatter.blueimp.gallery;

import com.google.gson.Gson;
import com.vaadin.annotations.JavaScript;
import com.vaadin.annotations.StyleSheet;
import com.vaadin.ui.AbstractJavaScriptComponent;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * A Vaadin Component representing a Gallery WebGL globe.
 *
 * @author watsond
 */
@JavaScript({
        "vaadin://addons/blueimp/gallery/js/jquery.min.js",
        "vaadin://addons/blueimp/gallery/js/blueimp-gallery.min.js",
        "vaadin://addons/blueimp/gallery/js/gallery_connector.js"
})
@StyleSheet({
        "vaadin://addons/blueimp/gallery/css/blueimp-gallery.min.css"
})
public class Gallery extends AbstractJavaScriptComponent {

    private static final long serialVersionUID = 1L;
    private static final Gson gson = new Gson();

    /**
     * @param shownImage    the image to open the gallery to
     * @param galleryImages the images in the gallery (may contain the shownImage)
     */
    public void showGallery(Image shownImage, Image... galleryImages) {
        Options options = new Options();
        showGallery(shownImage, asList(galleryImages), options);
    }

    /**
     * @param shownImage    the image to open the gallery to
     * @param galleryImages the images to show in the gallery (may contain the shownImage)
     * @param options       the gallery options (index will be overridden)
     */
    public void showGallery(Image shownImage, List<Image> galleryImages, Options options) {
        List<Image> images = new ArrayList<Image>();
        images.addAll(galleryImages);

        if (!images.contains(shownImage)) {
            // Add image as the first in the list
            images.add(0, shownImage);
        }

        int index = images.indexOf(shownImage);

        options.index = index < 0 ? 0 : index;

        showGallery(images, options);
    }

    /**
     * Shows the gallery. The gallery will be opened to the first image in the list.
     *
     * @param images the images to show in the gallery
     */
    public void showGallery(List<Image> images) {
        showGallery(images, new Options());
    }

    /**
     * @param images  the images to show in the gallery
     * @param options the gallery options
     */
    public void showGallery(List<Image> images, Options options) {
        getState().images = images;
        getState().options = options;
        callFunction("showGallery");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected GalleryState getState() {
        return (GalleryState) super.getState();
    }
}
