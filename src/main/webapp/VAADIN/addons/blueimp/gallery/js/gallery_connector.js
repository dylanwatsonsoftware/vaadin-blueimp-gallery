window.com_github_lotsabackscatter_blueimp_gallery_Gallery = function() {
    var that = this;

    var galleryElem = $('<div id="blueimp-gallery" class="blueimp-gallery blueimp-gallery-controls">' +
                          '<div class="slides"></div>' +
                          '<h3 class="title"></h3>' +
                          '<a class="prev">‹</a>' +
                          '<a class="next">›</a>' +
                          '<a class="close">×</a>' +
                          '<a class="play-pause"></a>' +
                          '<ol class="indicator"></ol>' +
                        '</div>');

    galleryElem.appendTo(this.getElement());

    this.showGallery = function() {
        var images = that.getState().images;
        var options = that.getState().options;
        console.log(options);
        console.log(options);
        console.log(images);
        console.log(images[0]);
        console.log(images[0]["title"]);
        options.container = galleryElem;
        blueimp.Gallery(images, options);
    };
};