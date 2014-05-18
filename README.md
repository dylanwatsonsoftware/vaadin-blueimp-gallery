Vaadin Blueimp Image Gallery
=======================

Add the [Blueimp Image Gallery][1] to your [Vaadin 7][2] Application.

[![Build Status](https://travis-ci.org/lotsabackscatter/vaadin-blueimp-gallery.svg?branch=master)](https://travis-ci.org/lotsabackscatter/vaadin-blueimp-gallery)

Download
--------

Download the latest JAR or grab via the Sonatype Maven Repository:
```xml
<repositories>
    <repository>
        <id>oss-sonatype</id>
        <name>oss-sonatype</name>
        <url>https://oss.sonatype.org/content/repositories/snapshots/</url>
        <snapshots>
            <enabled>true</enabled>
        </snapshots>
    </repository>
</repositories>

...

<dependency>
  <groupId>com.immersion</groupId>
  <artifactId>vaadin-blueimp-gallery</artifactId>
  <version>1.0-SNAPSHOT</version>
</dependency>
```

Usage
--------

Simply create a layout and add the Gallery component to it!
```java
VerticalLayout layout = new VerticalLayout();
Gallery gallery = new Gallery();
layout.addComponent(gallery);
```
Then, simply create the images and show the gallery!
```java
Image apple = new Image.Builder().title("Apple")
        .href("apple.jpg")
        .thumbnail("thumbs/apple.jpg").build();
        
Image banana = new Image.Builder().title("Banana")
        .href("banana.jpg")
        .thumbnail("thumbs/banana.jpg").build();        

gallery.showGallery(apple, banana);
```

Developed By
--------

* Dylan Watson - <lotsabackscatter@gmail.com>

License
--------

    Copyright 2014 Dylan Watson.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


 [1]: https://github.com/blueimp/Gallery
 [2]: https://vaadin.com/home
