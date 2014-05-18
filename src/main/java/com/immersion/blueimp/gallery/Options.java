package com.immersion.blueimp.gallery;

import com.google.gson.Gson;

/**
 * Gallery options
 */
public class Options {
    private static final Gson gson = new Gson();
    /** The tag name, Id, element or querySelector of the slides container:
     //    slidesContainer:'div',
     // The tag name, Id, element or querySelector of the title element:
     //    titleElement:'h3',
     // The class to add when the gallery is visible:
     //    displayClass:'blueimp-gallery-display',
     // The class to add when the gallery controls are visible:
     //    controlsClass:'blueimp-gallery-controls',
     // The class to add when the gallery only displays one element:
     //    singleClass:'blueimp-gallery-single',
     // The class to add when the left edge has been reached:
     //    leftEdgeClass:'blueimp-gallery-left',
     // The class to add when the right edge has been reached:
     //    rightEdgeClass:'blueimp-gallery-right',
     // The class to add when the automatic slideshow is active:
     //    playingClass:'blueimp-gallery-playing',
     // The class for all slides:
     //    slideClass:'slide',
     // The slide class for loading elements:
     //    slideLoadingClass:'slide-loading',
     // The slide class for elements that failed to load:
     //    slideErrorClass:'slide-error',
     // The class for the content element loaded into each slide:
     //    slideContentClass:'slide-content',
     // The class for the "toggle" control:
     //    toggleClass:'toggle',
     // The class for the "prev" control:
     //    prevClass:'prev',
     // The class for the "next" control:
     //    nextClass:'next',
     // The class for the "close" control:
     //    closeClass:'close',
     // The class for the "play-pause" toggle control:
     //    playPauseClass:'play-pause',
     // The list object property (or data attribute) with the object type:
     //    typeProperty:'type',
     // The list object property (or data attribute) with the object title:
     //    titleProperty:'title',
     // The list object property (or data attribute) with the object URL:
     //    urlProperty:'href',*/
    /**
     * The gallery listens for transitionend events before triggering the
     * opened and closed events, unless the following option is set to false:
     */
    public boolean displayTransition = true;
    //Defines if the gallery slides are cleared from the gallery modal,
    // or reused for the next gallery initialization:
//    clearSlides:true,
    /**
     * Defines if images should be stretched to fill the available space,
     * while maintaining their aspect ratio (will only be enabled for browsers
     * supporting background-size="contain", which excludes IE < 9).
     * Set to "cover", to make images cover all available space (requires
     * support for background-size="cover", which excludes IE < 9):
     */
    public boolean stretchImages = false;
    /**
     * Toggle the controls on pressing the Return key:
     */
    public boolean toggleControlsOnReturn = true;
    /**
     * Toggle the automatic slideshow interval on pressing the Space key:
     */
    public boolean toggleSlideshowOnSpace = true;
    /**
     * Navigate the gallery by pressing left and right on the keyboard:
     */
    public boolean enableKeyboardNavigation = true;
    /**
     * Close the gallery on pressing the ESC key:
     */
    public boolean closeOnEscape = true;
    /**
     * Close the gallery when clicking on an empty slide area:
     */
    public boolean closeOnSlideClick = true;
    /**
     * Close the gallery by swiping up or down:
     */
    public boolean closeOnSwipeUpOrDown = true;
    /**
     * Emulate touch events on mouse-pointer devices such as desktop browsers:
     */
    public boolean emulateTouchEvents = true;
    /**
     * Stop touch events from bubbling up to ancestor elements of the Gallery:
     */
    public boolean stopTouchEventsPropagation = false;
    /**
     * Hide the page scrollbars:
     */
    public boolean hidePageScrollbars = true;
    /**
     * Stops any touches on the container from scrolling the page:
     */
    public boolean disableScroll = true;
    /**
     * Carousel mode (shortcut for carousel specific options):
     */
    public boolean carousel = false;
    /**
     * Allow continuous navigation, moving from last to first
     * and from first to last slide:
     */
    public boolean continuous = true;
    /**
     * Remove elements outside of the preload range from the DOM:
     */
    public boolean unloadElements = true;
    /**
     * Start with the automatic slideshow:
     */
    public boolean startSlideshow = false;
    /**
     * Delay in milliseconds between slides for the automatic slideshow:
     */
    public int slideshowInterval = 5000;
    /**
     * The starting index as integer.
     * Can also be an object of the given list,
     * or an equal object with the same url property:
     */
    public int index = 0;
    /**
     * The number of elements to load around the current index:
     */
    public int preloadRange = 2;
    /**
     * The transition speed between slide changes in milliseconds:
     */
    public int transitionSpeed = 400;
    /**
     * The transition speed for automatic slide changes, set to an integer
     * greater 0 to override the default transition speed:
     */
    public int slideshowTransitionSpeed = 0;

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return gson.toJson(this);
    }
}
