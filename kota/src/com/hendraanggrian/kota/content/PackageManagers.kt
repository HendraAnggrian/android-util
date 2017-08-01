package com.hendraanggrian.kota.content

import android.content.Context
import android.content.pm.PackageManager
import android.support.v4.content.ContextCompat
import com.hendraanggrian.kota.annotation.PermissionString

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */

fun Context.isPermissionsGranted(@PermissionString vararg permissions: String): Boolean {
    check(permissions.isNotEmpty(), { "Need input!" })
    return permissions.none {
        ContextCompat.checkSelfPermission(this, it) != PackageManager.PERMISSION_GRANTED
    }
}

fun IntArray.isPermissionsGranted(): Boolean = none {
    it != PackageManager.PERMISSION_GRANTED
}