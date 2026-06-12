package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.os.BaseBundle;
import android.widget.TextView;
import android.app.Dialog;
import java.util.ArrayList;
import java.io.OutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.ByteArrayOutputStream;
import java.util.List;
import com.pichillilorenzo.flutter_inappwebview_android.types.PermissionResponse;
import android.webkit.PermissionRequest;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsPromptResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsConfirmResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsBeforeUnloadResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsAlertResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.GeolocationPermissionShowPromptResponse;
import android.webkit.GeolocationPermissions$Callback;
import android.os.Bundle;
import android.webkit.WebView$HitTestResult;
import com.google.android.gms.internal.measurement.L;
import v.e;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager;
import com.pichillilorenzo.flutter_inappwebview_android.types.CreateWindowAction;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLRequest;
import android.os.Message;
import android.webkit.ConsoleMessage;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import E.h;
import java.util.Arrays;
import android.view.ViewGroup;
import android.graphics.Bitmap$Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory$Options;
import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.Map$Entry;
import j.f;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.webkit.JsPromptResult;
import android.webkit.WebView;
import j.g;
import android.content.DialogInterface$OnCancelListener;
import j.d;
import android.content.Context;
import h1.w;
import android.content.DialogInterface$OnClickListener;
import android.content.res.AssetFileDescriptor;
import android.webkit.WebChromeClient$FileChooserParams;
import android.os.Parcelable;
import E.l;
import java.io.IOException;
import android.util.Log;
import android.webkit.MimeTypeMap;
import android.content.Intent;
import android.os.Environment;
import java.io.File;
import android.app.Activity;
import C4.b;
import o.q1;
import java.util.HashMap;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import android.webkit.WebChromeClient$CustomViewCallback;
import android.view.View;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserDelegate;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.JsResult;
import android.content.DialogInterface;
import java.util.Map;
import android.widget.FrameLayout$LayoutParams;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.ActivityResultListener;
import F4.r;
import android.webkit.WebChromeClient;

public class InAppWebViewChromeClient extends WebChromeClient implements r, ActivityResultListener
{
    protected static final FrameLayout$LayoutParams FULLSCREEN_LAYOUT_PARAMS;
    protected static final int FULLSCREEN_SYSTEM_UI_VISIBILITY = 1798;
    protected static final int FULLSCREEN_SYSTEM_UI_VISIBILITY_KITKAT = 7942;
    protected static final String LOG_TAG = "IABWebChromeClient";
    private static final int PICKER = 1;
    private static final int PICKER_LEGACY = 3;
    final String DEFAULT_MIME_TYPES;
    final Map<DialogInterface, JsResult> dialogs;
    private ValueCallback<Uri[]> filePathCallback;
    private ValueCallback<Uri> filePathCallbackLegacy;
    private Uri imageOutputFileUri;
    private InAppBrowserDelegate inAppBrowserDelegate;
    public InAppWebView inAppWebView;
    private View mCustomView;
    private WebChromeClient$CustomViewCallback mCustomViewCallback;
    private int mOriginalOrientation;
    private int mOriginalSystemUiVisibility;
    public InAppWebViewFlutterPlugin plugin;
    private Uri videoOutputFileUri;
    
    static {
        FULLSCREEN_LAYOUT_PARAMS = new FrameLayout$LayoutParams(-1, -1, 17);
    }
    
    public InAppWebViewChromeClient(final InAppWebViewFlutterPlugin plugin, final InAppWebView inAppWebView, final InAppBrowserDelegate inAppBrowserDelegate) {
        this.DEFAULT_MIME_TYPES = "*/*";
        this.dialogs = (Map<DialogInterface, JsResult>)new HashMap();
        this.plugin = plugin;
        this.inAppWebView = inAppWebView;
        this.inAppBrowserDelegate = inAppBrowserDelegate;
        if (inAppBrowserDelegate != null) {
            inAppBrowserDelegate.getActivityResultListeners().add((Object)this);
        }
        final b activityPluginBinding = plugin.activityPluginBinding;
        if (activityPluginBinding != null) {
            ((q1)activityPluginBinding).b((r)this);
        }
    }
    
