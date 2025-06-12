package com.hjg.kotlin.ch04

import java.net.URI

/**
 * 声明了2个secondary constructor。
 * String?表示可以为空，构造器需要处理空值的情况。
 */
open class Downloader {
    constructor(url: String?) {
        // some code
    }

    constructor(uri: URI?) {
        // some code
    }
}

class MyDownloader : Downloader {
    constructor(url: String?): super(url) {

    }

    constructor(uri: URI?): super(uri) {

    }
}

/**
 * 构造函数调用自身的其它构造函数。
 */
class MyDownloader2 : Downloader {
    constructor(url: String?): this(URI(url))
    constructor(uri: URI?): super(uri)
}

