package com.github.lotsabackscatter.blueimp.gallery;

import com.vaadin.shared.ui.JavaScriptComponentState;

import java.util.ArrayList;
import java.util.List;

/**
 * The current state of the gallery.
 */
public class State extends JavaScriptComponentState {

    /**
     * The pictures to be shown in the gallery.
     */

    public List<Picture> pictures = new ArrayList<>();
    /**
     * The options used to display the gallery.
     */
    public Options options = new Options();
}