    private Boolean acceptsAny(final String[] array) {
        if (this.isArrayEmpty(array)) {
            return Boolean.TRUE;
        }
        for (int length = array.length, i = 0; i < length; ++i) {
            if (array[i].equals((Object)"*/*")) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
    
    private Boolean acceptsImages(final String s) {
        String mimeTypeFromExtension = s;
        if (s.matches("\\.\\w+")) {
            mimeTypeFromExtension = this.getMimeTypeFromExtension(s.replace((CharSequence)".", (CharSequence)""));
        }
        return mimeTypeFromExtension.isEmpty() || mimeTypeFromExtension.toLowerCase().contains((CharSequence)"image");
    }
    
    private Boolean acceptsImages(final String[] array) {
        final String[] acceptedMimeType = this.getAcceptedMimeType(array);
        return this.acceptsAny(array) || this.arrayContainsString(acceptedMimeType, "image");
    }
    
    private Boolean acceptsVideo(final String s) {
        String mimeTypeFromExtension = s;
        if (s.matches("\\.\\w+")) {
            mimeTypeFromExtension = this.getMimeTypeFromExtension(s.replace((CharSequence)".", (CharSequence)""));
        }
        return mimeTypeFromExtension.isEmpty() || mimeTypeFromExtension.toLowerCase().contains((CharSequence)"video");
    }
    
    private Boolean acceptsVideo(final String[] array) {
        final String[] acceptedMimeType = this.getAcceptedMimeType(array);
        return this.acceptsAny(array) || this.arrayContainsString(acceptedMimeType, "video");
    }
    
    private Boolean arrayContainsString(final String[] array, final String s) {
        for (final String s2 : array) {
            if (s2 != null && s2.contains((CharSequence)s)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
    
    private String[] getAcceptedMimeType(final String[] array) {
        if (this.isArrayEmpty(array)) {
            return new String[] { "*/*" };
        }
        final String[] array2 = new String[array.length];
        for (int i = 0; i < array.length; ++i) {
            final String s = array[i];
            if (s.matches("\\.\\w+")) {
                array2[i] = this.getMimeTypeFromExtension(s.replace((CharSequence)".", (CharSequence)""));
            }
            else {
                array2[i] = s;
            }
        }
        return array2;
    }
    
    private Activity getActivity() {
        final InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate != null) {
            return inAppBrowserDelegate.getActivity();
        }
        final InAppWebViewFlutterPlugin plugin = this.plugin;
        if (plugin != null) {
            return plugin.activity;
        }
        return null;
    }
    
    private File getCapturedFile(String s) {
        String s2;
        if (s.equals((Object)"android.media.action.IMAGE_CAPTURE")) {
            s = Environment.DIRECTORY_PICTURES;
            s2 = "image";
            s = ".jpg";
        }
        else if (s.equals((Object)"android.media.action.VIDEO_CAPTURE")) {
            s = Environment.DIRECTORY_MOVIES;
            s2 = "video";
            s = ".mp4";
        }
        else {
            s2 = "";
            s = "";
        }
        final Activity activity = this.getActivity();
        if (activity == null) {
            return null;
        }
        return File.createTempFile(s2, s, ((Context)activity).getApplicationContext().getExternalFilesDir((String)null));
    }
    
    private Uri getCapturedMediaFile() {
        final Uri imageOutputFileUri = this.imageOutputFileUri;
        if (imageOutputFileUri != null && this.isFileNotEmpty(imageOutputFileUri)) {
            return this.imageOutputFileUri;
        }
        final Uri videoOutputFileUri = this.videoOutputFileUri;
        if (videoOutputFileUri != null && this.isFileNotEmpty(videoOutputFileUri)) {
            return this.videoOutputFileUri;
        }
        return null;
    }
    
    private Intent getFileChooserIntent(final String s) {
        String mimeTypeFromExtension;
        if (s.isEmpty()) {
            mimeTypeFromExtension = "*/*";
        }
        else {
            mimeTypeFromExtension = s;
        }
        if (s.matches("\\.\\w+")) {
            mimeTypeFromExtension = this.getMimeTypeFromExtension(s.replace((CharSequence)".", (CharSequence)""));
        }
        final Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(mimeTypeFromExtension);
        return intent;
    }
    
    private Intent getFileChooserIntent(final String[] array, final boolean b) {
        final Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.MIME_TYPES", this.getAcceptedMimeType(array));
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", b);
        return intent;
    }
    
    private String getMimeTypeFromExtension(String mimeTypeFromExtension) {
        if (mimeTypeFromExtension != null) {
            mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(mimeTypeFromExtension);
        }
        else {
            mimeTypeFromExtension = null;
        }
        return mimeTypeFromExtension;
    }
    
    private Uri getOutputUri(final String s) {
        File capturedFile;
        try {
            capturedFile = this.getCapturedFile(s);
        }
        catch (final IOException ex) {
            Log.e("IABWebChromeClient", "Error occurred while creating the File", (Throwable)ex);
            capturedFile = null;
        }
        if (capturedFile == null) {
            return null;
        }
        final Activity activity = this.getActivity();
        if (activity == null) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(((Context)activity).getApplicationContext().getPackageName());
        sb.append(".flutter_inappwebview_android.fileprovider");
        final String string = sb.toString();
        try {
            return l.getUriForFile(((Context)activity).getApplicationContext(), string, capturedFile);
        }
        catch (final Exception ex2) {
            Log.e("IABWebChromeClient", "", (Throwable)ex2);
            return null;
        }
    }
    
    private Intent getPhotoIntent() {
        final Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", (Parcelable)(this.imageOutputFileUri = this.getOutputUri("android.media.action.IMAGE_CAPTURE")));
        return intent;
    }
    
    private Uri[] getSelectedFiles(final Intent intent, int i) {
        if (intent != null && intent.getData() != null) {
            if (i == -1) {
                return WebChromeClient$FileChooserParams.parseResult(i, intent);
            }
            return null;
        }
        else {
            if (intent != null && intent.getClipData() != null) {
                final int itemCount = intent.getClipData().getItemCount();
                final Uri[] array = new Uri[itemCount];
                for (i = 0; i < itemCount; ++i) {
                    array[i] = intent.getClipData().getItemAt(i).getUri();
                }
                return array;
            }
            final Uri capturedMediaFile = this.getCapturedMediaFile();
            if (capturedMediaFile != null) {
                return new Uri[] { capturedMediaFile };
            }
            return null;
        }
    }
    
    private Intent getVideoIntent() {
        final Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        intent.putExtra("output", (Parcelable)(this.videoOutputFileUri = this.getOutputUri("android.media.action.VIDEO_CAPTURE")));
        return intent;
    }
    
    private Boolean isArrayEmpty(final String[] array) {
        final int length = array.length;
        boolean b = true;
        if (length != 0) {
            b = (array.length == 1 && array[0].length() == 0 && b);
        }
        return b;
    }
    
    private boolean isFileNotEmpty(final Uri uri) {
        final Activity activity = this.getActivity();
        boolean b = false;
        if (activity == null) {
            return false;
        }
        try {
            final AssetFileDescriptor openAssetFileDescriptor = ((Context)activity).getContentResolver().openAssetFileDescriptor(uri, "r");
            final long length = openAssetFileDescriptor.getLength();
            openAssetFileDescriptor.close();
            if (length > 0L) {
                b = true;
            }
            return b;
        }
        catch (final IOException ex) {
            return b;
        }
    }
    
    public void createAlertDialog(final String s, final JsResult jsResult, final String s2, final String g) {
        String f = s;
        if (s2 != null) {
            f = s;
            if (!s2.isEmpty()) {
                f = s2;
            }
        }
        final DialogInterface$OnClickListener dialogInterface$OnClickListener = (DialogInterface$OnClickListener)new DialogInterface$OnClickListener(this, jsResult) {
            final InAppWebViewChromeClient this$0;
            final JsResult val$result;
            
            public void onClick(final DialogInterface dialogInterface, final int n) {
                this.val$result.confirm();
                dialogInterface.dismiss();
                this.this$0.dialogs.remove((Object)dialogInterface);
            }
        };
        final Activity activity = this.getActivity();
        if (activity == null) {
            return;
        }
        final w w = new w((Context)activity, 2131755297);
        final d d = (d)w.D;
        d.f = f;
        if (g != null && !g.isEmpty()) {
            d.g = (CharSequence)g;
            d.h = (DialogInterface$OnClickListener)dialogInterface$OnClickListener;
        }
        else {
            d.g = ((Context)d.a).getText(17039370);
            d.h = (DialogInterface$OnClickListener)dialogInterface$OnClickListener;
        }
        d.k = (DialogInterface$OnCancelListener)new DialogInterface$OnCancelListener(this, jsResult) {
            final InAppWebViewChromeClient this$0;
            final JsResult val$result;
            
            public void onCancel(final DialogInterface dialogInterface) {
                this.val$result.cancel();
                dialogInterface.dismiss();
                this.this$0.dialogs.remove((Object)dialogInterface);
            }
        };
        final g g2 = w.g();
        this.dialogs.put((Object)g2, (Object)jsResult);
        ((Dialog)g2).show();
    }
    
    public void createBeforeUnloadDialog(final String s, final JsResult jsResult, final String s2, final String g, final String i) {
        String f = s;
        if (s2 != null) {
            f = s;
            if (!s2.isEmpty()) {
                f = s2;
            }
        }
        final DialogInterface$OnClickListener dialogInterface$OnClickListener = (DialogInterface$OnClickListener)new DialogInterface$OnClickListener(this, jsResult) {
            final InAppWebViewChromeClient this$0;
            final JsResult val$result;
            
            public void onClick(final DialogInterface dialogInterface, final int n) {
                this.val$result.confirm();
                dialogInterface.dismiss();
                this.this$0.dialogs.remove((Object)dialogInterface);
            }
        };
        final DialogInterface$OnClickListener dialogInterface$OnClickListener2 = (DialogInterface$OnClickListener)new DialogInterface$OnClickListener(this, jsResult) {
            final InAppWebViewChromeClient this$0;
            final JsResult val$result;
            
            public void onClick(final DialogInterface dialogInterface, final int n) {
                this.val$result.cancel();
                dialogInterface.dismiss();
                this.this$0.dialogs.remove((Object)dialogInterface);
            }
        };
        final Activity activity = this.getActivity();
        if (activity == null) {
            return;
        }
        final w w = new w((Context)activity, 2131755297);
        final d d = (d)w.D;
        d.f = f;
        if (g != null && !g.isEmpty()) {
            d.g = (CharSequence)g;
            d.h = (DialogInterface$OnClickListener)dialogInterface$OnClickListener;
        }
        else {
            d.g = ((Context)d.a).getText(17039370);
            d.h = (DialogInterface$OnClickListener)dialogInterface$OnClickListener;
        }
        if (i != null && !i.isEmpty()) {
            d.i = (CharSequence)i;
            d.j = (DialogInterface$OnClickListener)dialogInterface$OnClickListener2;
        }
        else {
            d.i = ((Context)d.a).getText(17039360);
            d.j = (DialogInterface$OnClickListener)dialogInterface$OnClickListener2;
        }
        d.k = (DialogInterface$OnCancelListener)new DialogInterface$OnCancelListener(this, jsResult) {
            final InAppWebViewChromeClient this$0;
            final JsResult val$result;
            
            public void onCancel(final DialogInterface dialogInterface) {
                this.val$result.cancel();
                dialogInterface.dismiss();
                this.this$0.dialogs.remove((Object)dialogInterface);
            }
        };
        final g g2 = w.g();
        this.dialogs.put((Object)g2, (Object)jsResult);
        ((Dialog)g2).show();
    }
    
    public void createConfirmDialog(final String s, final JsResult jsResult, final String s2, final String g, final String i) {
        String f = s;
        if (s2 != null) {
            f = s;
            if (!s2.isEmpty()) {
                f = s2;
            }
        }
        final DialogInterface$OnClickListener dialogInterface$OnClickListener = (DialogInterface$OnClickListener)new DialogInterface$OnClickListener(this, jsResult) {
            final InAppWebViewChromeClient this$0;
            final JsResult val$result;
            
            public void onClick(final DialogInterface dialogInterface, final int n) {
                this.val$result.confirm();
                dialogInterface.dismiss();
                this.this$0.dialogs.remove((Object)dialogInterface);
            }
        };
        final DialogInterface$OnClickListener dialogInterface$OnClickListener2 = (DialogInterface$OnClickListener)new DialogInterface$OnClickListener(this, jsResult) {
            final InAppWebViewChromeClient this$0;
            final JsResult val$result;
            
            public void onClick(final DialogInterface dialogInterface, final int n) {
                this.val$result.cancel();
                dialogInterface.dismiss();
                this.this$0.dialogs.remove((Object)dialogInterface);
            }
        };
        final Activity activity = this.getActivity();
        if (activity == null) {
            return;
        }
        final w w = new w((Context)activity, 2131755297);
        final d d = (d)w.D;
        d.f = f;
        if (g != null && !g.isEmpty()) {
            d.g = (CharSequence)g;
            d.h = (DialogInterface$OnClickListener)dialogInterface$OnClickListener;
        }
        else {
            d.g = ((Context)d.a).getText(17039370);
            d.h = (DialogInterface$OnClickListener)dialogInterface$OnClickListener;
        }
        if (i != null && !i.isEmpty()) {
            d.i = (CharSequence)i;
            d.j = (DialogInterface$OnClickListener)dialogInterface$OnClickListener2;
        }
        else {
            d.i = ((Context)d.a).getText(17039360);
            d.j = (DialogInterface$OnClickListener)dialogInterface$OnClickListener2;
        }
        d.k = (DialogInterface$OnCancelListener)new DialogInterface$OnCancelListener(this, jsResult) {
            final InAppWebViewChromeClient this$0;
            final JsResult val$result;
            
            public void onCancel(final DialogInterface dialogInterface) {
                this.val$result.cancel();
                dialogInterface.dismiss();
                this.this$0.dialogs.remove((Object)dialogInterface);
            }
        };
        final g g2 = w.g();
        this.dialogs.put((Object)g2, (Object)jsResult);
        ((Dialog)g2).show();
    }
    
    public void createPromptDialog(final WebView webView, final String s, final String s2, final JsPromptResult jsPromptResult, final String s3, final String s4, final String s5, final String i, final String g) {
        final FrameLayout g2 = new FrameLayout(((View)webView).getContext());
        final EditText editText = new EditText(((View)webView).getContext());
        ((TextView)editText).setMaxLines(1);
        String text = s2;
        if (s4 != null) {
            text = s2;
            if (!s4.isEmpty()) {
                text = s4;
            }
        }
        ((TextView)editText).setText((CharSequence)text);
        ((View)editText).setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(-1, -1));
        ((View)g2).setPaddingRelative(45, 15, 45, 0);
        ((ViewGroup)g2).addView((View)editText);
        String f = s;
        if (s3 != null) {
            f = s;
            if (!s3.isEmpty()) {
                f = s3;
            }
        }
        final DialogInterface$OnClickListener dialogInterface$OnClickListener = (DialogInterface$OnClickListener)new DialogInterface$OnClickListener(this, editText, jsPromptResult, s5) {
            final InAppWebViewChromeClient this$0;
            final String val$finalValue;
            final EditText val$input;
            final JsPromptResult val$result;
            
            public void onClick(final DialogInterface dialogInterface, final int n) {
                String string = this.val$input.getText().toString();
                final JsPromptResult val$result = this.val$result;
                final String val$finalValue = this.val$finalValue;
                if (val$finalValue != null) {
                    string = val$finalValue;
                }
                val$result.confirm(string);
                dialogInterface.dismiss();
                this.this$0.dialogs.remove((Object)dialogInterface);
            }
        };
        final DialogInterface$OnClickListener dialogInterface$OnClickListener2 = (DialogInterface$OnClickListener)new DialogInterface$OnClickListener(this, jsPromptResult) {
            final InAppWebViewChromeClient this$0;
            final JsPromptResult val$result;
            
            public void onClick(final DialogInterface dialogInterface, final int n) {
                ((JsResult)this.val$result).cancel();
                dialogInterface.dismiss();
                this.this$0.dialogs.remove((Object)dialogInterface);
            }
        };
        final Activity activity = this.getActivity();
        if (activity == null) {
            return;
        }
        final w w = new w((Context)activity, 2131755297);
        final d d = (d)w.D;
        d.f = f;
        if (g != null && !g.isEmpty()) {
            d.g = (CharSequence)g;
            d.h = (DialogInterface$OnClickListener)dialogInterface$OnClickListener;
        }
        else {
            d.g = ((Context)d.a).getText(17039370);
            d.h = (DialogInterface$OnClickListener)dialogInterface$OnClickListener;
        }
        if (i != null && !i.isEmpty()) {
            d.i = (CharSequence)i;
            d.j = (DialogInterface$OnClickListener)dialogInterface$OnClickListener2;
        }
        else {
            d.i = ((Context)d.a).getText(17039360);
            d.j = (DialogInterface$OnClickListener)dialogInterface$OnClickListener2;
        }
        d.k = (DialogInterface$OnCancelListener)new DialogInterface$OnCancelListener(this, jsPromptResult) {
            final InAppWebViewChromeClient this$0;
            final JsPromptResult val$result;
            
            public void onCancel(final DialogInterface dialogInterface) {
                ((JsResult)this.val$result).cancel();
                dialogInterface.dismiss();
                this.this$0.dialogs.remove((Object)dialogInterface);
            }
        };
        final g g3 = w.g();
        final f h = g3.H;
        h.g = g2;
        h.h = false;
        this.dialogs.put((Object)g3, (Object)jsPromptResult);
        ((Dialog)g3).show();
    }
    
    public void dispose() {
        for (final Map$Entry map$Entry : this.dialogs.entrySet()) {
            ((JsResult)map$Entry.getValue()).cancel();
            ((DialogInterface)map$Entry.getKey()).dismiss();
        }
        this.dialogs.clear();
        final InAppWebViewFlutterPlugin plugin = this.plugin;
        if (plugin != null) {
            final b activityPluginBinding = plugin.activityPluginBinding;
            if (activityPluginBinding != null) {
                ((q1)activityPluginBinding).h((r)this);
            }
        }
        final InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate != null) {
            inAppBrowserDelegate.getActivityResultListeners().clear();
            this.inAppBrowserDelegate = null;
        }
        this.filePathCallbackLegacy = null;
        this.filePathCallback = null;
        this.videoOutputFileUri = null;
        this.imageOutputFileUri = null;
        this.inAppWebView = null;
        this.plugin = null;
    }
    
    public Bitmap getDefaultVideoPoster() {
        final InAppWebView inAppWebView = this.inAppWebView;
        if (inAppWebView != null) {
            final byte[] defaultVideoPoster = inAppWebView.customSettings.defaultVideoPoster;
            if (defaultVideoPoster != null) {
                final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
                bitmapFactory$Options.inMutable = true;
                return BitmapFactory.decodeByteArray(defaultVideoPoster, 0, defaultVideoPoster.length, bitmapFactory$Options);
            }
        }
        return Bitmap.createBitmap(50, 50, Bitmap$Config.ARGB_8888);
    }
    
    public ViewGroup getRootView() {
        final Activity activity = this.getActivity();
        if (activity == null) {
            return null;
        }
        return (ViewGroup)activity.findViewById(16908290);
    }
    
    public boolean needsCameraPermission() {
        final Activity activity = this.getActivity();
        boolean b = true;
        if (activity == null) {
            return true;
        }
        final PackageManager packageManager = ((Context)activity).getPackageManager();
        try {
            if (!Arrays.asList((Object[])packageManager.getPackageInfo(((Context)activity).getApplicationContext().getPackageName(), 4096).requestedPermissions).contains((Object)"android.permission.CAMERA") || h.a((Context)activity, "android.permission.CAMERA") == 0) {
                b = false;
            }
            return b;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            return b;
        }
    }
    
    public boolean onActivityResult(final int n, final int n2, final Intent intent) {
        if (this.filePathCallback == null && this.filePathCallbackLegacy == null) {
            return true;
        }
        if (n != 1) {
            if (n == 3) {
                Uri uri;
                if (n2 == -1) {
                    if (intent != null) {
                        uri = intent.getData();
                    }
                    else {
                        uri = this.getCapturedMediaFile();
                    }
                }
                else {
                    uri = null;
                }
                final ValueCallback<Uri> filePathCallbackLegacy = this.filePathCallbackLegacy;
                if (filePathCallbackLegacy != null) {
                    filePathCallbackLegacy.onReceiveValue((Object)uri);
                }
            }
        }
        else {
            Uri[] selectedFiles;
            if (n2 == -1) {
                selectedFiles = this.getSelectedFiles(intent, n2);
            }
            else {
                selectedFiles = null;
            }
            final ValueCallback<Uri[]> filePathCallback = this.filePathCallback;
            if (filePathCallback != null) {
                filePathCallback.onReceiveValue((Object)selectedFiles);
            }
        }
        this.filePathCallback = null;
        this.filePathCallbackLegacy = null;
        this.imageOutputFileUri = null;
        this.videoOutputFileUri = null;
        return true;
    }
    
    public void onCloseWindow(final WebView webView) {
        final InAppWebView inAppWebView = this.inAppWebView;
        if (inAppWebView != null) {
            final WebViewChannelDelegate channelDelegate = inAppWebView.channelDelegate;
            if (channelDelegate != null) {
                channelDelegate.onCloseWindow();
            }
        }
        super.onCloseWindow(webView);
    }
    
    public boolean onConsoleMessage(final ConsoleMessage consoleMessage) {
        final InAppWebView inAppWebView = this.inAppWebView;
        if (inAppWebView != null) {
            final WebViewChannelDelegate channelDelegate = inAppWebView.channelDelegate;
            if (channelDelegate != null) {
                channelDelegate.onConsoleMessage(consoleMessage.message(), ((Enum)consoleMessage.messageLevel()).ordinal());
            }
        }
        return super.onConsoleMessage(consoleMessage);
    }
    
    public boolean onCreateWindow(final WebView webView, final boolean b, final boolean b2, final Message message) {
        final InAppWebViewFlutterPlugin plugin = this.plugin;
        int windowAutoincrementId = 0;
        Label_0045: {
            if (plugin != null) {
                final InAppWebViewManager inAppWebViewManager = plugin.inAppWebViewManager;
                if (inAppWebViewManager != null) {
                    windowAutoincrementId = inAppWebViewManager.windowAutoincrementId + 1;
                    inAppWebViewManager.windowAutoincrementId = windowAutoincrementId;
                    break Label_0045;
                }
            }
            windowAutoincrementId = 0;
        }
        final WebView$HitTestResult hitTestResult = webView.getHitTestResult();
        String extra;
        final String s = extra = hitTestResult.getExtra();
        if (hitTestResult.getType() == 8) {
            final Message obtainMessage = webView.getHandler().obtainMessage();
            webView.requestFocusNodeHref(obtainMessage);
            final Bundle data = obtainMessage.getData();
            extra = s;
            if (data != null) {
                final String string = ((BaseBundle)data).getString("url");
                extra = s;
                if (string != null) {
                    extra = s;
                    if (!string.isEmpty()) {
                        extra = string;
                    }
                }
            }
        }
        final CreateWindowAction createWindowAction = new CreateWindowAction(new URLRequest(extra, "GET", null, null), true, b2, false, windowAutoincrementId, b);
        final InAppWebViewFlutterPlugin plugin2 = this.plugin;
        if (plugin2 != null) {
            final InAppWebViewManager inAppWebViewManager2 = plugin2.inAppWebViewManager;
            if (inAppWebViewManager2 != null) {
                inAppWebViewManager2.windowWebViewMessages.put((Object)windowAutoincrementId, (Object)message);
            }
        }
        final InAppWebView inAppWebView = this.inAppWebView;
        if (inAppWebView != null) {
            final WebViewChannelDelegate channelDelegate = inAppWebView.channelDelegate;
            if (channelDelegate != null) {
                channelDelegate.onCreateWindow(createWindowAction, (WebViewChannelDelegate.CreateWindowCallback)new WebViewChannelDelegate.CreateWindowCallback(this, windowAutoincrementId) {
                    final InAppWebViewChromeClient this$0;
                    final int val$finalWindowId;
                    
                    @Override
                    public void defaultBehaviour(final Boolean b) {
                        final InAppWebViewFlutterPlugin plugin = this.this$0.plugin;
                        if (plugin != null) {
                            final InAppWebViewManager inAppWebViewManager = plugin.inAppWebViewManager;
                            if (inAppWebViewManager != null) {
                                inAppWebViewManager.windowWebViewMessages.remove((Object)this.val$finalWindowId);
                            }
                        }
                    }
                    
                    @Override
                    public void error(final String s, String s2, final Object o) {
                        final StringBuilder c = e.c(s, ", ");
                        if (s2 == null) {
                            s2 = "";
                        }
                        L.u(c, s2, "IABWebChromeClient");
                        this.defaultBehaviour(null);
                    }
                    
                    @Override
                    public boolean nonNullSuccess(final Boolean b) {
                        return b ^ true;
                    }
                });
                return true;
            }
        }
        return false;
    }
    
    public void onGeolocationPermissionsHidePrompt() {
        final InAppWebView inAppWebView = this.inAppWebView;
        if (inAppWebView != null) {
            final WebViewChannelDelegate channelDelegate = inAppWebView.channelDelegate;
            if (channelDelegate != null) {
                channelDelegate.onGeolocationPermissionsHidePrompt();
            }
        }
    }
    
    public void onGeolocationPermissionsShowPrompt(final String s, final GeolocationPermissions$Callback geolocationPermissions$Callback) {
        final WebViewChannelDelegate.GeolocationPermissionsShowPromptCallback geolocationPermissionsShowPromptCallback = new WebViewChannelDelegate.GeolocationPermissionsShowPromptCallback(this, geolocationPermissions$Callback, s) {
            final InAppWebViewChromeClient this$0;
            final GeolocationPermissions$Callback val$callback;
            final String val$origin;
            
            @Override
            public void defaultBehaviour(final GeolocationPermissionShowPromptResponse geolocationPermissionShowPromptResponse) {
                this.val$callback.invoke(this.val$origin, false, false);
            }
            
            @Override
            public void error(final String s, String s2, final Object o) {
                final StringBuilder c = e.c(s, ", ");
                if (s2 == null) {
                    s2 = "";
                }
                L.u(c, s2, "IABWebChromeClient");
                this.defaultBehaviour(null);
            }
            
            @Override
            public boolean nonNullSuccess(final GeolocationPermissionShowPromptResponse geolocationPermissionShowPromptResponse) {
                this.val$callback.invoke(geolocationPermissionShowPromptResponse.getOrigin(), geolocationPermissionShowPromptResponse.isAllow(), geolocationPermissionShowPromptResponse.isRetain());
                return false;
            }
        };
        final InAppWebView inAppWebView = this.inAppWebView;
        if (inAppWebView != null) {
            final WebViewChannelDelegate channelDelegate = inAppWebView.channelDelegate;
            if (channelDelegate != null) {
                channelDelegate.onGeolocationPermissionsShowPrompt(s, (WebViewChannelDelegate.GeolocationPermissionsShowPromptCallback)geolocationPermissionsShowPromptCallback);
                return;
            }
        }
        geolocationPermissionsShowPromptCallback.defaultBehaviour((Object)null);
    }
    
    public void onHideCustomView() {
        final Activity activity = this.getActivity();
        if (activity == null) {
            return;
        }
        final ViewGroup rootView = this.getRootView();
        if (rootView == null) {
            return;
        }
        final View mCustomView = this.mCustomView;
        if (mCustomView != null) {
            ((ViewGroup)rootView).removeView(mCustomView);
        }
        this.mCustomView = null;
        ((View)rootView).setSystemUiVisibility(this.mOriginalSystemUiVisibility);
        activity.setRequestedOrientation(this.mOriginalOrientation);
        final WebChromeClient$CustomViewCallback mCustomViewCallback = this.mCustomViewCallback;
        if (mCustomViewCallback != null) {
            mCustomViewCallback.onCustomViewHidden();
        }
        this.mCustomViewCallback = null;
        activity.getWindow().clearFlags(512);
        final InAppWebView inAppWebView = this.inAppWebView;
        if (inAppWebView != null) {
            final WebViewChannelDelegate channelDelegate = inAppWebView.channelDelegate;
            if (channelDelegate != null) {
                channelDelegate.onExitFullscreen();
            }
            this.inAppWebView.setInFullscreen(false);
        }
    }
    
    public boolean onJsAlert(final WebView webView, final String s, final String s2, final JsResult jsResult) {
        final InAppWebView inAppWebView = this.inAppWebView;
        if (inAppWebView != null) {
            final WebViewChannelDelegate channelDelegate = inAppWebView.channelDelegate;
            if (channelDelegate != null) {
                channelDelegate.onJsAlert(s, s2, null, (WebViewChannelDelegate.JsAlertCallback)new WebViewChannelDelegate.JsAlertCallback(this, jsResult, s2) {
                    final InAppWebViewChromeClient this$0;
                    final String val$message;
                    final JsResult val$result;
                    
                    @Override
                    public void defaultBehaviour(final JsAlertResponse jsAlertResponse) {
                        String s;
                        String s2;
                        if (jsAlertResponse != null) {
                            final String message = jsAlertResponse.getMessage();
                            final String confirmButtonTitle = jsAlertResponse.getConfirmButtonTitle();
                            s = message;
                            s2 = confirmButtonTitle;
                        }
                        else {
                            s = null;
                            s2 = null;
                        }
                        this.this$0.createAlertDialog(this.val$message, this.val$result, s, s2);
                    }
                    
                    @Override
                    public void error(final String s, String s2, final Object o) {
                        final StringBuilder c = e.c(s, ", ");
                        if (s2 == null) {
                            s2 = "";
                        }
                        L.u(c, s2, "IABWebChromeClient");
                        this.val$result.cancel();
                    }
                    
                    @Override
                    public boolean nonNullSuccess(final JsAlertResponse jsAlertResponse) {
                        final boolean handledByClient = jsAlertResponse.isHandledByClient();
                        int intValue = 1;
                        if (handledByClient) {
                            final Integer action = jsAlertResponse.getAction();
                            if (action != null) {
                                intValue = action;
                            }
                            if (intValue != 0) {
                                this.val$result.cancel();
                            }
                            else {
                                this.val$result.confirm();
                            }
                            return false;
                        }
                        return true;
                    }
                });
                return true;
            }
        }
        return false;
    }
    
    public boolean onJsBeforeUnload(final WebView webView, final String s, final String s2, final JsResult jsResult) {
        final InAppWebView inAppWebView = this.inAppWebView;
        if (inAppWebView != null) {
            final WebViewChannelDelegate channelDelegate = inAppWebView.channelDelegate;
            if (channelDelegate != null) {
                channelDelegate.onJsBeforeUnload(s, s2, (WebViewChannelDelegate.JsBeforeUnloadCallback)new WebViewChannelDelegate.JsBeforeUnloadCallback(this, jsResult, s2) {
                    final InAppWebViewChromeClient this$0;
                    final String val$message;
                    final JsResult val$result;
                    
                    @Override
                    public void defaultBehaviour(final JsBeforeUnloadResponse jsBeforeUnloadResponse) {
                        String message;
                        String confirmButtonTitle;
                        String cancelButtonTitle;
                        if (jsBeforeUnloadResponse != null) {
                            message = jsBeforeUnloadResponse.getMessage();
                            confirmButtonTitle = jsBeforeUnloadResponse.getConfirmButtonTitle();
                            cancelButtonTitle = jsBeforeUnloadResponse.getCancelButtonTitle();
                        }
                        else {
                            message = null;
                            confirmButtonTitle = (cancelButtonTitle = null);
                        }
                        this.this$0.createBeforeUnloadDialog(this.val$message, this.val$result, message, confirmButtonTitle, cancelButtonTitle);
                    }
                    
                    @Override
                    public void error(final String s, String s2, final Object o) {
                        final StringBuilder c = e.c(s, ", ");
                        if (s2 == null) {
                            s2 = "";
                        }
                        L.u(c, s2, "IABWebChromeClient");
                        this.val$result.cancel();
                    }
                    
                    @Override
                    public boolean nonNullSuccess(final JsBeforeUnloadResponse jsBeforeUnloadResponse) {
                        final boolean handledByClient = jsBeforeUnloadResponse.isHandledByClient();
                        int intValue = 1;
                        if (handledByClient) {
                            final Integer action = jsBeforeUnloadResponse.getAction();
                            if (action != null) {
                                intValue = action;
                            }
                            if (intValue != 0) {
                                this.val$result.cancel();
                            }
                            else {
                                this.val$result.confirm();
                            }
                            return false;
                        }
                        return true;
                    }
                });
                return true;
            }
        }
        return false;
    }
    
    public boolean onJsConfirm(final WebView webView, final String s, final String s2, final JsResult jsResult) {
        final InAppWebView inAppWebView = this.inAppWebView;
        if (inAppWebView != null) {
            final WebViewChannelDelegate channelDelegate = inAppWebView.channelDelegate;
            if (channelDelegate != null) {
                channelDelegate.onJsConfirm(s, s2, null, (WebViewChannelDelegate.JsConfirmCallback)new WebViewChannelDelegate.JsConfirmCallback(this, jsResult, s2) {
                    final InAppWebViewChromeClient this$0;
                    final String val$message;
                    final JsResult val$result;
                    
                    @Override
                    public void defaultBehaviour(final JsConfirmResponse jsConfirmResponse) {
                        String message;
                        String confirmButtonTitle;
                        String cancelButtonTitle;
                        if (jsConfirmResponse != null) {
                            message = jsConfirmResponse.getMessage();
                            confirmButtonTitle = jsConfirmResponse.getConfirmButtonTitle();
                            cancelButtonTitle = jsConfirmResponse.getCancelButtonTitle();
                        }
                        else {
                            message = null;
                            confirmButtonTitle = (cancelButtonTitle = null);
                        }
                        this.this$0.createConfirmDialog(this.val$message, this.val$result, message, confirmButtonTitle, cancelButtonTitle);
                    }
                    
                    @Override
                    public void error(final String s, String s2, final Object o) {
                        final StringBuilder c = e.c(s, ", ");
                        if (s2 == null) {
                            s2 = "";
                        }
                        L.u(c, s2, "IABWebChromeClient");
                        this.val$result.cancel();
                    }
                    
                    @Override
                    public boolean nonNullSuccess(final JsConfirmResponse jsConfirmResponse) {
                        final boolean handledByClient = jsConfirmResponse.isHandledByClient();
                        int intValue = 1;
                        if (handledByClient) {
                            final Integer action = jsConfirmResponse.getAction();
                            if (action != null) {
                                intValue = action;
                            }
                            if (intValue != 0) {
                                this.val$result.cancel();
                            }
                            else {
                                this.val$result.confirm();
                            }
                            return false;
                        }
                        return true;
                    }
                });
                return true;
            }
        }
        return false;
    }
    
    public boolean onJsPrompt(final WebView webView, final String s, final String s2, final String s3, final JsPromptResult jsPromptResult) {
        final InAppWebView inAppWebView = this.inAppWebView;
        if (inAppWebView != null) {
            final WebViewChannelDelegate channelDelegate = inAppWebView.channelDelegate;
            if (channelDelegate != null) {
                channelDelegate.onJsPrompt(s, s2, s3, null, (WebViewChannelDelegate.JsPromptCallback)new WebViewChannelDelegate.JsPromptCallback(this, jsPromptResult, webView, s2, s3) {
                    final InAppWebViewChromeClient this$0;
                    final String val$defaultValue;
                    final String val$message;
                    final JsPromptResult val$result;
                    final WebView val$view;
                    
                    @Override
                    public void defaultBehaviour(final JsPromptResponse jsPromptResponse) {
                        String defaultValue;
                        String value;
                        String confirmButtonTitle;
                        String cancelButtonTitle;
                        String s;
                        if (jsPromptResponse != null) {
                            final String message = jsPromptResponse.getMessage();
                            defaultValue = jsPromptResponse.getDefaultValue();
                            value = jsPromptResponse.getValue();
                            confirmButtonTitle = jsPromptResponse.getConfirmButtonTitle();
                            cancelButtonTitle = jsPromptResponse.getCancelButtonTitle();
                            s = message;
                        }
                        else {
                            final String s2 = null;
                            final String s3;
                            defaultValue = (s3 = null);
                            cancelButtonTitle = (confirmButtonTitle = s3);
                            value = s3;
                            s = s2;
                        }
                        this.this$0.createPromptDialog(this.val$view, this.val$message, this.val$defaultValue, this.val$result, s, defaultValue, value, cancelButtonTitle, confirmButtonTitle);
                    }
                    
                    @Override
                    public void error(final String s, String s2, final Object o) {
                        final StringBuilder c = e.c(s, ", ");
                        if (s2 == null) {
                            s2 = "";
                        }
                        L.u(c, s2, "IABWebChromeClient");
                        ((JsResult)this.val$result).cancel();
                    }
                    
                    @Override
                    public boolean nonNullSuccess(final JsPromptResponse jsPromptResponse) {
                        final boolean handledByClient = jsPromptResponse.isHandledByClient();
                        int intValue = 1;
                        if (handledByClient) {
                            final Integer action = jsPromptResponse.getAction();
                            if (action != null) {
                                intValue = action;
                            }
                            if (intValue != 0) {
                                ((JsResult)this.val$result).cancel();
                            }
                            else {
                                this.val$result.confirm(jsPromptResponse.getValue());
                            }
                            return false;
                        }
                        return true;
                    }
                });
                return true;
            }
        }
        return false;
    }
    
    public void onPermissionRequest(final PermissionRequest permissionRequest) {
        final WebViewChannelDelegate.PermissionRequestCallback permissionRequestCallback = new WebViewChannelDelegate.PermissionRequestCallback(this, permissionRequest) {
            final InAppWebViewChromeClient this$0;
            final PermissionRequest val$request;
            
            @Override
            public void defaultBehaviour(final PermissionResponse permissionResponse) {
                this.val$request.deny();
            }
            
            @Override
            public void error(final String s, String s2, final Object o) {
                final StringBuilder c = e.c(s, ", ");
                if (s2 == null) {
                    s2 = "";
                }
                L.u(c, s2, "IABWebChromeClient");
                this.defaultBehaviour(null);
            }
            
            @Override
            public boolean nonNullSuccess(final PermissionResponse permissionResponse) {
                final Integer action = permissionResponse.getAction();
                if (action != null) {
                    if (action != 1) {
                        this.val$request.deny();
                    }
                    else {
                        this.val$request.grant((String[])permissionResponse.getResources().toArray((Object[])new String[permissionResponse.getResources().size()]));
                    }
                    return false;
                }
                return true;
            }
        };
        final InAppWebView inAppWebView = this.inAppWebView;
        if (inAppWebView != null) {
            final WebViewChannelDelegate channelDelegate = inAppWebView.channelDelegate;
            if (channelDelegate != null) {
                channelDelegate.onPermissionRequest(permissionRequest.getOrigin().toString(), (List<String>)Arrays.asList((Object[])permissionRequest.getResources()), null, (WebViewChannelDelegate.PermissionRequestCallback)permissionRequestCallback);
                return;
            }
        }
        permissionRequestCallback.defaultBehaviour((Object)null);
    }
    
    public void onPermissionRequestCanceled(final PermissionRequest permissionRequest) {
        final InAppWebView inAppWebView = this.inAppWebView;
        if (inAppWebView != null) {
            final WebViewChannelDelegate channelDelegate = inAppWebView.channelDelegate;
            if (channelDelegate != null) {
                channelDelegate.onPermissionRequestCanceled(permissionRequest.getOrigin().toString(), (List<String>)Arrays.asList((Object[])permissionRequest.getResources()));
            }
        }
    }
    
    public void onProgressChanged(final WebView webView, final int n) {
        super.onProgressChanged(webView, n);
        final InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate != null) {
            inAppBrowserDelegate.didChangeProgress(n);
        }
        final InAppWebView inAppWebView = (InAppWebView)webView;
        final InAppWebViewClientCompat inAppWebViewClientCompat = inAppWebView.inAppWebViewClientCompat;
        if (inAppWebViewClientCompat != null) {
            inAppWebViewClientCompat.loadCustomJavaScriptOnPageStarted(webView);
        }
        else {
            final InAppWebViewClient inAppWebViewClient = inAppWebView.inAppWebViewClient;
            if (inAppWebViewClient != null) {
                inAppWebViewClient.loadCustomJavaScriptOnPageStarted(webView);
            }
        }
        final WebViewChannelDelegate channelDelegate = inAppWebView.channelDelegate;
        if (channelDelegate != null) {
            channelDelegate.onProgressChanged(n);
        }
    }
    
    public void onReceivedIcon(final WebView webView, final Bitmap bitmap) {
        super.onReceivedIcon(webView, bitmap);
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap$CompressFormat.PNG, 100, (OutputStream)byteArrayOutputStream);
        try {
            byteArrayOutputStream.close();
        }
        catch (final IOException ex) {
            Log.e("IABWebChromeClient", "", (Throwable)ex);
        }
        bitmap.recycle();
        final WebViewChannelDelegate channelDelegate = ((InAppWebView)webView).channelDelegate;
        if (channelDelegate != null) {
            channelDelegate.onReceivedIcon(byteArrayOutputStream.toByteArray());
        }
    }
    
