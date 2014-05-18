package com.immersion.blueimp.gallery;

import com.vaadin.shared.ui.JavaScriptComponentState;

import java.util.ArrayList;
import java.util.List;

/**
 * The current state of the gallery.
 */
public class GalleryState extends JavaScriptComponentState {

    /**
     * The images to be shown in the gallery.
     */
    public List<Image> images = new ArrayList<Image>();
    /**
     * The options used to display the gallery.
     */
    public Options options = new Options();
}
