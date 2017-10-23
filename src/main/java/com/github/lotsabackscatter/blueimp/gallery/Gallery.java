package com.github.lotsabackscatter.blueimp.gallery;

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

    /**
     * @param shownPicture    the picture to open the gallery to
     * @param galleryPictures the pictures in the gallery (may contain the shownPicture)
     */
    public void showGallery(Picture shownPicture, Picture... galleryPictures) {
        showGallery(shownPicture, asList(galleryPictures), new Options());
    }

    /**
     * @param shownPicture    the picture to open the gallery to
     * @param galleryPictures the pictures to show in the gallery (may contain the shownPicture)
     */
    public void showGallery(Picture shownPicture, List<Picture> galleryPictures) {
        showGallery(shownPicture, galleryPictures, new Options());
    }

    /**
     * @param shownPicture    the picture to open the gallery to
     * @param galleryPictures the pictures to show in the gallery (may contain the shownPicture)
     * @param options       the gallery options (index will be overridden)
     */
    public void showGallery(Picture shownPicture, List<Picture> galleryPictures, Options options) {
        List<Picture> pictures = new ArrayList<>();
        pictures.addAll(galleryPictures);

        if (!pictures.contains(shownPicture)) {
            // Add image as the first in the list
            pictures.add(0, shownPicture);
        }

        int index = pictures.indexOf(shownPicture);

        options.index = index < 0 ? 0 : index;

        showGallery(pictures, options);
    }

    /**
     * Shows the gallery. The gallery will be opened to the first picture in the list.
     *
     * @param pictures the pictures to show in the gallery
     */
    public void showGallery(List<Picture> pictures) {
        showGallery(pictures, new Options());
    }

    /**
     * @param pictures  the pictures to show in the gallery
     * @param options the gallery options
     */
    public void showGallery(List<Picture> pictures, Options options) {
        getState().pictures = pictures;
        getState().options = options;
        callFunction("showGallery");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected State getState() {
        return (State) super.getState();
    }
}
