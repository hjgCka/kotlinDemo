package com.hjg.util

import org.apache.commons.lang3.StringUtils
import org.apache.commons.lang3.time.FastDateFormat
import java.util.*

class PlainUtil {
    //如果kotlin-springboot-demo中的代码，引用这个字段，编译会报错.
    //kotlin-springboot-demo中引用的地方，会报找不到这个class。
    val dateformat = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss",
        TimeZone.getTimeZone("GMT+8:00"))

    fun trimString(string: String) : String {
        return StringUtils.trimToEmpty(string)
    }

    fun getDateFormat() : String {
        return dateformat.format(Date())
    }
}
