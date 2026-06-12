package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.os.Handler;
import java.util.Collection;
import java.lang.reflect.AccessibleObject;
import java.util.Iterator;
import java.lang.reflect.Field;
import android.util.Log;
import android.os.Build$VERSION;
import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager$DisplayListener;
import java.util.ArrayList;

public class DisplayListenerProxy
{
    private static final String TAG = "DisplayListenerProxy";
    private ArrayList<DisplayManager$DisplayListener> listenersBeforeWebView;
    
    private static ArrayList<DisplayManager$DisplayListener> yoinkDisplayListeners(final DisplayManager displayManager) {
        if (Build$VERSION.SDK_INT >= 28) {
            return (ArrayList<DisplayManager$DisplayListener>)new ArrayList();
        }
        while (true) {
        Label_0145:
            while (true) {
                ArrayList list2;
                Object next;
                Field field;
                try {
                    final Field declaredField = DisplayManager.class.getDeclaredField("mGlobal");
                    ((AccessibleObject)declaredField).setAccessible(true);
                    final Object value = declaredField.get((Object)displayManager);
                    final Field declaredField2 = value.getClass().getDeclaredField("mDisplayListeners");
                    ((AccessibleObject)declaredField2).setAccessible(true);
                    final ArrayList list = (ArrayList)declaredField2.get(value);
                    list2 = new ArrayList();
                    final Iterator iterator = list.iterator();
                    final AccessibleObject accessibleObject = null;
                    if (!iterator.hasNext()) {
                        return (ArrayList<DisplayManager$DisplayListener>)list2;
                    }
                    next = iterator.next();
                    if ((field = (Field)accessibleObject) == null) {
                        field = next.getClass().getField("mListener");
                        ((AccessibleObject)field).setAccessible(true);
                    }
                }
                catch (final IllegalAccessException ex) {
                    break Label_0145;
                }
                catch (final NoSuchFieldException ex) {
                    break Label_0145;
                }
                list2.add((Object)field.get(next));
                final AccessibleObject accessibleObject = (AccessibleObject)field;
                continue;
            }
            final StringBuilder sb = new StringBuilder("Could not extract WebView's display listeners. ");
            final IllegalAccessException ex;
            sb.append((Object)ex);
            Log.w("DisplayListenerProxy", sb.toString());
            return (ArrayList<DisplayManager$DisplayListener>)new ArrayList();
        }
    }
    
    public void onPostWebViewInitialization(final DisplayManager displayManager) {
        final ArrayList<DisplayManager$DisplayListener> yoinkDisplayListeners = yoinkDisplayListeners(displayManager);
        yoinkDisplayListeners.removeAll((Collection)this.listenersBeforeWebView);
        if (yoinkDisplayListeners.isEmpty()) {
            return;
        }
        final Iterator iterator = yoinkDisplayListeners.iterator();
        while (iterator.hasNext()) {
            displayManager.unregisterDisplayListener((DisplayManager$DisplayListener)iterator.next());
            displayManager.registerDisplayListener((DisplayManager$DisplayListener)new DisplayManager$DisplayListener(this, yoinkDisplayListeners, displayManager) {
                final DisplayListenerProxy this$0;
                final DisplayManager val$displayManager;
                final ArrayList val$webViewListeners;
                
                public void onDisplayAdded(final int n) {
                    final Iterator iterator = this.val$webViewListeners.iterator();
                    while (iterator.hasNext()) {
                        ((DisplayManager$DisplayListener)iterator.next()).onDisplayAdded(n);
                    }
                }
                
                public void onDisplayChanged(final int n) {
                    if (this.val$displayManager.getDisplay(n) == null) {
                        return;
                    }
                    final Iterator iterator = this.val$webViewListeners.iterator();
                    while (iterator.hasNext()) {
                        ((DisplayManager$DisplayListener)iterator.next()).onDisplayChanged(n);
                    }
                }
                
                public void onDisplayRemoved(final int n) {
                    final Iterator iterator = this.val$webViewListeners.iterator();
                    while (iterator.hasNext()) {
                        ((DisplayManager$DisplayListener)iterator.next()).onDisplayRemoved(n);
                    }
                }
            }, (Handler)null);
        }
    }
    
    public void onPreWebViewInitialization(final DisplayManager displayManager) {
        this.listenersBeforeWebView = yoinkDisplayListeners(displayManager);
    }
}
