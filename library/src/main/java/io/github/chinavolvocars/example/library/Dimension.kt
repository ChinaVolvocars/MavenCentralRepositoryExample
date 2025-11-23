package io.github.chinavolvocars.example.library

import android.content.res.Resources
import android.util.DisplayMetrics
import android.util.TypedValue
import kotlin.math.roundToInt

/**
 * 像素转换工具类 - dp、sp、px 单位转换
 * Dimension conversion utility - dp, sp, px unit conversion
 *
 * @author: Atlantis
 * @date: 2025/11/23 21:38
 */
object Dimension {

  /**
   * dp单位转换成px
   *
   * @param dp dp值
   * @return 像素值
   */
  fun dpToPx(dp: Float): Float {
    return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, displayMetrics)
  }

  /**
   * dp单位转换成px（四舍五入到整数）
   *
   * @param dp dp值
   * @return 像素值（整数）
   */
  fun dpToPxInt(dp: Float): Int {
    return dpToPx(dp).roundToInt()
  }

  /**
   * sp单位转换成px
   *
   * @param sp sp值
   * @return 像素值
   */
  fun spToPx(sp: Float): Float {
    return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, sp, displayMetrics)
  }

  /**
   * sp单位转换成px（四舍五入到整数）
   *
   * @param sp sp值
   * @return 像素值（整数）
   */
  fun spToPxInt(sp: Float): Int {
    return spToPx(sp).roundToInt()
  }

  /**
   * px单位转换成dp
   *
   * @param px 像素值
   * @return dp值
   */
  fun pxToDp(px: Float): Float {
    return px / displayMetrics.density
  }

  /**
   * px单位转换成dp（四舍五入到整数）
   *
   * @param px 像素值
   * @return dp值（整数）
   */
  fun pxToDpInt(px: Float): Int {
    return pxToDp(px).roundToInt()
  }

  /**
   * px单位转换成sp
   *
   * @param px 像素值
   * @return sp值
   */
  fun pxToSp(px: Float): Float {
    return px / displayMetrics.scaledDensity
  }

  /**
   * px单位转换成sp（四舍五入到整数）
   *
   * @param px 像素值
   * @return sp值（整数）
   */
  fun pxToSpInt(px: Float): Int {
    return pxToSp(px).roundToInt()
  }

  /**
   * 获取屏幕宽度
   *
   * @return 屏幕宽度（像素）
   */
  fun getScreenWidth(): Int {
    return displayMetrics.widthPixels
  }

  /**
   * 获取屏幕高度
   *
   * @return 屏幕高度（像素）
   */
  fun getScreenHeight(): Int {
    return displayMetrics.heightPixels
  }

  /**
   * 获取屏幕密度
   *
   * @return 屏幕密度
   */
  fun getDensity(): Float {
    return displayMetrics.density
  }

  /**
   * 获取缩放密度（主要用于字体）
   *
   * @return 缩放密度
   */
  fun getScaledDensity(): Float {
    return displayMetrics.scaledDensity
  }

  /**
   * 获取屏幕DPI
   *
   * @return 屏幕DPI
   */
  fun getDensityDpi(): Int {
    return displayMetrics.densityDpi
  }

  /**
   * 获取显示指标
   *
   * @return DisplayMetrics对象
   */
  private val displayMetrics: DisplayMetrics
    get() = Resources.getSystem().displayMetrics
}


/**
 * dp单位转换成px
 */
val Float.dp: Float
  get() = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, this, displayMetrics)

/**
 * dp单位转换成px（四舍五入到整数）
 */
val Float.dpToInt: Int
  get() = this.dp.roundToInt()

/**
 * sp单位转换成px
 */
val Float.sp: Float
  get() = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, this, displayMetrics)

/**
 * sp单位转换成px（四舍五入到整数）
 */
val Float.spToInt: Int
  get() = this.sp.roundToInt()

/**
 * px单位转换成dp
 */
val Float.pxToDp: Float
  get() = this / displayMetrics.density

/**
 * px单位转换成dp（四舍五入到整数）
 */
val Float.pxToDpInt: Int
  get() = this.pxToDp.roundToInt()

/**
 * px单位转换成sp
 */
val Float.pxToSp: Float
  get() = this / displayMetrics.scaledDensity

/**
 * px单位转换成sp（四舍五入到整数）
 */
val Float.pxToSpInt: Int
  get() = this.pxToSp.roundToInt()

/**
 * 获取显示指标
 */
private val displayMetrics
  get() = Resources.getSystem().displayMetrics

/**
 * 屏幕工具对象
 */
object ScreenUtils {
  /**
   * 获取屏幕宽度
   */
  val screenWidth: Int
    get() = displayMetrics.widthPixels

  /**
   * 获取屏幕高度
   */
  val screenHeight: Int
    get() = displayMetrics.heightPixels

  /**
   * 获取屏幕密度
   */
  val density: Float
    get() = displayMetrics.density

  /**
   * 获取缩放密度（主要用于字体）
   */
  val scaledDensity: Float
    get() = displayMetrics.scaledDensity

  /**
   * 获取屏幕DPI
   */
  val densityDpi: Int
    get() = displayMetrics.densityDpi
}