    public void onReceivedTitle(final WebView webView, final String s) {
        super.onReceivedTitle(webView, s);
        final InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate != null) {
            inAppBrowserDelegate.didChangeTitle(s);
        }
        final WebViewChannelDelegate channelDelegate = ((InAppWebView)webView).channelDelegate;
        if (channelDelegate != null) {
            channelDelegate.onTitleChanged(s);
        }
    }
    
    public void onReceivedTouchIconUrl(final WebView webView, final String s, final boolean b) {
        super.onReceivedTouchIconUrl(webView, s, b);
        final WebViewChannelDelegate channelDelegate = ((InAppWebView)webView).channelDelegate;
        if (channelDelegate != null) {
            channelDelegate.onReceivedTouchIconUrl(s, b);
        }
    }
    
    public void onRequestFocus(final WebView webView) {
        final InAppWebView inAppWebView = this.inAppWebView;
        if (inAppWebView != null) {
            final WebViewChannelDelegate channelDelegate = inAppWebView.channelDelegate;
            if (channelDelegate != null) {
                channelDelegate.onRequestFocus();
            }
        }
    }
    
    public void onShowCustomView(View mCustomView, final WebChromeClient$CustomViewCallback mCustomViewCallback) {
        if (this.mCustomView != null) {
            this.onHideCustomView();
            return;
        }
        final Activity activity = this.getActivity();
        if (activity == null) {
            return;
        }
        final ViewGroup rootView = this.getRootView();
        if (rootView == null) {
            return;
        }
        this.mCustomView = mCustomView;
        this.mOriginalSystemUiVisibility = ((View)rootView).getSystemUiVisibility();
        this.mOriginalOrientation = activity.getRequestedOrientation();
        this.mCustomViewCallback = mCustomViewCallback;
        mCustomView = this.mCustomView;
        if (mCustomView != null) {
            mCustomView.setBackgroundColor(-16777216);
        }
        ((View)rootView).setSystemUiVisibility(7942);
        activity.getWindow().setFlags(512, 512);
        ((ViewGroup)rootView).addView(this.mCustomView, (ViewGroup$LayoutParams)InAppWebViewChromeClient.FULLSCREEN_LAYOUT_PARAMS);
        final InAppWebView inAppWebView = this.inAppWebView;
        if (inAppWebView != null) {
            final WebViewChannelDelegate channelDelegate = inAppWebView.channelDelegate;
            if (channelDelegate != null) {
                channelDelegate.onEnterFullscreen();
            }
            this.inAppWebView.setInFullscreen(true);
        }
    }
    
    public boolean onShowFileChooser(final WebView webView, final ValueCallback<Uri[]> valueCallback, final WebChromeClient$FileChooserParams webChromeClient$FileChooserParams) {
        final String[] acceptTypes = webChromeClient$FileChooserParams.getAcceptTypes();
        final int mode = webChromeClient$FileChooserParams.getMode();
        boolean b = true;
        if (mode != 1) {
            b = false;
        }
        return this.startPickerIntent(valueCallback, acceptTypes, b, webChromeClient$FileChooserParams.isCaptureEnabled());
    }
    
    public void openFileChooser(final ValueCallback<Uri> valueCallback) {
        this.startPickerIntent(valueCallback, "", null);
    }
    
    public void openFileChooser(final ValueCallback<Uri> valueCallback, final String s) {
        this.startPickerIntent(valueCallback, s, null);
    }
    
    public void openFileChooser(final ValueCallback<Uri> valueCallback, final String s, final String s2) {
        this.startPickerIntent(valueCallback, s, s2);
    }
    
    public void startPickerIntent(final ValueCallback<Uri> filePathCallbackLegacy, final String s, final String s2) {
        this.filePathCallbackLegacy = filePathCallbackLegacy;
        final boolean booleanValue = this.acceptsImages(s);
        final boolean booleanValue2 = this.acceptsVideo(s);
        Intent intent = null;
        Label_0064: {
            if (s2 != null && !this.needsCameraPermission()) {
                if (booleanValue) {
                    intent = this.getPhotoIntent();
                    break Label_0064;
                }
                if (booleanValue2) {
                    intent = this.getVideoIntent();
                    break Label_0064;
                }
            }
            intent = null;
        }
        Intent chooser = intent;
        if (intent == null) {
            chooser = Intent.createChooser(this.getFileChooserIntent(s), (CharSequence)"");
            final ArrayList list = new ArrayList();
            if (!this.needsCameraPermission()) {
                if (booleanValue) {
                    list.add((Object)this.getPhotoIntent());
                }
                if (booleanValue2) {
                    list.add((Object)this.getVideoIntent());
                }
            }
            chooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[])list.toArray((Object[])new Parcelable[0]));
        }
        final Activity activity = this.getActivity();
        if (activity != null && chooser.resolveActivity(((Context)activity).getPackageManager()) != null) {
            activity.startActivityForResult(chooser, 3);
        }
        else {
            Log.d("IABWebChromeClient", "there is no Activity to handle this Intent");
        }
    }
    
    public boolean startPickerIntent(final ValueCallback<Uri[]> filePathCallback, final String[] array, final boolean b, final boolean b2) {
        this.filePathCallback = filePathCallback;
        final boolean booleanValue = this.acceptsImages(array);
        final boolean booleanValue2 = this.acceptsVideo(array);
        Intent intent = null;
        Label_0065: {
            if (b2 && !this.needsCameraPermission()) {
                if (booleanValue) {
                    intent = this.getPhotoIntent();
                    break Label_0065;
                }
                if (booleanValue2) {
                    intent = this.getVideoIntent();
                    break Label_0065;
                }
            }
            intent = null;
        }
        Intent intent2 = intent;
        if (intent == null) {
            final ArrayList list = new ArrayList();
            if (!this.needsCameraPermission()) {
                if (booleanValue) {
                    list.add((Object)this.getPhotoIntent());
                }
                if (booleanValue2) {
                    list.add((Object)this.getVideoIntent());
                }
            }
            final Intent fileChooserIntent = this.getFileChooserIntent(array, b);
            intent2 = new Intent("android.intent.action.CHOOSER");
            intent2.putExtra("android.intent.extra.INTENT", (Parcelable)fileChooserIntent);
            intent2.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[])list.toArray((Object[])new Parcelable[0]));
        }
        final Activity activity = this.getActivity();
        if (activity != null && intent2.resolveActivity(((Context)activity).getPackageManager()) != null) {
            activity.startActivityForResult(intent2, 1);
        }
        else {
            Log.d("IABWebChromeClient", "there is no Activity to handle this Intent");
        }
        return true;
    }
}
