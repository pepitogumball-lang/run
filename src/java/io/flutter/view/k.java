package io.flutter.view;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import android.os.Build$VERSION;
import android.view.accessibility.AccessibilityRecord;
import android.util.Log;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class k
{
    public final Method a;
    public final Method b;
    public final Method c;
    public final Method d;
    public final Field e;
    public final Method f;
    
    public k() {
        Method b = null;
        Method f = null;
        Method method;
        try {
            method = AccessibilityNodeInfo.class.getMethod("getSourceNodeId", (Class<?>[])null);
        }
        catch (final NoSuchMethodException ex) {
            Log.w("AccessibilityBridge", "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection");
            method = null;
        }
        Method method2;
        try {
            method2 = AccessibilityRecord.class.getMethod("getSourceNodeId", (Class<?>[])null);
        }
        catch (final NoSuchMethodException ex2) {
            Log.w("AccessibilityBridge", "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection");
            method2 = null;
        }
        Method method3 = null;
        Field declaredField = null;
        Label_0135: {
            if (Build$VERSION.SDK_INT > 26) {
                break Label_0135;
            }
            try {
                f = AccessibilityNodeInfo.class.getMethod("getParentNodeId", (Class<?>[])null);
            }
            catch (final NoSuchMethodException ex3) {
                Log.w("AccessibilityBridge", "can't invoke getParentNodeId with reflection");
                f = null;
            }
            while (true) {
                try {
                    method3 = AccessibilityNodeInfo.class.getMethod("getChildId", Integer.TYPE);
                    declaredField = null;
                    final Method method4 = null;
                    b = f;
                    f = method4;
                    break Label_0135;
                }
                catch (final NoSuchMethodException ex4) {
                    Log.w("AccessibilityBridge", "can't invoke getChildId with reflection");
                    method3 = null;
                    continue;
                }
                try {
                    declaredField = AccessibilityNodeInfo.class.getDeclaredField("mChildNodeIds");
                    ((AccessibleObject)declaredField).setAccessible(true);
                    f = Class.forName("android.util.LongArray").getMethod("get", Integer.TYPE);
                    method3 = null;
                }
                catch (final NoSuchFieldException | ClassNotFoundException | NoSuchMethodException | NullPointerException ex5) {
                    Log.w("AccessibilityBridge", "can't access childNodeIdsField with reflection");
                    method3 = null;
                    continue;
                }
                break;
            }
        }
        this.a = method;
        this.b = b;
        this.c = method2;
        this.d = method3;
        this.e = declaredField;
        this.f = f;
    }
    
    public static Long a(k k, final AccessibilityRecord accessibilityRecord) {
        final Method c = k.c;
        k = null;
        if (c != null) {
            Label_0049: {
                try {
                    k = (k)c.invoke((Object)accessibilityRecord, (Object[])null);
                    return (Long)k;
                }
                catch (final InvocationTargetException ex) {}
                catch (final IllegalAccessException ex2) {
                    break Label_0049;
                }
                final InvocationTargetException ex;
                Log.w("AccessibilityBridge", "The getRecordSourceNodeId method threw an exception when invoked.", (Throwable)ex);
                return (Long)k;
            }
            final IllegalAccessException ex2;
            Log.w("AccessibilityBridge", "Failed to access the getRecordSourceNodeId method.", (Throwable)ex2);
        }
        return (Long)k;
    }
    
    public static boolean b(final long n, final int n2) {
        return (n & 1L << n2) != 0x0L;
    }
}
