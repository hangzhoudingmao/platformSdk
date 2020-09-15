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
#-optimizationpasses 5
#-dontusemixedcaseclassnames
#-dontskipnonpubliclibraryclasses
#-dontpreverify
#-dontshrink#混淆jar的时候一定要配置，不然会把没有用到的代码全部remove   我本来封装一个jar就是给别人调用的，全部删掉就没有东西了
#-verbose
#
#-keepattributes Signature #过滤泛型 用到发射，泛型等要添加这个
#-keepattributes *Annotation*
#
#-optimizations !code/simplification/arithmetic,!field/*,!class/merging/*
#
#-keep public class * extends android.app.Activity
#-keep public class * extends android.app.Application
#-keep public class * extends android.app.Service
#-keep public class * extends android.content.BroadcastReceiver
#-keep public class * extends android.content.ContentProvider
#-keep public class com.android.vending.licensing.ILicensingService
#
#-keepclasseswithmembernames class * {
#    native <methods>;
#}
#
#-keepclasseswithmembernames class * {
#    public <init>(android.content.Context, android.util.AttributeSet);
#}
#
#-keepclasseswithmembernames class * {
#    public <init>(android.content.Context, android.util.AttributeSet, int);
#}
#
#-keepclassmembers enum * {
#    public static **[] values();
#    public static ** valueOf(java.lang.String);
#}
#
#-keep class * implements android.os.Parcelable {
#  public static final android.os.Parcelable$Creator *;
#}
#
#
##okhttp
#-dontwarn okhttp3.**
#-keep class okhttp3.**{*;}
#-keep interface okhttp3.**{*;}
#
##okio
#-dontwarn okio.**
#-keep class okio.**{*;}
#-keep interface okio.**{*;}
#
##json
#-dontwarn com.google.gson.**
#
#-keep class com.google.gson.**{*;}
#
#-keep public class com.dingmao.platformsdk.commonentity.**{
#   *;
#}
#-keep class com.dingmao.platformsdk.basicservices.**{*;}
#-keep class com.dingmao.platformsdk.callback.**{*;}
#-keep class com.dingmao.platformsdk.coderulemanagement.**{*;}
#-keep class com.dingmao.platformsdk.configurationmanagement.**{*;}
#-keep class com.dingmao.platformsdk.insertmanagement.**{*;}
#-keep class com.dingmao.platformsdk.interfaceservice.**{*;}
#-keep class com.dingmao.platformsdk.login.**{*;}
#-keep class com.dingmao.platformsdk.organization.**{*;}
#-keep class com.dingmao.platformsdk.registrationrelated.**{*;}
#-keep class com.dingmao.platformsdk.resourcesmanagement.**{*;}
#-keep class com.dingmao.platformsdk.screendata.**{*;}
#-keep class com.dingmao.platformsdk.systemmanagement.**{*;}
#-keep class com.dingmao.platformsdk.systemresources.**{*;}
#-keep class com.dingmao.platformsdk.usermanagement.**{*;}
#-keep class com.dingmao.platformsdk.systemmanagement.**{*;}
#
#-keep public class com.dingmao.platformsdk.PlatformSDK {*;}
#-keep public class com.dingmao.platformsdk.PlatformClient {*;}

