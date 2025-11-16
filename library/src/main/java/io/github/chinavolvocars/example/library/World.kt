package io.github.chinavolvocars.example.library

import android.util.Log

/**
 * World
 *
 * @Author: mac
 * @Date: 2025/11/16 11:37
 */
object World {

  val TAG = "World"

  fun i(msg: String) {
    Log.i(TAG, msg)
  }

  fun d(msg: String) {
    Log.d(TAG, msg)
  }

  fun w(msg: String) {
    Log.w(TAG, msg)
  }

  fun e(msg: String) {
    Log.e(TAG, msg)
  }

  fun v(msg: String) {
    Log.v(TAG, msg)
  }

  fun wtf(msg: String) {
    Log.wtf(TAG, msg)
  }

}
