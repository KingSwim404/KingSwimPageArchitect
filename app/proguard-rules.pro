# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile
# 保留类名及其该类的内容不会被混淆（包括变量名，方法名等）
#-keep class packageName.* {*;}

# 指定压缩级别
-optimizationpasses 5
# 保留行号
-keepattributes SourceFile,LineNumberTable
# 混淆时是否记录日志
-verbose
#指定混淆时采用的算法，后面的参数是一个过滤器
#这个过滤器是谷歌推荐的算法，一般不改变
-optimizations !code/simplification/artithmetic,!field/,!class/merging/



# 保留枚举类不被混淆
-keepclassmembers enum * {
    public static **[] values();
    public static ** valueOf(java.lang.String);
}

# Parcelable序列化和Creator静态成员变量
-keep class * implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator *;
}

# Serializable序列化
-keepclassmembers class * implements java.io.Serializable {
    static final long serialVersionUID;
    private static final java.io.ObjectStreamField[] serialPersistentFields;
    !static !transient <fields>;
    !private <fields>;
    !private <methods>;
    private void writeObject(java.io.ObjectOutputStream);
    private void readObject(java.io.ObjectInputStream);
    java.lang.Object writeReplace();
    java.lang.Object readResolve();
}

-keepattributes *Annotation*
-keepattributes *JavascriptInterface*

-keepattributes Signature

# 本地的native方法（JNI）
-keepclasseswithmembernames class * {
    native <methods>;
}

# 过滤R文件的混淆：
-keep class **.R$* {
 *;
}


# 保留Keep注解的类名和方法
-keep,allowobfuscation interface androidx.annotation.Keep
-keep class androidx.annotation.Keep
-keep @androidx.annotation.Keep class * {*;}
-keepclasseswithmembers class * {
    @androidx.annotation.Keep <methods>;
}
-keepclasseswithmembers class * {
    @androidx.annotation.Keep <fields>;
}
-keepclasseswithmembers class * {
    @androidx.annotation.Keep <init>(...);
}