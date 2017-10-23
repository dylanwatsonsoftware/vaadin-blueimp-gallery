window.com_github_lotsabackscatter_blueimp_gallery_Gallery = function() {
    var that        = this,
        galleryElem = $(
            '<div id="blueimp-gallery" class="blueimp-gallery blueimp-gallery-controls">' +
                '<div class="slides"></div>' +
                '<h3 class="title"></h3>' +
                '<a class="prev">‹</a>' +
                '<a class="next">›</a>' +
                '<a class="close">×</a>' +
                '<a class="play-pause"></a>' +
                '<ol class="indicator"></ol>' +
            '</div>'
        ).appendTo(that.getElement());

    this.showGallery = function() {
        var pictures = that.getState().pictures,
            options  = that.getState().options;

        options = (options) ? options : {};

        options.container = galleryElem;

        blueimp.Gallery(pictures, options);
    };
};