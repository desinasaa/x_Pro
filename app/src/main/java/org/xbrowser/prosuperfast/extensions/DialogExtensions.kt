@file:Suppress("NOTHING_TO_INLINE")

package org.xbrowser.prosuperfast.extensions

import org.xbrowser.prosuperfast.dialog.BrowserDialog
import androidx.appcompat.app.AlertDialog

/**
 * Ensures that the dialog is appropriately sized and displays it.
 */
inline fun AlertDialog.Builder.resizeAndShow() = BrowserDialog.setDialogSize(context, this.show())
